package com.github.tylersmith34.intellijhashicorpsentinel.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class SentinelPsiElement extends ASTWrapperPsiElement {
    public SentinelPsiElement(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return "SentinelPsiElement.";
    }
}
