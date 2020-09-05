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

public class SentinelBooleanExpressionImpl extends ASTWrapperPsiElement implements SentinelBooleanExpression {

  public SentinelBooleanExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitBooleanExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelBooleanOperators getBooleanOperators() {
    return findChildByClass(SentinelBooleanOperators.class);
  }

  @Override
  @Nullable
  public SentinelElseOperator getElseOperator() {
    return findChildByClass(SentinelElseOperator.class);
  }

  @Override
  @Nullable
  public SentinelFunctionCall getFunctionCall() {
    return findChildByClass(SentinelFunctionCall.class);
  }

  @Override
  @Nullable
  public SentinelLiteral getLiteral() {
    return findChildByClass(SentinelLiteral.class);
  }

  @Override
  @Nullable
  public SentinelQuantifierExpression getQuantifierExpression() {
    return findChildByClass(SentinelQuantifierExpression.class);
  }

  @Override
  @Nullable
  public SentinelUnaryOperator getUnaryOperator() {
    return findChildByClass(SentinelUnaryOperator.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
