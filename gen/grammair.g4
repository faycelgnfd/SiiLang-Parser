grammar grammair;

//lexer : 

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

//autre entitées lexicales
COM : '//'~[\r\n]* -> skip;
COMLIGNES : '/*' .*? '*/' -> skip;
PROGID : [A-Z]+; //Nom de programme
ID : [a-zA-Z][a-zA-Z0-9]*; //identificateurs
STRING : '"' (~[\r\n"] | '""')* '"' ; 
NBR : [0-9]+; //nombre entier
NBRN : '-'[1-9]+; //nombre entier negatif
WS : [ \t\n\r] -> skip;
PV : ';' ;
VIR : ',' ;
PT : '.' ;
AFF : '=' ;
O_PAR : '(' ;
F_PAR : ')' ;
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
DBQUOTE : '"' ;

//parser
operande
		: NBR
		| NBR PT NBR
		| ID
		| O_PAR NBRN F_PAR
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
			: operande operateur endExp
			;
			
endExp
			: operande
			;

comparaison
			: operande comparateur endComp
			;

endComp
			:operande
			;

affect
			: (ID AFF expression |
			ID AFF operande) PV
			;

decvar
			: (INT_TYPE | FLOAT_TYPE | STRING_TYPE) ID PV decvar
			| /* epsilon */
			;

// ce qui peut etre à l'interieur d'un block if ou do-while
inside
			: affect inside
			| si inside 
			| tantque inside
			| /* epsilon */
			;

sinon
			: ELSE O_ACOL inside F_ACOL
			| /* epsilon */
			;

//si
si
			: IF O_PAR comparaison F_PAR THEN O_ACOL inside F_ACOL sinon
			;
			

//do - while
tantque
			: DO O_ACOL inside F_ACOL WHILE O_PAR comparaison F_PAR
			;

insidelecture
			: ID VIR insidelecture
			| ID 
			;

lecture
			: SCANCOMPIL O_PAR insidelecture F_PAR PV
			;

insideecriture
			: STRING 
			| insidelecture
			;
			
ecriture
			: PRINTCOMPIL O_PAR insideecriture F_PAR PV
			;

instruction
			: lecture instruction
			| ecriture instruction
			| affect instruction
			| si instruction
			| tantque instruction
			| /* epsilon */
			;


programme : COMPIL PROGID O_ACOL decvar START instruction F_ACOL EOF;




