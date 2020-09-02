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

public class SentinelExpressionImpl extends ASTWrapperPsiElement implements SentinelExpression {

  public SentinelExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelBinaryOp getBinaryOp() {
    return findChildByClass(SentinelBinaryOp.class);
  }

  @Override
  @NotNull
  public List<SentinelExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelExpression.class);
  }

  @Override
  @Nullable
  public SentinelUnaryExpr getUnaryExpr() {
    return findChildByClass(SentinelUnaryExpr.class);
  }

}
