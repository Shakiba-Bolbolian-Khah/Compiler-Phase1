grammar Toorla;



program
    :   (classType)* entryClass (classType)* EOF
    ;

classType
    :   CLASS ID (INHERIT ID)? COLON classBody END
    ;

entryClass
    :   MAINCLASS ID (INHERIT ID)? COLON classBody END
    ;

classBody
    :   (method | fieldStmt)*
    ;

method
    :   accessModifier? FUNCTION ID RPARAN argument? LPARAN RETURNS (type | funcArray) COLON blockBody END
    ;

argument
    :   ID COLON (type | funcArray) multiArgs
    ;

multiArgs
    :   COMMA argument |
    ;

fieldStmt
    :   accessModifier? FIELD fieldVars (type | funcArray) SEMICOLON
    ;

fieldVars
    :   ID COMMA fieldVars | ID
    ;

blockBody
    :   statement*
    ;

statement
    :   singleStatement | ifExp | block
    ;

incDecStmt
    :   expression (INC | DEC) SEMICOLON
    ;

singleStatement
    :   (varDef | whileLoop | returnFunc | printFunc | incDecStmt | halt | SEMICOLON+)
    ;

accessModifier
    :   (PUBLIC | PRIVATE)
    ;

type
    :   (INT | STRING | BOOL | ID)
    ;

array
    :   type RBRACKET NUMBER LBRACKET
    ;

funcArray
    :   type RBRACKET LBRACKET
    ;

varDef
    :   assignment | instantiation
    ;

assignment
    :   (ID | arrayElement | callExp)  ASSIGN expression SEMICOLON
    ;

instantiation
    :   VAR ID ASSIGN expression multiVar
    ;

multiVar
    :   COMMA ID ASSIGN expression multiVar | SEMICOLON
    ;

whileLoop
    :   WHILE RPARAN expression LPARAN whileBody
    ;

whileBody
    :   block | singleStatement | ifExp
    ;

halt
    :   ( BREAK | CONTINUE )  SEMICOLON
    ;
    
ifBody
    :   (singleStatement | block)
    ;

ifExp
    : IF RPARAN expression LPARAN ((ifBody) (elifStmt)* elseStmt? | ifExp| (completeIf) ((elifStmt)+ elseStmt? | elseStmt))
    ;

elifStmt
    :   ELIF RPARAN expression LPARAN (ifBody | ifExp)
    ;

elseStmt
    :   ELSE (ifBody | ifExp)
    ;

completeIf
    :   IF RPARAN expression LPARAN (ifBody | completeIf) ((elifStmt)+ (elseStmt)? | elseStmt)
    ;

returnFunc
    :   RETURN expression SEMICOLON
    ;

block
    :   BEGIN blockBody END
    ;

printFunc
    :   PRINT RPARAN expression LPARAN SEMICOLON
    ;

expression
    :   andExp (OR andExp)*
    ;

andExp
    :   equalExp (AND equalExp)*
    ;

equalExp
    :   compareExp ((EQUAL | NEQUAL) compareExp)*
    ;

compareExp
    :   addExp ((LT | GT) addExp)*
    ;

addExp
    :   multExp ((PLUS | MINUSNEG) multExp)*
    ;

multExp
    :   unaryExp ((MULT | MOD | DIV) unaryExp)*
    ;

unaryExp
    :   (NOT | MINUSNEG) unaryExp | callExp
    ;


callExp
    :   methodCall RBRACKET addExp LBRACKET | methodCall | singleCall
    ;

methodCall
    :   otherCall methodTempCall
    ;

methodTempCall
    :   ((RBRACKET addExp LBRACKET)? DOT (ID RPARAN argCall LPARAN | ID)) (methodTempCall)?
    ;

otherCall
    : newExp | SELF | ID | paranExp | funcCall
    ;

singleCall
    :   NUMBER | STRTOKEN | TRUE | FALSE | newExp | arrayElement | paranExp | funcCall | ID
    ;

arrayElement
    :   (ID | paranExp) RBRACKET ( addExp ) LBRACKET
    ;

funcCall
    :   ID RPARAN argCall LPARAN
    ;

argCall
    :   expression (COMMA argCall)* |
    ;


//methodCall
//    :   ((NEW ID RPARAN LPARAN | SELF | ID | ID RBRACKET addExp LBRACKET) DOT | ) ID RPARAN argCall LPARAN
//    ;



//fieldCall
//    :   (ID | ID RBRACKET addExp LBRACKET | ID RPARAN LPARAN | SELF) DOT (ID)
//    ;



newExp
    :   NEW (ID RPARAN LPARAN | array)
    ;

paranExp
    :   RPARAN expression LPARAN
    ;

BEGIN
    : 'begin'
    ;

END
    : 'end'
    ;

INHERIT
    : 'inherits'
    ;

FUNCTION
    : 'function'
    ;

FIELD
    : 'field'
    ;

SELF
    :'self'
    ;

TRUE
    :'true'
    ;

FALSE
    : 'false'
    ;

ELSE
    : 'else'
    ;

ELIF
    : 'elif'
    ;

NEW
    : 'new'
    ;

RETURN
    : 'return'
    ;

RETURNS
    : 'returns'
    ;

BOOL
    : 'bool'
    ;

STRING
    : 'string'
    ;

INT
    : 'int'
    ;

VAR
    : 'var'
    ;

CLASS
    : 'class'
    ;

MAINCLASS
    : 'entry class'
    ;

IF
    : 'if'
    ;

WHILE
    : 'while'
    ;

BREAK
    : 'break'
    ;

CONTINUE
    : 'continue'
    ;

PRINT
    : 'print'
    ;

PUBLIC
    : 'public'
    ;

PRIVATE
    : 'private'
    ;

PLUS
    : '+'
    ;

MINUSNEG
    : '-'
    ;

MULT
    : '*'
    ;

DIV
    : '/'
    ;

MOD
    : '%'
    ;

EQUAL
    : '=='
    ;

NEQUAL
    : '<>'
    ;

LT
    : '<'
    ;

GT
    : '>'
    ;

AND
    : '&&'
    ;

OR
    : '||'
    ;

NOT
    : '!'
    ;


ASSIGN
	:	'='
	;

COMMENT
    : '/*' .*? '*/' -> skip
	;

LINECOMMENT
    : '//' ~[\r\n]* -> skip
    ;

WS
	: [ \t\n] -> skip
	;
SEMICOLON
	: ';'
	;

INC
	: '++'
	;

DEC
    : '--'
    ;

COLON
	: ':'
	;

COMMA
    : ','
    ;

DOT
    : '.'
    ;

STRTOKEN
    : '"' ('\\' ["\\] | ~["\\\r\n])* '"'
    ;

RPARAN
    : '('
    ;

LPARAN
    : ')'
    ;

RBRACKET
    : '['
    ;

LBRACKET
    : ']'
    ;

NUMBER
    :    [1-9][0-9]* | [0]
    ;

ID
	:	[a-zA-Z] [a-zA-Z0-9_]*
	;
