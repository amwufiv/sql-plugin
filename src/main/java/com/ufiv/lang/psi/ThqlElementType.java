package com.ufiv.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.ufiv.lang.ThqlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ThqlElementType extends IElementType {
  public ThqlElementType(@NotNull @NonNls String debugName) {
    super(debugName, ThqlLanguage.INSTANCE);
  }
}
