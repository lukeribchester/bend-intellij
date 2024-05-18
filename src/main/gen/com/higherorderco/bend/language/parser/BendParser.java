// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.higherorderco.bend.language.psi.BendTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BendParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Book(b, l + 1);
  }

  /* ********************************************************** */
  // Tag? "(" Term (Term)+ ")"
  public static boolean App(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "App")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APP, "<app>");
    r = App_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && Term(b, l + 1);
    r = r && App_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Tag?
  private static boolean App_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "App_0")) return false;
    Tag(b, l + 1);
    return true;
  }

  // (Term)+
  private static boolean App_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "App_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = App_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!App_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "App_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (Term)
  private static boolean App_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "App_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "ask" Pattern "=" Term ";" Term | Term
  public static boolean Ask(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ask")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASK, "<ask>");
    r = Ask_0(b, l + 1);
    if (!r) r = Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "ask" Pattern "=" Term ";" Term
  private static boolean Ask_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ask_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ask");
    r = r && Pattern(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && Term(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "do" NAME "{" Ask "}"
  public static boolean Bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND, "<bind>");
    r = consumeToken(b, "do");
    r = r && consumeToken(b, NAME);
    r = r && consumeToken(b, "{");
    r = r && Ask(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> (Data | Rule)*
  static boolean Book(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Book")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Book_0(b, l + 1);
    r = r && Book_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean Book_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Book_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Data | Rule)*
  private static boolean Book_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Book_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Book_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Book_1", c)) break;
    }
    return true;
  }

  // Data | Rule
  private static boolean Book_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Book_1_0")) return false;
    boolean r;
    r = Data(b, l + 1);
    if (!r) r = Rule(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "data" NAME "=" ( NAME | "(" NAME (NAME)* ")" )+
  public static boolean Data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Data")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA, "<data>");
    r = consumeToken(b, "data");
    r = r && consumeToken(b, NAME);
    r = r && consumeToken(b, "=");
    r = r && Data_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( NAME | "(" NAME (NAME)* ")" )+
  private static boolean Data_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Data_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Data_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Data_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Data_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NAME | "(" NAME (NAME)* ")"
  private static boolean Data_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Data_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    if (!r) r = Data_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" NAME (NAME)* ")"
  private static boolean Data_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Data_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, NAME);
    r = r && Data_3_0_1_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (NAME)*
  private static boolean Data_3_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Data_3_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NAME)) break;
      if (!empty_element_parsed_guard_(b, "Data_3_0_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "let" Tag? "{" NameEra (","? NameEra)+ "}" "=" Term ";"? Term
  public static boolean Dup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DUP, "<dup>");
    r = consumeToken(b, "let");
    r = r && Dup_1(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && NameEra(b, l + 1);
    r = r && Dup_4(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && consumeToken(b, "=");
    r = r && Term(b, l + 1);
    r = r && Dup_8(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Tag?
  private static boolean Dup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dup_1")) return false;
    Tag(b, l + 1);
    return true;
  }

  // (","? NameEra)+
  private static boolean Dup_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dup_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dup_4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Dup_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Dup_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ","? NameEra
  private static boolean Dup_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dup_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dup_4_0_0(b, l + 1);
    r = r && NameEra(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ","?
  private static boolean Dup_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dup_4_0_0")) return false;
    consumeToken(b, ",");
    return true;
  }

  // ";"?
  private static boolean Dup_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dup_8")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // "*"
  public static boolean Era(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Era")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERA, "<era>");
    r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" Term ")"
  public static boolean Group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Group")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP, "<group>");
    r = consumeToken(b, "(");
    r = r && Term(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Tag? ("λ"|"@") NameEra Term
  public static boolean Lam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAM, "<lam>");
    r = Lam_0(b, l + 1);
    r = r && Lam_1(b, l + 1);
    r = r && NameEra(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Tag?
  private static boolean Lam_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lam_0")) return false;
    Tag(b, l + 1);
    return true;
  }

  // "λ"|"@"
  private static boolean Lam_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lam_1")) return false;
    boolean r;
    r = consumeToken(b, "λ");
    if (!r) r = consumeToken(b, "@");
    return r;
  }

  /* ********************************************************** */
  // "let" NameEra "=" Term ";"? Term
  public static boolean Let(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Let")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET, "<let>");
    r = consumeToken(b, "let");
    r = r && NameEra(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && Term(b, l + 1);
    r = r && Let_4(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ";"?
  private static boolean Let_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Let_4")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // "let" "(" NameEra ("," NameEra)+ ")" "=" Term ";"? Term
  public static boolean LetTup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetTup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_TUP, "<let tup>");
    r = consumeToken(b, "let");
    r = r && consumeToken(b, "(");
    r = r && NameEra(b, l + 1);
    r = r && LetTup_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "=");
    r = r && Term(b, l + 1);
    r = r && LetTup_7(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," NameEra)+
  private static boolean LetTup_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetTup_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LetTup_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!LetTup_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetTup_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // "," NameEra
  private static boolean LetTup_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetTup_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && NameEra(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ";"?
  private static boolean LetTup_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetTup_7")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // "[" (Term ","?)* "]"
  public static boolean List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST, "<list>");
    r = consumeToken(b, "[");
    r = r && List_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Term ","?)*
  private static boolean List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!List_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "List_1", c)) break;
    }
    return true;
  }

  // Term ","?
  private static boolean List_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term(b, l + 1);
    r = r && List_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ","?
  private static boolean List_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List_1_0_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // "match" NAME ("=" Term)? ("with" Var (","? Var)*)? "{" MatchArm+ "}"
  public static boolean Match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH, "<match>");
    r = consumeToken(b, "match");
    r = r && consumeToken(b, NAME);
    r = r && Match_2(b, l + 1);
    r = r && Match_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && Match_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("=" Term)?
  private static boolean Match_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_2")) return false;
    Match_2_0(b, l + 1);
    return true;
  }

  // "=" Term
  private static boolean Match_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("with" Var (","? Var)*)?
  private static boolean Match_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3")) return false;
    Match_3_0(b, l + 1);
    return true;
  }

  // "with" Var (","? Var)*
  private static boolean Match_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "with");
    r = r && Var(b, l + 1);
    r = r && Match_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (","? Var)*
  private static boolean Match_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Match_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Match_3_0_2", c)) break;
    }
    return true;
  }

  // ","? Var
  private static boolean Match_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Match_3_0_2_0_0(b, l + 1);
    r = r && Var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ","?
  private static boolean Match_3_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3_0_2_0_0")) return false;
    consumeToken(b, ",");
    return true;
  }

  // MatchArm+
  private static boolean Match_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MatchArm(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MatchArm(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Match_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "|"? Pattern ":" Term ";"?
  public static boolean MatchArm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_ARM, "<match arm>");
    r = MatchArm_0(b, l + 1);
    r = r && Pattern(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && Term(b, l + 1);
    r = r && MatchArm_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "|"?
  private static boolean MatchArm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_0")) return false;
    consumeToken(b, "|");
    return true;
  }

  // ";"?
  private static boolean MatchArm_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_4")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // NAME | "*"
  public static boolean NameEra(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameEra")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAME_ERA, "<name era>");
    r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" Operator Term Term ")"
  public static boolean NumOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUM_OP, "<num op>");
    r = consumeToken(b, "(");
    r = r && Operator(b, l + 1);
    r = r && Term(b, l + 1);
    r = r && Term(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "+" | "-" | "*" | "/" | "%" | "==" | "!=" | "<<" | ">>" | "<=" | ">=" | "<" | ">" | "^"
  public static boolean Operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "^");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" NAME Pattern* ")" | NameEra | NUMBER | "(" Pattern ("," Pattern)+ ")"
  public static boolean Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = Pattern_0(b, l + 1);
    if (!r) r = NameEra(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = Pattern_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" NAME Pattern* ")"
  private static boolean Pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, NAME);
    r = r && Pattern_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // Pattern*
  private static boolean Pattern_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Pattern(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Pattern_0_2", c)) break;
    }
    return true;
  }

  // "(" Pattern ("," Pattern)+ ")"
  private static boolean Pattern_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && Pattern(b, l + 1);
    r = r && Pattern_3_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," Pattern)+
  private static boolean Pattern_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pattern_3_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Pattern_3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Pattern_3_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // "," Pattern
  private static boolean Pattern_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("(" NAME Pattern* ")" | NAME Pattern*) "=" Term
  public static boolean Rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE, "<rule>");
    r = Rule_0(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" NAME Pattern* ")" | NAME Pattern*
  private static boolean Rule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Rule_0_0(b, l + 1);
    if (!r) r = Rule_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" NAME Pattern* ")"
  private static boolean Rule_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, NAME);
    r = r && Rule_0_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // Pattern*
  private static boolean Rule_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Pattern(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Rule_0_0_2", c)) break;
    }
    return true;
  }

  // NAME Pattern*
  private static boolean Rule_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && Rule_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pattern*
  private static boolean Rule_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Pattern(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Rule_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "switch" NAME ("=" Term)? ("with" Var (","? Var)*)? "{" SwitchArm+ "}"
  public static boolean Switch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH, "<switch>");
    r = consumeToken(b, "switch");
    r = r && consumeToken(b, NAME);
    r = r && Switch_2(b, l + 1);
    r = r && Switch_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && Switch_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("=" Term)?
  private static boolean Switch_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_2")) return false;
    Switch_2_0(b, l + 1);
    return true;
  }

  // "=" Term
  private static boolean Switch_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("with" Var (","? Var)*)?
  private static boolean Switch_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_3")) return false;
    Switch_3_0(b, l + 1);
    return true;
  }

  // "with" Var (","? Var)*
  private static boolean Switch_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "with");
    r = r && Var(b, l + 1);
    r = r && Switch_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (","? Var)*
  private static boolean Switch_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Switch_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Switch_3_0_2", c)) break;
    }
    return true;
  }

  // ","? Var
  private static boolean Switch_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Switch_3_0_2_0_0(b, l + 1);
    r = r && Var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ","?
  private static boolean Switch_3_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_3_0_2_0_0")) return false;
    consumeToken(b, ",");
    return true;
  }

  // SwitchArm+
  private static boolean Switch_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SwitchArm(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SwitchArm(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Switch_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "|"? (DIGIT+|"_") ":" Term ";"?
  public static boolean SwitchArm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchArm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_ARM, "<switch arm>");
    r = SwitchArm_0(b, l + 1);
    r = r && SwitchArm_1(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && Term(b, l + 1);
    r = r && SwitchArm_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "|"?
  private static boolean SwitchArm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchArm_0")) return false;
    consumeToken(b, "|");
    return true;
  }

  // DIGIT+|"_"
  private static boolean SwitchArm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchArm_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SwitchArm_1_0(b, l + 1);
    if (!r) r = consumeToken(b, "_");
    exit_section_(b, m, null, r);
    return r;
  }

  // DIGIT+
  private static boolean SwitchArm_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchArm_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIGIT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, DIGIT)) break;
      if (!empty_element_parsed_guard_(b, "SwitchArm_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ";"?
  private static boolean SwitchArm_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchArm_4")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // "#" NAME
  public static boolean Tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TAG, "<tag>");
    r = consumeToken(b, "#");
    r = r && consumeToken(b, NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | NumOp | Tup | App | Group | Nat | Lam | UnscopedLam | Bend | Fold |
  //                Use | Dup | LetTup | Let | Bind | Match | Switch | Era | UnscopedVar | Var
  public static boolean Term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = consumeToken(b, NUMBER);
    if (!r) r = NumOp(b, l + 1);
    if (!r) r = Tup(b, l + 1);
    if (!r) r = App(b, l + 1);
    if (!r) r = Group(b, l + 1);
    if (!r) r = consumeToken(b, NAT);
    if (!r) r = Lam(b, l + 1);
    if (!r) r = UnscopedLam(b, l + 1);
    if (!r) r = consumeToken(b, BEND);
    if (!r) r = consumeToken(b, FOLD);
    if (!r) r = Use(b, l + 1);
    if (!r) r = Dup(b, l + 1);
    if (!r) r = LetTup(b, l + 1);
    if (!r) r = Let(b, l + 1);
    if (!r) r = Bind(b, l + 1);
    if (!r) r = Match(b, l + 1);
    if (!r) r = Switch(b, l + 1);
    if (!r) r = Era(b, l + 1);
    if (!r) r = UnscopedVar(b, l + 1);
    if (!r) r = Var(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" Term ("," Term)+ ")"
  public static boolean Tup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Tup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUP, "<tup>");
    r = consumeToken(b, "(");
    r = r && Term(b, l + 1);
    r = r && Tup_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," Term)+
  private static boolean Tup_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Tup_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Tup_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Tup_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Tup_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // "," Term
  private static boolean Tup_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Tup_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Tag? ("λ"|"@") "$" NAME Term
  public static boolean UnscopedLam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnscopedLam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSCOPED_LAM, "<unscoped lam>");
    r = UnscopedLam_0(b, l + 1);
    r = r && UnscopedLam_1(b, l + 1);
    r = r && consumeToken(b, "$");
    r = r && consumeToken(b, NAME);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Tag?
  private static boolean UnscopedLam_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnscopedLam_0")) return false;
    Tag(b, l + 1);
    return true;
  }

  // "λ"|"@"
  private static boolean UnscopedLam_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnscopedLam_1")) return false;
    boolean r;
    r = consumeToken(b, "λ");
    if (!r) r = consumeToken(b, "@");
    return r;
  }

  /* ********************************************************** */
  // "$" NAME
  public static boolean UnscopedVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnscopedVar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSCOPED_VAR, "<unscoped var>");
    r = consumeToken(b, "$");
    r = r && consumeToken(b, NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "use" NAME "=" Term ";"? Term
  public static boolean Use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE, "<use>");
    r = consumeToken(b, "use");
    r = r && consumeToken(b, NAME);
    r = r && consumeToken(b, "=");
    r = r && Term(b, l + 1);
    r = r && Use_4(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ";"?
  private static boolean Use_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use_4")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // NAME
  public static boolean Var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Var")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    exit_section_(b, m, VAR, r);
    return r;
  }

}
