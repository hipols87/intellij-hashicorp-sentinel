// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelStringLiteral extends PsiElement {

  @NotNull
  List<SentinelEscapedChar> getEscapedCharList();

  @NotNull
  List<SentinelLetter> getLetterList();

  @Nullable
  PsiElement getDoubleQuotedString();

  @Nullable
  PsiElement getSingleQuotedString();

}
