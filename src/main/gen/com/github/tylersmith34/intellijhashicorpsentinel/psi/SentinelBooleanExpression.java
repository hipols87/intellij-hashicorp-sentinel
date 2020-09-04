// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelBooleanExpression extends PsiElement {

  @Nullable
  SentinelComparisonOperator getComparisonOperator();

  @Nullable
  SentinelFunctionCall getFunctionCall();

  @Nullable
  SentinelLiteral getLiteral();

  @Nullable
  SentinelSetOperator getSetOperator();

  @Nullable
  SentinelUnaryOperator getUnaryOperator();

  @Nullable
  PsiElement getIdentifier();

}
