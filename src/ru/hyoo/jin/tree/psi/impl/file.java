package ru.hyoo.jin.tree.psi.impl;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import ru.hyoo.jin.tree.fileType;
import ru.hyoo.jin.tree.lang;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class file extends PsiFileBase {
    public file(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, lang.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return fileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Tree File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}