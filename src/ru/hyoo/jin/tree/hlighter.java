package ru.hyoo.jin.tree;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import ru.hyoo.jin.tree.psi.types;
import org.jetbrains.annotations.NotNull;
import java.awt.*;
import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class hlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey VALUE_PREFIX = createTextAttributesKey("VALUE_PREFIX", SyntaxHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey[] VALUE_PREFIXES = new TextAttributesKey[]{VALUE_PREFIX};

    public static final TextAttributesKey NAME = createTextAttributesKey("NAME", SyntaxHighlighterColors.KEYWORD);
    private static final TextAttributesKey[] NAMES = new TextAttributesKey[]{NAME};

    public static final TextAttributesKey VALUE = createTextAttributesKey("VALUE", SyntaxHighlighterColors.STRING);
    private static final TextAttributesKey[] VALUES = new TextAttributesKey[]{VALUE};

    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("BAD_CHARACTER", new TextAttributes(Color.RED, null, null, null, Font.BOLD));
    private static final TextAttributesKey[] BAD_CHARARACTERS = new TextAttributesKey[]{BAD_CHARACTER};

    private static final TextAttributesKey[] EMPTIES = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new lexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(types.VALUE_PREFIX)) {
            return VALUE_PREFIXES;
        } else if (tokenType.equals(types.NAME)) {
            return NAMES;
        } else if (tokenType.equals(types.VALUE)) {
            return VALUES;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARARACTERS;
        } else {
            return EMPTIES;
        }
    }
}