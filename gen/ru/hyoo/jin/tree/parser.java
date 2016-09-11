// This is a generated file. Not intended for manual editing.
package ru.hyoo.jin.tree;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.hyoo.jin.tree.psi.types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b, 0);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return FILE(b, l + 1);
  }

  /* ********************************************************** */
  // ( NODES LF )* NODES?
  static boolean FILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FILE")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FILE_0(b, l + 1);
    r = r && FILE_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NODES LF )*
  private static boolean FILE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FILE_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FILE_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FILE_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // NODES LF
  private static boolean FILE_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FILE_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NODES(b, l + 1);
    r = r && consumeToken(b, LF);
    exit_section_(b, m, null, r);
    return r;
  }

  // NODES?
  private static boolean FILE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FILE_1")) return false;
    NODES(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INDENT* ( NAME SPACE* )* ( VALUE_PREFIX VALUE? )?
  static boolean NODES(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NODES_0(b, l + 1);
    r = r && NODES_1(b, l + 1);
    r = r && NODES_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENT*
  private static boolean NODES_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, INDENT)) break;
      if (!empty_element_parsed_guard_(b, "NODES_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( NAME SPACE* )*
  private static boolean NODES_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!NODES_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NODES_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // NAME SPACE*
  private static boolean NODES_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && NODES_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean NODES_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "NODES_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( VALUE_PREFIX VALUE? )?
  private static boolean NODES_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_2")) return false;
    NODES_2_0(b, l + 1);
    return true;
  }

  // VALUE_PREFIX VALUE?
  private static boolean NODES_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE_PREFIX);
    r = r && NODES_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE?
  private static boolean NODES_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NODES_2_0_1")) return false;
    consumeToken(b, VALUE);
    return true;
  }

}
