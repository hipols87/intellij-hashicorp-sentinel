// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelLiteral extends PsiElement {

  @Nullable
  SentinelBooleanLiteral getBooleanLiteral();

  @Nullable
  SentinelDecimal getDecimal();

  @Nullable
  SentinelFloat getFloat();

  @Nullable
  SentinelHexLiteral getHexLiteral();

  @Nullable
  SentinelNullLiteral getNullLiteral();

  @Nullable
  SentinelNumberLiteral getNumberLiteral();

  @Nullable
  SentinelOctalLiteral getOctalLiteral();

  @Nullable
  SentinelStringLiteral getStringLiteral();

  @Nullable
  SentinelUndefinedLiteral getUndefinedLiteral();

  @Nullable
  PsiElement getNumber();

}
