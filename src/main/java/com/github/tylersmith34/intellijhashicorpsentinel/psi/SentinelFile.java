package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import com.github.tylersmith34.intellijhashicorpsentinel.language.Sentinel;
import com.github.tylersmith34.intellijhashicorpsentinel.language.SentinelFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class SentinelFile extends PsiFileBase {
    public SentinelFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Sentinel.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return SentinelFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Sentinel File";
    }
}
