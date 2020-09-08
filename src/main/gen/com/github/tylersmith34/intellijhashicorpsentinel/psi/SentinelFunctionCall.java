// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelFunctionCall extends PsiElement {

  @Nullable
  SentinelElseOperator getElseOperator();

  @NotNull
  SentinelFunctionCallParameters getFunctionCallParameters();

  @NotNull
  PsiElement getIdentifier();

}
