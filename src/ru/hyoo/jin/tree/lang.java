package ru.hyoo.jin.tree;

import com.intellij.lang.Language;

public class lang extends Language {
    public static final lang INSTANCE = new lang();

    private lang() {
        super("Tree");
    }
}