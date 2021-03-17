grammar grammair;

/*tokens { Start, Compil, IntCompil, FloatCompil, StringCompil, If, Then,
Else, Do, While, ScanCompil, PrintCompil }*/

//Keywords
INT_TYPE : 'intCompil' ;
FLOAT_TYPE : 'floatCompil' ;
STRING_TYPE : 'stringCompil' ;
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
DO : 'do' ;
WHILE : 'while';
SCANCOMPIL : 'scanCompil' ;
PRINTCOMPIL : 'printCompil' ;
START : 'start' ;
COMPIL : 'compil' ;

//lexical
PROGID : [A-Z]+; //Nom de programme
ID : [a-zA-Z][a-zA-Z0-9]*; //identificateurs
NBR : [0-9]+; //nombre entier
NBRN : '-'[1-9]+; //nombre entier negatif
WS : [ \t\n\r] -> skip;
WHATEVER : [.]*;
COM : '/''/' ~[\r\n] -> skip;
COMLIGNES : '/''*'WHATEVER'*''/' -> skip;
PV : ';' ;
VIR : ',' ;
PT : '.' ;
AFF : '=' ;
O_PAR : '(' ;
C_PAR : ')' ;
O_ACOL : '{' ;
F_ACOL : '}' ;
INF : '<' ;
SUP : '>' ;
EGAL : '==' ;
DIFF : '!=' ;
PLUS : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

//syntax
operande
		: NBR
		| NBR'.'NBRN
		| ID
		| O_PAR NBRN C_PAR
		;


comparateur
			: INF
			| SUP
			| EGAL
			| DIFF
			;
			
operateur 
			: PLUS
			| SUB
			| MUL
			| DIV
			;

expression
			: operande operateur operande
			;

comparaison
			: operande comparateur operande
			;

affect
			: (ID AFF expression | ID AFF operande) PV
			;

decvar
			: (INT_TYPE | FLOAT_TYPE | STRING_TYPE) ID PV decvar
			| /* epsilon */
			| EOF
			;

dakhel : expression dakhel| affect dakhel| EOF;

//si sinon
si : IF '('comparaison')' THEN '{' dakhel si '}'|
IF '('comparaison')' THEN '{' dakhel si '}' ELSE '{' dakhel si '}' | EOF ;

//do - while
tantque : DO '{' dakhel '}' WHILE '('comparaison')'|
DO '{' dakhel si'}' WHILE '('comparaison')'|
DO '{' dakhel tantque'}' WHILE '('comparaison')'| EOF ;

dakhellecture : ID ',' dakhellecture | ID ;
lecture : SCANCOMPIL '(' dakhellecture ')' ';' ;

dakhelecriture : WHATEVER | ID ;
ecriture : PRINTCOMPIL '(' dakhelecriture ')' ';' ;

instruction : lecture instruction| ecriture instruction|
affect instruction| si instruction| tantque instruction| EOF ;


programme : COMPIL  PROGID '{' decvar START '}' EOF;




