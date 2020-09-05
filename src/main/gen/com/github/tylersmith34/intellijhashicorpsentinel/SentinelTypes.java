// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelElementType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelTokenType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.impl.*;

public interface SentinelTypes {

  IElementType ADD_SUBTRACT_OPERATOR = new SentinelElementType("ADD_SUBTRACT_OPERATOR");
  IElementType BLOCK = new SentinelElementType("BLOCK");
  IElementType BOOLEAN_EXPRESSION = new SentinelElementType("BOOLEAN_EXPRESSION");
  IElementType BOOLEAN_EXPRESSIONS = new SentinelElementType("BOOLEAN_EXPRESSIONS");
  IElementType BOOLEAN_LITERAL = new SentinelElementType("BOOLEAN_LITERAL");
  IElementType BOOLEAN_OPERATORS = new SentinelElementType("BOOLEAN_OPERATORS");
  IElementType BREAK_STMT = new SentinelElementType("BREAK_STMT");
  IElementType COMPARISON_OPERATOR = new SentinelElementType("COMPARISON_OPERATOR");
  IElementType CONTINUE_STMT = new SentinelElementType("CONTINUE_STMT");
  IElementType DECIMAL = new SentinelElementType("DECIMAL");
  IElementType DECIMALS = new SentinelElementType("DECIMALS");
  IElementType DECIMAL_DIGIT = new SentinelElementType("DECIMAL_DIGIT");
  IElementType DEFINITION = new SentinelElementType("DEFINITION");
  IElementType DOT_IDENTIFIER = new SentinelElementType("DOT_IDENTIFIER");
  IElementType ELEMENT = new SentinelElementType("ELEMENT");
  IElementType ELEMENT_LIST = new SentinelElementType("ELEMENT_LIST");
  IElementType ELSE_OPERATOR = new SentinelElementType("ELSE_OPERATOR");
  IElementType ESCAPED_CHARACTER = new SentinelElementType("ESCAPED_CHARACTER");
  IElementType EXPONENT = new SentinelElementType("EXPONENT");
  IElementType EXTERNAL_PARAMETERS = new SentinelElementType("EXTERNAL_PARAMETERS");
  IElementType FLOAT = new SentinelElementType("FLOAT");
  IElementType FOR_BLOCK = new SentinelElementType("FOR_BLOCK");
  IElementType FOR_STATEMENT = new SentinelElementType("FOR_STATEMENT");
  IElementType FUNCTION = new SentinelElementType("FUNCTION");
  IElementType FUNCTION_BODY = new SentinelElementType("FUNCTION_BODY");
  IElementType FUNCTION_CALL = new SentinelElementType("FUNCTION_CALL");
  IElementType FUNCTION_DECLARATION = new SentinelElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_STATEMENT = new SentinelElementType("FUNCTION_STATEMENT");
  IElementType GLOBAL_VARIABLE_DEFINITION = new SentinelElementType("GLOBAL_VARIABLE_DEFINITION");
  IElementType HEX_DIGIT = new SentinelElementType("HEX_DIGIT");
  IElementType HEX_LITERAL = new SentinelElementType("HEX_LITERAL");
  IElementType IDENTIFIER_LIST = new SentinelElementType("IDENTIFIER_LIST");
  IElementType IF_STATEMENT = new SentinelElementType("IF_STATEMENT");
  IElementType IMPORT_STATEMENT = new SentinelElementType("IMPORT_STATEMENT");
  IElementType KEYED_ELEMENT = new SentinelElementType("KEYED_ELEMENT");
  IElementType KEYED_ELEMENT_LIST = new SentinelElementType("KEYED_ELEMENT_LIST");
  IElementType LETTER = new SentinelElementType("LETTER");
  IElementType LIST_DEFINITION = new SentinelElementType("LIST_DEFINITION");
  IElementType LITERAL = new SentinelElementType("LITERAL");
  IElementType LOGICAL_OPERATOR = new SentinelElementType("LOGICAL_OPERATOR");
  IElementType MAIN_RULE = new SentinelElementType("MAIN_RULE");
  IElementType MAIN_RULE_BLOCK = new SentinelElementType("MAIN_RULE_BLOCK");
  IElementType MAP_DEFINITION = new SentinelElementType("MAP_DEFINITION");
  IElementType MULTIPLE_DIVIDE_OPERATOR = new SentinelElementType("MULTIPLE_DIVIDE_OPERATOR");
  IElementType NULL_LITERAL = new SentinelElementType("NULL_LITERAL");
  IElementType NUMBER_LITERAL = new SentinelElementType("NUMBER_LITERAL");
  IElementType OCTAL_DIGIT = new SentinelElementType("OCTAL_DIGIT");
  IElementType OCTAL_LITERAL = new SentinelElementType("OCTAL_LITERAL");
  IElementType PARAMETERS = new SentinelElementType("PARAMETERS");
  IElementType QUANTIFIER_EXPRESSION = new SentinelElementType("QUANTIFIER_EXPRESSION");
  IElementType QUANTIFIER_OPERATOR = new SentinelElementType("QUANTIFIER_OPERATOR");
  IElementType RETURN_STATEMENT = new SentinelElementType("RETURN_STATEMENT");
  IElementType RULE_BASE = new SentinelElementType("RULE_BASE");
  IElementType RULE_DEFINITION = new SentinelElementType("RULE_DEFINITION");
  IElementType SELECTOR = new SentinelElementType("SELECTOR");
  IElementType SET_OPERATOR = new SentinelElementType("SET_OPERATOR");
  IElementType STATEMENT = new SentinelElementType("STATEMENT");
  IElementType STRING_LITERAL = new SentinelElementType("STRING_LITERAL");
  IElementType UNARY_OPERATOR = new SentinelElementType("UNARY_OPERATOR");
  IElementType UNDEFINED_LITERAL = new SentinelElementType("UNDEFINED_LITERAL");
  IElementType VARIABLE_DEFINITION = new SentinelElementType("VARIABLE_DEFINITION");

