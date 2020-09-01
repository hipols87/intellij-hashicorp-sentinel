// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SentinelParser implements PsiParser, LightPsiParser {

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
    return SimpleFile(b, l + 1);
  }

  /* ********************************************************** */
  // true | false
  public static boolean BooleanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
    if (!nextTokenIs(b, "<boolean literal>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ImportStatement)+  <<eof>>
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Definition_0(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, DEFINITION, r);
    return r;
  }

  // (ImportStatement)+
  private static boolean Definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Definition_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Definition_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Definition_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (ImportStatement)
  private static boolean Definition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CRLF
  static boolean EOL(PsiBuilder b, int l) {
    return consumeToken(b, CRLF);
  }

  /* ********************************************************** */
  // param (IDENTIFIER | IDENTIFIER default StringLiteral )
  public static boolean ExternalParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameter")) return false;
    if (!nextTokenIs(b, PARAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAM);
    r = r && ExternalParameter_1(b, l + 1);
    exit_section_(b, m, EXTERNAL_PARAMETER, r);
    return r;
  }

  // IDENTIFIER | IDENTIFIER default StringLiteral
  private static boolean ExternalParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = ExternalParameter_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER default StringLiteral
  private static boolean ExternalParameter_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameter_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DEFAULT);
    r = r && StringLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Statement*
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionBody", c)) break;
    }
    exit_section_(b, l, m, true, false, not_brace_or_next_value_parser_);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUALS func L_PAREN (FunctionInput) R_PAREN L_CURLY FunctionBody R_CURLY
  public static boolean FunctionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS, FUNC, L_PAREN);
    r = r && FunctionDeclaration_4(b, l + 1);
    r = r && consumeTokens(b, 0, R_PAREN, L_CURLY);
    r = r && FunctionBody(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, l, m, r, false, not_brace_or_next_value_parser_);
    return r;
  }

  // (FunctionInput)
  private static boolean FunctionDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionInput(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER | Type | COMMA)*
  public static boolean FunctionInput(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInput")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INPUT, "<function input>");
    while (true) {
      int c = current_position_(b);
      if (!FunctionInput_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionInput", c)) break;
    }
    exit_section_(b, l, m, true, false, not_paren_or_next_value_parser_);
    return true;
  }

  // IDENTIFIER | Type | COMMA
  private static boolean FunctionInput_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInput_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Type(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // import StringLiteral (as IDENTIFIER )?
  public static boolean ImportStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && StringLiteral(b, l + 1);
    r = r && ImportStatement_2(b, l + 1);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  // (as IDENTIFIER )?
  private static boolean ImportStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement_2")) return false;
    ImportStatement_2_0(b, l + 1);
    return true;
  }

  // as IDENTIFIER
  private static boolean ImportStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringLiteral | NumberLiteral | BooleanLiteral | NullLiteral | UndefinedLiteral
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = StringLiteral(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = BooleanLiteral(b, l + 1);
    if (!r) r = NullLiteral(b, l + 1);
    if (!r) r = UndefinedLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // main EQUALS rule '{' FunctionBody '}'
  public static boolean MainFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MainFunction")) return false;
    if (!nextTokenIs(b, MAIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAIN, EQUALS, RULE, L_CURLY);
    r = r && FunctionBody(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, MAIN_FUNCTION, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  public static boolean NullLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NullLiteral")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, NULL_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, NUMBER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // return ( IDENTIFIER | Type | Literal | value)
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = consumeToken(b, RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, not_EOL_parser_);
    return r;
  }

  // IDENTIFIER | Type | Literal | value
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Type(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

  /* ********************************************************** */
  // Definition*
  static boolean SimpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SimpleFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VariableDefinition | ReturnStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    if (!nextTokenIs(b, "<statement>", IDENTIFIER, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = VariableDefinition(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING | SINGLE_QUOTED_STRING
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, "<string literal>", DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = consumeToken(b, DOUBLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, SINGLE_QUOTED_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // int | string | map | list | Literal
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, MAP);
    if (!r) r = consumeToken(b, LIST);
    if (!r) r = Literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UNDEFINED
  public static boolean UndefinedLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UndefinedLiteral")) return false;
    if (!nextTokenIs(b, UNDEFINED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNDEFINED);
    exit_section_(b, m, UNDEFINED_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUALS Literal
  public static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS);
    r = r && Literal(b, l + 1);
    exit_section_(b, l, m, r, false, not_EOL_parser_);
    return r;
  }

  /* ********************************************************** */
  // !CRLF
  static boolean not_EOL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_EOL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('}'|value)
  static boolean not_brace_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_brace_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_brace_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}'|value
  private static boolean not_brace_or_next_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_brace_or_next_value_0")) return false;
    boolean r;
    r = consumeToken(b, R_CURLY);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

  /* ********************************************************** */
  // !(']'|(Literal | array | object))
  static boolean not_bracket_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_bracket_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_bracket_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ']'|(Literal | array | object)
  private static boolean not_bracket_or_next_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_bracket_or_next_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, R_BRACKET);
    if (!r) r = not_bracket_or_next_value_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Literal | array | object
  private static boolean not_bracket_or_next_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_bracket_or_next_value_0_1")) return false;
    boolean r;
    r = Literal(b, l + 1);
    if (!r) r = consumeToken(b, ARRAY);
    if (!r) r = consumeToken(b, OBJECT);
    return r;
  }

  /* ********************************************************** */
  // !(')'|value)
  static boolean not_paren_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_paren_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_paren_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ')'|value
  private static boolean not_paren_or_next_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_paren_or_next_value_0")) return false;
    boolean r;
    r = consumeToken(b, R_PAREN);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

  static final Parser not_EOL_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return not_EOL(b, l + 1);
    }
  };
  static final Parser not_brace_or_next_value_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return not_brace_or_next_value(b, l + 1);
    }
  };
  static final Parser not_paren_or_next_value_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return not_paren_or_next_value(b, l + 1);
    }
  };
}
