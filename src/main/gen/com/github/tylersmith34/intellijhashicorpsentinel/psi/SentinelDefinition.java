// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelDefinition extends PsiElement {

  @Nullable
  SentinelExternalParameters getExternalParameters();

  @Nullable
  SentinelFunctionDeclaration getFunctionDeclaration();

  @Nullable
  SentinelGlobalVariableDefinition getGlobalVariableDefinition();

  @Nullable
  SentinelImportStatement getImportStatement();

  @Nullable
  SentinelMainRule getMainRule();

  @Nullable
  SentinelRuleDefinition getRuleDefinition();

}
