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

public class SentinelLiteralImpl extends ASTWrapperPsiElement implements SentinelLiteral {

  public SentinelLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelBooleanLiteral getBooleanLiteral() {
    return findChildByClass(SentinelBooleanLiteral.class);
  }

  @Override
  @Nullable
  public SentinelDecimal getDecimal() {
    return findChildByClass(SentinelDecimal.class);
  }

  @Override
  @Nullable
  public SentinelFloat getFloat() {
    return findChildByClass(SentinelFloat.class);
  }

  @Override
  @Nullable
  public SentinelHexLiteral getHexLiteral() {
    return findChildByClass(SentinelHexLiteral.class);
  }

  @Override
  @Nullable
  public SentinelNullLiteral getNullLiteral() {
    return findChildByClass(SentinelNullLiteral.class);
  }

  @Override
  @Nullable
  public SentinelNumberLiteral getNumberLiteral() {
    return findChildByClass(SentinelNumberLiteral.class);
  }

  @Override
  @Nullable
  public SentinelOctalLiteral getOctalLiteral() {
    return findChildByClass(SentinelOctalLiteral.class);
  }

  @Override
  @Nullable
  public SentinelStringLiteral getStringLiteral() {
    return findChildByClass(SentinelStringLiteral.class);
  }

  @Override
  @Nullable
  public SentinelUndefinedLiteral getUndefinedLiteral() {
    return findChildByClass(SentinelUndefinedLiteral.class);
  }

}
