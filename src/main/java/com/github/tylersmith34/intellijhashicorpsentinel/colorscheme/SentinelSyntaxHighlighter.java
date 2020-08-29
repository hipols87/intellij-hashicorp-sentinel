package com.github.tylersmith34.intellijhashicorpsentinel.colorscheme;

import com.github.tylersmith34.intellijhashicorpsentinel.SentinelFlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.DOUBLE_QUOTED_STRING;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class SentinelSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("SENTINEL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("SENTINEL_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("SENTINEL_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SENTINEL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SENTINEL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    private Map<IElementType, TextAttributesKey[]> attributes = new HashMap();

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        attributes.put(DOUBLE_QUOTED_STRING, new TextAttributesKey[]{createTextAttributesKey("SENTINEL_VALUE", DefaultLanguageHighlighterColors.STRING)});
        return new SentinelFlexAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return attributes.getOrDefault(tokenType, new TextAttributesKey[0]);
    }
}
