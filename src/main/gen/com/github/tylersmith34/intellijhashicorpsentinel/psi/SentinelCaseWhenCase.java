// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelCaseWhenCase extends PsiElement {

  @NotNull
  List<SentinelCaseClause> getCaseClauseList();

  @Nullable
  SentinelElseClause getElseClause();

}
