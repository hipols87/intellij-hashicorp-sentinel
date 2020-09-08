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

public class SentinelStatementImpl extends ASTWrapperPsiElement implements SentinelStatement {

  public SentinelStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelCaseStatement getCaseStatement() {
    return findChildByClass(SentinelCaseStatement.class);
  }

  @Override
  @Nullable
  public SentinelForStatement getForStatement() {
    return findChildByClass(SentinelForStatement.class);
  }

  @Override
  @Nullable
  public SentinelFunctionCall getFunctionCall() {
    return findChildByClass(SentinelFunctionCall.class);
  }

  @Override
  @Nullable
  public SentinelIfStatement getIfStatement() {
    return findChildByClass(SentinelIfStatement.class);
  }

  @Override
  @Nullable
  public SentinelReturnStatement getReturnStatement() {
    return findChildByClass(SentinelReturnStatement.class);
  }

  @Override
  @Nullable
  public SentinelVariableDefinition getVariableDefinition() {
    return findChildByClass(SentinelVariableDefinition.class);
  }

}
