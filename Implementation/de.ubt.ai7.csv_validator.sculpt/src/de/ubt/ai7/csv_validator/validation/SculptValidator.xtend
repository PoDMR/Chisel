/*
 * generated by Xtext
 */
package de.ubt.ai7.csv_validator.validation

import de.ubt.ai7.csv_validator.library.parser.Parser
import de.ubt.ai7.csv_validator.library.parser.impl.ParserProviderImpl
import de.ubt.ai7.csv_validator.sculpt.AbstractToken
import de.ubt.ai7.csv_validator.sculpt.AtomicType
import de.ubt.ai7.csv_validator.sculpt.CompoundType
import de.ubt.ai7.csv_validator.sculpt.CompoundTypePrimitive
import de.ubt.ai7.csv_validator.sculpt.CompoundTypeSpecifier
import de.ubt.ai7.csv_validator.sculpt.ContentExpressionComparison
import de.ubt.ai7.csv_validator.sculpt.ListType
import de.ubt.ai7.csv_validator.sculpt.ListTypeSpecifier
import de.ubt.ai7.csv_validator.sculpt.NodeExpressionComparison
import de.ubt.ai7.csv_validator.sculpt.Sculpt
import de.ubt.ai7.csv_validator.sculpt.SculptPackage
import de.ubt.ai7.csv_validator.sculpt.TLLoop
import de.ubt.ai7.csv_validator.sculpt.TLLoopMode
import de.ubt.ai7.csv_validator.sculpt.TLOutput
import de.ubt.ai7.csv_validator.sculpt.Token
import de.ubt.ai7.csv_validator.sculpt.TransformationProgram
import de.ubt.ai7.csv_validator.sculpt.Type
import de.ubt.ai7.csv_validator.sculpt.TypeSpecifier
import java.util.HashSet
import java.util.regex.Pattern
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SculptValidator extends AbstractSculptValidator {

	@Check
	def void checkSchemaElementNameIsUnique(Sculpt schema) {
		val usedNames = new HashSet<String>();
		val tokens = EcoreUtil2.getAllContentsOfType(schema, AbstractToken)
		for (tok : tokens)
			if (usedNames.contains(tok.getName())) {
				error("Names have to be globally unique", tok, SculptPackage.Literals.ABSTRACT_TOKEN__NAME);
			} else {
				usedNames.add(tok.getName());
			}

	}

	@Check
	def void checkNodeExpressionComparison(NodeExpressionComparison ne) {
		checkTypeSpecifiers(ne.type, ne.typeSpecifier);
	}

	@Check
	def void checkContentExpressionComparison(ContentExpressionComparison ce) {
		if (ce.value == null && ce.path == null) {
			error("Value or path to region expected", ce, null);
		}
		checkTypeSpecifiers(ce.type, ce.typeSpecifier);
	}

	def Type checkTypeSpecifiers(Type topType, EList<TypeSpecifier> path) {
		var type = topType;

		if (path == null)
			return null;

		for (TypeSpecifier typeSpec : path) {
			if (type instanceof AtomicType) {
				if (typeSpec instanceof CompoundTypeSpecifier) {
					error("The atomic type " + type.getName() + " cannot be subdivided", typeSpec,
						SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER__SUBTYPE);
					return null;
				} else {
					error("The atomic type " + type.getName() + " cannot be subdivided", typeSpec,
						SculptPackage.Literals.LIST_TYPE_SPECIFIER__INDEX);
					return null;
				}
			} else if (typeSpec instanceof ListTypeSpecifier) {
				val index = typeSpec.getIndex();

				if (type instanceof ListType) {
					if (type.getMaxElements() != null && type.getMaxElements() >= 0 && type.getMaxElements() <= index) {
						error("Index out of bounds for type " + type.getName(), typeSpec,
							SculptPackage.Literals.LIST_TYPE_SPECIFIER__INDEX);
						return null;
					}

					// update for next iteration
					type = type.getBase();
				} else {
					error("Type " + type.getName() + " is not a list", typeSpec,
						SculptPackage.Literals.LIST_TYPE_SPECIFIER__INDEX);
					return null;
				}

			} else if (typeSpec instanceof CompoundTypeSpecifier) {

				if (type instanceof CompoundType) {
					val subtype = typeSpec.getSubtype();
					val subtypeOffset = typeSpec.getIndex();
					if (ValidationUtil.getChildIndex(type.getPrimitives(), subtype, subtypeOffset) == -1) {
						if (subtypeOffset == 0) {
							error("Type " + type.getName() + " does not contain such a type", typeSpec,
								SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER__SUBTYPE);
						} else {
							error("Type " + type.getName() + " does not contain that type such often", typeSpec,
								SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER__INDEX);
						}
						return null;
					}
					type = subtype;
				} else {
					error("Type " + type.getName() + " is not a compound type", typeSpec,
						SculptPackage.Literals.COMPOUND_TYPE_SPECIFIER__SUBTYPE);
					return null;
				}
			}
		}

		return type;
	}

	def boolean checkInterval(Integer minimum, Integer maximum) {
		return maximum == -1 || minimum <= maximum;
	}

	@Check
	def void checkListType(ListType type) {
		if (type.getMinElements() != null && type.getMinElements() < 0)
			error("Value must be non-negative", type, SculptPackage.Literals.LIST_TYPE__MIN_ELEMENTS);
		if (type.getMaxElements() != null && (type.getMaxElements() < -1 || type.getMaxElements() == 0))
			error("Value must be positive", type, SculptPackage.Literals.LIST_TYPE__MAX_ELEMENTS);
		if (!checkInterval(type.getMinElements(), type.getMaxElements()))
			error("Conflicts with other bound", type, SculptPackage.Literals.LIST_TYPE__MAX_ELEMENTS);
	}

	def void testParserParameters(Parser<?> parser, AtomicType type) {
		// order matters
		try {
			parser.setDecimalChar(type.getDecimalChar());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__DECIMAL_CHAR);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__DECIMAL_CHAR);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__DECIMAL_CHAR);
		}

		try {
			parser.setGroupChar(type.getGroupChar());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__GROUP_CHAR);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__GROUP_CHAR);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__GROUP_CHAR);
		}

		try {
			parser.setFormat(type.getFormat());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__FORMAT);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__FORMAT);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__FORMAT);
		}

		try {
			parser.setLength(type.getLength());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__LENGTH);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__LENGTH);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__LENGTH);
		}

		try {
			parser.setMinLength(type.getMinLength());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MIN_LENGTH);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__MIN_LENGTH);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MIN_LENGTH);
		}

		try {
			parser.setMaxLength(type.getMaxLength());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MAX_LENGTH);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__MAX_LENGTH);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MAX_LENGTH);
		}

		try {
			parser.setMinimum(type.getMinimum());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MINIMUM);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__MINIMUM);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MINIMUM);
		}

		try {
			parser.setMinExclusive(type.getMinExclusive());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MIN_EXCLUSIVE);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__MIN_EXCLUSIVE);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MIN_EXCLUSIVE);
		}

		try {
			parser.setMaximum(type.getMaximum());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MAXIMUM);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__MAXIMUM);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MAXIMUM);
		}

		try {
			parser.setMaxExclusive(type.getMaxExclusive());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MAX_EXCLUSIVE);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.ATOMIC_TYPE__MAX_EXCLUSIVE);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.ATOMIC_TYPE__MAX_EXCLUSIVE);
		}

		try {
			parser.setDefaultValue(type.getDefaultValue());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.TYPE__DEFAULT_VALUE);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.TYPE__DEFAULT_VALUE);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.TYPE__DEFAULT_VALUE);
		}

		try {
			parser.setEmptyValue(type.getEmptyValue());
		} catch (IllegalArgumentException e) {
			error("Invalid value: " + e.getMessage(), type, SculptPackage.Literals.TYPE__EMPTY_VALUE);
		} catch (UnsupportedOperationException e) {
			error("Unsupported parameter", type, SculptPackage.Literals.TYPE__EMPTY_VALUE);
		} catch (Exception e) {
			error(e.getLocalizedMessage(), type, SculptPackage.Literals.TYPE__EMPTY_VALUE);
		}

	}

	@Check
	def void checkAtomicType(AtomicType type) {
		try {
			val parser = ParserProviderImpl.getParser(type.getBase());
			testParserParameters(parser, type);
		} catch (IllegalArgumentException e) {
			error("No such parser found", type, SculptPackage.Literals.ATOMIC_TYPE__BASE);
			return;
		}

		if (type.getMinLength() != null && type.getMinLength() < 0)
			error("Value must be non-negative", type, SculptPackage.Literals.ATOMIC_TYPE__MIN_LENGTH);
		if (type.getMaxLength() != null && type.getMaxLength() <= 0)
			error("Value must be positive", type, SculptPackage.Literals.ATOMIC_TYPE__MAX_LENGTH);
		if (type.getLength() != null && type.getLength() <= 0)
			error("Value must be positive", type, SculptPackage.Literals.ATOMIC_TYPE__LENGTH);

		if (!checkInterval(type.getMinLength(), type.getLength()))
			error("Conflicts with other bound", type, SculptPackage.Literals.ATOMIC_TYPE__LENGTH);
		if (!checkInterval(type.getLength(), type.getMaxLength()))
			error("Conflicts with other bound", type, SculptPackage.Literals.ATOMIC_TYPE__LENGTH);
		if (!checkInterval(type.getMinLength(), type.getMaxLength()))
			error("Conflicts with other bound", type, SculptPackage.Literals.ATOMIC_TYPE__MAX_LENGTH);
	}

	@Check
	def void checkToken(Token tok) {
		if (tok.tokenRegex == null || tok.tokenRegex.isEmpty())
			return;

		try {
			Pattern.compile(tok.tokenRegex);
		} catch (Exception e) {
			error(e.localizedMessage, tok, SculptPackage.Literals.TOKEN__TOKEN_REGEX);
		}
	}

	@Check
	def void checkLoopVariables(TLLoop loop) {
		if (loop.mode != TLLoopMode.UNSPECIFIED && loop.contentExpression == null) {
			error("Expected content expression after region", loop, SculptPackage.Literals.TL_LOOP__MODE);
			return;
		}

		val specNr = loop.contentExpression.list.size;
		val varNr = loop.variables.size;

		if (loop.mode != TLLoopMode.UNSPECIFIED && specNr != varNr)
			error("Wrong number of arguments. Expected: " + loop.contentExpression.list.size + ", found: " +
				loop.variables.size, loop, SculptPackage.Literals.TL_LOOP__VARIABLES)

	}

	@Check
	def void checkColumSize(TransformationProgram prog) {
		val outputs = EcoreUtil2.getAllContentsOfType(prog, typeof(TLOutput));
		if(outputs.size == 0) return;

		val columns = outputs.get(0).primitives.size;
		for (output : outputs) {
			if (columns != output.primitives.size)
				warning("Rows may have different number of cells", output,
					SculptPackage.Literals.TL_OUTPUT__PRIMITIVES);
		}
	}

	@Check
	def void checkCompoundType(CompoundTypePrimitive t) {
		if (t.text == null && t.type == null)
			error("String or Type expected", t, null);
	}

}
