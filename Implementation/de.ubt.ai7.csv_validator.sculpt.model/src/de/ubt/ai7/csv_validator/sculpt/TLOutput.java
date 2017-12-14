/**
 */
package de.ubt.ai7.csv_validator.sculpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai7.csv_validator.sculpt.TLOutput#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLOutput()
 * @model
 * @generated
 */
public interface TLOutput extends TLStatement {
	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai7.csv_validator.sculpt.TLOutputPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' containment reference list.
	 * @see de.ubt.ai7.csv_validator.sculpt.SculptPackage#getTLOutput_Primitives()
	 * @model containment="true"
	 * @generated
	 */
	EList<TLOutputPrimitive> getPrimitives();

} // TLOutput
