// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelVariableAssignment extends PsiElement {

  @Nullable
  SentinelBooleanExpressions getBooleanExpressions();

  @NotNull
  List<SentinelChainedIdentifier> getChainedIdentifierList();

  @NotNull
  List<SentinelFunctionCall> getFunctionCallList();

  @Nullable
  SentinelListDefinition getListDefinition();

  @NotNull
  List<SentinelLiteral> getLiteralList();

  @Nullable
  SentinelMapDefinition getMapDefinition();

  @Nullable
  SentinelQuantifierExpression getQuantifierExpression();

}
