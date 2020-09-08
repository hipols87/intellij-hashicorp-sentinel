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

public class SentinelBlockImpl extends ASTWrapperPsiElement implements SentinelBlock {

  public SentinelBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelBreakStmt getBreakStmt() {
    return findChildByClass(SentinelBreakStmt.class);
  }

  @Override
  @Nullable
  public SentinelContinueStmt getContinueStmt() {
    return findChildByClass(SentinelContinueStmt.class);
  }

  @Override
  @Nullable
  public SentinelStatement getStatement() {
    return findChildByClass(SentinelStatement.class);
  }

}
