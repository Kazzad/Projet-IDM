package petrinet.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.Ressource;
import simplepdl.RessourceNeed;

import petrinet.Network;
import petrinet.NetworkElement;
import petrinet.Place;
import petrinet.Arc;
import petrinet.Transition;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;

public class PetriNetFromSimplePDL {	
	public static void main(String[] args) {
		
		/**
		 * RÃ©cupÃ©ration
		 */
		
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage spPackageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant ÃƒÂªtre ouverte ÃƒÂ 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry spReg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> spM = spReg.getExtensionToFactoryMap();
		spM.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃƒÂ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃƒÂ¨le)
		ResourceSet spResSet = new ResourceSetImpl();

		// Charger la ressource (notre modÃƒÂ¨le)
		URI spModelURI = URI.createURI("Process-patisserie.xmi");
		Resource spResource = spResSet.getResource(spModelURI, true);
		
		
		// Charger le package PetriNet afin de l'enregistrer dans le registre d'Eclipse.
		PetrinetPackage pnPackageInstance = PetrinetPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant ÃƒÂªtre ouverte ÃƒÂ 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry pnReg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> pnM = pnReg.getExtensionToFactoryMap();
		pnM.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃƒÂ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃƒÂ¨le)
		ResourceSet pnResSet = new ResourceSetImpl();

		// DÃƒÂ©finir la ressource (le modÃƒÂ¨le)
		URI pnModelURI = URI.createURI("Network-patisserie-EMF.xmi");
		Resource pnResource = pnResSet.createResource(pnModelURI);
		
		// La fabrique pour fabriquer les ÃƒÂ©lÃƒÂ©ments de PetriNet
		PetrinetFactory pnFactory = PetrinetFactory.eINSTANCE;
		
		/*
		 * 
		 */
		
		// Traduction de Process en Network
		Process process = (Process) spResource.getContents().get(0);
		Network network = pnFactory.createNetwork();
		network.setName(process.getName());
		pnResource.getContents().add(network);
		
		Map<String, NetworkElement> stateElements = new HashMap<>();
		Map<String, Place> ressources = new HashMap<>();
		
		// Ressources
		for (Object o : process.getProcessElements()) {
			if (o instanceof Ressource) {
				Ressource ressource = (Ressource) o;
				
				Place ressPlace = pnFactory.createPlace();
				ressPlace.setName(ressource.getName());
				ressPlace.setTokens(ressource.getAmount());
				
				ressources.put(ressPlace.getName(), ressPlace);
				
				network.getNetworkElements().add(ressPlace);
			}
		}
		
		// WorkDefinitions
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				String wdName = wd.getName();
				
				Place idle = pnFactory.createPlace();
				idle.setName(wdName + "_idle");
				idle.setTokens(1);
				network.getNetworkElements().add(idle);
				Place started = pnFactory.createPlace();
				started.setName(wdName + "_started");
				started.setTokens(0);
				network.getNetworkElements().add(started);
				stateElements.put(started.getName(), started);
				Place running = pnFactory.createPlace();
				running.setName(wdName + "_running");
				running.setTokens(0);
				network.getNetworkElements().add(running);
				Place finished = pnFactory.createPlace();
				finished.setName(wdName + "_finished");
				finished.setTokens(0);
				network.getNetworkElements().add(finished);
				stateElements.put(finished.getName(), finished);
				
				Transition start = pnFactory.createTransition();
				start.setName(wdName + "_start");
				network.getNetworkElements().add(start);
				stateElements.put(start.getName(), start);
				Transition finish = pnFactory.createTransition();
				finish.setName(wdName + "_finish");
				network.getNetworkElements().add(finish);
				stateElements.put(finish.getName(), finish);
				
				Arc idle2start = pnFactory.createArc();
				idle2start.setLinkToPrevCase(idle);
				idle2start.setLinkToNextCase(start);
				idle2start.setWeight(1);
				network.getNetworkElements().add(idle2start);
				Arc start2started = pnFactory.createArc();
				start2started.setLinkToPrevCase(start);
				start2started.setLinkToNextCase(started);
				start2started.setWeight(1);
				network.getNetworkElements().add(start2started);
				Arc start2running = pnFactory.createArc();
				start2running.setLinkToPrevCase(start);
				start2running.setLinkToNextCase(running);
				start2running.setWeight(1);
				network.getNetworkElements().add(start2running);
				Arc running2finish = pnFactory.createArc();
				running2finish.setLinkToPrevCase(running);
				running2finish.setLinkToNextCase(finish);
				running2finish.setWeight(1);
				network.getNetworkElements().add(running2finish);
				Arc finish2finished = pnFactory.createArc();
				finish2finished.setLinkToPrevCase(finish);
				finish2finished.setLinkToNextCase(finished);
				finish2finished.setWeight(1);
				network.getNetworkElements().add(finish2finished);
				
				for (RessourceNeed rn : wd.getLinksToNeeds()) {
					Place ressource = ressources.get(rn.getLinkToRessource().getName());
					
					Arc startArc = pnFactory.createArc();
					startArc.setWeight(rn.getNeed());
					startArc.setLinkToPrevCase(ressource);
					startArc.setLinkToNextCase(start);
					network.getNetworkElements().add(startArc);
					
					Arc finishArc = pnFactory.createArc();
					finishArc.setWeight(rn.getNeed());
					finishArc.setLinkToPrevCase(finish);
					finishArc.setLinkToNextCase(ressource);
					network.getNetworkElements().add(finishArc);
				}
			}
		}
		
		// WorkSequences
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				WorkSequenceType type = ws.getLinkType();
				WorkDefinition prev = ws.getPredecessor();
				WorkDefinition next = ws.getSuccessor();
				
				// Arc
				Arc arc = pnFactory.createArc();
				arc.setWeight(1);
				arc.setReadOnly(true);
				network.getNetworkElements().add(arc);
				
				// Predecesseur
				String prevName = prev.getName();
				Place prevPlace;
				if (type == WorkSequenceType.START_TO_START || type == WorkSequenceType.START_TO_FINISH) {
					prevPlace = (Place)stateElements.get(prevName + "_started");
				} else {
					prevPlace = (Place)stateElements.get(prevName + "_finished");
				}
				arc.setLinkToPrevCase(prevPlace);
				
				// Successeur
				String nextName = next.getName();
				Transition nextTransition;
				if (type == WorkSequenceType.START_TO_START || type == WorkSequenceType.FINISH_TO_START) {
					nextTransition = (Transition)stateElements.get(nextName + "_start");
				} else {
					nextTransition = (Transition)stateElements.get(nextName + "_finish");
				}
				arc.setLinkToNextCase(nextTransition);
			}
		}
	
	    
		
		// Sauver la ressource
	    try {
	    	pnResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
