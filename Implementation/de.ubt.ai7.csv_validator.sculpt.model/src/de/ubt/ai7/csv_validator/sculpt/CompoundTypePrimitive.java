/**
 */
package de.ubt.ai7.csv_validator.sculpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Type Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getText <em>Text</em>}</li>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getCompoundTypePrimitive()
 * @model
 * @generated
 */
public interface CompoundTypePrimitive extends SchemaElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getCompoundTypePrimitive_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getCompoundTypePrimitive_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // CompoundTypePrimitive
