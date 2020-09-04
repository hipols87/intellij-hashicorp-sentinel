// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelIfStatement extends PsiElement {

  @NotNull
  List<SentinelBlock> getBlockList();

  @NotNull
  SentinelBooleanExpressions getBooleanExpressions();

  @Nullable
  SentinelIfStatement getIfStatement();

}
