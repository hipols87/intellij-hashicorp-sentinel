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

public class SentinelPrimaryExpressionImpl extends ASTWrapperPsiElement implements SentinelPrimaryExpression {

  public SentinelPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelArguments getArguments() {
    return findChildByClass(SentinelArguments.class);
  }

  @Override
  @Nullable
  public SentinelIndex getIndex() {
    return findChildByClass(SentinelIndex.class);
  }

  @Override
  @Nullable
  public SentinelOperand getOperand() {
    return findChildByClass(SentinelOperand.class);
  }

  @Override
  @Nullable
  public SentinelSelector getSelector() {
    return findChildByClass(SentinelSelector.class);
  }

  @Override
  @Nullable
  public SentinelSlice getSlice() {
    return findChildByClass(SentinelSlice.class);
  }

  @Override
  @NotNull
  public List<SentinelPrimaryExpression> getPrimaryExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelPrimaryExpression.class);
  }

}
