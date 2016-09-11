package ru.hyoo.jin.tree.psi.impl;

import com.intellij.psi.tree.IElementType;
import ru.hyoo.jin.tree.lang;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class element extends IElementType {
    public element(@NotNull @NonNls String debugName) {
        super(debugName, lang.INSTANCE);
    }
}