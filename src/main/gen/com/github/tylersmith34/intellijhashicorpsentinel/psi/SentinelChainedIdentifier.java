// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelChainedIdentifier extends PsiElement {

  @NotNull
  List<SentinelElseOperator> getElseOperatorList();

  @NotNull
  List<SentinelFunctionCall> getFunctionCallList();

  @NotNull
  List<SentinelLiteral> getLiteralList();

  @NotNull
  List<SentinelNumberLiteral> getNumberLiteralList();

  @NotNull
  List<SentinelSelector> getSelectorList();

  @NotNull
  List<SentinelStringLiteral> getStringLiteralList();

}
