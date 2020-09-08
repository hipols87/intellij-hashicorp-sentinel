// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelConcatenatedLiteral extends PsiElement {

  @Nullable
  SentinelChainedIdentifier getChainedIdentifier();

  @Nullable
  SentinelLiteral getLiteral();

  @NotNull
  List<SentinelVariableConcatenation> getVariableConcatenationList();

  @Nullable
  PsiElement getIdentifier();

}
