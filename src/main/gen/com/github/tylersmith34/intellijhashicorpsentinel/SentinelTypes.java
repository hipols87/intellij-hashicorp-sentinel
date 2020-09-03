// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelElementType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelTokenType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.impl.*;

public interface SentinelTypes {

  IElementType ADD_OP = new SentinelElementType("ADD_OP");
  IElementType ARGUMENTS = new SentinelElementType("ARGUMENTS");
  IElementType ASSIGNMENT = new SentinelElementType("ASSIGNMENT");
  IElementType ASSIGN_EXPR = new SentinelElementType("ASSIGN_EXPR");
  IElementType ASSIGN_OP = new SentinelElementType("ASSIGN_OP");
  IElementType BASIC_LIT = new SentinelElementType("BASIC_LIT");
  IElementType BIG_U_VALUE = new SentinelElementType("BIG_U_VALUE");
  IElementType BINARY_OP = new SentinelElementType("BINARY_OP");
  IElementType BOOLEAN_LITERAL = new SentinelElementType("BOOLEAN_LITERAL");
  IElementType BREAK_STMT = new SentinelElementType("BREAK_STMT");
  IElementType BYTE_VALUE = new SentinelElementType("BYTE_VALUE");
  IElementType CASE_STMT = new SentinelElementType("CASE_STMT");
  IElementType CASE_WHEN_CASE = new SentinelElementType("CASE_WHEN_CASE");
  IElementType CASE_WHEN_CLAUSE = new SentinelElementType("CASE_WHEN_CLAUSE");
  IElementType CONTINUE_STMT = new SentinelElementType("CONTINUE_STMT");
  IElementType DECIMALS = new SentinelElementType("DECIMALS");
  IElementType DECIMAL_LIT = new SentinelElementType("DECIMAL_LIT");
  IElementType DEFINITION = new SentinelElementType("DEFINITION");
  IElementType DIGIT = new SentinelElementType("DIGIT");
  IElementType ELEMENT = new SentinelElementType("ELEMENT");
  IElementType ELEMENT_LIST = new SentinelElementType("ELEMENT_LIST");
  IElementType ELSE_OP = new SentinelElementType("ELSE_OP");
  IElementType ESCAPED_CHAR = new SentinelElementType("ESCAPED_CHAR");
  IElementType EXPONENT = new SentinelElementType("EXPONENT");
  IElementType EXPRESSION = new SentinelElementType("EXPRESSION");
  IElementType EXPRESSION_STMT = new SentinelElementType("EXPRESSION_STMT");
  IElementType EXTERNAL_PARAMETERS = new SentinelElementType("EXTERNAL_PARAMETERS");
  IElementType FLOAT_LIT = new SentinelElementType("FLOAT_LIT");
  IElementType FOR_STMT = new SentinelElementType("FOR_STMT");
  IElementType FUNCTION = new SentinelElementType("FUNCTION");
  IElementType FUNCTION_BODY = new SentinelElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new SentinelElementType("FUNCTION_DECLARATION");
  IElementType GLOBAL_VARIABLE_DEFINITION = new SentinelElementType("GLOBAL_VARIABLE_DEFINITION");
  IElementType HEX_BYTE_VALUE = new SentinelElementType("HEX_BYTE_VALUE");
  IElementType HEX_DIGIT = new SentinelElementType("HEX_DIGIT");
  IElementType HEX_LIT = new SentinelElementType("HEX_LIT");
  IElementType IDENTIFIER_LIST = new SentinelElementType("IDENTIFIER_LIST");
  IElementType IF_STMT = new SentinelElementType("IF_STMT");
  IElementType IMPORT_STATEMENT = new SentinelElementType("IMPORT_STATEMENT");
  IElementType INDEX = new SentinelElementType("INDEX");
  IElementType INT_LIT = new SentinelElementType("INT_LIT");
  IElementType KEYED_ELEMENT = new SentinelElementType("KEYED_ELEMENT");
  IElementType KEYED_ELEMENT_LIST = new SentinelElementType("KEYED_ELEMENT_LIST");
  IElementType LETTER = new SentinelElementType("LETTER");
  IElementType LIST_LIT = new SentinelElementType("LIST_LIT");
  IElementType LITERAL = new SentinelElementType("LITERAL");
  IElementType LITTLE_U_VALUE = new SentinelElementType("LITTLE_U_VALUE");
  IElementType LOGICAL_OP = new SentinelElementType("LOGICAL_OP");
  IElementType MAIN_RULE = new SentinelElementType("MAIN_RULE");
  IElementType MAP_LIT = new SentinelElementType("MAP_LIT");
  IElementType MUL_OP = new SentinelElementType("MUL_OP");
  IElementType NULL_LITERAL = new SentinelElementType("NULL_LITERAL");
  IElementType NUMBER = new SentinelElementType("NUMBER");
  IElementType NUMBER_LITERAL = new SentinelElementType("NUMBER_LITERAL");
  IElementType OCTAL_BYTE_VALUE = new SentinelElementType("OCTAL_BYTE_VALUE");
  IElementType OCTAL_DIGIT = new SentinelElementType("OCTAL_DIGIT");
  IElementType OCTAL_LIT = new SentinelElementType("OCTAL_LIT");
  IElementType OPERAND = new SentinelElementType("OPERAND");
  IElementType PARAMETERS = new SentinelElementType("PARAMETERS");
  IElementType PRIMARY_EXPR = new SentinelElementType("PRIMARY_EXPR");
  IElementType QUANT_EXPR = new SentinelElementType("QUANT_EXPR");
  IElementType QUANT_OP = new SentinelElementType("QUANT_OP");
  IElementType REL_OP = new SentinelElementType("REL_OP");
  IElementType RETURN_STATEMENT = new SentinelElementType("RETURN_STATEMENT");
  IElementType RULE_BASE = new SentinelElementType("RULE_BASE");
  IElementType SELECTOR = new SentinelElementType("SELECTOR");
  IElementType SET_OP = new SentinelElementType("SET_OP");
  IElementType SLICE = new SentinelElementType("SLICE");
  IElementType STATEMENT = new SentinelElementType("STATEMENT");
  IElementType STRING_LIT = new SentinelElementType("STRING_LIT");
  IElementType STRING_LITERAL = new SentinelElementType("STRING_LITERAL");
  IElementType UNARY_EXPR = new SentinelElementType("UNARY_EXPR");
  IElementType UNARY_OP = new SentinelElementType("UNARY_OP");
  IElementType UNDEFINED_LITERAL = new SentinelElementType("UNDEFINED_LITERAL");
  IElementType UNICODE_VALUE = new SentinelElementType("UNICODE_VALUE");
  IElementType VARIABLE_DEFINITION = new SentinelElementType("VARIABLE_DEFINITION");

