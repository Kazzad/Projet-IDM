/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.CaseElement;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.CaseElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.CaseElementImpl#getLinksToPrevArcs <em>Links To Prev Arcs</em>}</li>
 *   <li>{@link petrinet.impl.CaseElementImpl#getLinksToNextArcs <em>Links To Next Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CaseElementImpl extends NetworkElementImpl implements CaseElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinksToPrevArcs() <em>Links To Prev Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPrevArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> linksToPrevArcs;

	/**
	 * The cached value of the '{@link #getLinksToNextArcs() <em>Links To Next Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToNextArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> linksToNextArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.CASE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.CASE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLinksToPrevArcs() {
		if (linksToPrevArcs == null) {
			linksToPrevArcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS, PetrinetPackage.ARC__LINK_TO_NEXT_CASE);
		}
		return linksToPrevArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLinksToNextArcs() {
		if (linksToNextArcs == null) {
			linksToNextArcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS, PetrinetPackage.ARC__LINK_TO_PREV_CASE);
		}
		return linksToNextArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToPrevArcs()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToNextArcs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS:
				return ((InternalEList<?>)getLinksToPrevArcs()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS:
				return ((InternalEList<?>)getLinksToNextArcs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.CASE_ELEMENT__NAME:
				return getName();
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS:
				return getLinksToPrevArcs();
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS:
				return getLinksToNextArcs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.CASE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS:
				getLinksToPrevArcs().clear();
				getLinksToPrevArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS:
				getLinksToNextArcs().clear();
				getLinksToNextArcs().addAll((Collection<? extends Arc>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetPackage.CASE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS:
				getLinksToPrevArcs().clear();
				return;
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS:
				getLinksToNextArcs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetPackage.CASE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS:
				return linksToPrevArcs != null && !linksToPrevArcs.isEmpty();
			case PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS:
				return linksToNextArcs != null && !linksToNextArcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CaseElementImpl
