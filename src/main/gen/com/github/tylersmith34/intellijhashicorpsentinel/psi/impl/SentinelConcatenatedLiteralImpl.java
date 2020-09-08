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

public class SentinelConcatenatedLiteralImpl extends ASTWrapperPsiElement implements SentinelConcatenatedLiteral {

  public SentinelConcatenatedLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitConcatenatedLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelChainedIdentifier getChainedIdentifier() {
    return findChildByClass(SentinelChainedIdentifier.class);
  }

  @Override
  @Nullable
  public SentinelLiteral getLiteral() {
    return findChildByClass(SentinelLiteral.class);
  }

  @Override
  @NotNull
  public List<SentinelVariableConcatenation> getVariableConcatenationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelVariableConcatenation.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
