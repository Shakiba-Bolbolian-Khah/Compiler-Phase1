grammar Toorla_Actions;

@header
{
    import toorla.ast.*;
    import toorla.ast.declaration.*;
    import toorla.ast.declaration.classDecs.*;
    import toorla.ast.declaration.classDecs.classMembersDecs.*;
    import toorla.ast.declaration.localVarDecs.*;
    import toorla.ast.expression.*;
    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.unaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.statement.*;
    import toorla.ast.statement.localVarStats.*;
    import toorla.ast.statement.returnStatement.*;
    import toorla.types.*;
    import toorla.types.arrayType.*;
    import toorla.types.singleType.*;


}

program returns [Program mProgram]
    :  { $mProgram = new Program();}
       (c1 = classType {$mProgram.addClass($c1.value);})*
       (e = entryClass {$mProgram.addClass($e.value);})
       (c2 = classType {$mProgram.addClass($c2.value);})* EOF

    ;

classType returns [ClassDeclaration value] locals[String name,String parName="", Identifier iD, Identifier parenID,int line,int pos]
    :   c = CLASS {$line = $c.line; $pos = $c.pos;}
        className = ID
        {
         $name = $className.text;
         $iD = new Identifier($name);
         $iD.line = $className.line;
         $iD.col = $className.pos;
        }
        ( INHERIT parentName = ID
        {
         $parName = $parentName.getText();
         $parenID = new Identifier($parName);
         $parenID.line = $parentName.line;
         $parenID.col = $parentName.pos;
        })?

        {
          if($parName == "")
            $value = new ClassDeclaration($iD);
          else
            $value = new ClassDeclaration($iD,$parenID);
        }

        COLON cb = classBody[$value] {$value = $cb.value;}
        END
        {$value.line = $line; $value.col = $pos;}

    ;

entryClass returns [ClassDeclaration value] locals[String name,String parName="", Identifier iD, Identifier parenID,int line,int pos]
    :   m = MAINCLASS {$line = $m.line; $pos = $m.pos;}
        className = ID
        {
         $name = $className.text;
         $iD = new Identifier($name);
         $iD.line = $className.line;
         $iD.col = $className.pos;
        }
        ( INHERIT parentName = ID
        {
         $parName = $parentName.getText();
         $parenID = new Identifier($parName);
         $parenID.line = $parentName.line;
         $parenID.col = $parentName.pos;
        })?
        {
          if($parName == "")
            $value = new ClassDeclaration($iD);
          else
            $value = new ClassDeclaration($iD,$parenID);
        }

        COLON cb = classBody[$value] {$value = $cb.value;}
        END
        {$value.line = $line; $value.col = $pos;}
    ;

classBody[ClassDeclaration classs] returns[ClassDeclaration value]
    :   (m = method {$classs.addMethodDeclaration($m.value);} | f = fieldStmt {$classs.addFieldsDeclarations($f.value);})*
        { $value = $classs;}
    ;

method returns[MethodDeclaration value] locals [int i,String accessmodifier="public",Identifier name,Type returnType, List<Statement> body,int line , int pos]
    :   (am = accessModifier {$accessmodifier = $am.name;})?
        ff = FUNCTION {$line = $ff.line; $pos = $ff.pos;}
        ii = ID
        {
         $name = new Identifier($ii.text);
         $name.line = $ii.line;
         $name.col = $ii.pos;
        }
        RPARAN
        { $value = new MethodDeclaration($name);
          $value.line = $line;
          $value.col = $pos;
          if($accessmodifier == "private")
            $value.setAccessModifier(AccessModifier.ACCESS_MODIFIER_PRIVATE);
        }
        (a = argument[$value] {$value = $a.value;})?
        LPARAN RETURNS
        (( t = typpe {$returnType = $t.type;} | f = funcArray {$returnType = new ArrayType($f.type);})
        { $value.setReturnType($returnType);})
        COLON
        b = blockBody
        {$body = $b.value;
        for ( $i = 0 ; $i< $body.size() ; $i++)
            $value.addStatement( $body.get($i));
        }
        END
    ;

accessModifier returns[String name]//TO DO
    :   pu = PUBLIC {$name = $pu.getText();}
        | pr = PRIVATE {$name = $pr.getText();}
    ;

typpe returns[SingleType type] locals[ Identifier iD, ClassDeclaration cd]
    :
        i = INT {$type = new IntType();}
       |s = STRING {$type = new StringType();}
       |b = BOOL {$type = new BoolType();}
       |c = ID
       {
       $iD = new Identifier($c.getText());
       $cd = new ClassDeclaration($iD);
       $type = new UserDefinedType($cd);
       }
    ;

