// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelBooleanExpression extends PsiElement {

  @Nullable
  SentinelAddSubtractOperator getAddSubtractOperator();

  @Nullable
  SentinelComparisonOperator getComparisonOperator();

  @Nullable
  SentinelElseOperator getElseOperator();

  @Nullable
  SentinelFunctionCall getFunctionCall();

  @Nullable
  SentinelLiteral getLiteral();

  @Nullable
  SentinelMultipleDivideOperator getMultipleDivideOperator();

  @Nullable
  SentinelSetOperator getSetOperator();

  @Nullable
  SentinelUnaryOperator getUnaryOperator();

  @Nullable
  PsiElement getIdentifier();

}
