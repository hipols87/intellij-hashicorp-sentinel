// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelBinaryOp extends PsiElement {

  @Nullable
  SentinelAddSubtractOperator getAddSubtractOperator();

  @Nullable
  SentinelMultipleDivideOperator getMultipleDivideOperator();

  @Nullable
  SentinelElseOp getElseOp();

  @Nullable
  SentinelLogicalOp getLogicalOp();

  @Nullable
  SentinelRelOp getRelOp();

  @Nullable
  SentinelSetOp getSetOp();

}