argument[MethodDeclaration md] returns[MethodDeclaration value] locals[String name, Type argType, Identifier iD, ParameterDeclaration pd]
    :   i = ID
    {
     $name = $i.getText();
     $iD = new Identifier($name);
     $iD.line = $i.line;
     $iD.col = $i.pos;
    }
        COLON
        ( t = typpe {$argType = $t.type;} | f = funcArray {$argType = new ArrayType($f.type);})
        {
          $pd = new ParameterDeclaration( $iD, $argType);
          $md.addArg( $pd );
        }
        ma = multiArgs[$md] { $md = $ma.value;}
        { $value = $md;}
    ;

multiArgs[MethodDeclaration md] returns[MethodDeclaration value]
    :   (COMMA
        arg = argument[$md] { $value = $arg.value;})
        | ({$value = $md;})
    ;

funcArray returns[SingleType type]
    :   t = typpe { $type = $t.type;}
        RBRACKET
        LBRACKET
    ;

blockBody returns[List<Statement> value]
    :
        { $value = new ArrayList<>(); }
        (( stmt = statement { $value.add($stmt.value);})+
        | {$value.add(new Skip());})
    ;
//what to do what not to do
fieldStmt returns[ List<FieldDeclaration> value] locals [int i,String accessmodifier="private",List<Identifier> names,Type fieldType, FieldDeclaration fd,int line,int pos]
    :   { $names = new ArrayList();
          $value = new ArrayList<>();
        }
        (am = accessModifier {$accessmodifier = $am.name;})?
        ff = FIELD {$line = $ff.line; $pos = $ff.pos;}
        fVars = fieldVars {$names = $fVars.names;}
        ( (t = typpe {$fieldType = $t.type;}) | (f = funcArray {$fieldType = new ArrayType($f.type);}))
        {
            for( $i = 0; $i < $names.size(); $i++){
                $fd = new FieldDeclaration( $names.get($i) , $fieldType);
                if($accessmodifier == "public")
                    $fd.setAccessModifier(AccessModifier.ACCESS_MODIFIER_PUBLIC);
                $value.add($fd);
            }
        }
        SEMICOLON
    ;

fieldVars returns[ List<Identifier> names, Identifier iD]
    :
        {$names = new ArrayList();}
        ((i = ID { $iD = new Identifier($i.getText()); $iD.line = $i.line; $iD.col = $i.pos;}
        { $names.add($iD); }
        COMMA
        fVars = fieldVars {$names.addAll($fVars.names);})
        |(name = ID { $iD = new Identifier($name.getText()); $iD.line = $name.line; $iD.col = $name.pos;}
        {$names.add($iD);}))
    ;
 statement returns[ Statement value]
    :
        s = singleStatement { $value = $s.value;}
        | i = ifExp { $value = $i.value;}
        | b = block {$value = $b.value;}
    ;

varDef returns[ Statement value]
    :
        a = assignment {$value = $a.value;}
        | i = instantiation {$value = $i.value;}
    ;
//check
assignment returns[ Statement value] locals[Expression lValue, Expression rValue,int line,int pos]
    :
        ( i = ID { $lValue = new Identifier($i.getText()); $lValue.line = $i.line; $lValue.col = $i.pos;}
        | a = arrayElement { $lValue = $a.value;}
        | f = callExp { $lValue = $f.value;})
        aa = ASSIGN {$line = $aa.line; $pos = $aa.pos;}
        e = expression { $rValue = $e.value;}
        { $value = new Assign( $lValue, $rValue); $value.line = $line; $value.col = $pos;}
        SEMICOLON
    ;

instantiation returns[LocalVarsDefinitions value] locals[LocalVarDef lvd, Identifier iD, Expression rValue,int line1,int pos1,int line2 ,int pos2]
    :
        { $value = new LocalVarsDefinitions();}
        v = VAR {$line1 = $v.line; $pos1 = $v.pos;}
        i = ID { $iD = new Identifier($i.getText()); $iD.line = $i.line; $iD.col = $i.pos;}
        a = ASSIGN {$line2 = $a.line; $pos2 = $a.pos;}
        e = expression { $rValue = $e.value;}
        { $lvd = new LocalVarDef($iD, $rValue);
          $lvd.line = $line2; $lvd.col = $pos2;
          $value.addVarDefinition($lvd);
        }
        m = multiVar[$value] { $value = $m.value;}
        {$value.line = $line1; $value.col = $pos1;}
    ;

