grammar SmallC;
@header { package gramatica; }

// Entrada del programa: varias funciones o sentencias
program     : (funcDecl | stmt)* EOF ;

// Declaración de función sin parámetros
funcDecl    : 'func' ID '(' ')' block ;

// Bloque de sentencias
block       : '{' stmt* '}' ;

// Las distintas sentencias
stmt
    : varDecl ';'
    | assignStmt ';'
    | ifStmt
    | whileStmt
    | exprStmt ';'
    ;

// Declaración de variable entera
varDecl     : 'int' ID ('=' expr)? ;

// Asignación
assignStmt  : ID '=' expr ;

// If / Else
ifStmt      : 'if' '(' expr ')' block ('else' block)? ;

// While
whileStmt   : 'while' '(' expr ')' block ;

// Una expresión como sentencia
exprStmt    : expr ;

// Expresiones aritméticas con precedencia y paréntesis
expr
    : relExpr
    ;

relExpr
    : addExpr ((GT|LT|GE|LE|EQ|NEQ) addExpr)*
    ;

addExpr
    : mulExpr (('+'|'-') mulExpr)*
    ;

mulExpr
    : atom (('*'|'/') atom)*
    ;

atom
    : INT
    | ID
    | '(' expr ')'
    ;
// Tokens
GE   : '>=' ;
LE   : '<=' ;
EQ   : '==' ;
NEQ  : '!=' ;
GT   : '>' ;
LT   : '<' ;

ID   : [a-zA-Z_][a-zA-Z0-9_]* ;
INT  : [0-9]+ ;
WS   : [ \t\r\n]+ -> skip ;
