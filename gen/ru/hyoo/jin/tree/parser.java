// This is a generated file. Not intended for manual editing.
package ru.hyoo.jin.tree;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static ru.hyoo.jin.tree.psi.types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class parser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("ru.hyoo.jin.tree.parser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_, 0);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return FILE(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ( NODES LF )* NODES?
  static boolean FILE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FILE")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = FILE_0(builder_, level_ + 1);
    result_ = result_ && FILE_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( NODES LF )*
  private static boolean FILE_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FILE_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!FILE_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FILE_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // NODES LF
  private static boolean FILE_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FILE_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = NODES(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NODES?
  private static boolean FILE_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FILE_1")) return false;
    NODES(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // INDENT* ( NAME SPACE* )* ( VALUE_PREFIX VALUE? )?
  static boolean NODES(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = NODES_0(builder_, level_ + 1);
    result_ = result_ && NODES_1(builder_, level_ + 1);
    result_ = result_ && NODES_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // INDENT*
  private static boolean NODES_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, INDENT)) break;
      if (!empty_element_parsed_guard_(builder_, "NODES_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ( NAME SPACE* )*
  private static boolean NODES_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!NODES_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "NODES_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // NAME SPACE*
  private static boolean NODES_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NAME);
    result_ = result_ && NODES_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SPACE*
  private static boolean NODES_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, SPACE)) break;
      if (!empty_element_parsed_guard_(builder_, "NODES_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ( VALUE_PREFIX VALUE? )?
  private static boolean NODES_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_2")) return false;
    NODES_2_0(builder_, level_ + 1);
    return true;
  }

  // VALUE_PREFIX VALUE?
  private static boolean NODES_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VALUE_PREFIX);
    result_ = result_ && NODES_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VALUE?
  private static boolean NODES_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NODES_2_0_1")) return false;
    consumeToken(builder_, VALUE);
    return true;
  }

}
