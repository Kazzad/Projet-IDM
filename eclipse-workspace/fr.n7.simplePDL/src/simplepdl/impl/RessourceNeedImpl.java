/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplepdl.Ressource;
import simplepdl.RessourceNeed;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RessourceNeedImpl#getNeed <em>Need</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceNeedImpl#getLinkToRessource <em>Link To Ressource</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceNeedImpl#getLinkToWorkDefinition <em>Link To Work Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceNeedImpl extends MinimalEObjectImpl.Container implements RessourceNeed {
	/**
	 * The default value of the '{@link #getNeed() <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected static final int NEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeed() <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected int need = NEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkToRessource() <em>Link To Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource linkToRessource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceNeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCE_NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNeed() {
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeed(int newNeed) {
		int oldNeed = need;
		need = newNeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_NEED__NEED, oldNeed, need));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressource getLinkToRessource() {
		if (linkToRessource != null && linkToRessource.eIsProxy()) {
			InternalEObject oldLinkToRessource = (InternalEObject)linkToRessource;
			linkToRessource = (Ressource)eResolveProxy(oldLinkToRessource);
			if (linkToRessource != oldLinkToRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCE_NEED__LINK_TO_RESSOURCE, oldLinkToRessource, linkToRessource));
			}
		}
		return linkToRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetLinkToRessource() {
		return linkToRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToRessource(Ressource newLinkToRessource) {
		Ressource oldLinkToRessource = linkToRessource;
		linkToRessource = newLinkToRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_NEED__LINK_TO_RESSOURCE, oldLinkToRessource, linkToRessource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getLinkToWorkDefinition() {
		if (eContainerFeatureID() != SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION) return null;
		return (WorkDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkToWorkDefinition(WorkDefinition newLinkToWorkDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLinkToWorkDefinition, SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToWorkDefinition(WorkDefinition newLinkToWorkDefinition) {
		if (newLinkToWorkDefinition != eInternalContainer() || (eContainerFeatureID() != SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION && newLinkToWorkDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newLinkToWorkDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLinkToWorkDefinition != null)
				msgs = ((InternalEObject)newLinkToWorkDefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_NEEDS, WorkDefinition.class, msgs);
			msgs = basicSetLinkToWorkDefinition(newLinkToWorkDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION, newLinkToWorkDefinition, newLinkToWorkDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLinkToWorkDefinition((WorkDefinition)otherEnd, msgs);
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
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				return basicSetLinkToWorkDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				return eInternalContainer().eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_NEEDS, WorkDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_NEED__NEED:
				return getNeed();
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_RESSOURCE:
				if (resolve) return getLinkToRessource();
				return basicGetLinkToRessource();
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				return getLinkToWorkDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE_NEED__NEED:
				setNeed((Integer)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_RESSOURCE:
				setLinkToRessource((Ressource)newValue);
				return;
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				setLinkToWorkDefinition((WorkDefinition)newValue);
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
			case SimplepdlPackage.RESSOURCE_NEED__NEED:
				setNeed(NEED_EDEFAULT);
				return;
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_RESSOURCE:
				setLinkToRessource((Ressource)null);
				return;
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				setLinkToWorkDefinition((WorkDefinition)null);
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
			case SimplepdlPackage.RESSOURCE_NEED__NEED:
				return need != NEED_EDEFAULT;
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_RESSOURCE:
				return linkToRessource != null;
			case SimplepdlPackage.RESSOURCE_NEED__LINK_TO_WORK_DEFINITION:
				return getLinkToWorkDefinition() != null;
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
		result.append(" (need: ");
		result.append(need);
		result.append(')');
		return result.toString();
	}

} //RessourceNeedImpl
