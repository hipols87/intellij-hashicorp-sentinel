// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelElementType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelTokenType;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.impl.*;

public interface SentinelTypes {

  IElementType PROPERTY = new SentinelElementType("PROPERTY");

  IElementType BLOCK_COMMENT = new SentinelTokenType("block_comment");
  IElementType COMMA = new SentinelTokenType(",");
  IElementType COMMENT = new SentinelTokenType("COMMENT");
  IElementType CRLF = new SentinelTokenType("CRLF");
  IElementType DOUBLE_QUOTED_STRING = new SentinelTokenType("DOUBLE_QUOTED_STRING");
  IElementType EQUALS = new SentinelTokenType("=");
  IElementType FALSE = new SentinelTokenType("false");
  IElementType ID = new SentinelTokenType("ID");
  IElementType KEY = new SentinelTokenType("KEY");
  IElementType LINE_COMMENT = new SentinelTokenType("line_comment");
  IElementType L_BRACKET = new SentinelTokenType("[");
  IElementType L_CURLY = new SentinelTokenType("{");
  IElementType NULL = new SentinelTokenType("null");
  IElementType NUMBER = new SentinelTokenType("NUMBER");
  IElementType R_BRACKET = new SentinelTokenType("]");
  IElementType R_CURLY = new SentinelTokenType("}");
  IElementType SEPARATOR = new SentinelTokenType("SEPARATOR");
  IElementType SINGLE_QUOTED_STRING = new SentinelTokenType("SINGLE_QUOTED_STRING");
  IElementType TRUE = new SentinelTokenType("true");
  IElementType UNDEFINED = new SentinelTokenType("undefined");
  IElementType VALUE = new SentinelTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new SentinelPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
