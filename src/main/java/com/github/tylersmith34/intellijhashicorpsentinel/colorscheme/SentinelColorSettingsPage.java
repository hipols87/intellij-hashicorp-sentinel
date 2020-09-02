package com.github.tylersmith34.intellijhashicorpsentinel.colorscheme;

import com.github.tylersmith34.intellijhashicorpsentinel.language.SentinelIcons;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class SentinelColorSettingsPage implements ColorSettingsPage {
    final AttributesDescriptor[] descriptors = new AttributesDescriptor[]{
//            new AttributesDescriptor("Bad Value", SentinelSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("Braces and Operators//Comma", SentinelSyntaxHighlighter.COMMA),
            new AttributesDescriptor("Keyword", SentinelSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Comments//Line comment", SentinelSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Braces and Operators//Braces", SentinelSyntaxHighlighter.CURLY),
            new AttributesDescriptor("String//String text", SentinelSyntaxHighlighter.SENTINEL_STRING)
    };
    private SentinelSyntaxHighlighter sentinelSyntaxHighlighter = new SentinelSyntaxHighlighter();

    @Override
    public @Nullable Icon getIcon() {
        return SentinelIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return sentinelSyntaxHighlighter;
    }

    @Override
    public @NotNull String getDemoText() {
        return "# Basics of Sentinel\n" +
                "import \"strings\"\n" +
                "import \"tfplan/v2\" as tfplan\n\n" +
                "param policySetVariable\n\n" +
                "globalKey = \"global value\"";
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public @NotNull AttributesDescriptor[] getAttributeDescriptors() {
        return descriptors;
    }

    @Override
    public @NotNull ColorDescriptor[] getColorDescriptors() {
        return new ColorDescriptor[0];
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "HashiCorp Sentinel";
    }
}
