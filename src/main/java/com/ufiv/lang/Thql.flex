package com.ufiv.lang;


import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.ufiv.lang.psi.ThqlTypes;
import com.intellij.psi.TokenType;
import com.ufiv.lang.psi.ThqlTypes;

%%

%class ThqlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%caseless
%eof{  return;
%eof}

/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*
EndOfLineComment = "--" {InputCharacter}* {LineTerminator}?
/* identifiers */
Identifier = [:jletter:][:jletterdigit:]*

/* integer literals */
DecIntegerLiteral = 0 | [1-9][0-9]*

/* floating point literals */
FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}) {Exponent}? [fF]

FLit1    = [0-9]+ \. [0-9]*
FLit2    = \. [0-9]+
FLit3    = [0-9]+
Exponent = [eE] [+-]? [0-9]+

/* string and character literals */
StringCharacter = [^\r\n\"\\]
SingleCharacter = [^\r\n\'\\]

CREATE = 'CREATE'
TABLE = 'TABLE'
EXTERNAL = 'EXTERNAL'
IF = 'IF'
NOT = 'NOT'
EXISTS = 'EXISTS'
COMMENT = 'COMMENT'
COMMA = ','
STORED = 'STORED'
AS = 'AS'
%%

<YYINITIAL>{
    {CREATE}   {return ThqlTypes.CREATE;}
    {TABLE}    {return ThqlTypes.TABLE;}
    {EXTERNAL} {return ThqlTypes.EXTERNAL;}
      {IF} {return ThqlTypes.IF;}
      {NOT} {return ThqlTypes.NOT;}
    {EXISTS} {return ThqlTypes.EXISTS;}
      {COMMENT} {return ThqlTypes.COMMENT;}
      {COMMA} {return ThqlTypes.COMMA;}
      {STORED} {return ThqlTypes.STORED;}
      {AS} {return ThqlTypes.AS;}
}