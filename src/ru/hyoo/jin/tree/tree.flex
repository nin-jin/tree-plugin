package ru.hyoo.jin.tree;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import ru.hyoo.jin.tree.psi.types;
import com.intellij.psi.TokenType;

%%

%class lexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
    return;
%eof}

LF= [\n]
INDENT= [\t]
VALUE_PREFIX= [=]
SPACE= [ ]
NAME= [^= \n\r\t]
VALUE= [^\n]

%state STREAMING

%%

<YYINITIAL> {NAME}+ { yybegin(YYINITIAL); return types.NAME; }

<YYINITIAL> {VALUE_PREFIX} { yybegin(STREAMING); return types.VALUE_PREFIX; }

<STREAMING> {LF} { yybegin(YYINITIAL); return types.LF; }

<STREAMING> {VALUE}* { yybegin(YYINITIAL); return types.VALUE; }

{LF} { yybegin(YYINITIAL); return types.LF; }

{SPACE}+ { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

. { return TokenType.BAD_CHARACTER; }