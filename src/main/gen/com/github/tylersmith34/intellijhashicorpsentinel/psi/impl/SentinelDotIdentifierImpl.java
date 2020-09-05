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

public class SentinelDotIdentifierImpl extends ASTWrapperPsiElement implements SentinelDotIdentifier {

  public SentinelDotIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitDotIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SentinelNumberLiteral> getNumberLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelNumberLiteral.class);
  }

  @Override
  @NotNull
  public List<SentinelSelector> getSelectorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelSelector.class);
  }

  @Override
  @NotNull
  public List<SentinelStringLiteral> getStringLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SentinelStringLiteral.class);
  }

}
