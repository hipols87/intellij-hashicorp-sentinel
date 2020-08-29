package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import com.github.tylersmith34.intellijhashicorpsentinel.language.Sentinel;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class SentinelTokenType extends IElementType {
    public SentinelTokenType(@NotNull String debugName) {
        super(debugName, Sentinel.INSTANCE);
    }

    @Override
    public String toString() {
        return "SentinelTokenType." + super.toString();
    }
}
