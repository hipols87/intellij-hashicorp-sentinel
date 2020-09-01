package com.github.tylersmith34.intellijhashicorpsentinel.psi.impl;

import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelStringLiteral;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelUtils;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SentinelPsiImplUtil {
    public static char getQuoteSymbol(@NotNull SentinelStringLiteral literal) {
        return SentinelPsiImplUtils.INSTANCE.getQuoteSymbol(literal);
    }

    @NotNull
    public static List<Pair<TextRange, String>> getTextFragments(@NotNull SentinelStringLiteral literal) {
        return SentinelPsiImplUtils.INSTANCE.getTextFragments(literal);
    }

    @NotNull
    public static String getValue(@NotNull SentinelStringLiteral literal) {
        return SentinelUtils.removeQuotes(literal.getText());
    }
}
