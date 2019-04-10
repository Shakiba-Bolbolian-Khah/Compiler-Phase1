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
         $name = $className.getText();
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
            $value = new ClassDeclaration($iD,new Identifier(null));
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
         $name = $className.getText();
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
            $value = new EntryClassDeclaration($iD,new Identifier(null));
          else
            $value = new EntryClassDeclaration($iD,$parenID);
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
          if($accessmodifier.equals("private"))
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

accessModifier returns[String name]
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
       $iD.line = $c.line; $iD.col = $c.pos;
       $cd = new ClassDeclaration($iD);
       $cd.line = $iD.line; $cd.col = $iD.col;
       $type = new UserDefinedType($cd);
       }
    ;

argument[MethodDeclaration md] returns[MethodDeclaration value] locals[String name, Type argType, Identifier iD, ParameterDeclaration pd,int line,int pos]
    :   i = ID
    {
     $name = $i.getText();
     $iD = new Identifier($name);
     $iD.line = $i.line;
     $iD.col = $i.pos;
    }
        cc = COLON {$line = $cc.line; $pos = $cc.pos;}
        ( t = typpe {$argType = $t.type;} | f = funcArray {$argType = new ArrayType($f.type);})
        {
          $pd = new ParameterDeclaration( $iD, $argType);
          $pd.line = $line; $pd.col = $pos;
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
        | )
    ;

