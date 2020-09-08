// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.*;

public class SentinelVariableDefinitionImpl extends ASTWrapperPsiElement implements SentinelVariableDefinition {

  public SentinelVariableDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitVariableDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelAddSubtractOperator getAddSubtractOperator() {
    return findChildByClass(SentinelAddSubtractOperator.class);
  }

  @Override
  @Nullable
  public SentinelBooleanExpressions getBooleanExpressions() {
    return findChildByClass(SentinelBooleanExpressions.class);
  }

  @Override
  @NotNull
  public SentinelChainedIdentifier getChainedIdentifier() {
    return findNotNullChildByClass(SentinelChainedIdentifier.class);
  }

  @Override
  @Nullable
  public SentinelFunctionCall getFunctionCall() {
    return findChildByClass(SentinelFunctionCall.class);
  }

  @Override
  @Nullable
  public SentinelListDefinition getListDefinition() {
    return findChildByClass(SentinelListDefinition.class);
  }

  @Override
  @Nullable
  public SentinelLiteral getLiteral() {
    return findChildByClass(SentinelLiteral.class);
  }

  @Override
  @Nullable
  public SentinelMapDefinition getMapDefinition() {
    return findChildByClass(SentinelMapDefinition.class);
  }

  @Override
  @Nullable
  public SentinelMultipleDivideOperator getMultipleDivideOperator() {
    return findChildByClass(SentinelMultipleDivideOperator.class);
  }

  @Override
  @Nullable
  public SentinelQuantifierExpression getQuantifierExpression() {
    return findChildByClass(SentinelQuantifierExpression.class);
  }

  @Override
  @NotNull
  public List<SentinelVariableConcatenation> getVariableConcatenationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelVariableConcatenation.class);
  }

}
