grammar Logo; 

@header {
  package logoparsing;
}

INT : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;
CHAR : [a-zA-Z]+ ;
//LP : 'loop' ;

programme : (procedure_declaration|fonction_declaration)* liste_instructions 
;
liste_instructions :
    (instruction)+
;

bloc :
 '[' (instruction)* ']'
;

variable :
   CHAR # nomVariable
;

condition :
    expr '<' expr # inf
  | expr '<=' expr # infzero
  | expr '>' expr # sup
  | expr '>=' expr # supzero
  | expr '=' expr # egal
  | expr '!=' expr # NotEgal
;

procedure_declaration :
	'pour' CHAR (':'variable)*  (instruction)+ 'fin' # proced
;

procedure_execution :
	 CHAR '[' (expr)* ']' # execProced
;


fonction_declaration :
	'pour' CHAR (':'variable)*  (instruction)* 'rends' expr 'fin' # fonc
;

fonction_execution :
	CHAR '[' (expr)* ']' # execfonc
;


instruction :
    'av' expr # av
  | 'td' expr # td
  | 'tg' expr # tg
  | 're' expr # re
  | 've' # ve
  | 'lc' # lc
  | 'bc' # bc
  | 'fpos' '[' expr expr ']' # fpos
  | 'fcc' expr # fcc
  | 'donne' '"'variable expr # vari
  | 'si' condition bloc bloc? # si
  | 'repete' expr bloc  # repete
  | 'tantque' condition bloc  #tantque
  | procedure_execution # exec_proc
;

//instruction_fonction :
//	(instruction)* #liste__intruction
//  | 'rends' expr  #return
	
	
expr:
	  expr '^' expr # exp
	| expr ('*' | '/' ) expr # mult
	| expr ('+' | '-' ) expr # sum
	| INT # int
	| 'loop' # loop
	| ':'variable # resVar
	| 'hasard' expr # hasard
	| '(' expr ')' # parent
	| CHAR '[' (expr)* ']' # exec_fonc
;
   