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

public class SentinelIntLitImpl extends ASTWrapperPsiElement implements SentinelIntLit {

  public SentinelIntLitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitIntLit(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelDecimalLit getDecimalLit() {
    return findChildByClass(SentinelDecimalLit.class);
  }

  @Override
  @Nullable
  public SentinelHexLit getHexLit() {
    return findChildByClass(SentinelHexLit.class);
  }

  @Override
  @Nullable
  public SentinelOctalLit getOctalLit() {
    return findChildByClass(SentinelOctalLit.class);
  }

}
