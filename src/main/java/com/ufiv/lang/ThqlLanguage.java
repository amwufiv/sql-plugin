package com.ufiv.lang;

import com.intellij.lang.Language;

public class ThqlLanguage extends Language {
    public static final ThqlLanguage INSTANCE = new ThqlLanguage();

    private ThqlLanguage() {
        super("Thql");
    }
}