  IElementType ALL = new SentinelTokenType("all");
  IElementType AND = new SentinelTokenType("and");
  IElementType ANY = new SentinelTokenType("any");
  IElementType AS = new SentinelTokenType("as");
  IElementType BLOCK_COMMENT = new SentinelTokenType("BLOCK_COMMENT");
  IElementType BREAK = new SentinelTokenType("break");
  IElementType COLON = new SentinelTokenType(":");
  IElementType COMMA = new SentinelTokenType(",");
  IElementType COMMENT = new SentinelTokenType("COMMENT");
  IElementType CONTAINS = new SentinelTokenType("contains");
  IElementType CONTINUE = new SentinelTokenType("continue");
  IElementType DEFAULT = new SentinelTokenType("default");
  IElementType DOUBLE_EQUALS = new SentinelTokenType("==");
  IElementType DOUBLE_QUOTED_STRING = new SentinelTokenType("DOUBLE_QUOTED_STRING");
  IElementType ELSE = new SentinelTokenType("else");
  IElementType EQUALS = new SentinelTokenType("=");
  IElementType EXCLAMATION = new SentinelTokenType("!");
  IElementType FALSE = new SentinelTokenType("false");
  IElementType FILTER = new SentinelTokenType("filter");
  IElementType FOR = new SentinelTokenType("for");
  IElementType FUNC = new SentinelTokenType("func");
  IElementType GREATER_THAN = new SentinelTokenType(">");
  IElementType GREATER_THAN_EQUALS = new SentinelTokenType(">=");
  IElementType IDENTIFIER = new SentinelTokenType("IDENTIFIER");
  IElementType IF = new SentinelTokenType("if");
  IElementType IMPORT = new SentinelTokenType("import");
  IElementType IN = new SentinelTokenType("in");
  IElementType IS = new SentinelTokenType("is");
  IElementType LESS_THAN = new SentinelTokenType("<");
  IElementType LESS_THAN_EQUALS = new SentinelTokenType("<=");
  IElementType L_BRACKET = new SentinelTokenType("[");
  IElementType L_CURLY = new SentinelTokenType("{");
  IElementType L_PAREN = new SentinelTokenType("(");
  IElementType MAIN = new SentinelTokenType("main");
  IElementType MATCHES = new SentinelTokenType("matches");
  IElementType MINUS = new SentinelTokenType("-");
  IElementType NOT = new SentinelTokenType("not");
  IElementType NOT_EQUALS = new SentinelTokenType("!=");
  IElementType NULL = new SentinelTokenType("null");
  IElementType NUMBER = new SentinelTokenType("Number");
  IElementType OR = new SentinelTokenType("or");
  IElementType PARAM = new SentinelTokenType("param");
  IElementType PERCENT = new SentinelTokenType("%");
  IElementType PERIOD = new SentinelTokenType(".");
  IElementType PLUS = new SentinelTokenType("+");
  IElementType RETURN = new SentinelTokenType("return");
  IElementType RULE = new SentinelTokenType("rule");
  IElementType R_BRACKET = new SentinelTokenType("]");
  IElementType R_CURLY = new SentinelTokenType("}");
  IElementType R_PAREN = new SentinelTokenType(")");
  IElementType SINGLE_QUOTED_STRING = new SentinelTokenType("SINGLE_QUOTED_STRING");
  IElementType SLASH = new SentinelTokenType("/");
  IElementType SPLAT = new SentinelTokenType("*");
  IElementType TRUE = new SentinelTokenType("true");
  IElementType UNDEFINED = new SentinelTokenType("undefined");
  IElementType WHEN = new SentinelTokenType("when");
  IElementType XOR = new SentinelTokenType("xor");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_SUBTRACT_OPERATOR) {
        return new SentinelAddSubtractOperatorImpl(node);
      }
      else if (type == BLOCK) {
        return new SentinelBlockImpl(node);
      }
      else if (type == BOOLEAN_EXPRESSION) {
        return new SentinelBooleanExpressionImpl(node);
      }
      else if (type == BOOLEAN_EXPRESSIONS) {
        return new SentinelBooleanExpressionsImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new SentinelBooleanLiteralImpl(node);
      }
      else if (type == BOOLEAN_OPERATORS) {
        return new SentinelBooleanOperatorsImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new SentinelBreakStmtImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new SentinelComparisonOperatorImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new SentinelContinueStmtImpl(node);
      }
      else if (type == DECIMAL) {
        return new SentinelDecimalImpl(node);
      }
      else if (type == DECIMALS) {
        return new SentinelDecimalsImpl(node);
      }
      else if (type == DECIMAL_DIGIT) {
        return new SentinelDecimalDigitImpl(node);
      }
      else if (type == DEFINITION) {
        return new SentinelDefinitionImpl(node);
      }
      else if (type == DOT_IDENTIFIER) {
        return new SentinelDotIdentifierImpl(node);
      }
      else if (type == ELEMENT) {
        return new SentinelElementImpl(node);
      }
      else if (type == ELEMENT_LIST) {
        return new SentinelElementListImpl(node);
      }
      else if (type == ELSE_OPERATOR) {
        return new SentinelElseOperatorImpl(node);
      }
      else if (type == ESCAPED_CHARACTER) {
        return new SentinelEscapedCharacterImpl(node);
      }
      else if (type == EXPONENT) {
        return new SentinelExponentImpl(node);
      }
      else if (type == EXTERNAL_PARAMETERS) {
        return new SentinelExternalParametersImpl(node);
      }
      else if (type == FLOAT) {
        return new SentinelFloatImpl(node);
      }
      else if (type == FOR_BLOCK) {
        return new SentinelForBlockImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new SentinelForStatementImpl(node);
      }
      else if (type == FUNCTION) {
        return new SentinelFunctionImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new SentinelFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new SentinelFunctionCallImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new SentinelFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_STATEMENT) {
        return new SentinelFunctionStatementImpl(node);
      }
      else if (type == GLOBAL_VARIABLE_DEFINITION) {
        return new SentinelGlobalVariableDefinitionImpl(node);
      }
      else if (type == HEX_DIGIT) {
        return new SentinelHexDigitImpl(node);
      }
      else if (type == HEX_LITERAL) {
        return new SentinelHexLiteralImpl(node);
      }
      else if (type == IDENTIFIER_LIST) {
        return new SentinelIdentifierListImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new SentinelIfStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new SentinelImportStatementImpl(node);
      }
      else if (type == KEYED_ELEMENT) {
        return new SentinelKeyedElementImpl(node);
      }
      else if (type == KEYED_ELEMENT_LIST) {
        return new SentinelKeyedElementListImpl(node);
      }
      else if (type == LETTER) {
        return new SentinelLetterImpl(node);
      }
      else if (type == LIST_DEFINITION) {
        return new SentinelListDefinitionImpl(node);
      }
      else if (type == LITERAL) {
        return new SentinelLiteralImpl(node);
      }
      else if (type == LOGICAL_OPERATOR) {
        return new SentinelLogicalOperatorImpl(node);
      }
      else if (type == MAIN_RULE) {
        return new SentinelMainRuleImpl(node);
      }
      else if (type == MAIN_RULE_BLOCK) {
        return new SentinelMainRuleBlockImpl(node);
      }
      else if (type == MAP_DEFINITION) {
        return new SentinelMapDefinitionImpl(node);
      }
      else if (type == MULTIPLE_DIVIDE_OPERATOR) {
        return new SentinelMultipleDivideOperatorImpl(node);
      }
      else if (type == NULL_LITERAL) {
        return new SentinelNullLiteralImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new SentinelNumberLiteralImpl(node);
      }
      else if (type == OCTAL_DIGIT) {
        return new SentinelOctalDigitImpl(node);
      }
      else if (type == OCTAL_LITERAL) {
        return new SentinelOctalLiteralImpl(node);
      }
      else if (type == PARAMETERS) {
        return new SentinelParametersImpl(node);
      }
      else if (type == QUANTIFIER_EXPRESSION) {
        return new SentinelQuantifierExpressionImpl(node);
      }
      else if (type == QUANTIFIER_OPERATOR) {
        return new SentinelQuantifierOperatorImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new SentinelReturnStatementImpl(node);
      }
      else if (type == RULE_BASE) {
        return new SentinelRuleBaseImpl(node);
      }
      else if (type == RULE_DEFINITION) {
        return new SentinelRuleDefinitionImpl(node);
      }
      else if (type == SELECTOR) {
        return new SentinelSelectorImpl(node);
      }
      else if (type == SET_OPERATOR) {
        return new SentinelSetOperatorImpl(node);
      }
      else if (type == STATEMENT) {
        return new SentinelStatementImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new SentinelStringLiteralImpl(node);
      }
      else if (type == UNARY_OPERATOR) {
        return new SentinelUnaryOperatorImpl(node);
      }
      else if (type == UNDEFINED_LITERAL) {
        return new SentinelUndefinedLiteralImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new SentinelVariableDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
