package com.higherorderco.bend.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.higherorderco.bend.language.psi.BendTypes;
import com.intellij.psi.TokenType;

%%

%class BendLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

/* Whitespace */
CRLF=\R
WHITE_SPACE=[ \n\t\f]


%state WAITING_VALUE

%%

/* Reference */
<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
[^]                                                         { return TokenType.BAD_CHARACTER; }
