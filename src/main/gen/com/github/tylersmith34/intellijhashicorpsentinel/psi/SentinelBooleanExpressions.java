// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelBooleanExpressions extends PsiElement {

  @NotNull
  List<SentinelBooleanExpression> getBooleanExpressionList();

  @Nullable
  SentinelElseOperator getElseOperator();

  @NotNull
  List<SentinelLogicalOperator> getLogicalOperatorList();

}
