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

public class SentinelUnaryExpressionImpl extends ASTWrapperPsiElement implements SentinelUnaryExpression {

  public SentinelUnaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitUnaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelUnaryOperator getUnaryOperator() {
    return findChildByClass(SentinelUnaryOperator.class);
  }

  @Override
  @Nullable
  public SentinelPrimaryExpression getPrimaryExpression() {
    return findChildByClass(SentinelPrimaryExpression.class);
  }

  @Override
  @Nullable
  public SentinelUnaryExpression getUnaryExpression() {
    return findChildByClass(SentinelUnaryExpression.class);
  }

}