fieldStmt returns[ List<FieldDeclaration> value] locals [int i,String accessmodifier="private",List<Identifier> names,Type fieldType, FieldDeclaration fd,int line,int pos]
    :   { $names = new ArrayList();
          $value = new ArrayList<>();
        }
        (am = accessModifier {$accessmodifier = $am.name; })?
        ff = FIELD {$line = $ff.line; $pos = $ff.pos;}
        fVars = fieldVars {$names = $fVars.names;}
        ( (t = typpe {$fieldType = $t.type;}) | (f = funcArray {$fieldType = new ArrayType($f.type);}))
        {
            for( $i = 0; $i < $names.size(); $i++){
                $fd = new FieldDeclaration( $names.get($i) , $fieldType);
                $fd.line = $line; $fd.col = $pos;
                if($accessmodifier.equals( "public"))
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

assignment returns[ Statement value] locals[Expression lValue, Expression rValue,int line,int pos]
    :
        ( f = callExp { $lValue = $f.value;})
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
        {
        $value.line = $line1;
        $value.col = $pos1;}
    ;

multiVar[LocalVarsDefinitions val] returns[LocalVarsDefinitions value] locals[LocalVarDef lvd, Identifier iD, Expression rValue,int line,int pos]
    :
        ((COMMA
        i = ID { $iD = new Identifier($i.getText()); $iD.line = $i.line; $iD.col = $i.pos;}
        a = ASSIGN {$line = $a.line; $pos = $a.pos;}
        e = expression { $rValue = $e.value;}
        { $lvd = new LocalVarDef($iD, $rValue);
          $lvd.line = $line; $lvd.col = $pos;
        $val.addVarDefinition($lvd); }
        m = multiVar[$val] { $val = $m.value;})
        | SEMICOLON)
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


ifExp returns[Statement value] locals[int i,List<Expression> conds, List<Statement> stmts, Statement elze,List<Integer> lines, List<Integer> poses]
    :   {
            $conds = new ArrayList<>();
            $stmts = new ArrayList<>();
            $lines = new ArrayList<>();
            $poses = new ArrayList<>();
        }
        ii = IF {$lines.add($ii.line); $poses.add($ii.pos);}
        RPARAN
        e = expression { $conds.add($e.value);}
        LPARAN
        ((
        b = ifBody { $stmts.add($b.value);}
        ( el = elifStmt[$conds,$stmts]
        { $conds = $el.conds;
          $stmts = $el.stmts;
          $lines.add($el.line);
          $poses.add($el.pos);
        })*
        (els = elseStmt { $stmts.add($els.value);})?)
        | ie = ifExp { $stmts.add($ie.value);}
        | (cf = completeIf { $stmts.add($cf.value); }
        (el2 = elifStmt[$conds,$stmts]
        { $conds = $el2.conds;
          $stmts = $el2.stmts;
          $lines.add($el2.line);
          $poses.add($el2.pos);
        })+
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
                $elze.line = $lines.get($i); $elze.col = $poses.get($i);
            }
            $value = $elze;
        }
    ;

ifBody returns[Statement value]
    :   s = singleStatement { $value = $s.value; }
        | b = block { $value = $b.value; }
    ;

elifStmt[List<Expression> condVal, List<Statement> stmtVal] returns[List<Expression> conds, List<Statement> stmts,int line,int pos]
    :   el = ELIF { $line = $el.line; $pos = $el.pos;}
        RPARAN
        e = expression { $condVal.add($e.value);}
        LPARAN
        ( b = ifBody { $stmtVal.add($b.value);}
        | ie = ifExp { $stmtVal.add($ie.value);} )
        { $conds = $condVal;
          $stmts = $stmtVal; }
    ;

elseStmt returns[Statement value]
    :   ELSE
        (b = ifBody { $value = $b.value;}
        | ie = ifExp { $value = $ie.value;})
    ;

completeIf returns[Statement value] locals[int i,List<Expression> conds, List<Statement> stmts, Statement elze,List<Integer> lines, List<Integer> poses]
    :   {
            $conds = new ArrayList<>();
            $stmts = new ArrayList<>();
            $lines = new ArrayList<>();
            $poses = new ArrayList<>();
        }
        ii = IF {$lines.add($ii.line); $poses.add($ii.pos);}
        RPARAN
        e = expression { $conds.add($e.value);}
        LPARAN
        ( b = ifBody { $stmts.add($b.value);}
        | ci = completeIf { $stmts.add($ci.value);} )
        ((el2 = elifStmt[$conds,$stmts]
        { $conds = $el2.conds;
          $stmts = $el2.stmts;
          $lines.add($el2.line);
          $poses.add($el2.pos);})+
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
                $elze.line = $lines.get($i); $elze.col = $poses.get($i);
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

singleStatement returns[ Statement value]
    :
        (
        v = varDef { $value = $v.value;}
        | w = whileLoop { $value = $w.value;}
        | r = returnFunc {$value = $r.value;}
        | p = printFunc {$value = $p.value;}
        | in = incDecStmt {$value = $in.value;}
        | h = halt {$value = $h.value;}
        | (s = SEMICOLON {$value = new Skip(); $value.line = $s.line; $value.col = $s.pos;}))
    ;

expression returns [Expression value] locals[Expression lhs,Expression rhs,int line,int pos]
    :   al = andExp { $lhs = $al.value;}
        (o = OR {$line = $o.line; $pos = $o.pos;}
         ar = andExp {$rhs = $ar.value;}
         {$lhs = new Or($lhs,$rhs);
          $lhs.line = $line; $lhs.col = $pos;
         })*

        {$value = $lhs;}
    ;


andExp returns[Expression value] locals[Expression lhs,Expression rhs,int line,int pos]
    :   el = equalExp { $lhs = $el.value;}
        (a = AND {$line = $a.line; $pos = $a.pos;}
        er = equalExp {$rhs = $er.value;}
        {$lhs = new And($lhs,$rhs);
         $lhs.line = $line; $lhs.col = $pos;
        })*

        {$value = $lhs;}
    ;

equalExp returns[Expression value] locals[Expression lhs,Expression rhs,int line,int pos]
    :   cl = compareExp { $lhs = $cl.value;}
        ((e = EQUAL {$line = $e.line; $pos = $e.pos;}
         er = equalExp {$rhs = $er.value;}
         {$lhs = new Equals($lhs,$rhs);
          $lhs.line = $line; $lhs.col = $pos;
         })
         |(ne = NEQUAL {$line = $ne.line; $pos = $ne.pos;}
          er = equalExp {$rhs = $er.value;}
         {$lhs = new NotEquals($lhs,$rhs);
          $lhs.line = $line; $lhs.col = $pos;
         }))*

        {$value = $lhs;}
    ;

compareExp returns[Expression value] locals[Expression lhs,Expression rhs,int line,int pos]
    :   adl = addExp { $lhs = $adl.value;}
        ((l = LT {$line = $l.line; $pos = $l.pos;}
         adr = addExp {$rhs = $adr.value;}
         {$lhs = new LessThan($lhs,$rhs);
          $lhs.line = $line; $lhs.col = $pos;
         })
         |(g = GT {$line = $g.line; $pos = $g.pos;}
          adr = addExp {$rhs = $adr.value;}
         {$lhs = new GreaterThan($lhs,$rhs);
          $lhs.line = $line; $lhs.col = $pos;
         }))*

        {$value = $lhs;}
    ;

addExp returns[Expression value] locals[Expression lhs,Expression rhs,int line,int pos]
   :   multl = multExp { $lhs = $multl.value;}
       ((p = PLUS {$line = $p.line; $pos = $p.pos;}
        multr = multExp {$rhs = $multr.value;}
        {$lhs = new Plus($lhs,$rhs);
         $lhs.line = $line; $lhs.col = $pos;
        })
        |(m = MINUSNEG {$line = $m.line; $pos = $m.pos;}
         multr = multExp {$rhs = $multr.value;}
        {$lhs = new Minus($lhs,$rhs);
         $lhs.line = $line; $lhs.col = $pos;
        }))*

       {$value = $lhs;}
   ;

multExp returns[Expression value] locals[Expression lhs,Expression rhs,int line,int pos]
   :   unaryl = unaryExp { $lhs = $unaryl.value;}
       ((mul = MULT {$line = $mul.line; $pos = $mul.pos;}
        unaryr = unaryExp {$rhs = $unaryr.value;}
        {$lhs = new Times($lhs,$rhs);
         $lhs.line = $line; $lhs.col = $pos;
        })
        |(mod = MOD {$line = $mod.line; $pos = $mod.pos;}
         unaryr = unaryExp {$rhs = $unaryr.value;}
        {$lhs = new Modulo($lhs,$rhs);
         $lhs.line = $line; $lhs.col = $pos;
        })
        |(d = DIV {$line = $d.line; $pos = $d.pos;}
         unaryr = unaryExp {$rhs = $unaryr.value;}
        {$lhs = new Division($lhs,$rhs);
         $lhs.line = $line; $lhs.col = $pos;
        }))*

       {$value = $lhs;}
   ;

unaryExp returns[Expression value] locals[String type, Expression expr,int line,int pos]
    :   ((( n = NOT { $type = "NOT";$line = $n.line; $pos = $n.pos;}
        | m = MINUSNEG {$type = "NEG";$line = $n.line; $pos = $n.pos;})
        u = unaryExp
        { $expr = $u.value;})
        | c = callExp {$value = $c.value;})

        { if( $type == "NOT"){
             $value = new Not($expr);
             $value.line = $line; $value.col = $pos;
          }
          else if( $type == "NEG"){
             $value = new Neg($expr);
             $value.line = $line; $value.col = $pos;
          }
        }
    ;

callExp returns[Expression value] locals[Expression instance,Expression index,int line,int pos]
    :   ( m = methodCall { $instance = $m.value;}
          r = RBRACKET {$line = $r.line; $pos = $r.pos;}
          a = addExp { $index = $a.value;}
          LBRACKET
          {$value = new ArrayCall($instance,$index); $value.line = $line; $value.col = $pos;}
        )
        | m = methodCall { $value = $m.value;}
        | s = singleCall { $value = $s.value;}
    ;


newExp returns[Expression value] locals[Identifier iD,int line , int pos]
    :   n = NEW {$line = $n.line; $pos = $n.pos;}
        (( i = ID
        { $iD = new Identifier($i.getText());
          $iD.line = $i.line; $iD.col = $i.pos;
          $value = new NewClassInstance($iD);
          $value.line = $line; $value.col = $pos;
        }
        RPARAN
        LPARAN )
        | a = array { $value = $array.value;})
    ;

array returns[NewArray value] locals[ SingleType type, Expression length,int line , int pos]
    :   t = typpe { $type = $t.type; }
        r = RBRACKET {$line = $r.line; $pos = $r.pos;}
        n = expression { $length = $n.value;}
        LBRACKET
        { $value = new NewArray( $type, $length); $value.line = $line; $value.col = $pos;}
    ;

methodCall returns[Expression value] locals[Expression instance]
    :   o = otherCall { $instance = $o.value;}
        m = methodTempCall[$instance] { $value = $m.value;}
    ;

otherCall returns[Expression value]
    :   n = newExp { $value = $n.value;}
       |s = SELF { $value = new Self(); $value.line = $s.line; $value.col = $s.pos;}
       |i = ID { $value = new Identifier($i.getText()); $value.line = $i.line; $value.col = $i.pos;}
       |p = paranExp { $value = $p.value;}
       |f = funcCall { $value = $f.value;}
    ;

methodTempCall[Expression instance] returns[Expression value] locals[Expression index,Identifier name,MethodCall mc,int line,int pos,int cLine,int cPos]
    :    (r = RBRACKET {$line = $r.line; $pos = $r.pos;}
          aa = addExp { $index = $aa.value;}
          LBRACKET
          {$instance = new ArrayCall($instance,$index); $instance.line = $line; $instance.col = $pos;}
         )?
         d = DOT {$cLine = $d.line; $cPos = $d.pos;}
         ((i = ID { $name = new Identifier($i.getText()); $name.line = $i.line; $name.col = $i.pos;}
           RPARAN
           { $mc = new MethodCall($instance,$name); $mc.line = $cLine; $mc.col = $cPos;}
           a = argCall[$mc] { $value = $a.value;}
           LPARAN
          )
          | ii = ID { $name = new Identifier($ii.getText()); $name.line = $i.line; $name.col = $i.pos;}
            { $value = new FieldCall($instance,$name); $value.line = $cLine; $value.col = $cPos;}
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

singleCall returns[Expression value] locals[Identifier iD]
    :   nn = NUMBER { $value = new IntValue($nn.int);$value.line = $nn.line; $value.col = $nn.pos;}
      | s = STRTOKEN { $value = new StringValue($s.getText());$value.line = $s.line; $value.col = $s.pos;}
      | t = TRUE { $value = new BoolValue(true);$value.line = $t.line; $value.col = $t.pos;}
      | ff = FALSE { $value = new BoolValue(false);$value.line = $ff.line; $value.col = $ff.pos;}
      | n = newExp { $value = $n.value;}
      | a = arrayElement { $value = $a.value;}
      | p = paranExp { $value = $p.value;}
      | f = funcCall { $value = $f.value;}
      | i = ID { $iD = new Identifier($i.text);$iD.line = $i.line; $iD.col = $i.pos; $value = $iD;}
    ;

funcCall returns[MethodCall value] locals[Identifier name,Expression instance]
    :   i = ID { $name = new Identifier($i.getText());$name.line = $i.line; $name.col = $i.pos;}
        RPARAN
        {
            $instance = new Self(); $instance.line = $name.line; $instance.col = $name.col;
            $value = new MethodCall($instance,$name); $value.line = $name.line; $value.col = $name.col;
        }
          a = argCall[$value] { $value = $a.value;}
        LPARAN
    ;

arrayElement returns[ ArrayCall value] locals[ Expression instance, Expression index,int line,int pos]
    :   (i = ID  { $instance = new Identifier($i.getText()); $instance.line = $i.line; $instance.col = $i.pos;}
        | p = paranExp { $instance = $p.value;}
        )
        r = RBRACKET { $line = $r.line; $pos = $r.pos;}
        a = addExp { $index = $a.value; }
        LBRACKET
        { $value = new ArrayCall( $instance , $index); $value.line = $line; $value.col = $pos;}
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
	: [ \t\n \r\n] -> skip
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

//STRTOKEN
//    : '"' ('\\' ["\\] | ~["\\\r\n])* '"'
//    ;
STRTOKEN
    : '"' ~('\r' | '\n' | '"')* '"'
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
	:	[a-zA-Z_] [a-zA-Z0-9_]*
    ;

