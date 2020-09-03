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

public class SentinelBinaryOpImpl extends ASTWrapperPsiElement implements SentinelBinaryOp {

  public SentinelBinaryOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitBinaryOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelAddOp getAddOp() {
    return findChildByClass(SentinelAddOp.class);
  }

  @Override
  @Nullable
  public SentinelElseOp getElseOp() {
    return findChildByClass(SentinelElseOp.class);
  }

  @Override
  @Nullable
  public SentinelLogicalOp getLogicalOp() {
    return findChildByClass(SentinelLogicalOp.class);
  }

  @Override
  @Nullable
  public SentinelMulOp getMulOp() {
    return findChildByClass(SentinelMulOp.class);
  }

  @Override
  @Nullable
  public SentinelRelOp getRelOp() {
    return findChildByClass(SentinelRelOp.class);
  }

  @Override
  @Nullable
  public SentinelSetOp getSetOp() {
    return findChildByClass(SentinelSetOp.class);
  }

}
