grammar grammair;

tokens { Start, Compil, IntCompil, FloatCompil, StringCompil, If, Then,
Else, Do, While, ScanCompil, PrintCompil }

//lexical
PROGID : [A-Z]+; //Nom de programme
ID : [a-zA-Z][a-zA-Z0-9]*; //identificateurs
OPERATEUR : [+*/-];
NBR : [0-9]+; //nombre entier
NBRN : '-'[1-9]+; //nombre entier negatif
WS : [ \t\n\r] -> skip;
WHATEVER : [.]*;
COM : '/''/' ~[\r\n] -> skip;
COMLIGNES : '/''*'WHATEVER'*''/' -> skip;
PV : ';';
O_PAR : '(';
C_PAR : ')';

//syntax
operande : NBR | NBR'.'NBRN | ID | O_PAR NBRN C_PAR;

comparateur : '<'|'>'|'=='|'!=';

expression : operande OPERATEUR operande PV;

comparaison : operande comparateur operande PV;

affect : (ID '=' expression | ID '=' operande) PV;

