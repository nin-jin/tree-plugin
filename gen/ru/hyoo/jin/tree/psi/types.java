// This is a generated file. Not intended for manual editing.
package ru.hyoo.jin.tree.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface types {


  IElementType INDENT = new token("INDENT");
  IElementType LF = new token("LF");
  IElementType NAME = new token("NAME");
  IElementType SPACE = new token("SPACE");
  IElementType VALUE = new token("VALUE");
  IElementType VALUE_PREFIX = new token("VALUE_PREFIX");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
