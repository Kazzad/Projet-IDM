/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getWeight <em>Weight</em>}</li>
 *   <li>{@link petrinet.Arc#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link petrinet.Arc#getLinkToPrevCase <em>Link To Prev Case</em>}</li>
 *   <li>{@link petrinet.Arc#getLinkToNextCase <em>Link To Next Case</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends NetworkElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see petrinet.PetrinetPackage#getArc_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see petrinet.PetrinetPackage#getArc_ReadOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link petrinet.Arc#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Link To Prev Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.CaseElement#getLinksToNextArcs <em>Links To Next Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Prev Case</em>' reference.
	 * @see #setLinkToPrevCase(CaseElement)
	 * @see petrinet.PetrinetPackage#getArc_LinkToPrevCase()
	 * @see petrinet.CaseElement#getLinksToNextArcs
	 * @model opposite="linksToNextArcs" required="true"
	 * @generated
	 */
	CaseElement getLinkToPrevCase();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getLinkToPrevCase <em>Link To Prev Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Prev Case</em>' reference.
	 * @see #getLinkToPrevCase()
	 * @generated
	 */
	void setLinkToPrevCase(CaseElement value);

	/**
	 * Returns the value of the '<em><b>Link To Next Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.CaseElement#getLinksToPrevArcs <em>Links To Prev Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Next Case</em>' reference.
	 * @see #setLinkToNextCase(CaseElement)
	 * @see petrinet.PetrinetPackage#getArc_LinkToNextCase()
	 * @see petrinet.CaseElement#getLinksToPrevArcs
	 * @model opposite="linksToPrevArcs"
	 * @generated
	 */
	CaseElement getLinkToNextCase();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getLinkToNextCase <em>Link To Next Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Next Case</em>' reference.
	 * @see #getLinkToNextCase()
	 * @generated
	 */
	void setLinkToNextCase(CaseElement value);

} // Arc
