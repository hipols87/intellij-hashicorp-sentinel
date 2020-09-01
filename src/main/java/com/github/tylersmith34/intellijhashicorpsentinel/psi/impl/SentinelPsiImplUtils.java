package com.github.tylersmith34.intellijhashicorpsentinel.psi.impl;

import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelStringLiteral;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelUtils;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SentinelPsiImplUtils {
    public static SentinelPsiImplUtils INSTANCE = new SentinelPsiImplUtils();

    public char getQuoteSymbol(SentinelStringLiteral literal) {
        return literal.getText().charAt(0);
    }

    public List<Pair<TextRange, String>> getTextFragments(@NotNull SentinelStringLiteral literal) {
        return PsiUtil.getTextFragments(literal);
    }

    public String getValue(SentinelStringLiteral literal) {
        return SentinelUtils.removeQuotes(literal.getText());
    }
}
