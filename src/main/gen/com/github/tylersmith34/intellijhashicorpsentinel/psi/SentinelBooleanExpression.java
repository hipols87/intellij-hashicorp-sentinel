// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelBooleanExpression extends PsiElement {

  @Nullable
  SentinelBooleanOperators getBooleanOperators();

  @Nullable
  SentinelElseOperator getElseOperator();

  @Nullable
  SentinelFunctionCall getFunctionCall();

  @Nullable
  SentinelIdent getIdent();

  @Nullable
  SentinelLiteral getLiteral();

  @Nullable
  SentinelQuantifierExpression getQuantifierExpression();

  @Nullable
  SentinelUnaryOperator getUnaryOperator();

}
