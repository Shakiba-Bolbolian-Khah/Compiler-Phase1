grammar AS;


program
    :    additionExp EOF
    ;
// rooye main haa baraye etminaan EOF bezarid!
additionExp
    :    multiplyExp
         ( '+' multiplyExp
         | '-' multiplyExp
         )*
    ;


multiplyExp
    :    atomExp
         ( '*' atomExp
         | '/' atomExp
         )*
    ;

atomExp
    :    NUMBER
    |    '(' additionExp ')'
    ;


NUMBER
    :    [1-9][0-9]* | [0]
    ;

WS: [ \t\n] -> skip
;