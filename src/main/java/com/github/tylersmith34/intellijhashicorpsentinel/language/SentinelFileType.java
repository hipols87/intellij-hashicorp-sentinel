package com.github.tylersmith34.intellijhashicorpsentinel.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SentinelFileType extends LanguageFileType {
    public static final String DEFAULT_EXTENSION = "sentinel";
    public static final SentinelFileType INSTANCE = new SentinelFileType();

    protected SentinelFileType() {
        super(Sentinel.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Sentinel";
    }

    @java.lang.Override
    public String getDescription() {
        return "Sentinel";
    }

    @java.lang.Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @java.lang.Override
    public Icon getIcon() {
        return null;
    }
}
