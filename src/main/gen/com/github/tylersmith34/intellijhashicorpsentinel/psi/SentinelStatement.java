// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelStatement extends PsiElement {

  @Nullable
  SentinelForStatement getForStatement();

  @Nullable
  SentinelFunctionCall getFunctionCall();

  @Nullable
  SentinelIfStatement getIfStatement();

  @Nullable
  SentinelReturnStatement getReturnStatement();

  @Nullable
  SentinelVariableDefinition getVariableDefinition();

}
