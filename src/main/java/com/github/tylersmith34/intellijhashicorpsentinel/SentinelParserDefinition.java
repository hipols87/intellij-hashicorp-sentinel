package com.github.tylersmith34.intellijhashicorpsentinel;

import com.github.tylersmith34.intellijhashicorpsentinel.language.Sentinel;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.SentinelFile;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class SentinelParserDefinition implements com.intellij.lang.ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(SentinelTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Sentinel.INSTANCE);

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MUST;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new SentinelFlexAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new SentinelParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return SentinelTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SentinelFile(viewProvider);
    }
}
