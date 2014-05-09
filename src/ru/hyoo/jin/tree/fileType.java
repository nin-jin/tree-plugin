package ru.hyoo.jin.tree;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;

public class fileType extends LanguageFileType {
    public static final fileType INSTANCE = new fileType();

    private fileType() {
        super(lang.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Tree file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Simple structural language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "tree";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return icon.FILE;
    }
}