  IElementType ALL = new SentinelTokenType("all");
  IElementType ANY = new SentinelTokenType("any");
  IElementType ARRAY = new SentinelTokenType("array");
  IElementType AS = new SentinelTokenType("as");
  IElementType BLOCK = new SentinelTokenType("Block");
  IElementType BLOCK_COMMENT = new SentinelTokenType("BLOCK_COMMENT");
  IElementType BREAK = new SentinelTokenType("break");
  IElementType CASE = new SentinelTokenType("case");
  IElementType COMMA = new SentinelTokenType(",");
  IElementType COMMENT = new SentinelTokenType("COMMENT");
  IElementType CONTINUE = new SentinelTokenType("continue");
  IElementType CRLF = new SentinelTokenType("CRLF");
  IElementType DEFAULT = new SentinelTokenType("default");
  IElementType DOUBLE_QUOTED_STRING = new SentinelTokenType("DOUBLE_QUOTED_STRING");
  IElementType ELSE = new SentinelTokenType("else");
  IElementType EQUALS = new SentinelTokenType("=");
  IElementType EXPRESSIONS = new SentinelTokenType("Expressions");
  IElementType FALSE = new SentinelTokenType("false");
  IElementType FOR = new SentinelTokenType("for");
  IElementType FUNC = new SentinelTokenType("func");
  IElementType IDENTIFIER = new SentinelTokenType("IDENTIFIER");
  IElementType IF = new SentinelTokenType("if");
  IElementType IMPORT = new SentinelTokenType("import");
  IElementType L_BRACKET = new SentinelTokenType("[");
  IElementType L_CURLY = new SentinelTokenType("{");
  IElementType L_PAREN = new SentinelTokenType("(");
  IElementType MAIN = new SentinelTokenType("main");
  IElementType NULL = new SentinelTokenType("null");
  IElementType OBJECT = new SentinelTokenType("object");
  IElementType PARAM = new SentinelTokenType("param");
  IElementType RETURN = new SentinelTokenType("return");
  IElementType RULE = new SentinelTokenType("rule");
  IElementType R_BRACKET = new SentinelTokenType("]");
  IElementType R_CURLY = new SentinelTokenType("}");
  IElementType R_PAREN = new SentinelTokenType(")");
  IElementType SINGLE_QUOTED_STRING = new SentinelTokenType("SINGLE_QUOTED_STRING");
  IElementType STATEMENTLIST = new SentinelTokenType("StatementList");
  IElementType TRUE = new SentinelTokenType("true");
  IElementType UNDEFINED = new SentinelTokenType("undefined");
  IElementType VALUE = new SentinelTokenType("value");
  IElementType WHEN = new SentinelTokenType("when");
  IElementType _DIGIT_ = new SentinelTokenType("<digit>");
  IElementType _EXPRESSION_ = new SentinelTokenType("<expression>");
  IElementType _NUMBER_ = new SentinelTokenType("<number>");
  IElementType _PRIMARY_EXPR_ = new SentinelTokenType("<primary_expr>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_OP) {
        return new SentinelAddOpImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new SentinelArgumentsImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new SentinelAssignmentImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new SentinelAssignExprImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new SentinelAssignOpImpl(node);
      }
      else if (type == BASIC_LIT) {
        return new SentinelBasicLitImpl(node);
      }
      else if (type == BIG_U_VALUE) {
        return new SentinelBigUValueImpl(node);
      }
      else if (type == BINARY_OP) {
        return new SentinelBinaryOpImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new SentinelBooleanLiteralImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new SentinelBreakStmtImpl(node);
      }
      else if (type == BYTE_VALUE) {
        return new SentinelByteValueImpl(node);
      }
      else if (type == CASE_STMT) {
        return new SentinelCaseStmtImpl(node);
      }
      else if (type == CASE_WHEN_CASE) {
        return new SentinelCaseWhenCaseImpl(node);
      }
      else if (type == CASE_WHEN_CLAUSE) {
        return new SentinelCaseWhenClauseImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new SentinelContinueStmtImpl(node);
      }
      else if (type == DECIMALS) {
        return new SentinelDecimalsImpl(node);
      }
      else if (type == DECIMAL_LIT) {
        return new SentinelDecimalLitImpl(node);
      }
      else if (type == DEFINITION) {
        return new SentinelDefinitionImpl(node);
      }
      else if (type == DIGIT) {
        return new SentinelDigitImpl(node);
      }
      else if (type == ELEMENT) {
        return new SentinelElementImpl(node);
      }
      else if (type == ELEMENT_LIST) {
        return new SentinelElementListImpl(node);
      }
      else if (type == ELSE_OP) {
        return new SentinelElseOpImpl(node);
      }
      else if (type == ESCAPED_CHAR) {
        return new SentinelEscapedCharImpl(node);
      }
      else if (type == EXPONENT) {
        return new SentinelExponentImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SentinelExpressionImpl(node);
      }
      else if (type == EXPRESSION_STMT) {
        return new SentinelExpressionStmtImpl(node);
      }
      else if (type == EXTERNAL_PARAMETERS) {
        return new SentinelExternalParametersImpl(node);
      }
      else if (type == FLOAT_LIT) {
        return new SentinelFloatLitImpl(node);
      }
      else if (type == FOR_STMT) {
        return new SentinelForStmtImpl(node);
      }
      else if (type == FUNCTION) {
        return new SentinelFunctionImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new SentinelFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new SentinelFunctionDeclarationImpl(node);
      }
      else if (type == GLOBAL_VARIABLE_DEFINITION) {
        return new SentinelGlobalVariableDefinitionImpl(node);
      }
      else if (type == HEX_BYTE_VALUE) {
        return new SentinelHexByteValueImpl(node);
      }
      else if (type == HEX_DIGIT) {
        return new SentinelHexDigitImpl(node);
      }
      else if (type == HEX_LIT) {
        return new SentinelHexLitImpl(node);
      }
      else if (type == IDENTIFIER_LIST) {
        return new SentinelIdentifierListImpl(node);
      }
      else if (type == IF_STMT) {
        return new SentinelIfStmtImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new SentinelImportStatementImpl(node);
      }
      else if (type == INDEX) {
        return new SentinelIndexImpl(node);
      }
      else if (type == INT_LIT) {
        return new SentinelIntLitImpl(node);
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
      else if (type == LIST_LIT) {
        return new SentinelListLitImpl(node);
      }
      else if (type == LITERAL) {
        return new SentinelLiteralImpl(node);
      }
      else if (type == LITTLE_U_VALUE) {
        return new SentinelLittleUValueImpl(node);
      }
      else if (type == LOGICAL_OP) {
        return new SentinelLogicalOpImpl(node);
      }
      else if (type == MAIN_RULE) {
        return new SentinelMainRuleImpl(node);
      }
      else if (type == MAP_LIT) {
        return new SentinelMapLitImpl(node);
      }
      else if (type == MUL_OP) {
        return new SentinelMulOpImpl(node);
      }
      else if (type == NULL_LITERAL) {
        return new SentinelNullLiteralImpl(node);
      }
      else if (type == NUMBER) {
        return new SentinelNumberImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new SentinelNumberLiteralImpl(node);
      }
      else if (type == OCTAL_BYTE_VALUE) {
        return new SentinelOctalByteValueImpl(node);
      }
      else if (type == OCTAL_DIGIT) {
        return new SentinelOctalDigitImpl(node);
      }
      else if (type == OCTAL_LIT) {
        return new SentinelOctalLitImpl(node);
      }
      else if (type == OPERAND) {
        return new SentinelOperandImpl(node);
      }
      else if (type == PARAMETERS) {
        return new SentinelParametersImpl(node);
      }
      else if (type == PRIMARY_EXPR) {
        return new SentinelPrimaryExprImpl(node);
      }
      else if (type == QUANT_EXPR) {
        return new SentinelQuantExprImpl(node);
      }
      else if (type == QUANT_OP) {
        return new SentinelQuantOpImpl(node);
      }
      else if (type == REL_OP) {
        return new SentinelRelOpImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new SentinelReturnStatementImpl(node);
      }
      else if (type == RULE_BASE) {
        return new SentinelRuleBaseImpl(node);
      }
      else if (type == SELECTOR) {
        return new SentinelSelectorImpl(node);
      }
      else if (type == SET_OP) {
        return new SentinelSetOpImpl(node);
      }
      else if (type == SLICE) {
        return new SentinelSliceImpl(node);
      }
      else if (type == STATEMENT) {
        return new SentinelStatementImpl(node);
      }
      else if (type == STRING_LIT) {
        return new SentinelStringLitImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new SentinelStringLiteralImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new SentinelUnaryExprImpl(node);
      }
      else if (type == UNARY_OP) {
        return new SentinelUnaryOpImpl(node);
      }
      else if (type == UNDEFINED_LITERAL) {
        return new SentinelUndefinedLiteralImpl(node);
      }
      else if (type == UNICODE_VALUE) {
        return new SentinelUnicodeValueImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new SentinelVariableDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
