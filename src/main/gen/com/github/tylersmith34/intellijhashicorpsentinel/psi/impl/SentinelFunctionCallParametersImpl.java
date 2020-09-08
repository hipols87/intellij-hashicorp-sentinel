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

public class SentinelFunctionCallParametersImpl extends ASTWrapperPsiElement implements SentinelFunctionCallParameters {

  public SentinelFunctionCallParametersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitFunctionCallParameters(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SentinelChainedIdentifier> getChainedIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelChainedIdentifier.class);
  }

  @Override
  @NotNull
  public List<SentinelConcatenatedLiteral> getConcatenatedLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelConcatenatedLiteral.class);
  }

  @Override
  @NotNull
  public List<SentinelLiteral> getLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelLiteral.class);
  }

}
