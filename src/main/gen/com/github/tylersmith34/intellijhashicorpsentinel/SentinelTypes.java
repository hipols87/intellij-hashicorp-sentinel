// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelElementType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelTokenType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.impl.*;

public interface SentinelTypes {

  IElementType BOOLEAN_LITERAL = new SentinelElementType("BOOLEAN_LITERAL");
  IElementType DEFINITION = new SentinelElementType("DEFINITION");
  IElementType EXTERNAL_PARAMETER = new SentinelElementType("EXTERNAL_PARAMETER");
  IElementType FUNCTION_BODY = new SentinelElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new SentinelElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_INPUT = new SentinelElementType("FUNCTION_INPUT");
  IElementType IMPORT_STATEMENT = new SentinelElementType("IMPORT_STATEMENT");
  IElementType LITERAL = new SentinelElementType("LITERAL");
  IElementType MAIN_FUNCTION = new SentinelElementType("MAIN_FUNCTION");
  IElementType NULL_LITERAL = new SentinelElementType("NULL_LITERAL");
  IElementType NUMBER_LITERAL = new SentinelElementType("NUMBER_LITERAL");
  IElementType RETURN_STATEMENT = new SentinelElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new SentinelElementType("STATEMENT");
  IElementType STRING_LITERAL = new SentinelElementType("STRING_LITERAL");
  IElementType TYPE = new SentinelElementType("TYPE");
  IElementType UNDEFINED_LITERAL = new SentinelElementType("UNDEFINED_LITERAL");
  IElementType VARIABLE_DEFINITION = new SentinelElementType("VARIABLE_DEFINITION");

  IElementType ARRAY = new SentinelTokenType("array");
  IElementType AS = new SentinelTokenType("as");
  IElementType BLOCK_COMMENT = new SentinelTokenType("BLOCK_COMMENT");
  IElementType COMMA = new SentinelTokenType(",");
  IElementType COMMENT = new SentinelTokenType("COMMENT");
  IElementType CRLF = new SentinelTokenType("CRLF");
  IElementType DEFAULT = new SentinelTokenType("default");
  IElementType DOUBLE_QUOTED_STRING = new SentinelTokenType("DOUBLE_QUOTED_STRING");
  IElementType EQUALS = new SentinelTokenType("=");
  IElementType FALSE = new SentinelTokenType("false");
  IElementType FUNC = new SentinelTokenType("func");
  IElementType IDENTIFIER = new SentinelTokenType("IDENTIFIER");
  IElementType IMPORT = new SentinelTokenType("import");
  IElementType INT = new SentinelTokenType("int");
  IElementType LIST = new SentinelTokenType("list");
  IElementType L_BRACKET = new SentinelTokenType("[");
  IElementType L_CURLY = new SentinelTokenType("{");
  IElementType L_PAREN = new SentinelTokenType("(");
  IElementType MAIN = new SentinelTokenType("main");
  IElementType MAP = new SentinelTokenType("map");
  IElementType NULL = new SentinelTokenType("null");
  IElementType NUMBER = new SentinelTokenType("NUMBER");
  IElementType OBJECT = new SentinelTokenType("object");
  IElementType PARAM = new SentinelTokenType("param");
  IElementType RETURN = new SentinelTokenType("return");
  IElementType RULE = new SentinelTokenType("rule");
  IElementType R_BRACKET = new SentinelTokenType("]");
  IElementType R_CURLY = new SentinelTokenType("}");
  IElementType R_PAREN = new SentinelTokenType(")");
  IElementType SINGLE_QUOTED_STRING = new SentinelTokenType("SINGLE_QUOTED_STRING");
  IElementType STRING = new SentinelTokenType("string");
  IElementType TRUE = new SentinelTokenType("true");
  IElementType UNDEFINED = new SentinelTokenType("undefined");
  IElementType VALUE = new SentinelTokenType("value");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BOOLEAN_LITERAL) {
        return new SentinelBooleanLiteralImpl(node);
      }
      else if (type == DEFINITION) {
        return new SentinelDefinitionImpl(node);
      }
      else if (type == EXTERNAL_PARAMETER) {
        return new SentinelExternalParameterImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new SentinelFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new SentinelFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_INPUT) {
        return new SentinelFunctionInputImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new SentinelImportStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new SentinelLiteralImpl(node);
      }
      else if (type == MAIN_FUNCTION) {
        return new SentinelMainFunctionImpl(node);
      }
      else if (type == NULL_LITERAL) {
        return new SentinelNullLiteralImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new SentinelNumberLiteralImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new SentinelReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new SentinelStatementImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new SentinelStringLiteralImpl(node);
      }
      else if (type == TYPE) {
        return new SentinelTypeImpl(node);
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
