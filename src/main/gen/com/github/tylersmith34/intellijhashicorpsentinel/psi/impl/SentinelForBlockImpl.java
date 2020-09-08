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

public class SentinelForBlockImpl extends ASTWrapperPsiElement implements SentinelForBlock {

  public SentinelForBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitForBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SentinelBreakStmt> getBreakStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelBreakStmt.class);
  }

  @Override
  @NotNull
  public List<SentinelContinueStmt> getContinueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelContinueStmt.class);
  }

  @Override
  @NotNull
  public List<SentinelStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelStatement.class);
  }

}
