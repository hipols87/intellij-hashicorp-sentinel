package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import com.github.tylersmith34.intellijhashicorpsentinel.language.Sentinel;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class SentinelElementType extends IElementType {
    public SentinelElementType(@NotNull String debugName) {
        super(debugName, Sentinel.INSTANCE);
    }
}
