package com.ufiv.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.ufiv.lang.ThqlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ThqlTokenType extends IElementType {
    public ThqlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ThqlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ThqlTokenType." + super.toString();
    }
}
