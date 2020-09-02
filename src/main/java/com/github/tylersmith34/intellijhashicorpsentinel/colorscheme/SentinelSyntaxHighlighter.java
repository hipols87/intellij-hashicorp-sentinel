package com.github.tylersmith34.intellijhashicorpsentinel.colorscheme;

import com.github.tylersmith34.intellijhashicorpsentinel.SentinelFlexAdapter;
import com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.BRACES;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.STRING;

public class SentinelSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SENTINEL_STRING = TextAttributesKey.createTextAttributesKey("SENTINEL_STRING", STRING);
    public static final TextAttributesKey CURLY = TextAttributesKey.createTextAttributesKey("SENTINEL_CURLY", BRACES);
    public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey("SENTINEL_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("SENTINEL_COMMENT", BRACES);
    public static final TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey("SENTINEL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("SENTINEL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    private final Map<IElementType, TextAttributesKey> attributes = new HashMap<>();

    public SentinelSyntaxHighlighter() {
        fillMap(attributes, SENTINEL_STRING, SentinelTypes.DOUBLE_QUOTED_STRING, SentinelTypes.SINGLE_QUOTED_STRING);
        fillMap(attributes, COMMA, SentinelTypes.COMMA);
        fillMap(attributes, COMMENT, BLOCK_COMMENT, SentinelTypes.COMMENT);
        fillMap(attributes, CURLY, L_CURLY, R_CURLY);
        fillMap(attributes, BAD_CHARACTER, TokenType.BAD_CHARACTER);
        fillMap(attributes, KEYWORD, SentinelTypes.IMPORT, PARAM, TRUE, SentinelTypes.FALSE, SentinelTypes.NULL, SentinelTypes.UNDEFINED, SentinelTypes.ALL, SentinelTypes.ANY, SentinelTypes.AS, SentinelTypes.BREAK, SentinelTypes.CASE, SentinelTypes.CONTINUE, SentinelTypes.DEFAULT, SentinelTypes.ELSE, SentinelTypes.FOR, SentinelTypes.FUNC, SentinelTypes.IF, SentinelTypes.RETURN, SentinelTypes.WHEN);
    }

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new SentinelFlexAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(attributes.get(tokenType));
    }
}
