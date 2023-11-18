/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.RessourceNeed#getNeed <em>Need</em>}</li>
 *   <li>{@link simplepdl.RessourceNeed#getLinkToRessource <em>Link To Ressource</em>}</li>
 *   <li>{@link simplepdl.RessourceNeed#getLinkToWorkDefinition <em>Link To Work Definition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessourceNeed()
 * @model
 * @generated
 */
public interface RessourceNeed extends EObject {
	/**
	 * Returns the value of the '<em><b>Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' attribute.
	 * @see #setNeed(int)
	 * @see simplepdl.SimplepdlPackage#getRessourceNeed_Need()
	 * @model required="true"
	 * @generated
	 */
	int getNeed();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceNeed#getNeed <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' attribute.
	 * @see #getNeed()
	 * @generated
	 */
	void setNeed(int value);

	/**
	 * Returns the value of the '<em><b>Link To Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Ressource</em>' reference.
	 * @see #setLinkToRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getRessourceNeed_LinkToRessource()
	 * @model required="true"
	 * @generated
	 */
	Ressource getLinkToRessource();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceNeed#getLinkToRessource <em>Link To Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Ressource</em>' reference.
	 * @see #getLinkToRessource()
	 * @generated
	 */
	void setLinkToRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Link To Work Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getLinksToNeeds <em>Links To Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Work Definition</em>' container reference.
	 * @see #setLinkToWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessourceNeed_LinkToWorkDefinition()
	 * @see simplepdl.WorkDefinition#getLinksToNeeds
	 * @model opposite="linksToNeeds" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getLinkToWorkDefinition();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceNeed#getLinkToWorkDefinition <em>Link To Work Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Work Definition</em>' container reference.
	 * @see #getLinkToWorkDefinition()
	 * @generated
	 */
	void setLinkToWorkDefinition(WorkDefinition value);

} // RessourceNeed
