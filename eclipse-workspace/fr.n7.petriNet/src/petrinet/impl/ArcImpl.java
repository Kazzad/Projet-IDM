/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.Arc;
import petrinet.CaseElement;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ArcImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getLinkToPrevCase <em>Link To Prev Case</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getLinkToNextCase <em>Link To Next Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends NetworkElementImpl implements Arc {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkToPrevCase() <em>Link To Prev Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToPrevCase()
	 * @generated
	 * @ordered
	 */
	protected CaseElement linkToPrevCase;

	/**
	 * The cached value of the '{@link #getLinkToNextCase() <em>Link To Next Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToNextCase()
	 * @generated
	 * @ordered
	 */
	protected CaseElement linkToNextCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseElement getLinkToPrevCase() {
		if (linkToPrevCase != null && linkToPrevCase.eIsProxy()) {
			InternalEObject oldLinkToPrevCase = (InternalEObject)linkToPrevCase;
			linkToPrevCase = (CaseElement)eResolveProxy(oldLinkToPrevCase);
			if (linkToPrevCase != oldLinkToPrevCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__LINK_TO_PREV_CASE, oldLinkToPrevCase, linkToPrevCase));
			}
		}
		return linkToPrevCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseElement basicGetLinkToPrevCase() {
		return linkToPrevCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkToPrevCase(CaseElement newLinkToPrevCase, NotificationChain msgs) {
		CaseElement oldLinkToPrevCase = linkToPrevCase;
		linkToPrevCase = newLinkToPrevCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__LINK_TO_PREV_CASE, oldLinkToPrevCase, newLinkToPrevCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToPrevCase(CaseElement newLinkToPrevCase) {
		if (newLinkToPrevCase != linkToPrevCase) {
			NotificationChain msgs = null;
			if (linkToPrevCase != null)
				msgs = ((InternalEObject)linkToPrevCase).eInverseRemove(this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS, CaseElement.class, msgs);
			if (newLinkToPrevCase != null)
				msgs = ((InternalEObject)newLinkToPrevCase).eInverseAdd(this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS, CaseElement.class, msgs);
			msgs = basicSetLinkToPrevCase(newLinkToPrevCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__LINK_TO_PREV_CASE, newLinkToPrevCase, newLinkToPrevCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseElement getLinkToNextCase() {
		if (linkToNextCase != null && linkToNextCase.eIsProxy()) {
			InternalEObject oldLinkToNextCase = (InternalEObject)linkToNextCase;
			linkToNextCase = (CaseElement)eResolveProxy(oldLinkToNextCase);
			if (linkToNextCase != oldLinkToNextCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__LINK_TO_NEXT_CASE, oldLinkToNextCase, linkToNextCase));
			}
		}
		return linkToNextCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseElement basicGetLinkToNextCase() {
		return linkToNextCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkToNextCase(CaseElement newLinkToNextCase, NotificationChain msgs) {
		CaseElement oldLinkToNextCase = linkToNextCase;
		linkToNextCase = newLinkToNextCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__LINK_TO_NEXT_CASE, oldLinkToNextCase, newLinkToNextCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToNextCase(CaseElement newLinkToNextCase) {
		if (newLinkToNextCase != linkToNextCase) {
			NotificationChain msgs = null;
			if (linkToNextCase != null)
				msgs = ((InternalEObject)linkToNextCase).eInverseRemove(this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS, CaseElement.class, msgs);
			if (newLinkToNextCase != null)
				msgs = ((InternalEObject)newLinkToNextCase).eInverseAdd(this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS, CaseElement.class, msgs);
			msgs = basicSetLinkToNextCase(newLinkToNextCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__LINK_TO_NEXT_CASE, newLinkToNextCase, newLinkToNextCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.ARC__LINK_TO_PREV_CASE:
				if (linkToPrevCase != null)
					msgs = ((InternalEObject)linkToPrevCase).eInverseRemove(this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_NEXT_ARCS, CaseElement.class, msgs);
				return basicSetLinkToPrevCase((CaseElement)otherEnd, msgs);
			case PetrinetPackage.ARC__LINK_TO_NEXT_CASE:
				if (linkToNextCase != null)
					msgs = ((InternalEObject)linkToNextCase).eInverseRemove(this, PetrinetPackage.CASE_ELEMENT__LINKS_TO_PREV_ARCS, CaseElement.class, msgs);
				return basicSetLinkToNextCase((CaseElement)otherEnd, msgs);
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
			case PetrinetPackage.ARC__LINK_TO_PREV_CASE:
				return basicSetLinkToPrevCase(null, msgs);
			case PetrinetPackage.ARC__LINK_TO_NEXT_CASE:
				return basicSetLinkToNextCase(null, msgs);
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
			case PetrinetPackage.ARC__WEIGHT:
				return getWeight();
			case PetrinetPackage.ARC__READ_ONLY:
				return isReadOnly();
			case PetrinetPackage.ARC__LINK_TO_PREV_CASE:
				if (resolve) return getLinkToPrevCase();
				return basicGetLinkToPrevCase();
			case PetrinetPackage.ARC__LINK_TO_NEXT_CASE:
				if (resolve) return getLinkToNextCase();
				return basicGetLinkToNextCase();
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
			case PetrinetPackage.ARC__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case PetrinetPackage.ARC__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case PetrinetPackage.ARC__LINK_TO_PREV_CASE:
				setLinkToPrevCase((CaseElement)newValue);
				return;
			case PetrinetPackage.ARC__LINK_TO_NEXT_CASE:
				setLinkToNextCase((CaseElement)newValue);
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
			case PetrinetPackage.ARC__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PetrinetPackage.ARC__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case PetrinetPackage.ARC__LINK_TO_PREV_CASE:
				setLinkToPrevCase((CaseElement)null);
				return;
			case PetrinetPackage.ARC__LINK_TO_NEXT_CASE:
				setLinkToNextCase((CaseElement)null);
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
			case PetrinetPackage.ARC__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case PetrinetPackage.ARC__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case PetrinetPackage.ARC__LINK_TO_PREV_CASE:
				return linkToPrevCase != null;
			case PetrinetPackage.ARC__LINK_TO_NEXT_CASE:
				return linkToNextCase != null;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
