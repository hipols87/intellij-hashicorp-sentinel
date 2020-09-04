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

public class SentinelBinaryOperationImpl extends ASTWrapperPsiElement implements SentinelBinaryOperation {

  public SentinelBinaryOperationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitBinaryOperation(this);
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
  public SentinelComparisonOperator getComparisonOperator() {
    return findChildByClass(SentinelComparisonOperator.class);
  }

  @Override
  @Nullable
  public SentinelElseOperator getElseOperator() {
    return findChildByClass(SentinelElseOperator.class);
  }

  @Override
  @Nullable
  public SentinelLogicalOperator getLogicalOperator() {
    return findChildByClass(SentinelLogicalOperator.class);
  }

  @Override
  @Nullable
  public SentinelMultipleDivideOperator getMultipleDivideOperator() {
    return findChildByClass(SentinelMultipleDivideOperator.class);
  }

  @Override
  @Nullable
  public SentinelSetOperator getSetOperator() {
    return findChildByClass(SentinelSetOperator.class);
  }

}