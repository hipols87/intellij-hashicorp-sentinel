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

public class SentinelBooleanExpressionsImpl extends ASTWrapperPsiElement implements SentinelBooleanExpressions {

  public SentinelBooleanExpressionsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitBooleanExpressions(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SentinelBooleanExpression> getBooleanExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelBooleanExpression.class);
  }

  @Override
  @Nullable
  public SentinelElseOperator getElseOperator() {
    return findChildByClass(SentinelElseOperator.class);
  }

  @Override
  @NotNull
  public List<SentinelLogicalOperator> getLogicalOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelLogicalOperator.class);
  }

}