multiVar[LocalVarsDefinitions val] returns[LocalVarsDefinitions value] locals[LocalVarDef lvd, Identifier iD, Expression rValue,int line,int pos]
    :
        (COMMA
        i = ID { $iD = new Identifier($i.getText()); $iD.line = $i.line; $iD.col = $i.pos;}
        a = ASSIGN {$line = $a.line; $pos = $a.pos;}
        e = expression { $rValue = $e.value;}
        { $lvd = new LocalVarDef($iD, $rValue);
          $lvd.line = $line; $lvd.col = $pos;
        $val.addVarDefinition($lvd); }
        m = multiVar[$val] { $val = $m.value;})
        | SEMICOLON
        { $value = $val;}
    ;

whileLoop returns[Statement value] locals[Expression condition, Statement body,int line, int pos]
    :
        w = WHILE {$line = $w.line; $pos = $w.pos;}
        RPARAN
        e = expression { $condition = $e.value;}
        LPARAN
        b = whileBody { $body = $b.value;}
        {
          $value = new While( $condition , $body);
          $value.line = $line; $value.col = $pos;
        }
    ;

whileBody returns[Statement value]
    :
        b = block { $value = $b.value; }
        | s = singleStatement { $value = $s.value; }
        | i = ifExp { $value = $i.value;}
    ;

//what to do what not to do
ifExp returns[Statement value] locals[int i,List<Expression> conds, List<Statement> stmts, Statement elze,int line, int pos]
    :   {
            $conds = new ArrayList<>();
            $stmts = new ArrayList<>();
        }
        ii = IF {$line = $ii.line; $pos = $ii.pos;}
        RPARAN
        e = expression { $conds.add($e.value);}
        LPARAN
        ((
        b = ifBody { $stmts.add($b.value);}
        ( el = elifStmt[$conds,$stmts]
        { $conds = $el.conds;
          $stmts = $el.stmts; })*
        (els = elseStmt { $stmts.add($els.value);})?
        )
        | ie = ifExp { $stmts.add($ie.value);}
        | (cf = completeIf { $stmts.add($cf.value); }
        (el2 = elifStmt[$conds,$stmts]
        { $conds = $el2.conds;
          $stmts = $el2.stmts; })+
        (els2 = elseStmt { $stmts.add($els2.value);})?
        | els3 = elseStmt  { $stmts.add($els3.value);}))

        {
            if( $stmts.size() == $conds.size()+1 )
            {
                $elze = $stmts.get( $stmts.size()-1);
            }
            else
            {
                $elze = new Skip();
            }
            for( $i = $conds.size()-1 ; $i > -1 ; $i--)
            {
                $elze = new Conditional( $conds.get($i) , $stmts.get($i), $elze);
            }
            $value = $elze;
        }
    ;

ifBody returns[Statement value]
    :   s = singleStatement { $value = $s.value; }
        | b = block { $value = $b.value; }
    ;

elifStmt[List<Expression> condVal, List<Statement> stmtVal] returns[List<Expression> conds, List<Statement> stmts]
    :   ELIF
        RPARAN
        e = expression { $condVal.add($e.value);}
        LPARAN
        ( b = ifBody { $stmtVal.add($b.value);}
        | ie = ifExp { $stmts.add($ie.value);} )
        { $conds = $condVal;
          $stmts = $stmtVal; }
    ;

elseStmt returns[Statement value]
    :   ELSE
        b = ifBody { $value = $b.value;}
        | ie = ifExp { $value = $ie.value;}
    ;

completeIf returns[Statement value] locals[int i,List<Expression> conds, List<Statement> stmts, Statement elze]
    :   {
            $conds = new ArrayList<>();
            $stmts = new ArrayList<>();
        }
        IF
        RPARAN
        e = expression { $conds.add($e.value);}
        LPARAN
        ( b = ifBody { $stmts.add($b.value);}
        | ci = completeIf { $stmts.add($ci.value);} )
        ((el2 = elifStmt[$conds,$stmts]
        { $conds = $el2.conds;
          $stmts = $el2.stmts; })+
        (els2 = elseStmt { $stmts.add($els2.value);})?
        | els3 = elseStmt  { $stmts.add($els3.value);})

        {
            if( $stmts.size() == $conds.size()+1 )
            {
                $elze = $stmts.get( $stmts.size()-1);
            }
            else
            {
                $elze = new Skip();
            }
            for( $i = $conds.size()-1 ; $i > -1 ; $i--)
            {
                $elze = new Conditional( $conds.get($i) , $stmts.get($i), $elze);
            }
            $value = $elze;
        }
    ;


