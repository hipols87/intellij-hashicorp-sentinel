// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelParserUtil.*;
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
  // PLUS | MINUS
  public static boolean AddSubtractOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddSubtractOperator")) return false;
    if (!nextTokenIs(b, "<add subtract operator>", MINUS, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_SUBTRACT_OPERATOR, "<add subtract operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY ( Statement | BreakStmt | ContinueStmt ) R_CURLY
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && Block_1(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // Statement | BreakStmt | ContinueStmt
  private static boolean Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block_1")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = BreakStmt(b, l + 1);
    if (!r) r = ContinueStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // UnaryOperator? ( BooleanExpressionSegment BooleanOperators BooleanExpressionSegment
  //                                          | L_PAREN BooleanExpressionSegment BooleanOperators BooleanExpressionSegment R_PAREN
  //                                          | L_PAREN FunctionCall R_PAREN BooleanOperators BooleanExpressionSegment
  //                                          | QuantifierExpression
  //                                          | IDENTIFIER L_PAREN R_PAREN
  //                                          | L_PAREN IDENTIFIER  R_PAREN
  //                                          | BooleanExpressionSegment
  //                          )
  public static boolean BooleanExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_EXPRESSION, "<boolean expression>");
    r = BooleanExpression_0(b, l + 1);
    r = r && BooleanExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // UnaryOperator?
  private static boolean BooleanExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpression_0")) return false;
    UnaryOperator(b, l + 1);
    return true;
  }

  // BooleanExpressionSegment BooleanOperators BooleanExpressionSegment
  //                                          | L_PAREN BooleanExpressionSegment BooleanOperators BooleanExpressionSegment R_PAREN
  //                                          | L_PAREN FunctionCall R_PAREN BooleanOperators BooleanExpressionSegment
  //                                          | QuantifierExpression
  //                                          | IDENTIFIER L_PAREN R_PAREN
  //                                          | L_PAREN IDENTIFIER  R_PAREN
  //                                          | BooleanExpressionSegment
  private static boolean BooleanExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanExpression_1_0(b, l + 1);
    if (!r) r = BooleanExpression_1_1(b, l + 1);
    if (!r) r = BooleanExpression_1_2(b, l + 1);
    if (!r) r = QuantifierExpression(b, l + 1);
    if (!r) r = parseTokens(b, 0, IDENTIFIER, L_PAREN, R_PAREN);
    if (!r) r = parseTokens(b, 0, L_PAREN, IDENTIFIER, R_PAREN);
    if (!r) r = BooleanExpressionSegment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BooleanExpressionSegment BooleanOperators BooleanExpressionSegment
  private static boolean BooleanExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanExpressionSegment(b, l + 1);
    r = r && BooleanOperators(b, l + 1);
    r = r && BooleanExpressionSegment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // L_PAREN BooleanExpressionSegment BooleanOperators BooleanExpressionSegment R_PAREN
  private static boolean BooleanExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && BooleanExpressionSegment(b, l + 1);
    r = r && BooleanOperators(b, l + 1);
    r = r && BooleanExpressionSegment(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // L_PAREN FunctionCall R_PAREN BooleanOperators BooleanExpressionSegment
  private static boolean BooleanExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpression_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && FunctionCall(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    r = r && BooleanOperators(b, l + 1);
    r = r && BooleanExpressionSegment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionCall | ChainedIdentifier | Literal | QuantifierExpression
  //     | R_PAREN ((IDENTIFIER L_PAREN R_PAREN)  FunctionCall | ChainedIdentifier | Literal | QuantifierExpression ) L_PAREN
  public static boolean BooleanExpressionSegment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressionSegment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_EXPRESSION_SEGMENT, "<boolean expression segment>");
    r = FunctionCall(b, l + 1);
    if (!r) r = ChainedIdentifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = QuantifierExpression(b, l + 1);
    if (!r) r = BooleanExpressionSegment_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // R_PAREN ((IDENTIFIER L_PAREN R_PAREN)  FunctionCall | ChainedIdentifier | Literal | QuantifierExpression ) L_PAREN
  private static boolean BooleanExpressionSegment_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressionSegment_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, R_PAREN);
    r = r && BooleanExpressionSegment_4_1(b, l + 1);
    r = r && consumeToken(b, L_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER L_PAREN R_PAREN)  FunctionCall | ChainedIdentifier | Literal | QuantifierExpression
  private static boolean BooleanExpressionSegment_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressionSegment_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanExpressionSegment_4_1_0(b, l + 1);
    if (!r) r = ChainedIdentifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = QuantifierExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER L_PAREN R_PAREN)  FunctionCall
  private static boolean BooleanExpressionSegment_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressionSegment_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanExpressionSegment_4_1_0_0(b, l + 1);
    r = r && FunctionCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER L_PAREN R_PAREN
  private static boolean BooleanExpressionSegment_4_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressionSegment_4_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, L_PAREN, R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BooleanExpression+ (LogicalOperator BooleanExpression)*  ElseOperator?
  public static boolean BooleanExpressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_EXPRESSIONS, "<boolean expressions>");
    r = BooleanExpressions_0(b, l + 1);
    r = r && BooleanExpressions_1(b, l + 1);
    r = r && BooleanExpressions_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BooleanExpression+
  private static boolean BooleanExpressions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanExpression(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!BooleanExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BooleanExpressions_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (LogicalOperator BooleanExpression)*
  private static boolean BooleanExpressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressions_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BooleanExpressions_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BooleanExpressions_1", c)) break;
    }
    return true;
  }

  // LogicalOperator BooleanExpression
  private static boolean BooleanExpressions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LogicalOperator(b, l + 1);
    r = r && BooleanExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ElseOperator?
  private static boolean BooleanExpressions_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanExpressions_2")) return false;
    ElseOperator(b, l + 1);
    return true;
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
  // SetOperator | ComparisonOperator | UnaryOperator | MultipleDivideOperator | AddSubtractOperator | LogicalOperator
  public static boolean BooleanOperators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanOperators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_OPERATORS, "<boolean operators>");
    r = SetOperator(b, l + 1);
    if (!r) r = ComparisonOperator(b, l + 1);
    if (!r) r = UnaryOperator(b, l + 1);
    if (!r) r = MultipleDivideOperator(b, l + 1);
    if (!r) r = AddSubtractOperator(b, l + 1);
    if (!r) r = LogicalOperator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // break
  public static boolean BreakStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStmt")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, BREAK_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | Literal | Statement
  public static boolean CaseClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_CLAUSE, "<case clause>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // case (IDENTIFIER | Literal) L_CURLY ( CaseWhenClause* ) R_CURLY
  public static boolean CaseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && CaseStatement_1(b, l + 1);
    r = r && consumeToken(b, L_CURLY);
    r = r && CaseStatement_3(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  // IDENTIFIER | Literal
  private static boolean CaseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // CaseWhenClause*
  private static boolean CaseStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseWhenClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // when CaseClause+ ( COMMA CaseClause )* | ElseClause
  public static boolean CaseWhenCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase")) return false;
    if (!nextTokenIs(b, "<case when case>", ELSE, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_WHEN_CASE, "<case when case>");
    r = CaseWhenCase_0(b, l + 1);
    if (!r) r = ElseClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // when CaseClause+ ( COMMA CaseClause )*
  private static boolean CaseWhenCase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && CaseWhenCase_0_1(b, l + 1);
    r = r && CaseWhenCase_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CaseClause+
  private static boolean CaseWhenCase_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseClause(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CaseClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseWhenCase_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA CaseClause )*
  private static boolean CaseWhenCase_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseWhenCase_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseWhenCase_0_2", c)) break;
    }
    return true;
  }

  // COMMA CaseClause
  private static boolean CaseWhenCase_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CaseClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CaseWhenCase COLON Statement
  public static boolean CaseWhenClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenClause")) return false;
    if (!nextTokenIs(b, "<case when clause>", ELSE, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_WHEN_CLAUSE, "<case when clause>");
    r = CaseWhenCase(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (Selector
  //                                     | (L_BRACKET (IDENTIFIER | StringLiteral | NumberLiteral ) R_BRACKET )
  //                                     | (L_PAREN (IDENTIFIER | Literal ) R_PAREN )
  //                                     | FunctionCall
  //                                     | ElseOperator
  //                                   )*
  public static boolean ChainedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ChainedIdentifier_1(b, l + 1);
    exit_section_(b, m, CHAINED_IDENTIFIER, r);
    return r;
  }

  // (Selector
  //                                     | (L_BRACKET (IDENTIFIER | StringLiteral | NumberLiteral ) R_BRACKET )
  //                                     | (L_PAREN (IDENTIFIER | Literal ) R_PAREN )
  //                                     | FunctionCall
  //                                     | ElseOperator
  //                                   )*
  private static boolean ChainedIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ChainedIdentifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ChainedIdentifier_1", c)) break;
    }
    return true;
  }

  // Selector
  //                                     | (L_BRACKET (IDENTIFIER | StringLiteral | NumberLiteral ) R_BRACKET )
  //                                     | (L_PAREN (IDENTIFIER | Literal ) R_PAREN )
  //                                     | FunctionCall
  //                                     | ElseOperator
  private static boolean ChainedIdentifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Selector(b, l + 1);
    if (!r) r = ChainedIdentifier_1_0_1(b, l + 1);
    if (!r) r = ChainedIdentifier_1_0_2(b, l + 1);
    if (!r) r = FunctionCall(b, l + 1);
    if (!r) r = ElseOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // L_BRACKET (IDENTIFIER | StringLiteral | NumberLiteral ) R_BRACKET
  private static boolean ChainedIdentifier_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && ChainedIdentifier_1_0_1_1(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | StringLiteral | NumberLiteral
  private static boolean ChainedIdentifier_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier_1_0_1_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    return r;
  }

  // L_PAREN (IDENTIFIER | Literal ) R_PAREN
  private static boolean ChainedIdentifier_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && ChainedIdentifier_1_0_2_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | Literal
  private static boolean ChainedIdentifier_1_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifier_1_0_2_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ChainedIdentifier FunctionCallParameters
  public static boolean ChainedIdentifierFunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChainedIdentifierFunctionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ChainedIdentifier(b, l + 1);
    r = r && FunctionCallParameters(b, l + 1);
    exit_section_(b, m, CHAINED_IDENTIFIER_FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // '==' | '!=' | '<' | '<=' | '>' | '>=' | is | is not | matches | not matches
  public static boolean ComparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparisonOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, DOUBLE_EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_THAN_EQUALS);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN_EQUALS);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = parseTokens(b, 0, IS, NOT);
    if (!r) r = consumeToken(b, MATCHES);
    if (!r) r = parseTokens(b, 0, NOT, MATCHES);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( ChainedIdentifier | Literal | IDENTIFIER ) VariableConcatenation*
  public static boolean ConcatenatedLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConcatenatedLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCATENATED_LITERAL, "<concatenated literal>");
    r = ConcatenatedLiteral_0(b, l + 1);
    r = r && ConcatenatedLiteral_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ChainedIdentifier | Literal | IDENTIFIER
  private static boolean ConcatenatedLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConcatenatedLiteral_0")) return false;
    boolean r;
    r = ChainedIdentifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // VariableConcatenation*
  private static boolean ConcatenatedLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConcatenatedLiteral_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableConcatenation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConcatenatedLiteral_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // continue
  public static boolean ContinueStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStmt")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // '-'? DecimalDigit+ (PERIOD DecimalDigit+)?
  public static boolean Decimal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL, "<decimal>");
    r = Decimal_0(b, l + 1);
    r = r && Decimal_1(b, l + 1);
    r = r && Decimal_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '-'?
  private static boolean Decimal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_0")) return false;
    consumeToken(b, MINUS);
    return true;
  }

  // DecimalDigit+
  private static boolean Decimal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DecimalDigit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DecimalDigit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Decimal_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (PERIOD DecimalDigit+)?
  private static boolean Decimal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_2")) return false;
    Decimal_2_0(b, l + 1);
    return true;
  }

  // PERIOD DecimalDigit+
  private static boolean Decimal_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERIOD);
    r = r && Decimal_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DecimalDigit+
  private static boolean Decimal_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DecimalDigit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DecimalDigit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Decimal_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 1|2|3|4|5|6|7|8|9|0
  public static boolean DecimalDigit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecimalDigit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL_DIGIT, "<decimal digit>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    if (!r) r = consumeToken(b, "0");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ImportStatement | ExternalParameters | GlobalVariableDefinition | MainRule | RuleDefinition | FunctionDeclaration
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = ImportStatement(b, l + 1);
    if (!r) r = ExternalParameters(b, l + 1);
    if (!r) r = GlobalVariableDefinition(b, l + 1);
    if (!r) r = MainRule(b, l + 1);
    if (!r) r = RuleDefinition(b, l + 1);
    if (!r) r = FunctionDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Literal | ListDefinition | MapDefinition
  public static boolean Element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT, "<element>");
    r = Literal(b, l + 1);
    if (!r) r = ListDefinition(b, l + 1);
    if (!r) r = MapDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Element+ ( COMMA Element)*
  public static boolean ElementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_LIST, "<element list>");
    r = ElementList_0(b, l + 1);
    r = r && ElementList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Element+
  private static boolean ElementList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElementList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Element(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElementList_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA Element)*
  private static boolean ElementList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElementList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ElementList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElementList_1", c)) break;
    }
    return true;
  }

  // COMMA Element
  private static boolean ElementList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElementList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // else
  public static boolean ElseClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseClause")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    exit_section_(b, m, ELSE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ElseClause ( Literal | ListDefinition | MapDefinition )
  public static boolean ElseOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseOperator")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseClause(b, l + 1);
    r = r && ElseOperator_1(b, l + 1);
    exit_section_(b, m, ELSE_OPERATOR, r);
    return r;
  }

  // Literal | ListDefinition | MapDefinition
  private static boolean ElseOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseOperator_1")) return false;
    boolean r;
    r = Literal(b, l + 1);
    if (!r) r = ListDefinition(b, l + 1);
    if (!r) r = MapDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '\' ( "a" | "b" | "f" | "n" | "r" | "t" | "v" | '\' | '"' )
  public static boolean EscapedCharacter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EscapedCharacter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ESCAPED_CHARACTER, "<escaped character>");
    r = consumeToken(b, "\\");
    r = r && EscapedCharacter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "a" | "b" | "f" | "n" | "r" | "t" | "v" | '\' | '"'
  private static boolean EscapedCharacter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EscapedCharacter_1")) return false;
    boolean r;
    r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "b");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "n");
    if (!r) r = consumeToken(b, "r");
    if (!r) r = consumeToken(b, "t");
    if (!r) r = consumeToken(b, "v");
    if (!r) r = consumeToken(b, "\\");
    if (!r) r = consumeToken(b, "\"");
    return r;
  }

  /* ********************************************************** */
  // param IDENTIFIER ( default Literal )?
  public static boolean ExternalParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameters")) return false;
    if (!nextTokenIs(b, PARAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARAM, IDENTIFIER);
    r = r && ExternalParameters_2(b, l + 1);
    exit_section_(b, m, EXTERNAL_PARAMETERS, r);
    return r;
  }

  // ( default Literal )?
  private static boolean ExternalParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameters_2")) return false;
    ExternalParameters_2_0(b, l + 1);
    return true;
  }

  // default Literal
  private static boolean ExternalParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decimals "." ( decimals )* ( exponent )? | decimals exponent | "." decimals ( exponent )?
  public static boolean Float(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT, "<float>");
    r = Float_0(b, l + 1);
    if (!r) r = Float_1(b, l + 1);
    if (!r) r = Float_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decimals "." ( decimals )* ( exponent )?
  private static boolean Float_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimals(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && Float_0_2(b, l + 1);
    r = r && Float_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( decimals )*
  private static boolean Float_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Float_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Float_0_2", c)) break;
    }
    return true;
  }

  // ( decimals )
  private static boolean Float_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( exponent )?
  private static boolean Float_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_0_3")) return false;
    Float_0_3_0(b, l + 1);
    return true;
  }

  // ( exponent )
  private static boolean Float_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exponent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decimals exponent
  private static boolean Float_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimals(b, l + 1);
    r = r && exponent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "." decimals ( exponent )?
  private static boolean Float_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERIOD);
    r = r && decimals(b, l + 1);
    r = r && Float_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( exponent )?
  private static boolean Float_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_2_2")) return false;
    Float_2_2_0(b, l + 1);
    return true;
  }

  // ( exponent )
  private static boolean Float_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Float_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exponent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY ( Statement | BreakStmt | ContinueStmt )* R_CURLY
  public static boolean ForBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlock")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && ForBlock_1(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, FOR_BLOCK, r);
    return r;
  }

  // ( Statement | BreakStmt | ContinueStmt )*
  private static boolean ForBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ForBlock_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForBlock_1", c)) break;
    }
    return true;
  }

  // Statement | BreakStmt | ContinueStmt
  private static boolean ForBlock_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForBlock_1_0")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = BreakStmt(b, l + 1);
    if (!r) r = ContinueStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // for ChainedIdentifier as ( IDENTIFIER COMMA )? IDENTIFIER ForBlock
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && ChainedIdentifier(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && ForStatement_3(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && ForBlock(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // ( IDENTIFIER COMMA )?
  private static boolean ForStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_3")) return false;
    ForStatement_3_0(b, l + 1);
    return true;
  }

  // IDENTIFIER COMMA
  private static boolean ForStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionParameters FunctionBody
  public static boolean Function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionParameters(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY FunctionStatement* ReturnStatement  R_CURLY
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && FunctionBody_1(b, l + 1);
    r = r && ReturnStatement(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, FUNCTION_BODY, r);
    return r;
  }

  // FunctionStatement*
  private static boolean FunctionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionBody_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER FunctionCallParameters ElseOperator?
  public static boolean FunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && FunctionCallParameters(b, l + 1);
    r = r && FunctionCall_2(b, l + 1);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  // ElseOperator?
  private static boolean FunctionCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCall_2")) return false;
    ElseOperator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // L_PAREN ((ChainedIdentifier|Literal|ConcatenatedLiteral) ( COMMA (ChainedIdentifier|Literal|ConcatenatedLiteral)+ )*)? R_PAREN
  public static boolean FunctionCallParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && FunctionCallParameters_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, FUNCTION_CALL_PARAMETERS, r);
    return r;
  }

  // ((ChainedIdentifier|Literal|ConcatenatedLiteral) ( COMMA (ChainedIdentifier|Literal|ConcatenatedLiteral)+ )*)?
  private static boolean FunctionCallParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1")) return false;
    FunctionCallParameters_1_0(b, l + 1);
    return true;
  }

  // (ChainedIdentifier|Literal|ConcatenatedLiteral) ( COMMA (ChainedIdentifier|Literal|ConcatenatedLiteral)+ )*
  private static boolean FunctionCallParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallParameters_1_0_0(b, l + 1);
    r = r && FunctionCallParameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ChainedIdentifier|Literal|ConcatenatedLiteral
  private static boolean FunctionCallParameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1_0_0")) return false;
    boolean r;
    r = ChainedIdentifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = ConcatenatedLiteral(b, l + 1);
    return r;
  }

  // ( COMMA (ChainedIdentifier|Literal|ConcatenatedLiteral)+ )*
  private static boolean FunctionCallParameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionCallParameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallParameters_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA (ChainedIdentifier|Literal|ConcatenatedLiteral)+
  private static boolean FunctionCallParameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FunctionCallParameters_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ChainedIdentifier|Literal|ConcatenatedLiteral)+
  private static boolean FunctionCallParameters_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallParameters_1_0_1_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunctionCallParameters_1_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallParameters_1_0_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ChainedIdentifier|Literal|ConcatenatedLiteral
  private static boolean FunctionCallParameters_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallParameters_1_0_1_0_1_0")) return false;
    boolean r;
    r = ChainedIdentifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = ConcatenatedLiteral(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUALS func Function
  public static boolean FunctionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS, FUNC);
    r = r && Function(b, l + 1);
    exit_section_(b, m, FUNCTION_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN ( IDENTIFIER+ ( COMMA IDENTIFIER+ )* )? R_PAREN
  public static boolean FunctionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && FunctionParameters_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, FUNCTION_PARAMETERS, r);
    return r;
  }

  // ( IDENTIFIER+ ( COMMA IDENTIFIER+ )* )?
  private static boolean FunctionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1")) return false;
    FunctionParameters_1_0(b, l + 1);
    return true;
  }

  // IDENTIFIER+ ( COMMA IDENTIFIER+ )*
  private static boolean FunctionParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionParameters_1_0_0(b, l + 1);
    r = r && FunctionParameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean FunctionParameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "FunctionParameters_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA IDENTIFIER+ )*
  private static boolean FunctionParameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionParameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionParameters_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER+
  private static boolean FunctionParameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FunctionParameters_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean FunctionParameters_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "FunctionParameters_1_0_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableDefinition | IfStatement | ForStatement | FunctionCall | CaseStatement
  public static boolean FunctionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_STATEMENT, "<function statement>");
    r = VariableDefinition(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = FunctionCall(b, l + 1);
    if (!r) r = CaseStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VariableDefinition
  public static boolean GlobalVariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition(b, l + 1);
    exit_section_(b, m, GLOBAL_VARIABLE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // 1|2|3|4|5|6|7 | "A" | "F" | "a" | "f"
  public static boolean HexDigit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexDigit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEX_DIGIT, "<hex digit>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "f");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "0" ( "x" | "X" ) HexDigit { HexDigit }
  public static boolean HexLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEX_LITERAL, "<hex literal>");
    r = consumeToken(b, "0");
    r = r && HexLiteral_1(b, l + 1);
    r = r && HexDigit(b, l + 1);
    r = r && HexLiteral_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "x" | "X"
  private static boolean HexLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexLiteral_1")) return false;
    boolean r;
    r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "X");
    return r;
  }

  // { HexDigit }
  private static boolean HexLiteral_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexLiteral_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HexDigit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if ( BooleanExpressions | L_PAREN BooleanExpressions R_PAREN ) Block ( else ( IfStatement | Block ) )?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && IfStatement_1(b, l + 1);
    r = r && Block(b, l + 1);
    r = r && IfStatement_3(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // BooleanExpressions | L_PAREN BooleanExpressions R_PAREN
  private static boolean IfStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanExpressions(b, l + 1);
    if (!r) r = IfStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // L_PAREN BooleanExpressions R_PAREN
  private static boolean IfStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && BooleanExpressions(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( else ( IfStatement | Block ) )?
  private static boolean IfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3")) return false;
    IfStatement_3_0(b, l + 1);
    return true;
  }

  // else ( IfStatement | Block )
  private static boolean IfStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && IfStatement_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfStatement | Block
  private static boolean IfStatement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3_0_1")) return false;
    boolean r;
    r = IfStatement(b, l + 1);
    if (!r) r = Block(b, l + 1);
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
  // Element COLON Element
  public static boolean KeyedElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYED_ELEMENT, "<keyed element>");
    r = Element(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Element(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeyedElement ( COMMA KeyedElement COMMA?)*
  public static boolean KeyedElementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYED_ELEMENT_LIST, "<keyed element list>");
    r = KeyedElement(b, l + 1);
    r = r && KeyedElementList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( COMMA KeyedElement COMMA?)*
  private static boolean KeyedElementList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElementList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!KeyedElementList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KeyedElementList_1", c)) break;
    }
    return true;
  }

  // COMMA KeyedElement COMMA?
  private static boolean KeyedElementList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElementList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && KeyedElement(b, l + 1);
    r = r && KeyedElementList_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean KeyedElementList_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElementList_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
  public static boolean Letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "B");
    if (!r) r = consumeToken(b, "C");
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "G");
    if (!r) r = consumeToken(b, "H");
    if (!r) r = consumeToken(b, "I");
    if (!r) r = consumeToken(b, "J");
    if (!r) r = consumeToken(b, "K");
    if (!r) r = consumeToken(b, "L");
    if (!r) r = consumeToken(b, "M");
    if (!r) r = consumeToken(b, "N");
    if (!r) r = consumeToken(b, "O");
    if (!r) r = consumeToken(b, "P");
    if (!r) r = consumeToken(b, "Q");
    if (!r) r = consumeToken(b, "R");
    if (!r) r = consumeToken(b, "S");
    if (!r) r = consumeToken(b, "T");
    if (!r) r = consumeToken(b, "U");
    if (!r) r = consumeToken(b, "V");
    if (!r) r = consumeToken(b, "W");
    if (!r) r = consumeToken(b, "X");
    if (!r) r = consumeToken(b, "Y");
    if (!r) r = consumeToken(b, "Z");
    if (!r) r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "b");
    if (!r) r = consumeToken(b, "c");
    if (!r) r = consumeToken(b, "d");
    if (!r) r = consumeToken(b, "e");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "g");
    if (!r) r = consumeToken(b, "h");
    if (!r) r = consumeToken(b, "i");
    if (!r) r = consumeToken(b, "j");
    if (!r) r = consumeToken(b, "k");
    if (!r) r = consumeToken(b, "l");
    if (!r) r = consumeToken(b, "m");
    if (!r) r = consumeToken(b, "n");
    if (!r) r = consumeToken(b, "o");
    if (!r) r = consumeToken(b, "p");
    if (!r) r = consumeToken(b, "q");
    if (!r) r = consumeToken(b, "r");
    if (!r) r = consumeToken(b, "s");
    if (!r) r = consumeToken(b, "t");
    if (!r) r = consumeToken(b, "u");
    if (!r) r = consumeToken(b, "v");
    if (!r) r = consumeToken(b, "w");
    if (!r) r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "y");
    if (!r) r = consumeToken(b, "z");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // L_BRACKET ( ElementList )? COMMA? R_BRACKET
  public static boolean ListDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListDefinition")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && ListDefinition_1(b, l + 1);
    r = r && ListDefinition_2(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, LIST_DEFINITION, r);
    return r;
  }

  // ( ElementList )?
  private static boolean ListDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListDefinition_1")) return false;
    ListDefinition_1_0(b, l + 1);
    return true;
  }

  // ( ElementList )
  private static boolean ListDefinition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListDefinition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean ListDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListDefinition_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // NUMBER | NumberLiteral | Decimal | OctalLiteral | HexLiteral | Float | StringLiteral | BooleanLiteral | NullLiteral | UndefinedLiteral
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = Decimal(b, l + 1);
    if (!r) r = OctalLiteral(b, l + 1);
    if (!r) r = HexLiteral(b, l + 1);
    if (!r) r = Float(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = BooleanLiteral(b, l + 1);
    if (!r) r = NullLiteral(b, l + 1);
    if (!r) r = UndefinedLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // and | or | xor
  public static boolean LogicalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OPERATOR, "<logical operator>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, XOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // main EQUALS RuleBase
  public static boolean MainRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MainRule")) return false;
    if (!nextTokenIs(b, MAIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAIN, EQUALS);
    r = r && RuleBase(b, l + 1);
    exit_section_(b, m, MAIN_RULE, r);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY BooleanExpressions R_CURLY
  public static boolean MainRuleBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MainRuleBlock")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && BooleanExpressions(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, MAIN_RULE_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY ( KeyedElementList )? R_CURLY
  public static boolean MapDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapDefinition")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && MapDefinition_1(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, MAP_DEFINITION, r);
    return r;
  }

  // ( KeyedElementList )?
  private static boolean MapDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapDefinition_1")) return false;
    MapDefinition_1_0(b, l + 1);
    return true;
  }

  // ( KeyedElementList )
  private static boolean MapDefinition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapDefinition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KeyedElementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SPLAT | SLASH | PERCENT
  public static boolean MultipleDivideOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleDivideOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLE_DIVIDE_OPERATOR, "<multiple divide operator>");
    r = consumeToken(b, SPLAT);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, PERCENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // null
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
  // Decimal | OctalLiteral | HexLiteral
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = Decimal(b, l + 1);
    if (!r) r = OctalLiteral(b, l + 1);
    if (!r) r = HexLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 1|2|3|4|5|6|7
  public static boolean OctalDigit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OctalDigit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OCTAL_DIGIT, "<octal digit>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "0" ( OctalDigit )
  public static boolean OctalLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OctalLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OCTAL_LITERAL, "<octal literal>");
    r = consumeToken(b, "0");
    r = r && OctalLiteral_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( OctalDigit )
  private static boolean OctalLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OctalLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OctalDigit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QuantifierOperator ChainedIdentifier as ( IDENTIFIER COMMA )? IDENTIFIER L_CURLY BooleanExpressions  R_CURLY
  public static boolean QuantifierExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANTIFIER_EXPRESSION, "<quantifier expression>");
    r = QuantifierOperator(b, l + 1);
    r = r && ChainedIdentifier(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && QuantifierExpression_3(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, L_CURLY);
    r = r && BooleanExpressions(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IDENTIFIER COMMA )?
  private static boolean QuantifierExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierExpression_3")) return false;
    QuantifierExpression_3_0(b, l + 1);
    return true;
  }

  // IDENTIFIER COMMA
  private static boolean QuantifierExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // all | any | filter
  public static boolean QuantifierOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANTIFIER_OPERATOR, "<quantifier operator>");
    r = consumeToken(b, ALL);
    if (!r) r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, FILTER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // return ( IDENTIFIER | Literal )
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // IDENTIFIER | Literal
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // rule ( when BooleanExpressions )? MainRuleBlock
  public static boolean RuleBase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleBase")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    r = r && RuleBase_1(b, l + 1);
    r = r && MainRuleBlock(b, l + 1);
    exit_section_(b, m, RULE_BASE, r);
    return r;
  }

  // ( when BooleanExpressions )?
  private static boolean RuleBase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleBase_1")) return false;
    RuleBase_1_0(b, l + 1);
    return true;
  }

  // when BooleanExpressions
  private static boolean RuleBase_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleBase_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && BooleanExpressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUALS RuleBase
  public static boolean RuleDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS);
    r = r && RuleBase(b, l + 1);
    exit_section_(b, m, RULE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // "." IDENTIFIER
  public static boolean Selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Selector")) return false;
    if (!nextTokenIs(b, PERIOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERIOD, IDENTIFIER);
    exit_section_(b, m, SELECTOR, r);
    return r;
  }

  /* ********************************************************** */
  // (not)? ( contains | in )
  public static boolean SetOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_OPERATOR, "<set operator>");
    r = SetOperator_0(b, l + 1);
    r = r && SetOperator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (not)?
  private static boolean SetOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetOperator_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // contains | in
  private static boolean SetOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetOperator_1")) return false;
    boolean r;
    r = consumeToken(b, CONTAINS);
    if (!r) r = consumeToken(b, IN);
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
  // VariableDefinition | IfStatement | ReturnStatement | ForStatement | FunctionCall | CaseStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = VariableDefinition(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = FunctionCall(b, l + 1);
    if (!r) r = CaseStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('"' ( Letter | EscapedCharacter)* '"') | DOUBLE_QUOTED_STRING | SINGLE_QUOTED_STRING
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = StringLiteral_0(b, l + 1);
    if (!r) r = consumeToken(b, DOUBLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, SINGLE_QUOTED_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '"' ( Letter | EscapedCharacter)* '"'
  private static boolean StringLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "\"");
    r = r && StringLiteral_0_1(b, l + 1);
    r = r && consumeToken(b, "\"");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Letter | EscapedCharacter)*
  private static boolean StringLiteral_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StringLiteral_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringLiteral_0_1", c)) break;
    }
    return true;
  }

  // Letter | EscapedCharacter
  private static boolean StringLiteral_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0_1_0")) return false;
    boolean r;
    r = Letter(b, l + 1);
    if (!r) r = EscapedCharacter(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PLUS | MINUS | EXCLAMATION | not
  public static boolean UnaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, EXCLAMATION);
    if (!r) r = consumeToken(b, NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // undefined
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
  // PLUS ( ChainedIdentifierFunctionCall | ChainedIdentifier | FunctionCall | Literal | IDENTIFIER )*
  public static boolean VariableConcatenation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableConcatenation")) return false;
    if (!nextTokenIs(b, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && VariableConcatenation_1(b, l + 1);
    exit_section_(b, m, VARIABLE_CONCATENATION, r);
    return r;
  }

  // ( ChainedIdentifierFunctionCall | ChainedIdentifier | FunctionCall | Literal | IDENTIFIER )*
  private static boolean VariableConcatenation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableConcatenation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableConcatenation_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableConcatenation_1", c)) break;
    }
    return true;
  }

  // ChainedIdentifierFunctionCall | ChainedIdentifier | FunctionCall | Literal | IDENTIFIER
  private static boolean VariableConcatenation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableConcatenation_1_0")) return false;
    boolean r;
    r = ChainedIdentifierFunctionCall(b, l + 1);
    if (!r) r = ChainedIdentifier(b, l + 1);
    if (!r) r = FunctionCall(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // ChainedIdentifier ( AddSubtractOperator | MultipleDivideOperator )? EQUALS ( Literal | ListDefinition | MapDefinition | FunctionCall | QuantifierExpression | BooleanExpressions ) VariableConcatenation*
  public static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ChainedIdentifier(b, l + 1);
    r = r && VariableDefinition_1(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && VariableDefinition_3(b, l + 1);
    r = r && VariableDefinition_4(b, l + 1);
    exit_section_(b, m, VARIABLE_DEFINITION, r);
    return r;
  }

  // ( AddSubtractOperator | MultipleDivideOperator )?
  private static boolean VariableDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1")) return false;
    VariableDefinition_1_0(b, l + 1);
    return true;
  }

  // AddSubtractOperator | MultipleDivideOperator
  private static boolean VariableDefinition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1_0")) return false;
    boolean r;
    r = AddSubtractOperator(b, l + 1);
    if (!r) r = MultipleDivideOperator(b, l + 1);
    return r;
  }

  // Literal | ListDefinition | MapDefinition | FunctionCall | QuantifierExpression | BooleanExpressions
  private static boolean VariableDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_3")) return false;
    boolean r;
    r = Literal(b, l + 1);
    if (!r) r = ListDefinition(b, l + 1);
    if (!r) r = MapDefinition(b, l + 1);
    if (!r) r = FunctionCall(b, l + 1);
    if (!r) r = QuantifierExpression(b, l + 1);
    if (!r) r = BooleanExpressions(b, l + 1);
    return r;
  }

  // VariableConcatenation*
  private static boolean VariableDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableConcatenation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableDefinition_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Decimal*
  public static boolean decimals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimals")) return false;
    Marker m = enter_section_(b, l, _NONE_, DECIMALS, "<decimals>");
    while (true) {
      int c = current_position_(b);
      if (!Decimal(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decimals", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ( "e" | "E" ) [ PLUS | MINUS ] decimals
  public static boolean exponent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPONENT, "<exponent>");
    r = exponent_0(b, l + 1);
    r = r && exponent_1(b, l + 1);
    r = r && decimals(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "e" | "E"
  private static boolean exponent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_0")) return false;
    boolean r;
    r = consumeToken(b, "e");
    if (!r) r = consumeToken(b, "E");
    return r;
  }

  // [ PLUS | MINUS ]
  private static boolean exponent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1")) return false;
    exponent_1_0(b, l + 1);
    return true;
  }

  // PLUS | MINUS
  private static boolean exponent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

}
