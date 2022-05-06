package com.ufiv.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.ufiv.lang.ThqlFileType;
import com.ufiv.lang.ThqlLanguage;
import org.jetbrains.annotations.NotNull;

public class ThqlFile extends PsiFileBase {
    public ThqlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ThqlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ThqlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Thql File";
    }
}
