package com.github.tylersmith34.intellijhashicorpsentinel.Sentinel;

import com.intellij.lang.Language;

public class Sentinel extends Language {
    public static final Sentinel INSTANCE = new Sentinel();

    protected Sentinel() {
        super("Sentinel");
    }
}
