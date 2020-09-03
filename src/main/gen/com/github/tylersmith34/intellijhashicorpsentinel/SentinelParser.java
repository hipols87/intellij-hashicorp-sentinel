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
  // "+" | "-"
  public static boolean AddSubtractOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddSubtractOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_SUBTRACT_OPERATOR, "<add subtract operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" [ ( <expression> | Literal [ "," <expression> ] ) [ "..." ] [ "," ] ] ")"
  public static boolean Arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && Arguments_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  // [ ( <expression> | Literal [ "," <expression> ] ) [ "..." ] [ "," ] ]
  private static boolean Arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1")) return false;
    Arguments_1_0(b, l + 1);
    return true;
  }

  // ( <expression> | Literal [ "," <expression> ] ) [ "..." ] [ "," ]
  private static boolean Arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arguments_1_0_0(b, l + 1);
    r = r && Arguments_1_0_1(b, l + 1);
    r = r && Arguments_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <expression> | Literal [ "," <expression> ]
  private static boolean Arguments_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = Arguments_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Literal [ "," <expression> ]
  private static boolean Arguments_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && Arguments_1_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "," <expression> ]
  private static boolean Arguments_1_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0_0_1_1")) return false;
    parseTokens(b, 0, COMMA, _EXPRESSION_);
    return true;
  }

  // [ "..." ]
  private static boolean Arguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0_1")) return false;
    consumeToken(b, "...");
    return true;
  }

  // [ "," ]
  private static boolean Arguments_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean AssignExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignExpr")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ASSIGN_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // AssignExpr AssignmentOperators <expression>
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpr(b, l + 1);
    r = r && AssignmentOperators(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ( AddSubtractOperator | MultipleDivideOperator ) EQUALS
  public static boolean AssignmentOperators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATORS, "<assignment operators>");
    r = AssignmentOperators_0(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AddSubtractOperator | MultipleDivideOperator
  private static boolean AssignmentOperators_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperators_0")) return false;
    boolean r;
    r = AddSubtractOperator(b, l + 1);
    if (!r) r = MultipleDivideOperator(b, l + 1);
    return r;
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
  // "break"
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
  // "case" [ <expression> ] "{" ( CaseWhenClause ) R_CURLY
  public static boolean CaseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmt")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && CaseStmt_1(b, l + 1);
    r = r && consumeToken(b, L_CURLY);
    r = r && CaseStmt_3(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, CASE_STMT, r);
    return r;
  }

  // [ <expression> ]
  private static boolean CaseStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmt_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // ( CaseWhenClause )
  private static boolean CaseStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseWhenClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "when" <expression> ( "," <expression> ) | "else"
  public static boolean CaseWhenCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase")) return false;
    if (!nextTokenIs(b, "<case when case>", ELSE, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_WHEN_CASE, "<case when case>");
    r = CaseWhenCase_0(b, l + 1);
    if (!r) r = consumeToken(b, ELSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "when" <expression> ( "," <expression> )
  private static boolean CaseWhenCase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHEN, _EXPRESSION_);
    r = r && CaseWhenCase_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," <expression>
  private static boolean CaseWhenCase_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenCase_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, _EXPRESSION_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CaseWhenCase ":" StatementList
  public static boolean CaseWhenClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseWhenClause")) return false;
    if (!nextTokenIs(b, "<case when clause>", ELSE, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_WHEN_CLAUSE, "<case when clause>");
    r = CaseWhenCase(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, STATEMENTLIST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "continue"
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
  // '-'? DecimalDigit+ ('.' DecimalDigit+)?
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
    consumeToken(b, "-");
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

  // ('.' DecimalDigit+)?
  private static boolean Decimal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_2")) return false;
    Decimal_2_0(b, l + 1);
    return true;
  }

  // '.' DecimalDigit+
  private static boolean Decimal_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decimal_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
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
  // ImportStatement | ExternalParameters | GlobalVariableDefinition | MainRule | FunctionDeclaration
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = ImportStatement(b, l + 1);
    if (!r) r = ExternalParameters(b, l + 1);
    if (!r) r = GlobalVariableDefinition(b, l + 1);
    if (!r) r = MainRule(b, l + 1);
    if (!r) r = FunctionDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CRLF
  static boolean EOL(PsiBuilder b, int l) {
    return consumeToken(b, CRLF);
  }

  /* ********************************************************** */
  // Literal
  public static boolean Element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT, "<element>");
    r = Literal(b, l + 1);
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
  // <expression>
  public static boolean ExpressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt")) return false;
    if (!nextTokenIs(b, _EXPRESSION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, EXPRESSION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // param IDENTIFIER ( default StringLiteral )?
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

  // ( default StringLiteral )?
  private static boolean ExternalParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameters_2")) return false;
    ExternalParameters_2_0(b, l + 1);
    return true;
  }

  // default StringLiteral
  private static boolean ExternalParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    r = r && StringLiteral(b, l + 1);
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
    r = r && consumeToken(b, ".");
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
    r = consumeToken(b, ".");
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
  // "for" Expressions "as" ( IDENTIFIER "," ) IDENTIFIER Block
  public static boolean ForStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStmt")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, EXPRESSIONS, AS);
    r = r && ForStmt_3(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, BLOCK);
    exit_section_(b, m, FOR_STMT, r);
    return r;
  }

  // IDENTIFIER ","
  private static boolean ForStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Parameters FunctionBody
  public static boolean Function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY Statement ReturnStatement  R_CURLY
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && Statement(b, l + 1);
    r = r && ReturnStatement(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, FUNCTION_BODY, r);
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
  // IDENTIFIER+ ( COMMA IDENTIFIER+ )?
  public static boolean IdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierList_0(b, l + 1);
    r = r && IdentifierList_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean IdentifierList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "IdentifierList_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA IDENTIFIER+ )?
  private static boolean IdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1")) return false;
    IdentifierList_1_0(b, l + 1);
    return true;
  }

  // COMMA IDENTIFIER+
  private static boolean IdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && IdentifierList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean IdentifierList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "IdentifierList_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "if" <expression> Block [ "else" ( IfStmt | Block ) ]
  public static boolean IfStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, _EXPRESSION_, BLOCK);
    r = r && IfStmt_3(b, l + 1);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  // [ "else" ( IfStmt | Block ) ]
  private static boolean IfStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_3")) return false;
    IfStmt_3_0(b, l + 1);
    return true;
  }

  // "else" ( IfStmt | Block )
  private static boolean IfStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && IfStmt_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfStmt | Block
  private static boolean IfStmt_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_3_0_1")) return false;
    boolean r;
    r = IfStmt(b, l + 1);
    if (!r) r = consumeToken(b, BLOCK);
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
  // "[" <expression> "]"
  public static boolean Index(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Index")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, L_BRACKET, _EXPRESSION_, R_BRACKET);
    exit_section_(b, m, INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // Element ":" Element
  public static boolean KeyedElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYED_ELEMENT, "<keyed element>");
    r = Element(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && Element(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeyedElement ( "," KeyedElement )
  public static boolean KeyedElementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYED_ELEMENT_LIST, "<keyed element list>");
    r = KeyedElement(b, l + 1);
    r = r && KeyedElementList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," KeyedElement
  private static boolean KeyedElementList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyedElementList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && KeyedElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // L_BRACKET ( ElementList )? R_BRACKET
  public static boolean ListDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListDefinition")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && ListDefinition_1(b, l + 1);
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

  /* ********************************************************** */
  // Number | NumberLiteral | Decimal | octal_lit | hex_lit | Float | StringLiteral | BooleanLiteral | NullLiteral | UndefinedLiteral
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = Decimal(b, l + 1);
    if (!r) r = octal_lit(b, l + 1);
    if (!r) r = hex_lit(b, l + 1);
    if (!r) r = Float(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = BooleanLiteral(b, l + 1);
    if (!r) r = NullLiteral(b, l + 1);
    if (!r) r = UndefinedLiteral(b, l + 1);
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
  // "{" ( KeyedElementList [ "," ] ) R_CURLY
  public static boolean MapLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLit")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_CURLY);
    r = r && MapLit_1(b, l + 1);
    r = r && consumeToken(b, R_CURLY);
    exit_section_(b, m, MAP_LIT, r);
    return r;
  }

  // KeyedElementList [ "," ]
  private static boolean MapLit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KeyedElementList(b, l + 1);
    r = r && MapLit_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "," ]
  private static boolean MapLit_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLit_1_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // "*" | "/" | "%"
  public static boolean MultipleDivideOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleDivideOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLE_DIVIDE_OPERATOR, "<multiple divide operator>");
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
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
  // Decimal | octal_lit | hex_lit
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = Decimal(b, l + 1);
    if (!r) r = octal_lit(b, l + 1);
    if (!r) r = hex_lit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Literal | IDENTIFIER | "(" <expression> ")"
  public static boolean Operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERAND, "<operand>");
    r = Literal(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, L_PAREN, _EXPRESSION_, R_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN ( IdentifierList )? R_PAREN
  public static boolean Parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && Parameters_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, PARAMETERS, r);
    return r;
  }

  // ( IdentifierList )?
  private static boolean Parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1")) return false;
    Parameters_1_0(b, l + 1);
    return true;
  }

  // ( IdentifierList )
  private static boolean Parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QuantOp <expression> "as" [ IDENTIFIER "," ] IDENTIFIER "{" <expression> R_CURLY
  public static boolean QuantExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANT_EXPR, "<quant expr>");
    r = QuantOp(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && QuantExpr_3(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, L_CURLY, _EXPRESSION_, R_CURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ IDENTIFIER "," ]
  private static boolean QuantExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantExpr_3")) return false;
    parseTokens(b, 0, IDENTIFIER, COMMA);
    return true;
  }

  /* ********************************************************** */
  // "all" | "any" | "filter"
  public static boolean QuantOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANT_OP, "<quant op>");
    r = consumeToken(b, ALL);
    if (!r) r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, "filter");
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
  // rule [ "when" <expression> ] L_CURLY <expression> R_CURLY
  public static boolean RuleBase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleBase")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    r = r && RuleBase_1(b, l + 1);
    r = r && consumeTokens(b, 0, L_CURLY, _EXPRESSION_, R_CURLY);
    exit_section_(b, m, RULE_BASE, r);
    return r;
  }

  // [ "when" <expression> ]
  private static boolean RuleBase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleBase_1")) return false;
    parseTokens(b, 0, WHEN, _EXPRESSION_);
    return true;
  }

  /* ********************************************************** */
  // "." IDENTIFIER
  public static boolean Selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Selector")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR, "<selector>");
    r = consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
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
  // "[" ( <expression> ) ":" ( <expression> ) "]" | "[" ( <expression> ) ":" <expression> ":" <expression> "]"
  public static boolean Slice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Slice")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Slice_0(b, l + 1);
    if (!r) r = Slice_1(b, l + 1);
    exit_section_(b, m, SLICE, r);
    return r;
  }

  // "[" ( <expression> ) ":" ( <expression> ) "]"
  private static boolean Slice_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Slice_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" ( <expression> ) ":" <expression> ":" <expression> "]"
  private static boolean Slice_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Slice_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { VariableDefinition  }*
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    while (true) {
      int c = current_position_(b);
      if (!Statement_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Statement", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // { VariableDefinition  }
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('"' ( letter | escaped_char)* '"') | DOUBLE_QUOTED_STRING | SINGLE_QUOTED_STRING
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

  // '"' ( letter | escaped_char)* '"'
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

  // ( letter | escaped_char)*
  private static boolean StringLiteral_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StringLiteral_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringLiteral_0_1", c)) break;
    }
    return true;
  }

  // letter | escaped_char
  private static boolean StringLiteral_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0_1_0")) return false;
    boolean r;
    r = letter(b, l + 1);
    if (!r) r = escaped_char(b, l + 1);
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
  // IDENTIFIER EQUALS ( Literal | ListDefinition  )
  public static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS);
    r = r && VariableDefinition_2(b, l + 1);
    exit_section_(b, m, VARIABLE_DEFINITION, r);
    return r;
  }

  // Literal | ListDefinition
  private static boolean VariableDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_2")) return false;
    boolean r;
    r = Literal(b, l + 1);
    if (!r) r = ListDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '\' "U" hex_digit hex_digit hex_digit hex_digit hex_digit hex_digit hex_digit hex_digit
  public static boolean big_u_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "big_u_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIG_U_VALUE, "<big u value>");
    r = consumeToken(b, "\\");
    r = r && consumeToken(b, "U");
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logical_op | set_op | rel_op | AddSubtractOperator | MultipleDivideOperator | else_op
  public static boolean binary_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP, "<binary op>");
    r = logical_op(b, l + 1);
    if (!r) r = set_op(b, l + 1);
    if (!r) r = rel_op(b, l + 1);
    if (!r) r = AddSubtractOperator(b, l + 1);
    if (!r) r = MultipleDivideOperator(b, l + 1);
    if (!r) r = else_op(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // octal_byte_value | hex_byte_value
  public static boolean byte_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "byte_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BYTE_VALUE, "<byte value>");
    r = octal_byte_value(b, l + 1);
    if (!r) r = hex_byte_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // "else"
  public static boolean else_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_op")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    exit_section_(b, m, ELSE_OP, r);
    return r;
  }

  /* ********************************************************** */
  // '\' ( "a" | "b" | "f" | "n" | "r" | "t" | "v" | '\' | '"' )
  public static boolean escaped_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped_char")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ESCAPED_CHAR, "<escaped char>");
    r = consumeToken(b, "\\");
    r = r && escaped_char_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "a" | "b" | "f" | "n" | "r" | "t" | "v" | '\' | '"'
  private static boolean escaped_char_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped_char_1")) return false;
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
  // ( "e" | "E" ) [ "+" | "-" ] decimals
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

  // [ "+" | "-" ]
  private static boolean exponent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1")) return false;
    exponent_1_0(b, l + 1);
    return true;
  }

  // "+" | "-"
  private static boolean exponent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1_0")) return false;
    boolean r;
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    return r;
  }

  /* ********************************************************** */
  // unary_expr? | {<expression>} binary_op {<expression>}
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unary_expr?
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    unary_expr(b, l + 1);
    return true;
  }

  // {<expression>} binary_op {<expression>}
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && binary_op(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '\' "x" hex_digit hex_digit
  public static boolean hex_byte_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_byte_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEX_BYTE_VALUE, "<hex byte value>");
    r = consumeToken(b, "\\");
    r = r && consumeToken(b, "x");
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 1|2|3|4|5|6|7 | "A" | "F" | "a" | "f"
  public static boolean hex_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_digit")) return false;
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
  // "0" ( "x" | "X" ) hex_digit { hex_digit }
  public static boolean hex_lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEX_LIT, "<hex lit>");
    r = consumeToken(b, "0");
    r = r && hex_lit_1(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_lit_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "x" | "X"
  private static boolean hex_lit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_lit_1")) return false;
    boolean r;
    r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "X");
    return r;
  }

  // { hex_digit }
  private static boolean hex_lit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_lit_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hex_digit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
  public static boolean letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter")) return false;
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
  // '\' "u" hex_digit hex_digit hex_digit hex_digit
  public static boolean little_u_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "little_u_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITTLE_U_VALUE, "<little u value>");
    r = consumeToken(b, "\\");
    r = r && consumeToken(b, "u");
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    r = r && hex_digit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "and" | "or" | "xor"
  public static boolean logical_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OP, "<logical op>");
    r = consumeToken(b, "and");
    if (!r) r = consumeToken(b, "or");
    if (!r) r = consumeToken(b, "xor");
    exit_section_(b, l, m, r, false, null);
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
  // !(R_CURLY|value)
  static boolean not_brace_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_brace_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_brace_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // R_CURLY|value
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

  /* ********************************************************** */
  // !(R_CURLY|')'|']'|value)
  static boolean not_terminator_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_terminator_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_terminator_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // R_CURLY|')'|']'|value
  private static boolean not_terminator_or_next_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_terminator_or_next_value_0")) return false;
    boolean r;
    r = consumeToken(b, R_CURLY);
    if (!r) r = consumeToken(b, R_PAREN);
    if (!r) r = consumeToken(b, R_BRACKET);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

  /* ********************************************************** */
  // '\' octal_digit octal_digit octal_digit
  public static boolean octal_byte_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octal_byte_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OCTAL_BYTE_VALUE, "<octal byte value>");
    r = consumeToken(b, "\\");
    r = r && octal_digit(b, l + 1);
    r = r && octal_digit(b, l + 1);
    r = r && octal_digit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 1|2|3|4|5|6|7
  public static boolean octal_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octal_digit")) return false;
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
  // "0" ( octal_digit )
  public static boolean octal_lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octal_lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OCTAL_LIT, "<octal lit>");
    r = consumeToken(b, "0");
    r = r && octal_lit_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( octal_digit )
  private static boolean octal_lit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octal_lit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = octal_digit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Operand |
  //     {<primary_expr>} Selector |
  //     {<primary_expr>} Index |
  //     {<primary_expr>} Slice |
  //     {<primary_expr>} Arguments
  public static boolean primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPR, "<primary expr>");
    r = Operand(b, l + 1);
    if (!r) r = primary_expr_1(b, l + 1);
    if (!r) r = primary_expr_2(b, l + 1);
    if (!r) r = primary_expr_3(b, l + 1);
    if (!r) r = primary_expr_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {<primary_expr>} Selector
  private static boolean primary_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr(b, l + 1);
    r = r && Selector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {<primary_expr>} Index
  private static boolean primary_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr(b, l + 1);
    r = r && Index(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {<primary_expr>} Slice
  private static boolean primary_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr(b, l + 1);
    r = r && Slice(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {<primary_expr>} Arguments
  private static boolean primary_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expr(b, l + 1);
    r = r && Arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "==" | "!=" | "<" | "<=" | ">" | ">=" | "is" | "is not" | "matches" | "not matches"
  public static boolean rel_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rel_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REL_OP, "<rel op>");
    r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "is");
    if (!r) r = consumeToken(b, "is not");
    if (!r) r = consumeToken(b, "matches");
    if (!r) r = consumeToken(b, "not matches");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ["not"] ( "contains" | "in" )
  public static boolean set_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_OP, "<set op>");
    r = set_op_0(b, l + 1);
    r = r && set_op_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ["not"]
  private static boolean set_op_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_op_0")) return false;
    consumeToken(b, "not");
    return true;
  }

  // "contains" | "in"
  private static boolean set_op_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_op_1")) return false;
    boolean r;
    r = consumeToken(b, "contains");
    if (!r) r = consumeToken(b, "in");
    return r;
  }

  /* ********************************************************** */
  // <primary_expr> | unary_op {unary_expr}
  public static boolean unary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPR, "<unary expr>");
    r = primary_expr(b, l + 1);
    if (!r) r = unary_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unary_op {unary_expr}
  private static boolean unary_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_op(b, l + 1);
    r = r && unary_expr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {unary_expr}
  private static boolean unary_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "+" | "-" | "!" | "not"
  public static boolean unary_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OP, "<unary op>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "!");
    if (!r) r = consumeToken(b, "not");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // little_u_value | big_u_value | escaped_char
  public static boolean unicode_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unicode_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNICODE_VALUE, "<unicode value>");
    r = little_u_value(b, l + 1);
    if (!r) r = big_u_value(b, l + 1);
    if (!r) r = escaped_char(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
