// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelBooleanExpressionSegment extends PsiElement {

  @Nullable
  SentinelChainedIdentifier getChainedIdentifier();

  @Nullable
  SentinelFunctionCall getFunctionCall();

  @Nullable
  SentinelLiteral getLiteral();

  @Nullable
  SentinelQuantifierExpression getQuantifierExpression();

  @Nullable
  PsiElement getIdentifier();

}
