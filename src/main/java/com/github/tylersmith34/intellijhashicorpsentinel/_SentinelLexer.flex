package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;

%%

%{
  public _SentinelLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SentinelLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
WHITE_SPACE=[ \t\n\x0B\f\r]+
DOUBLE_QUOTED_STRING=\"([^\\\"\r\n]|\\[^\r\n])*\"?
SINGLE_QUOTED_STRING='([^\\'\r\n]|\\[^\r\n])*'?
COMMENT=("//".*)|(#.*)
BLOCK_COMMENT="/"\*([^*]|\*[^/])*\*?(\*"/")?
NUMBER=-?(0x)?(0|[1-9])[0-9]*(\.[0-9]+)?([eE][-+]?[0-9]+)?

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  "["                         { return L_BRACKET; }
  "]"                         { return R_BRACKET; }
  "{"                         { return L_CURLY; }
  "}"                         { return R_CURLY; }
  "("                         { return L_PAREN; }
  ")"                         { return R_PAREN; }
  ","                         { return COMMA; }
  "."                         { return PERIOD; }
  "="                         { return EQUALS; }
  "import"                    { return IMPORT; }
  "as"                        { return AS; }
  "param"                     { return PARAM; }
  "default"                   { return DEFAULT; }
  "main"                      { return MAIN; }
  "rule"                      { return RULE; }
  "<condition>"               { return CONDITION; }
  "func"                      { return FUNC; }
  "return"                    { return RETURN; }
  "if"                        { return IF; }
  "else"                      { return ELSE; }
  "for"                       { return FOR; }
  "break"                     { return BREAK; }
  "continue"                  { return CONTINUE; }
  "all"                       { return ALL; }
  "any"                       { return ANY; }
  "filter"                    { return FILTER; }
  "true"                      { return TRUE; }
  "false"                     { return FALSE; }
  "null"                      { return NULL; }
  "undefined"                 { return UNDEFINED; }
  "<unary_expression>"        { return UNARY_EXPRESSION; }
  "<primary_expression>"      { return PRIMARY_EXPRESSION; }
  "and"                       { return AND; }
  "or"                        { return OR; }
  "xor"                       { return XOR; }
  "not"                       { return NOT; }
  "contains"                  { return CONTAINS; }
  "in"                        { return IN; }
  "AssignmentOperators"       { return ASSIGNMENTOPERATORS; }
  "StatementList"             { return STATEMENTLIST; }

  {IDENTIFIER}                { return IDENTIFIER; }
  {WHITE_SPACE}               { return WHITE_SPACE; }
  {DOUBLE_QUOTED_STRING}      { return DOUBLE_QUOTED_STRING; }
  {SINGLE_QUOTED_STRING}      { return SINGLE_QUOTED_STRING; }
  {COMMENT}                   { return COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {NUMBER}                    { return NUMBER; }

}

[^] { return BAD_CHARACTER; }
