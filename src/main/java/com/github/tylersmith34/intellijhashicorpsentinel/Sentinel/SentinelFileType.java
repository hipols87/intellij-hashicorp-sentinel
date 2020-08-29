package com.github.tylersmith34.intellijhashicorpsentinel.Sentinel;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SentinelFileType extends LanguageFileType {
    public static final SentinelFileType INSTANCE = new SentinelFileType(new Sentinel());

    protected SentinelFileType(@NotNull Language language) {
        super(language);
    }

    @NotNull
    @Override
    public String getName() {
        return "Sentinel";
    }

    @java.lang.Override
    public String getDescription() {
        return "HashiCorp Sentinel";
    }

    @java.lang.Override
    public String getDefaultExtension() {
        return ".sentinel";
    }

    @Nullable
    @java.lang.Override
    public Icon getIcon() {
        return null;
    }
}
