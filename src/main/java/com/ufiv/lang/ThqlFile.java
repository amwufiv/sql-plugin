package com.ufiv.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class ThqlFile extends PsiFileBase {
  public ThqlFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, ThqlLanguage.INSTANCE);
  }

  @Override
  public @NotNull FileType getFileType() {
    return ThqlFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Thql File";
  }
}
