/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.CaseElement#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.CaseElement#getLinksToPrevArcs <em>Links To Prev Arcs</em>}</li>
 *   <li>{@link petrinet.CaseElement#getLinksToNextArcs <em>Links To Next Arcs</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getCaseElement()
 * @model abstract="true"
 * @generated
 */
public interface CaseElement extends NetworkElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getCaseElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.CaseElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Links To Prev Arcs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getLinkToNextCase <em>Link To Next Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Prev Arcs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getCaseElement_LinksToPrevArcs()
	 * @see petrinet.Arc#getLinkToNextCase
	 * @model opposite="linkToNextCase"
	 * @generated
	 */
	EList<Arc> getLinksToPrevArcs();

	/**
	 * Returns the value of the '<em><b>Links To Next Arcs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getLinkToPrevCase <em>Link To Prev Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Next Arcs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getCaseElement_LinksToNextArcs()
	 * @see petrinet.Arc#getLinkToPrevCase
	 * @model opposite="linkToPrevCase"
	 * @generated
	 */
	EList<Arc> getLinksToNextArcs();

} // CaseElement