returnFunc returns[Statement value] locals[ Expression retVal,int line,int pos]
    :
        r = RETURN {$line = $r.line; $pos = $r.pos;}
        e = expression { $retVal = $e.value; }
        SEMICOLON
        { $value = new Return($retVal);
          $value.line = $line; $value.col = $pos;
        }
    ;
//check
block returns[Statement value] locals[ List<Statement> body,int line,int pos ]
    :
        bb = BEGIN {$line = $bb.line; $pos = $bb.pos;}
        b = blockBody { $body = $b.value;}
        END
        { $value = new Block($body);
          $value.line = $line; $value.col = $pos;
        }
    ;

printFunc returns[Statement value] locals[ Expression exp,int line,int pos]
    :
        p = PRINT {$line = $p.line; $pos = $p.pos;}
        RPARAN
        e = expression { $exp = $e.value; }
        LPARAN
        SEMICOLON
        { $value = new PrintLine($exp);
          $value.line = $line; $value.col = $pos;
        }
    ;

incDecStmt returns[Statement value] locals[ Expression exp, String type = "",int line,int pos]
    :
        e = expression { $exp = $e.value; }
        ( i = INC { $type = "INC";$line = $i.line; $pos = $i.pos;}
        | d = DEC { $type = "DEC"; $line = $d.line; $pos = $d.pos;})
        SEMICOLON
        { if( $type == "INC")
            $value = new IncStatement($exp);
          else if( $type == "DEC")
            $value = new  DecStatement($exp);
          $value.line = $line; $value.col = $pos;
        }
    ;

halt returns[Statement value]
    :
        (c = CONTINUE { $value = new Continue(); $value.line = $c.line; $value.col = $c.pos;}
        | b = BREAK { $value = new Break(); $value.line = $b.line; $value.col = $b.pos;})
        SEMICOLON
    ;
//semicolon??
singleStatement returns[ Statement value]
    :
        v = varDef { $value = $v.value;}
        | w = whileLoop { $value = $w.value;}
        | r = returnFunc {$value = $r.value;}
        | p = printFunc {$value = $p.value;}
        | in = incDecStmt {$value = $in.value;}
        | h = halt {$value = $h.value;}
        | SEMICOLON+ {$value = new Skip();}
    ;

expression returns [Expression value] locals[Expression lhs,Expression rhs]
    :   al = andExp { $lhs = $al.value;}
        (OR ar = andExp {$rhs = $ar.value;}
         {$lhs = new Or($lhs,$rhs);})*

        {$value = $lhs;}
    ;


andExp returns[Expression value] locals[Expression lhs,Expression rhs]
    :   el = equalExp { $lhs = $el.value;}
        (AND er = equalExp {$rhs = $er.value;}
        {$lhs = new And($lhs,$rhs);})*

        {$value = $lhs;}
    ;

equalExp returns[Expression value] locals[Expression lhs,Expression rhs]
    :   cl = compareExp { $lhs = $cl.value;}
        ((EQUAL er = equalExp {$rhs = $er.value;}
         {$lhs = new Equals($lhs,$rhs);})
         |(NEQUAL er = equalExp {$rhs = $er.value;}
         {$lhs = new NotEquals($lhs,$rhs);}))*

        {$value = $lhs;}
    ;

compareExp returns[Expression value] locals[Expression lhs,Expression rhs]
    :   adl = addExp { $lhs = $adl.value;}
        ((LT adr = addExp {$rhs = $adr.value;}
         {$lhs = new LessThan($lhs,$rhs);})
         |(GT adr = addExp {$rhs = $adr.value;}
         {$lhs = new GreaterThan($lhs,$rhs);}))*

        {$value = $lhs;}
    ;

addExp returns[Expression value] locals[Expression lhs,Expression rhs]
   :   multl = multExp { $lhs = $multl.value;}
       ((PLUS multr = multExp {$rhs = $multr.value;}
        {$lhs = new Plus($lhs,$rhs);})
        |(MINUSNEG multr = multExp {$rhs = $multr.value;}
        {$lhs = new Minus($lhs,$rhs);}))*

       {$value = $lhs;}
   ;

