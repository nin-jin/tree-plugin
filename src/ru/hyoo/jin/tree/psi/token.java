package ru.hyoo.jin.tree.psi;

import com.intellij.psi.tree.IElementType;
import ru.hyoo.jin.tree.lang;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class token extends IElementType {
    public token(@NotNull @NonNls String debugName) {
        super(debugName, lang.INSTANCE);
    }

    @Override
    public String toString() {
        return "token." + super.toString();
    }
}