
grammar Sql;

//tokeny
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

DatatypeI: 'Int';
DatatypeF: 'Float';
DatatypeT: 'Text';
DatatypeB: 'Bool';

True: 'True';
False: 'False';

Select: 'Select';
From: 'From';
Where: 'Where';
And: 'And';
Or: 'Or';
In: 'In';
Not: 'Not';
Order: 'Order';
By: 'By';
Descending: 'Descending';
Update: 'Update';
Set: 'Set';
Delete: 'Delete';
Like: 'Like';

Insert: 'Insert';
Into: 'Into';
Values: 'Values';

Join: 'Join';
Inner: 'Inner';
Outer: 'Outer';
Left: 'Left';
Right: 'Right';
Full: 'Full';
Create: 'Create';
Table: 'Table';
//Operacje
Plus: '+';
Minus: '-';
Star: '*';
Divide: '/';

//Porównania
Equals: '=';
Lesser: '<';
Greater: '>';
Greater_Equal: '>=';
Leser_Equal: '<=';
Not_Equal: '<>';




BracketL: '(';
BracketR: ')';
SColon: ';';
Coma: ',';

Id: [a-zA-Z] [a-zA-Z0-9_]*;
Liczba: [0-9]+ ('.' [0-9]+)?;

String: ('"' .*? '"' | '\'' .*? '\''); // Non-greedy -> .*? dopasowuje wszystko do następnego " lub '    https://github.com/antlr/antlr4/blob/master/doc/wildcard.md



//Start - token Startowy



//Produkcje


start
    : (select | insert | create) SColon ( (select | insert | create) SColon )*  EOF
    ;
select
    : Select selectItemList (From table)? // whereStatement? (Order By Id Descending? )? // ToDo : OrderBy
    ;
selectItemList
    : selectItem (Coma selectItem)*
    | Star
    ;
selectItem
    : expr
    ;
//Wyrażenia


expr
    : expr operator expr
    | BracketL expr BracketR
    | variable
    ;

operator
    : operatorM
    | operatorC
    | operatorL
    ;

exprM
    :baseExpr
    exprM operator exprM
    ;
baseExpr //Formula
    : variable
    ;

variable
    : numVar = Liczba
    | textVar = String
    | boolVar = (True | False)
    | colVar = Id //referencja do kolumny
    ;



update
    : Update Id Set columnsSetEq whereStatement?
    ;
delete
    : Delete From Id whereStatement?
    ;
columns
    : column (Coma column)*
    ;
column
    :Id
    ;
table
    : Id (join Id)*
    ;
join
    : (Inner | Outer | Left | Right | Full)? Join
    ;
condition
    : BracketL condition BracketR
    | condition operatorL condition
    | formula
    ;

var
    : Liczba
    | Id
    // | String // TODO : Dodać string
    ;
formula
    : BracketL formula BracketR
    | var operatorC var
    ;
columnsSetEq
    : Id Equals var (Coma Id Equals var)*
    ;
whereStatement
    : Where (condition | Id Like var)
    ;
operatorL
    : And | Or
    ;
operatorC
    :Equals | Leser_Equal | Lesser | Greater | Greater_Equal | Not_Equal
    ;
operatorM
    : Plus | Minus | Star | Divide
    ;
create
    : createTable
    ;
createTable
    : Create Table Id (BracketL createTableCol BracketR)?
    ;
createTableCol
    :Id datatype (Coma createTableCol)?
    ;

datatype
    :DatatypeB|DatatypeF|DatatypeT
    ;

insert
    : Insert Into Id BracketL insertCol BracketR Values BracketL insertValues BracketR
    ;

insertCol
    : Id (Coma insertCol)?
    ;

insertValues
    : insertValue (Coma insertValues)?
    ;


insertValue
    : numVar = Liczba
    | textVar = String
    | boolVar = (True | False)
    ;











