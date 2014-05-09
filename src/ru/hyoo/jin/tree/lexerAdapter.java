package ru.hyoo.jin.tree;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class lexerAdapter extends FlexAdapter {
    public lexerAdapter() {
        super(new lexer((Reader) null));
    }
}
