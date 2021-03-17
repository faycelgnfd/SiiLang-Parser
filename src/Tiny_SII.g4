grammar Tiny_SII;

tokens { Start, Compil, IntCompil, FloatCompil, StringCompil, If, Then,
Else, Do, While, ScanCompile, PrintCompil }

//lexical
PROGID : [A-Z]+;
ID : [a-zA-Z][a-zA-Z0-9]*;
OPERATEUR : [+*/-];
WS : [\t\n] -> skip;
WHATEVER : [.]*;
NBR :[0-9]+ ;
COM : '/''/'WHATEVER -> skip;
COMLIGNES : '/''*'WHATEVER'*''/' -> skip;

//syntax
operande : NBR|NBR'.'NBR|ID;

comparateur : '<'|'>'|'=='|'!=';

expression : operande OPERATEUR operande';';

comparaison : operande comparateur operande';';

affect : ID '=' expression ';' | ID '=' operande ';';

decvar : IntCompil ID ';' decvar| FloatCompil ID ';' decvar| StringCompil ID ';' decvar | EOF;

dakhel : expression dakhel| affect dakhel| EOF;

//si sinon
si : If '('comparaison')' Then '{' dakhel si '}'|
If '('comparaison')' Then '{' dakhel si '}' Else '{' dakhel si '}' | EOF ;


//do - while
tantque : Do '{' dakhel '}' While '('comparaison')'|
Do '{' dakhel si'}' While '('comparaison')'|
Do '{' dakhel tantque'}' While '('comparaison')'| EOF ;

dakhellecture : ID ',' dakhellecture | ID ;
lecture : ScanCompile '(' dakhellecture ')' ';' ;

dakhelecriture : WHATEVER | ID ;
ecriture : PrintCompil '(' dakhelecriture ')' ';' ;

instruction : lecture instruction| ecriture instruction|
affect instruction| si instruction| tantque instruction| EOF;

programme : Compil PROGID '{' decvar Start instruction '}' EOF;