multExp returns[Expression value] locals[Expression lhs,Expression rhs]
   :   unaryl = unaryExp { $lhs = $unaryl.value;}
       ((MULT unaryr = unaryExp {$rhs = $unaryr.value;}
        {$lhs = new Times($lhs,$rhs);})
        |(MOD unaryr = unaryExp {$rhs = $unaryr.value;}
        {$lhs = new Modulo($lhs,$rhs);})
        |(DIV unaryr = unaryExp {$rhs = $unaryr.value;}
        {$lhs = new Division($lhs,$rhs);}))*

       {$value = $lhs;}
   ;

unaryExp returns[Expression value] locals[String type, Expression expr]
    :   ((( n = NOT { $type = "NOT";}
        | m = MINUSNEG {$type = "NEG";})
        u = unaryExp
        { $expr = $u.value;})
        | c = callExp {$expr = $c.value;})

        { if( $type == "NOT")
             $value = new Not($expr);
          else if( $type == "NEG")
             $value = new Neg($expr);
        }
    ;

callExp returns[Expression value] locals[Expression instance,Expression index]
    :   ( m = methodCall { $instance = $m.value;}
          RBRACKET
          a = addExp { $index = $a.value;}
          LBRACKET
          {$value = new ArrayCall($instance,$index);}
        )
        | m = methodCall { $value = $m.value;}
        | s = singleCall { $value = $s.value;}
    ;


newExp returns[Expression value] locals[Identifier iD]
    :   NEW
        (( i = ID
        { $iD = new Identifier($i.getText());
          $value = new NewClassInstance($iD);
        }
        RPARAN
        LPARAN )
        | a = array { $value = $array.value;})
    ;

array returns[NewArray value] locals[ SingleType type, IntValue length]
    :   t = typpe { $type = $t.type; }
        RBRACKET
        n = NUMBER { $length = new IntValue($n.int);}
        LBRACKET
        { $value = new NewArray( $type, $length);}
    ;

methodCall returns[Expression value] locals[Expression instance]
    :   o = otherCall { $instance = $o.value;}
        m = methodTempCall[$instance] { $value = $m.value;}
    ;

otherCall returns[Expression value]
    :   n = newExp { $value = $n.value;}
       |s = SELF { $value = new Self();}
       |i = ID { $value = new Identifier($i.getText());}
       |p = paranExp { $value = $p.value;}
       |f = funcCall { $value = $f.value;}
    ;

methodTempCall[Expression instance] returns[Expression value] locals[Expression index,Identifier name,MethodCall mc]
    :    (RBRACKET
          aa = addExp { $index = $aa.value;}
          LBRACKET
          {$instance = new ArrayCall($instance,$index);}
         )?
         DOT
         ((i = ID { $name = new Identifier($i.getText());}
           RPARAN
           { $mc = new MethodCall($instance,$name);}
           a = argCall[$mc] { $value = $a.value;}
           LPARAN
          )
          | ii = ID { $name = new Identifier($ii.getText());}
            { $value = new FieldCall($instance,$name);}
         )
         (
          m = methodTempCall[$value] { $value = $m.value;}
         )?
    ;

argCall[ MethodCall mc] returns[MethodCall value]
    :   (e = expression { $mc.addArg($e.value); }
        ( COMMA
        ac = argCall[$mc] { $mc = $ac.value; } )*
        | )
        { $value = $mc; }
    ;

singleCall returns[Expression value]
    :   nn = NUMBER { $value = new IntValue($nn.int);}
      | s = STRTOKEN { $value = new StringValue($s.getText());}
      | t = TRUE { $value = new BoolValue(true);}
      | ff = FALSE { $value = new BoolValue(false);}
      | n = newExp { $value = $n.value;}
      | a = arrayElement { $value = $a.value;}
      | p = paranExp { $value = $p.value;}
      | f = funcCall { $value = $f.value;}
      | i = ID { $value = new Identifier($i.getText());}
    ;

funcCall returns[MethodCall value] locals[Identifier name,Expression instance]
    :   i = ID { $name = new Identifier($i.getText());}
        RPARAN
        {
            $instance = new Self();
            $value = new MethodCall($instance,$name);
        }
          a = argCall[$value] { $value = $a.value;}
        LPARAN
    ;

arrayElement returns[ ArrayCall value] locals[ Expression instance, Expression index]
    :   (i = ID  { $instance = new Identifier($i.getText());}
        | p = paranExp { $instance = $p.value;}
        )
        RBRACKET
        a = addExp { $index = $a.value; }
        LBRACKET
        { $value = new ArrayCall( $instance , $index); }
    ;

paranExp returns[Expression value]
    :   RPARAN
        e = expression {$value = $e.value;}
        LPARAN
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

