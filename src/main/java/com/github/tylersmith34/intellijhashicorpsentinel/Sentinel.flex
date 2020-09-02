package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;

%%

%{
  public SentinelLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class SentinelLexer
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
  "="                         { return EQUALS; }
  "true"                      { return TRUE; }
  "false"                     { return FALSE; }
  "null"                      { return NULL; }
  "undefined"                 { return UNDEFINED; }
  "import"                    { return IMPORT; }
  "as"                        { return AS; }
  "param"                     { return PARAM; }
  "default"                   { return DEFAULT; }
  "main"                      { return MAIN; }
  "rule"                      { return RULE; }
  "<expression>"              { return EXPRESSION; }
  "<digit>"                   { return DIGIT; }
  "<number>"                  { return NUMBER; }
  "<primary_expr>"            { return PRIMARY_EXPR; }
  "func"                      { return FUNC; }
  "Block"                     { return BLOCK; }
  "StatementList"             { return STATEMENTLIST; }
  "Expressions"               { return EXPRESSIONS; }
  "CRLF"                      { return CRLF; }
  "value"                     { return VALUE; }
  "array"                     { return ARRAY; }
  "object"                    { return OBJECT; }

  {IDENTIFIER}                { return IDENTIFIER; }
  {WHITE_SPACE}               { return WHITE_SPACE; }
  {DOUBLE_QUOTED_STRING}      { return DOUBLE_QUOTED_STRING; }
  {SINGLE_QUOTED_STRING}      { return SINGLE_QUOTED_STRING; }
  {COMMENT}                   { return COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
