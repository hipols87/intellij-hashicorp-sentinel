package com.github.tylersmith34.intellijhashicorpsentinel;

public class SentinelFlexAdapter extends com.intellij.lexer.FlexAdapter {
    public SentinelFlexAdapter() {
        super(new _SentinelLexer(null));
    }
}
