package com.ufiv.lang;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class ThqlLexerAdapter extends FlexAdapter {
    public ThqlLexerAdapter() {
        super(new ThqlLexer(null));
    }
}
