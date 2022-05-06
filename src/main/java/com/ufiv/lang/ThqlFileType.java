package com.ufiv.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ThqlFileType extends LanguageFileType {
    public static final ThqlFileType INSTANCE = new ThqlFileType();

    private ThqlFileType() {
        super(ThqlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Thql File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "TDW SQL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "thql";
    }

    @Override
    public @Nullable Icon getIcon() {
        return null;
    }


}
