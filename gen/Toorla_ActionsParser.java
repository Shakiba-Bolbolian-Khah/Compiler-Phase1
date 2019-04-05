// Generated from /home/hosna/IdeaProjects/ph1/grammar/Toorla_Actions.g4 by ANTLR 4.7.2

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



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Toorla_ActionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INHERIT=3, FUNCTION=4, FIELD=5, SELF=6, TRUE=7, FALSE=8, 
		ELSE=9, ELIF=10, NEW=11, RETURN=12, RETURNS=13, BOOL=14, STRING=15, INT=16, 
		VAR=17, CLASS=18, MAINCLASS=19, IF=20, WHILE=21, BREAK=22, CONTINUE=23, 
		PRINT=24, PUBLIC=25, PRIVATE=26, PLUS=27, MINUSNEG=28, MULT=29, DIV=30, 
		MOD=31, EQUAL=32, NEQUAL=33, LT=34, GT=35, AND=36, OR=37, NOT=38, ASSIGN=39, 
		COMMENT=40, LINECOMMENT=41, WS=42, SEMICOLON=43, INC=44, DEC=45, COLON=46, 
		COMMA=47, DOT=48, STRTOKEN=49, RPARAN=50, LPARAN=51, RBRACKET=52, LBRACKET=53, 
		NUMBER=54, ID=55;
	public static final int
		RULE_program = 0, RULE_classType = 1, RULE_entryClass = 2, RULE_classBody = 3, 
		RULE_method = 4, RULE_accessModifier = 5, RULE_typpe = 6, RULE_argument = 7, 
		RULE_multiArgs = 8, RULE_funcArray = 9, RULE_blockBody = 10, RULE_fieldStmt = 11, 
		RULE_fieldVars = 12, RULE_statement = 13, RULE_varDef = 14, RULE_assignment = 15, 
		RULE_instantiation = 16, RULE_multiVar = 17, RULE_whileLoop = 18, RULE_whileBody = 19, 
		RULE_ifExp = 20, RULE_ifBody = 21, RULE_elifStmt = 22, RULE_elseStmt = 23, 
		RULE_completeIf = 24, RULE_returnFunc = 25, RULE_block = 26, RULE_printFunc = 27, 
		RULE_incDecStmt = 28, RULE_halt = 29, RULE_singleStatement = 30, RULE_expression = 31, 
		RULE_andExp = 32, RULE_equalExp = 33, RULE_compareExp = 34, RULE_addExp = 35, 
		RULE_multExp = 36, RULE_unaryExp = 37, RULE_callExp = 38, RULE_newExp = 39, 
		RULE_array = 40, RULE_methodCall = 41, RULE_otherCall = 42, RULE_methodTempCall = 43, 
		RULE_argCall = 44, RULE_singleCall = 45, RULE_funcCall = 46, RULE_arrayElement = 47, 
		RULE_paranExp = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classType", "entryClass", "classBody", "method", "accessModifier", 
			"typpe", "argument", "multiArgs", "funcArray", "blockBody", "fieldStmt", 
			"fieldVars", "statement", "varDef", "assignment", "instantiation", "multiVar", 
			"whileLoop", "whileBody", "ifExp", "ifBody", "elifStmt", "elseStmt", 
			"completeIf", "returnFunc", "block", "printFunc", "incDecStmt", "halt", 
			"singleStatement", "expression", "andExp", "equalExp", "compareExp", 
			"addExp", "multExp", "unaryExp", "callExp", "newExp", "array", "methodCall", 
			"otherCall", "methodTempCall", "argCall", "singleCall", "funcCall", "arrayElement", 
			"paranExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'inherits'", "'function'", "'field'", "'self'", 
			"'true'", "'false'", "'else'", "'elif'", "'new'", "'return'", "'returns'", 
			"'bool'", "'string'", "'int'", "'var'", "'class'", "'entry class'", "'if'", 
			"'while'", "'break'", "'continue'", "'print'", "'public'", "'private'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'<>'", "'<'", "'>'", "'&&'", 
			"'||'", "'!'", "'='", null, null, null, "';'", "'++'", "'--'", "':'", 
			"','", "'.'", null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "END", "INHERIT", "FUNCTION", "FIELD", "SELF", "TRUE", 
			"FALSE", "ELSE", "ELIF", "NEW", "RETURN", "RETURNS", "BOOL", "STRING", 
			"INT", "VAR", "CLASS", "MAINCLASS", "IF", "WHILE", "BREAK", "CONTINUE", 
			"PRINT", "PUBLIC", "PRIVATE", "PLUS", "MINUSNEG", "MULT", "DIV", "MOD", 
			"EQUAL", "NEQUAL", "LT", "GT", "AND", "OR", "NOT", "ASSIGN", "COMMENT", 
			"LINECOMMENT", "WS", "SEMICOLON", "INC", "DEC", "COLON", "COMMA", "DOT", 
			"STRTOKEN", "RPARAN", "LPARAN", "RBRACKET", "LBRACKET", "NUMBER", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Toorla_Actions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Toorla_ActionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program mProgram;
		public ClassTypeContext c1;
		public EntryClassContext e;
		public ClassTypeContext c2;
		public TerminalNode EOF() { return getToken(Toorla_ActionsParser.EOF, 0); }
		public EntryClassContext entryClass() {
			return getRuleContext(EntryClassContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).mProgram =  new Program();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(99);
				((ProgramContext)_localctx).c1 = classType();
				_localctx.mProgram.addClass(((ProgramContext)_localctx).c1.value);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(107);
			((ProgramContext)_localctx).e = entryClass();
			_localctx.mProgram.addClass(((ProgramContext)_localctx).e.value);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(110);
				((ProgramContext)_localctx).c2 = classType();
				_localctx.mProgram.addClass(((ProgramContext)_localctx).c2.value);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassDeclaration value;
		public String name;
		public String parName = "";
		public Identifier iD;
		public Identifier parenID;
		public int line;
		public int pos;
		public Token c;
		public Token className;
		public Token parentName;
		public ClassBodyContext cb;
		public TerminalNode COLON() { return getToken(Toorla_ActionsParser.COLON, 0); }
		public TerminalNode END() { return getToken(Toorla_ActionsParser.END, 0); }
		public TerminalNode CLASS() { return getToken(Toorla_ActionsParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(Toorla_ActionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Toorla_ActionsParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode INHERIT() { return getToken(Toorla_ActionsParser.INHERIT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((ClassTypeContext)_localctx).c = match(CLASS);
			((ClassTypeContext)_localctx).line =  (((ClassTypeContext)_localctx).c!=null?((ClassTypeContext)_localctx).c.getLine():0); ((ClassTypeContext)_localctx).pos =  (((ClassTypeContext)_localctx).c!=null?((ClassTypeContext)_localctx).c.getCharPositionInLine():0);
			setState(122);
			((ClassTypeContext)_localctx).className = match(ID);

			         ((ClassTypeContext)_localctx).name =  (((ClassTypeContext)_localctx).className!=null?((ClassTypeContext)_localctx).className.getText():null);
			         ((ClassTypeContext)_localctx).iD =  new Identifier(_localctx.name);
			         _localctx.iD.line = (((ClassTypeContext)_localctx).className!=null?((ClassTypeContext)_localctx).className.getLine():0);
			         _localctx.iD.col = (((ClassTypeContext)_localctx).className!=null?((ClassTypeContext)_localctx).className.getCharPositionInLine():0);
			        
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(124);
				match(INHERIT);
				setState(125);
				((ClassTypeContext)_localctx).parentName = match(ID);

				         ((ClassTypeContext)_localctx).parName =  ((ClassTypeContext)_localctx).parentName.getText();
				         ((ClassTypeContext)_localctx).parenID =  new Identifier(_localctx.parName);
				         _localctx.parenID.line = (((ClassTypeContext)_localctx).parentName!=null?((ClassTypeContext)_localctx).parentName.getLine():0);
				         _localctx.parenID.col = (((ClassTypeContext)_localctx).parentName!=null?((ClassTypeContext)_localctx).parentName.getCharPositionInLine():0);
				        
				}
			}


			          if(_localctx.parName == "")
			            ((ClassTypeContext)_localctx).value =  new ClassDeclaration(_localctx.iD);
			          else
			            ((ClassTypeContext)_localctx).value =  new ClassDeclaration(_localctx.iD,_localctx.parenID);
			        
			setState(130);
			match(COLON);
			setState(131);
			((ClassTypeContext)_localctx).cb = classBody(_localctx.value);
			((ClassTypeContext)_localctx).value =  ((ClassTypeContext)_localctx).cb.value;
			setState(133);
			match(END);
			_localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryClassContext extends ParserRuleContext {
		public ClassDeclaration value;
		public String name;
		public String parName = "";
		public Identifier iD;
		public Identifier parenID;
		public int line;
		public int pos;
		public Token m;
		public Token className;
		public Token parentName;
		public ClassBodyContext cb;
		public TerminalNode COLON() { return getToken(Toorla_ActionsParser.COLON, 0); }
		public TerminalNode END() { return getToken(Toorla_ActionsParser.END, 0); }
		public TerminalNode MAINCLASS() { return getToken(Toorla_ActionsParser.MAINCLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(Toorla_ActionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Toorla_ActionsParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode INHERIT() { return getToken(Toorla_ActionsParser.INHERIT, 0); }
		public EntryClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterEntryClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitEntryClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitEntryClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryClassContext entryClass() throws RecognitionException {
		EntryClassContext _localctx = new EntryClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entryClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((EntryClassContext)_localctx).m = match(MAINCLASS);
			((EntryClassContext)_localctx).line =  (((EntryClassContext)_localctx).m!=null?((EntryClassContext)_localctx).m.getLine():0); ((EntryClassContext)_localctx).pos =  (((EntryClassContext)_localctx).m!=null?((EntryClassContext)_localctx).m.getCharPositionInLine():0);
			setState(138);
			((EntryClassContext)_localctx).className = match(ID);

			         ((EntryClassContext)_localctx).name =  (((EntryClassContext)_localctx).className!=null?((EntryClassContext)_localctx).className.getText():null);
			         ((EntryClassContext)_localctx).iD =  new Identifier(_localctx.name);
			         _localctx.iD.line = (((EntryClassContext)_localctx).className!=null?((EntryClassContext)_localctx).className.getLine():0);
			         _localctx.iD.col = (((EntryClassContext)_localctx).className!=null?((EntryClassContext)_localctx).className.getCharPositionInLine():0);
			        
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(140);
				match(INHERIT);
				setState(141);
				((EntryClassContext)_localctx).parentName = match(ID);

				         ((EntryClassContext)_localctx).parName =  ((EntryClassContext)_localctx).parentName.getText();
				         ((EntryClassContext)_localctx).parenID =  new Identifier(_localctx.parName);
				         _localctx.parenID.line = (((EntryClassContext)_localctx).parentName!=null?((EntryClassContext)_localctx).parentName.getLine():0);
				         _localctx.parenID.col = (((EntryClassContext)_localctx).parentName!=null?((EntryClassContext)_localctx).parentName.getCharPositionInLine():0);
				        
				}
			}


			          if(_localctx.parName == "")
			            ((EntryClassContext)_localctx).value =  new ClassDeclaration(_localctx.iD);
			          else
			            ((EntryClassContext)_localctx).value =  new ClassDeclaration(_localctx.iD,_localctx.parenID);
			        
			setState(146);
			match(COLON);
			setState(147);
			((EntryClassContext)_localctx).cb = classBody(_localctx.value);
			((EntryClassContext)_localctx).value =  ((EntryClassContext)_localctx).cb.value;
			setState(149);
			match(END);
			_localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassDeclaration classs;
		public ClassDeclaration value;
		public MethodContext m;
		public FieldStmtContext f;
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<FieldStmtContext> fieldStmt() {
			return getRuleContexts(FieldStmtContext.class);
		}
		public FieldStmtContext fieldStmt(int i) {
			return getRuleContext(FieldStmtContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState, ClassDeclaration classs) {
			super(parent, invokingState);
			this.classs = classs;
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody(ClassDeclaration classs) throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState(), classs);
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << FIELD) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(152);
					((ClassBodyContext)_localctx).m = method();
					_localctx.classs.addMethodDeclaration(((ClassBodyContext)_localctx).m.value);
					}
					break;
				case 2:
					{
					setState(155);
					((ClassBodyContext)_localctx).f = fieldStmt();
					_localctx.classs.addFieldsDeclarations(((ClassBodyContext)_localctx).f.value);
					}
					break;
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ClassBodyContext)_localctx).value =  _localctx.classs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration value;
		public int i;
		public String accessmodifier = "public";
		public Identifier name;
		public Type returnType;
		public List<Statement> body;
		public int line;
		public int pos;
		public AccessModifierContext am;
		public Token ff;
		public Token ii;
		public ArgumentContext a;
		public TyppeContext t;
		public FuncArrayContext f;
		public BlockBodyContext b;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode RETURNS() { return getToken(Toorla_ActionsParser.RETURNS, 0); }
		public TerminalNode COLON() { return getToken(Toorla_ActionsParser.COLON, 0); }
		public TerminalNode END() { return getToken(Toorla_ActionsParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(Toorla_ActionsParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TyppeContext typpe() {
			return getRuleContext(TyppeContext.class,0);
		}
		public FuncArrayContext funcArray() {
			return getRuleContext(FuncArrayContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(165);
				((MethodContext)_localctx).am = accessModifier();
				((MethodContext)_localctx).accessmodifier =  ((MethodContext)_localctx).am.name;
				}
			}

			setState(170);
			((MethodContext)_localctx).ff = match(FUNCTION);
			((MethodContext)_localctx).line =  (((MethodContext)_localctx).ff!=null?((MethodContext)_localctx).ff.getLine():0); ((MethodContext)_localctx).pos =  (((MethodContext)_localctx).ff!=null?((MethodContext)_localctx).ff.getCharPositionInLine():0);
			setState(172);
			((MethodContext)_localctx).ii = match(ID);

			         ((MethodContext)_localctx).name =  new Identifier((((MethodContext)_localctx).ii!=null?((MethodContext)_localctx).ii.getText():null));
			         _localctx.name.line = (((MethodContext)_localctx).ii!=null?((MethodContext)_localctx).ii.getLine():0);
			         _localctx.name.col = (((MethodContext)_localctx).ii!=null?((MethodContext)_localctx).ii.getCharPositionInLine():0);
			        
			setState(174);
			match(RPARAN);
			 ((MethodContext)_localctx).value =  new MethodDeclaration(_localctx.name);
			          _localctx.value.line = _localctx.line;
			          _localctx.value.col = _localctx.pos;
			          if(_localctx.accessmodifier == "private")
			            _localctx.value.setAccessModifier(AccessModifier.ACCESS_MODIFIER_PRIVATE);
			        
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
				((MethodContext)_localctx).a = argument(_localctx.value);
				((MethodContext)_localctx).value =  ((MethodContext)_localctx).a.value;
				}
			}

			setState(181);
			match(LPARAN);
			setState(182);
			match(RETURNS);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(183);
				((MethodContext)_localctx).t = typpe();
				((MethodContext)_localctx).returnType =  ((MethodContext)_localctx).t.type;
				}
				break;
			case 2:
				{
				setState(186);
				((MethodContext)_localctx).f = funcArray();
				((MethodContext)_localctx).returnType =  new ArrayType(((MethodContext)_localctx).f.type);
				}
				break;
			}
			 _localctx.value.setReturnType(_localctx.returnType);
			}
			setState(193);
			match(COLON);
			setState(194);
			((MethodContext)_localctx).b = blockBody();
			((MethodContext)_localctx).body =  ((MethodContext)_localctx).b.value;
			        for ( ((MethodContext)_localctx).i =  0 ; _localctx.i< _localctx.body.size() ; _localctx.i++)
			            _localctx.value.addStatement( _localctx.body.get(_localctx.i));
			        
			setState(196);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public String name;
		public Token pu;
		public Token pr;
		public TerminalNode PUBLIC() { return getToken(Toorla_ActionsParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(Toorla_ActionsParser.PRIVATE, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accessModifier);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((AccessModifierContext)_localctx).pu = match(PUBLIC);
				((AccessModifierContext)_localctx).name =  ((AccessModifierContext)_localctx).pu.getText();
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((AccessModifierContext)_localctx).pr = match(PRIVATE);
				((AccessModifierContext)_localctx).name =  ((AccessModifierContext)_localctx).pr.getText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyppeContext extends ParserRuleContext {
		public SingleType type;
		public Identifier iD;
		public ClassDeclaration cd;
		public Token i;
		public Token s;
		public Token b;
		public Token c;
		public TerminalNode INT() { return getToken(Toorla_ActionsParser.INT, 0); }
		public TerminalNode STRING() { return getToken(Toorla_ActionsParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(Toorla_ActionsParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public TyppeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typpe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterTyppe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitTyppe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitTyppe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyppeContext typpe() throws RecognitionException {
		TyppeContext _localctx = new TyppeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typpe);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((TyppeContext)_localctx).i = match(INT);
				((TyppeContext)_localctx).type =  new IntType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((TyppeContext)_localctx).s = match(STRING);
				((TyppeContext)_localctx).type =  new StringType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				((TyppeContext)_localctx).b = match(BOOL);
				((TyppeContext)_localctx).type =  new BoolType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				((TyppeContext)_localctx).c = match(ID);

				       ((TyppeContext)_localctx).iD =  new Identifier(((TyppeContext)_localctx).c.getText());
				       ((TyppeContext)_localctx).cd =  new ClassDeclaration(_localctx.iD);
				       ((TyppeContext)_localctx).type =  new UserDefinedType(_localctx.cd);
				       
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public MethodDeclaration md;
		public MethodDeclaration value;
		public String name;
		public Type argType;
		public Identifier iD;
		public ParameterDeclaration pd;
		public Token i;
		public TyppeContext t;
		public FuncArrayContext f;
		public MultiArgsContext ma;
		public TerminalNode COLON() { return getToken(Toorla_ActionsParser.COLON, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public MultiArgsContext multiArgs() {
			return getRuleContext(MultiArgsContext.class,0);
		}
		public TyppeContext typpe() {
			return getRuleContext(TyppeContext.class,0);
		}
		public FuncArrayContext funcArray() {
			return getRuleContext(FuncArrayContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgumentContext(ParserRuleContext parent, int invokingState, MethodDeclaration md) {
			super(parent, invokingState);
			this.md = md;
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument(MethodDeclaration md) throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState(), md);
		enterRule(_localctx, 14, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((ArgumentContext)_localctx).i = match(ID);

			     ((ArgumentContext)_localctx).name =  ((ArgumentContext)_localctx).i.getText();
			     ((ArgumentContext)_localctx).iD =  new Identifier(_localctx.name);
			     _localctx.iD.line = (((ArgumentContext)_localctx).i!=null?((ArgumentContext)_localctx).i.getLine():0);
			     _localctx.iD.col = (((ArgumentContext)_localctx).i!=null?((ArgumentContext)_localctx).i.getCharPositionInLine():0);
			    
			setState(216);
			match(COLON);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(217);
				((ArgumentContext)_localctx).t = typpe();
				((ArgumentContext)_localctx).argType =  ((ArgumentContext)_localctx).t.type;
				}
				break;
			case 2:
				{
				setState(220);
				((ArgumentContext)_localctx).f = funcArray();
				((ArgumentContext)_localctx).argType =  new ArrayType(((ArgumentContext)_localctx).f.type);
				}
				break;
			}

			          ((ArgumentContext)_localctx).pd =  new ParameterDeclaration( _localctx.iD, _localctx.argType);
			          _localctx.md.addArg( _localctx.pd );
			        
			setState(226);
			((ArgumentContext)_localctx).ma = multiArgs(_localctx.md);
			 ((ArgumentContext)_localctx).md =  ((ArgumentContext)_localctx).ma.value;
			 ((ArgumentContext)_localctx).value =  _localctx.md;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiArgsContext extends ParserRuleContext {
		public MethodDeclaration md;
		public MethodDeclaration value;
		public ArgumentContext arg;
		public TerminalNode COMMA() { return getToken(Toorla_ActionsParser.COMMA, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public MultiArgsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiArgsContext(ParserRuleContext parent, int invokingState, MethodDeclaration md) {
			super(parent, invokingState);
			this.md = md;
		}
		@Override public int getRuleIndex() { return RULE_multiArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterMultiArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitMultiArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitMultiArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgsContext multiArgs(MethodDeclaration md) throws RecognitionException {
		MultiArgsContext _localctx = new MultiArgsContext(_ctx, getState(), md);
		enterRule(_localctx, 16, RULE_multiArgs);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				((MultiArgsContext)_localctx).arg = argument(_localctx.md);
				 ((MultiArgsContext)_localctx).value =  ((MultiArgsContext)_localctx).arg.value;
				}
				}
				break;
			case LPARAN:
				enterOuterAlt(_localctx, 2);
				{
				{
				((MultiArgsContext)_localctx).value =  _localctx.md;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncArrayContext extends ParserRuleContext {
		public SingleType type;
		public TyppeContext t;
		public TerminalNode RBRACKET() { return getToken(Toorla_ActionsParser.RBRACKET, 0); }
		public TerminalNode LBRACKET() { return getToken(Toorla_ActionsParser.LBRACKET, 0); }
		public TyppeContext typpe() {
			return getRuleContext(TyppeContext.class,0);
		}
		public FuncArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterFuncArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitFuncArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitFuncArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArrayContext funcArray() throws RecognitionException {
		FuncArrayContext _localctx = new FuncArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((FuncArrayContext)_localctx).t = typpe();
			 ((FuncArrayContext)_localctx).type =  ((FuncArrayContext)_localctx).t.type;
			setState(239);
			match(RBRACKET);
			setState(240);
			match(LBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockBodyContext extends ParserRuleContext {
		public List<Statement> value;
		public StatementContext stmt;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((BlockBodyContext)_localctx).value =  new ArrayList<>(); 
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case RETURN:
			case VAR:
			case IF:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case MINUSNEG:
			case NOT:
			case SEMICOLON:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				{
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243);
					((BlockBodyContext)_localctx).stmt = statement();
					 _localctx.value.add(((BlockBodyContext)_localctx).stmt.value);
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << RETURN) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << MINUSNEG) | (1L << NOT) | (1L << SEMICOLON) | (1L << STRTOKEN) | (1L << RPARAN) | (1L << NUMBER) | (1L << ID))) != 0) );
				}
				break;
			case END:
				{
				_localctx.value.add(new Skip());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldStmtContext extends ParserRuleContext {
		public List<FieldDeclaration> value;
		public int i;
		public String accessmodifier = "private";
		public List<Identifier> names;
		public Type fieldType;
		public FieldDeclaration fd;
		public int line;
		public int pos;
		public AccessModifierContext am;
		public Token ff;
		public FieldVarsContext fVars;
		public TyppeContext t;
		public FuncArrayContext f;
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public TerminalNode FIELD() { return getToken(Toorla_ActionsParser.FIELD, 0); }
		public FieldVarsContext fieldVars() {
			return getRuleContext(FieldVarsContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TyppeContext typpe() {
			return getRuleContext(TyppeContext.class,0);
		}
		public FuncArrayContext funcArray() {
			return getRuleContext(FuncArrayContext.class,0);
		}
		public FieldStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterFieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitFieldStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitFieldStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldStmtContext fieldStmt() throws RecognitionException {
		FieldStmtContext _localctx = new FieldStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FieldStmtContext)_localctx).names =  new ArrayList();
			          ((FieldStmtContext)_localctx).value =  new ArrayList<>();
			        
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(254);
				((FieldStmtContext)_localctx).am = accessModifier();
				((FieldStmtContext)_localctx).accessmodifier =  ((FieldStmtContext)_localctx).am.name;
				}
			}

			setState(259);
			((FieldStmtContext)_localctx).ff = match(FIELD);
			((FieldStmtContext)_localctx).line =  (((FieldStmtContext)_localctx).ff!=null?((FieldStmtContext)_localctx).ff.getLine():0); ((FieldStmtContext)_localctx).pos =  (((FieldStmtContext)_localctx).ff!=null?((FieldStmtContext)_localctx).ff.getCharPositionInLine():0);
			setState(261);
			((FieldStmtContext)_localctx).fVars = fieldVars();
			((FieldStmtContext)_localctx).names =  ((FieldStmtContext)_localctx).fVars.names;
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(263);
				((FieldStmtContext)_localctx).t = typpe();
				((FieldStmtContext)_localctx).fieldType =  ((FieldStmtContext)_localctx).t.type;
				}
				}
				break;
			case 2:
				{
				{
				setState(266);
				((FieldStmtContext)_localctx).f = funcArray();
				((FieldStmtContext)_localctx).fieldType =  new ArrayType(((FieldStmtContext)_localctx).f.type);
				}
				}
				break;
			}

			            for( ((FieldStmtContext)_localctx).i =  0; _localctx.i < _localctx.names.size(); _localctx.i++){
			                ((FieldStmtContext)_localctx).fd =  new FieldDeclaration( _localctx.names.get(_localctx.i) , _localctx.fieldType);
			                _localctx.fd.line = _localctx.line; _localctx.fd.col = _localctx.pos;
			                if(_localctx.accessmodifier == "public")
			                    _localctx.fd.setAccessModifier(AccessModifier.ACCESS_MODIFIER_PUBLIC);
			                _localctx.value.add(_localctx.fd);
			            }
			        
			setState(272);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldVarsContext extends ParserRuleContext {
		public List<Identifier> names;
		public Identifier iD;
		public Token i;
		public FieldVarsContext fVars;
		public Token name;
		public TerminalNode COMMA() { return getToken(Toorla_ActionsParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public FieldVarsContext fieldVars() {
			return getRuleContext(FieldVarsContext.class,0);
		}
		public FieldVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterFieldVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitFieldVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitFieldVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldVarsContext fieldVars() throws RecognitionException {
		FieldVarsContext _localctx = new FieldVarsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldVarsContext)_localctx).names =  new ArrayList();
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(275);
				((FieldVarsContext)_localctx).i = match(ID);
				 ((FieldVarsContext)_localctx).iD =  new Identifier(((FieldVarsContext)_localctx).i.getText()); _localctx.iD.line = (((FieldVarsContext)_localctx).i!=null?((FieldVarsContext)_localctx).i.getLine():0); _localctx.iD.col = (((FieldVarsContext)_localctx).i!=null?((FieldVarsContext)_localctx).i.getCharPositionInLine():0);
				 _localctx.names.add(_localctx.iD); 
				setState(278);
				match(COMMA);
				setState(279);
				((FieldVarsContext)_localctx).fVars = fieldVars();
				_localctx.names.addAll(((FieldVarsContext)_localctx).fVars.names);
				}
				}
				break;
			case 2:
				{
				{
				setState(282);
				((FieldVarsContext)_localctx).name = match(ID);
				 ((FieldVarsContext)_localctx).iD =  new Identifier(((FieldVarsContext)_localctx).name.getText()); _localctx.iD.line = (((FieldVarsContext)_localctx).name!=null?((FieldVarsContext)_localctx).name.getLine():0); _localctx.iD.col = (((FieldVarsContext)_localctx).name!=null?((FieldVarsContext)_localctx).name.getCharPositionInLine():0);
				_localctx.names.add(_localctx.iD);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement value;
		public SingleStatementContext s;
		public IfExpContext i;
		public BlockContext b;
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case RETURN:
			case VAR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case MINUSNEG:
			case NOT:
			case SEMICOLON:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((StatementContext)_localctx).s = singleStatement();
				 ((StatementContext)_localctx).value =  ((StatementContext)_localctx).s.value;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((StatementContext)_localctx).i = ifExp();
				 ((StatementContext)_localctx).value =  ((StatementContext)_localctx).i.value;
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).value =  ((StatementContext)_localctx).b.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public Statement value;
		public AssignmentContext a;
		public InstantiationContext i;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDef);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				((VarDefContext)_localctx).a = assignment();
				((VarDefContext)_localctx).value =  ((VarDefContext)_localctx).a.value;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				((VarDefContext)_localctx).i = instantiation();
				((VarDefContext)_localctx).value =  ((VarDefContext)_localctx).i.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Statement value;
		public Expression lValue;
		public Expression rValue;
		public int line;
		public int pos;
		public Token i;
		public ArrayElementContext a;
		public CallExpContext f;
		public Token aa;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(Toorla_ActionsParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public CallExpContext callExp() {
			return getRuleContext(CallExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(306);
				((AssignmentContext)_localctx).i = match(ID);
				 ((AssignmentContext)_localctx).lValue =  new Identifier(((AssignmentContext)_localctx).i.getText()); _localctx.lValue.line = (((AssignmentContext)_localctx).i!=null?((AssignmentContext)_localctx).i.getLine():0); _localctx.lValue.col = (((AssignmentContext)_localctx).i!=null?((AssignmentContext)_localctx).i.getCharPositionInLine():0);
				}
				break;
			case 2:
				{
				setState(308);
				((AssignmentContext)_localctx).a = arrayElement();
				 ((AssignmentContext)_localctx).lValue =  ((AssignmentContext)_localctx).a.value;
				}
				break;
			case 3:
				{
				setState(311);
				((AssignmentContext)_localctx).f = callExp();
				 ((AssignmentContext)_localctx).lValue =  ((AssignmentContext)_localctx).f.value;
				}
				break;
			}
			setState(316);
			((AssignmentContext)_localctx).aa = match(ASSIGN);
			((AssignmentContext)_localctx).line =  (((AssignmentContext)_localctx).aa!=null?((AssignmentContext)_localctx).aa.getLine():0); ((AssignmentContext)_localctx).pos =  (((AssignmentContext)_localctx).aa!=null?((AssignmentContext)_localctx).aa.getCharPositionInLine():0);
			setState(318);
			((AssignmentContext)_localctx).e = expression();
			 ((AssignmentContext)_localctx).rValue =  ((AssignmentContext)_localctx).e.value;
			 ((AssignmentContext)_localctx).value =  new Assign( _localctx.lValue, _localctx.rValue); _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			setState(321);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstantiationContext extends ParserRuleContext {
		public LocalVarsDefinitions value;
		public LocalVarDef lvd;
		public Identifier iD;
		public Expression rValue;
		public int line1;
		public int pos1;
		public int line2;
		public int pos2;
		public Token v;
		public Token i;
		public Token a;
		public ExpressionContext e;
		public MultiVarContext m;
		public TerminalNode VAR() { return getToken(Toorla_ActionsParser.VAR, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Toorla_ActionsParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiVarContext multiVar() {
			return getRuleContext(MultiVarContext.class,0);
		}
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((InstantiationContext)_localctx).value =  new LocalVarsDefinitions();
			setState(324);
			((InstantiationContext)_localctx).v = match(VAR);
			((InstantiationContext)_localctx).line1 =  (((InstantiationContext)_localctx).v!=null?((InstantiationContext)_localctx).v.getLine():0); ((InstantiationContext)_localctx).pos1 =  (((InstantiationContext)_localctx).v!=null?((InstantiationContext)_localctx).v.getCharPositionInLine():0);
			setState(326);
			((InstantiationContext)_localctx).i = match(ID);
			 ((InstantiationContext)_localctx).iD =  new Identifier(((InstantiationContext)_localctx).i.getText()); _localctx.iD.line = (((InstantiationContext)_localctx).i!=null?((InstantiationContext)_localctx).i.getLine():0); _localctx.iD.col = (((InstantiationContext)_localctx).i!=null?((InstantiationContext)_localctx).i.getCharPositionInLine():0);
			setState(328);
			((InstantiationContext)_localctx).a = match(ASSIGN);
			((InstantiationContext)_localctx).line2 =  (((InstantiationContext)_localctx).a!=null?((InstantiationContext)_localctx).a.getLine():0); ((InstantiationContext)_localctx).pos2 =  (((InstantiationContext)_localctx).a!=null?((InstantiationContext)_localctx).a.getCharPositionInLine():0);
			setState(330);
			((InstantiationContext)_localctx).e = expression();
			 ((InstantiationContext)_localctx).rValue =  ((InstantiationContext)_localctx).e.value;
			 ((InstantiationContext)_localctx).lvd =  new LocalVarDef(_localctx.iD, _localctx.rValue);
			          _localctx.lvd.line = _localctx.line2; _localctx.lvd.col = _localctx.pos2;
			          _localctx.value.addVarDefinition(_localctx.lvd);
			        
			setState(333);
			((InstantiationContext)_localctx).m = multiVar(_localctx.value);
			 ((InstantiationContext)_localctx).value =  ((InstantiationContext)_localctx).m.value;
			_localctx.value.line = _localctx.line1; _localctx.value.col = _localctx.pos1;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiVarContext extends ParserRuleContext {
		public LocalVarsDefinitions val;
		public LocalVarsDefinitions value;
		public LocalVarDef lvd;
		public Identifier iD;
		public Expression rValue;
		public int line;
		public int pos;
		public Token i;
		public Token a;
		public ExpressionContext e;
		public MultiVarContext m;
		public TerminalNode COMMA() { return getToken(Toorla_ActionsParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Toorla_ActionsParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiVarContext multiVar() {
			return getRuleContext(MultiVarContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public MultiVarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiVarContext(ParserRuleContext parent, int invokingState, LocalVarsDefinitions val) {
			super(parent, invokingState);
			this.val = val;
		}
		@Override public int getRuleIndex() { return RULE_multiVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterMultiVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitMultiVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitMultiVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiVarContext multiVar(LocalVarsDefinitions val) throws RecognitionException {
		MultiVarContext _localctx = new MultiVarContext(_ctx, getState(), val);
		enterRule(_localctx, 34, RULE_multiVar);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(337);
				match(COMMA);
				setState(338);
				((MultiVarContext)_localctx).i = match(ID);
				 ((MultiVarContext)_localctx).iD =  new Identifier(((MultiVarContext)_localctx).i.getText()); _localctx.iD.line = (((MultiVarContext)_localctx).i!=null?((MultiVarContext)_localctx).i.getLine():0); _localctx.iD.col = (((MultiVarContext)_localctx).i!=null?((MultiVarContext)_localctx).i.getCharPositionInLine():0);
				setState(340);
				((MultiVarContext)_localctx).a = match(ASSIGN);
				((MultiVarContext)_localctx).line =  (((MultiVarContext)_localctx).a!=null?((MultiVarContext)_localctx).a.getLine():0); ((MultiVarContext)_localctx).pos =  (((MultiVarContext)_localctx).a!=null?((MultiVarContext)_localctx).a.getCharPositionInLine():0);
				setState(342);
				((MultiVarContext)_localctx).e = expression();
				 ((MultiVarContext)_localctx).rValue =  ((MultiVarContext)_localctx).e.value;
				 ((MultiVarContext)_localctx).lvd =  new LocalVarDef(_localctx.iD, _localctx.rValue);
				          _localctx.lvd.line = _localctx.line; _localctx.lvd.col = _localctx.pos;
				        _localctx.val.addVarDefinition(_localctx.lvd); 
				setState(345);
				((MultiVarContext)_localctx).m = multiVar(_localctx.val);
				 ((MultiVarContext)_localctx).val =  ((MultiVarContext)_localctx).m.value;
				}
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(SEMICOLON);
				 ((MultiVarContext)_localctx).value =  _localctx.val;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public Statement value;
		public Expression condition;
		public Statement body;
		public int line;
		public int pos;
		public Token w;
		public ExpressionContext e;
		public WhileBodyContext b;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode WHILE() { return getToken(Toorla_ActionsParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((WhileLoopContext)_localctx).w = match(WHILE);
			((WhileLoopContext)_localctx).line =  (((WhileLoopContext)_localctx).w!=null?((WhileLoopContext)_localctx).w.getLine():0); ((WhileLoopContext)_localctx).pos =  (((WhileLoopContext)_localctx).w!=null?((WhileLoopContext)_localctx).w.getCharPositionInLine():0);
			setState(354);
			match(RPARAN);
			setState(355);
			((WhileLoopContext)_localctx).e = expression();
			 ((WhileLoopContext)_localctx).condition =  ((WhileLoopContext)_localctx).e.value;
			setState(357);
			match(LPARAN);
			setState(358);
			((WhileLoopContext)_localctx).b = whileBody();
			 ((WhileLoopContext)_localctx).body =  ((WhileLoopContext)_localctx).b.value;

			          ((WhileLoopContext)_localctx).value =  new While( _localctx.condition , _localctx.body);
			          _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBodyContext extends ParserRuleContext {
		public Statement value;
		public BlockContext b;
		public SingleStatementContext s;
		public IfExpContext i;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public WhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitWhileBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitWhileBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBodyContext whileBody() throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileBody);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				((WhileBodyContext)_localctx).b = block();
				 ((WhileBodyContext)_localctx).value =  ((WhileBodyContext)_localctx).b.value; 
				}
				break;
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case RETURN:
			case VAR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case MINUSNEG:
			case NOT:
			case SEMICOLON:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((WhileBodyContext)_localctx).s = singleStatement();
				 ((WhileBodyContext)_localctx).value =  ((WhileBodyContext)_localctx).s.value; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				((WhileBodyContext)_localctx).i = ifExp();
				 ((WhileBodyContext)_localctx).value =  ((WhileBodyContext)_localctx).i.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpContext extends ParserRuleContext {
		public Statement value;
		public int i;
		public List<Expression> conds;
		public List<Statement> stmts;
		public Statement elze;
		public List<Integer> lines;
		public List<Integer> poses;
		public Token ii;
		public ExpressionContext e;
		public IfBodyContext b;
		public ElifStmtContext el;
		public ElseStmtContext els;
		public IfExpContext ie;
		public CompleteIfContext cf;
		public ElifStmtContext el2;
		public ElseStmtContext els2;
		public ElseStmtContext els3;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode IF() { return getToken(Toorla_ActionsParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public CompleteIfContext completeIf() {
			return getRuleContext(CompleteIfContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public List<ElifStmtContext> elifStmt() {
			return getRuleContexts(ElifStmtContext.class);
		}
		public ElifStmtContext elifStmt(int i) {
			return getRuleContext(ElifStmtContext.class,i);
		}
		public IfExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpContext ifExp() throws RecognitionException {
		IfExpContext _localctx = new IfExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			            ((IfExpContext)_localctx).conds =  new ArrayList<>();
			            ((IfExpContext)_localctx).stmts =  new ArrayList<>();
			            ((IfExpContext)_localctx).lines =  new ArrayList<>();
			            ((IfExpContext)_localctx).poses =  new ArrayList<>();
			        
			setState(374);
			((IfExpContext)_localctx).ii = match(IF);
			_localctx.lines.add((((IfExpContext)_localctx).ii!=null?((IfExpContext)_localctx).ii.getLine():0)); _localctx.poses.add((((IfExpContext)_localctx).ii!=null?((IfExpContext)_localctx).ii.getCharPositionInLine():0));
			setState(376);
			match(RPARAN);
			setState(377);
			((IfExpContext)_localctx).e = expression();
			 _localctx.conds.add(((IfExpContext)_localctx).e.value);
			setState(379);
			match(LPARAN);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				{
				setState(380);
				((IfExpContext)_localctx).b = ifBody();
				 _localctx.stmts.add(((IfExpContext)_localctx).b.value);
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382);
						((IfExpContext)_localctx).el = elifStmt(_localctx.conds,_localctx.stmts);
						 ((IfExpContext)_localctx).conds =  ((IfExpContext)_localctx).el.conds;
						          ((IfExpContext)_localctx).stmts =  ((IfExpContext)_localctx).el.stmts;
						          _localctx.lines.add(((IfExpContext)_localctx).el.line);
						          _localctx.poses.add(((IfExpContext)_localctx).el.pos);
						        
						}
						} 
					}
					setState(389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(390);
					((IfExpContext)_localctx).els = elseStmt();
					 _localctx.stmts.add(((IfExpContext)_localctx).els.value);
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(395);
				((IfExpContext)_localctx).ie = ifExp();
				 _localctx.stmts.add(((IfExpContext)_localctx).ie.value);
				}
				break;
			case 3:
				{
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(398);
					((IfExpContext)_localctx).cf = completeIf();
					 _localctx.stmts.add(((IfExpContext)_localctx).cf.value); 
					setState(403); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(400);
							((IfExpContext)_localctx).el2 = elifStmt(_localctx.conds,_localctx.stmts);
							 ((IfExpContext)_localctx).conds =  ((IfExpContext)_localctx).el2.conds;
							          ((IfExpContext)_localctx).stmts =  ((IfExpContext)_localctx).el2.stmts;
							          _localctx.lines.add(((IfExpContext)_localctx).el2.line);
							          _localctx.poses.add(((IfExpContext)_localctx).el2.pos);
							        
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(405); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(407);
						((IfExpContext)_localctx).els2 = elseStmt();
						 _localctx.stmts.add(((IfExpContext)_localctx).els2.value);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(412);
					((IfExpContext)_localctx).els3 = elseStmt();
					 _localctx.stmts.add(((IfExpContext)_localctx).els3.value);
					}
					break;
				}
				}
				break;
			}

			            if( _localctx.stmts.size() == _localctx.conds.size()+1 )
			            {
			                ((IfExpContext)_localctx).elze =  _localctx.stmts.get( _localctx.stmts.size()-1);
			            }
			            else
			            {
			                ((IfExpContext)_localctx).elze =  new Skip();
			            }
			            for( ((IfExpContext)_localctx).i =  _localctx.conds.size()-1 ; _localctx.i > -1 ; _localctx.i--)
			            {
			                ((IfExpContext)_localctx).elze =  new Conditional( _localctx.conds.get(_localctx.i) , _localctx.stmts.get(_localctx.i), _localctx.elze);
			                _localctx.elze.line = _localctx.lines.get(_localctx.i); _localctx.elze.col = _localctx.poses.get(_localctx.i);
			            }
			            ((IfExpContext)_localctx).value =  _localctx.elze;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBodyContext extends ParserRuleContext {
		public Statement value;
		public SingleStatementContext s;
		public BlockContext b;
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifBody);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case RETURN:
			case VAR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case MINUSNEG:
			case NOT:
			case SEMICOLON:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				((IfBodyContext)_localctx).s = singleStatement();
				 ((IfBodyContext)_localctx).value =  ((IfBodyContext)_localctx).s.value; 
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				((IfBodyContext)_localctx).b = block();
				 ((IfBodyContext)_localctx).value =  ((IfBodyContext)_localctx).b.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifStmtContext extends ParserRuleContext {
		public List<Expression> condVal;
		public List<Statement> stmtVal;
		public List<Expression> conds;
		public List<Statement> stmts;
		public int line;
		public int pos;
		public Token el;
		public ExpressionContext e;
		public IfBodyContext b;
		public IfExpContext ie;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode ELIF() { return getToken(Toorla_ActionsParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public ElifStmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElifStmtContext(ParserRuleContext parent, int invokingState, List<Expression> condVal, List<Statement> stmtVal) {
			super(parent, invokingState);
			this.condVal = condVal;
			this.stmtVal = stmtVal;
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterElifStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitElifStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitElifStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmtContext elifStmt(List<Expression> condVal,List<Statement> stmtVal) throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState(), condVal, stmtVal);
		enterRule(_localctx, 44, RULE_elifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			((ElifStmtContext)_localctx).el = match(ELIF);
			 ((ElifStmtContext)_localctx).line =  (((ElifStmtContext)_localctx).el!=null?((ElifStmtContext)_localctx).el.getLine():0); ((ElifStmtContext)_localctx).pos =  (((ElifStmtContext)_localctx).el!=null?((ElifStmtContext)_localctx).el.getCharPositionInLine():0);
			setState(431);
			match(RPARAN);
			setState(432);
			((ElifStmtContext)_localctx).e = expression();
			 _localctx.condVal.add(((ElifStmtContext)_localctx).e.value);
			setState(434);
			match(LPARAN);
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case RETURN:
			case VAR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case MINUSNEG:
			case NOT:
			case SEMICOLON:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				{
				setState(435);
				((ElifStmtContext)_localctx).b = ifBody();
				 _localctx.stmtVal.add(((ElifStmtContext)_localctx).b.value);
				}
				break;
			case IF:
				{
				setState(438);
				((ElifStmtContext)_localctx).ie = ifExp();
				 _localctx.stmts.add(((ElifStmtContext)_localctx).ie.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((ElifStmtContext)_localctx).conds =  _localctx.condVal;
			          ((ElifStmtContext)_localctx).stmts =  _localctx.stmtVal; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStmtContext extends ParserRuleContext {
		public Statement value;
		public IfBodyContext b;
		public IfExpContext ie;
		public TerminalNode ELSE() { return getToken(Toorla_ActionsParser.ELSE, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseStmt);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(ELSE);
				setState(446);
				((ElseStmtContext)_localctx).b = ifBody();
				 ((ElseStmtContext)_localctx).value =  ((ElseStmtContext)_localctx).b.value;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				((ElseStmtContext)_localctx).ie = ifExp();
				 ((ElseStmtContext)_localctx).value =  ((ElseStmtContext)_localctx).ie.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompleteIfContext extends ParserRuleContext {
		public Statement value;
		public int i;
		public List<Expression> conds;
		public List<Statement> stmts;
		public Statement elze;
		public List<Integer> lines;
		public List<Integer> poses;
		public Token ii;
		public ExpressionContext e;
		public IfBodyContext b;
		public CompleteIfContext ci;
		public ElifStmtContext el2;
		public ElseStmtContext els2;
		public ElseStmtContext els3;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode IF() { return getToken(Toorla_ActionsParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public CompleteIfContext completeIf() {
			return getRuleContext(CompleteIfContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public List<ElifStmtContext> elifStmt() {
			return getRuleContexts(ElifStmtContext.class);
		}
		public ElifStmtContext elifStmt(int i) {
			return getRuleContext(ElifStmtContext.class,i);
		}
		public CompleteIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterCompleteIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitCompleteIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitCompleteIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompleteIfContext completeIf() throws RecognitionException {
		CompleteIfContext _localctx = new CompleteIfContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_completeIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			            ((CompleteIfContext)_localctx).conds =  new ArrayList<>();
			            ((CompleteIfContext)_localctx).stmts =  new ArrayList<>();
			            ((CompleteIfContext)_localctx).lines =  new ArrayList<>();
			            ((CompleteIfContext)_localctx).poses =  new ArrayList<>();
			        
			setState(455);
			((CompleteIfContext)_localctx).ii = match(IF);
			_localctx.lines.add((((CompleteIfContext)_localctx).ii!=null?((CompleteIfContext)_localctx).ii.getLine():0)); _localctx.poses.add((((CompleteIfContext)_localctx).ii!=null?((CompleteIfContext)_localctx).ii.getCharPositionInLine():0));
			setState(457);
			match(RPARAN);
			setState(458);
			((CompleteIfContext)_localctx).e = expression();
			 _localctx.conds.add(((CompleteIfContext)_localctx).e.value);
			setState(460);
			match(LPARAN);
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case RETURN:
			case VAR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case MINUSNEG:
			case NOT:
			case SEMICOLON:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				{
				setState(461);
				((CompleteIfContext)_localctx).b = ifBody();
				 _localctx.stmts.add(((CompleteIfContext)_localctx).b.value);
				}
				break;
			case IF:
				{
				setState(464);
				((CompleteIfContext)_localctx).ci = completeIf();
				 _localctx.stmts.add(((CompleteIfContext)_localctx).ci.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(472); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(469);
						((CompleteIfContext)_localctx).el2 = elifStmt(_localctx.conds,_localctx.stmts);
						 ((CompleteIfContext)_localctx).conds =  ((CompleteIfContext)_localctx).el2.conds;
						          ((CompleteIfContext)_localctx).stmts =  ((CompleteIfContext)_localctx).el2.stmts;
						          _localctx.lines.add(((CompleteIfContext)_localctx).el2.line);
						          _localctx.poses.add(((CompleteIfContext)_localctx).el2.pos);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(474); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(476);
					((CompleteIfContext)_localctx).els2 = elseStmt();
					 _localctx.stmts.add(((CompleteIfContext)_localctx).els2.value);
					}
					break;
				}
				}
				break;
			case ELSE:
			case IF:
				{
				setState(481);
				((CompleteIfContext)_localctx).els3 = elseStmt();
				 _localctx.stmts.add(((CompleteIfContext)_localctx).els3.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			            if( _localctx.stmts.size() == _localctx.conds.size()+1 )
			            {
			                ((CompleteIfContext)_localctx).elze =  _localctx.stmts.get( _localctx.stmts.size()-1);
			            }
			            else
			            {
			                ((CompleteIfContext)_localctx).elze =  new Skip();
			            }
			            for( ((CompleteIfContext)_localctx).i =  _localctx.conds.size()-1 ; _localctx.i > -1 ; _localctx.i--)
			            {
			                ((CompleteIfContext)_localctx).elze =  new Conditional( _localctx.conds.get(_localctx.i) , _localctx.stmts.get(_localctx.i), _localctx.elze);
			                _localctx.elze.line = _localctx.lines.get(_localctx.i); _localctx.elze.col = _localctx.poses.get(_localctx.i);
			            }
			            ((CompleteIfContext)_localctx).value =  _localctx.elze;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnFuncContext extends ParserRuleContext {
		public Statement value;
		public Expression retVal;
		public int line;
		public int pos;
		public Token r;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(Toorla_ActionsParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterReturnFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitReturnFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitReturnFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			((ReturnFuncContext)_localctx).r = match(RETURN);
			((ReturnFuncContext)_localctx).line =  (((ReturnFuncContext)_localctx).r!=null?((ReturnFuncContext)_localctx).r.getLine():0); ((ReturnFuncContext)_localctx).pos =  (((ReturnFuncContext)_localctx).r!=null?((ReturnFuncContext)_localctx).r.getCharPositionInLine():0);
			setState(490);
			((ReturnFuncContext)_localctx).e = expression();
			 ((ReturnFuncContext)_localctx).retVal =  ((ReturnFuncContext)_localctx).e.value; 
			setState(492);
			match(SEMICOLON);
			 ((ReturnFuncContext)_localctx).value =  new Return(_localctx.retVal);
			          _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Statement value;
		public List<Statement> body;
		public int line;
		public int pos;
		public Token bb;
		public BlockBodyContext b;
		public TerminalNode END() { return getToken(Toorla_ActionsParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(Toorla_ActionsParser.BEGIN, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			((BlockContext)_localctx).bb = match(BEGIN);
			((BlockContext)_localctx).line =  (((BlockContext)_localctx).bb!=null?((BlockContext)_localctx).bb.getLine():0); ((BlockContext)_localctx).pos =  (((BlockContext)_localctx).bb!=null?((BlockContext)_localctx).bb.getCharPositionInLine():0);
			setState(497);
			((BlockContext)_localctx).b = blockBody();
			 ((BlockContext)_localctx).body =  ((BlockContext)_localctx).b.value;
			setState(499);
			match(END);
			 ((BlockContext)_localctx).value =  new Block(_localctx.body);
			          _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintFuncContext extends ParserRuleContext {
		public Statement value;
		public Expression exp;
		public int line;
		public int pos;
		public Token p;
		public ExpressionContext e;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(Toorla_ActionsParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterPrintFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitPrintFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitPrintFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_printFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			((PrintFuncContext)_localctx).p = match(PRINT);
			((PrintFuncContext)_localctx).line =  (((PrintFuncContext)_localctx).p!=null?((PrintFuncContext)_localctx).p.getLine():0); ((PrintFuncContext)_localctx).pos =  (((PrintFuncContext)_localctx).p!=null?((PrintFuncContext)_localctx).p.getCharPositionInLine():0);
			setState(504);
			match(RPARAN);
			setState(505);
			((PrintFuncContext)_localctx).e = expression();
			 ((PrintFuncContext)_localctx).exp =  ((PrintFuncContext)_localctx).e.value; 
			setState(507);
			match(LPARAN);
			setState(508);
			match(SEMICOLON);
			 ((PrintFuncContext)_localctx).value =  new PrintLine(_localctx.exp);
			          _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStmtContext extends ParserRuleContext {
		public Statement value;
		public Expression exp;
		public String type = "";
		public int line;
		public int pos;
		public ExpressionContext e;
		public Token i;
		public Token d;
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(Toorla_ActionsParser.INC, 0); }
		public TerminalNode DEC() { return getToken(Toorla_ActionsParser.DEC, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitIncDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_incDecStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			((IncDecStmtContext)_localctx).e = expression();
			 ((IncDecStmtContext)_localctx).exp =  ((IncDecStmtContext)_localctx).e.value; 
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(513);
				((IncDecStmtContext)_localctx).i = match(INC);
				 ((IncDecStmtContext)_localctx).type =  "INC";((IncDecStmtContext)_localctx).line =  (((IncDecStmtContext)_localctx).i!=null?((IncDecStmtContext)_localctx).i.getLine():0); ((IncDecStmtContext)_localctx).pos =  (((IncDecStmtContext)_localctx).i!=null?((IncDecStmtContext)_localctx).i.getCharPositionInLine():0);
				}
				break;
			case DEC:
				{
				setState(515);
				((IncDecStmtContext)_localctx).d = match(DEC);
				 ((IncDecStmtContext)_localctx).type =  "DEC"; ((IncDecStmtContext)_localctx).line =  (((IncDecStmtContext)_localctx).d!=null?((IncDecStmtContext)_localctx).d.getLine():0); ((IncDecStmtContext)_localctx).pos =  (((IncDecStmtContext)_localctx).d!=null?((IncDecStmtContext)_localctx).d.getCharPositionInLine():0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(519);
			match(SEMICOLON);
			 if( _localctx.type == "INC")
			            ((IncDecStmtContext)_localctx).value =  new IncStatement(_localctx.exp);
			          else if( _localctx.type == "DEC")
			            ((IncDecStmtContext)_localctx).value =  new  DecStatement(_localctx.exp);
			          _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HaltContext extends ParserRuleContext {
		public Statement value;
		public Token c;
		public Token b;
		public TerminalNode SEMICOLON() { return getToken(Toorla_ActionsParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(Toorla_ActionsParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(Toorla_ActionsParser.BREAK, 0); }
		public HaltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_halt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterHalt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitHalt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitHalt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HaltContext halt() throws RecognitionException {
		HaltContext _localctx = new HaltContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_halt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				{
				setState(522);
				((HaltContext)_localctx).c = match(CONTINUE);
				 ((HaltContext)_localctx).value =  new Continue(); _localctx.value.line = (((HaltContext)_localctx).c!=null?((HaltContext)_localctx).c.getLine():0); _localctx.value.col = (((HaltContext)_localctx).c!=null?((HaltContext)_localctx).c.getCharPositionInLine():0);
				}
				break;
			case BREAK:
				{
				setState(524);
				((HaltContext)_localctx).b = match(BREAK);
				 ((HaltContext)_localctx).value =  new Break(); _localctx.value.line = (((HaltContext)_localctx).b!=null?((HaltContext)_localctx).b.getLine():0); _localctx.value.col = (((HaltContext)_localctx).b!=null?((HaltContext)_localctx).b.getCharPositionInLine():0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(528);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement value;
		public VarDefContext v;
		public WhileLoopContext w;
		public ReturnFuncContext r;
		public PrintFuncContext p;
		public IncDecStmtContext in;
		public HaltContext h;
		public Token s;
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public HaltContext halt() {
			return getRuleContext(HaltContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Toorla_ActionsParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Toorla_ActionsParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_singleStatement);
		try {
			int _alt;
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				((SingleStatementContext)_localctx).v = varDef();
				 ((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).v.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				((SingleStatementContext)_localctx).w = whileLoop();
				 ((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).w.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				((SingleStatementContext)_localctx).r = returnFunc();
				((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).r.value;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				((SingleStatementContext)_localctx).p = printFunc();
				((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).p.value;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				((SingleStatementContext)_localctx).in = incDecStmt();
				((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).in.value;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				((SingleStatementContext)_localctx).h = halt();
				((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).h.value;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(549); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(548);
						((SingleStatementContext)_localctx).s = match(SEMICOLON);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(551); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((SingleStatementContext)_localctx).value =  new Skip(); _localctx.value.line = (((SingleStatementContext)_localctx).s!=null?((SingleStatementContext)_localctx).s.getLine():0); _localctx.value.col = (((SingleStatementContext)_localctx).s!=null?((SingleStatementContext)_localctx).s.getCharPositionInLine():0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression value;
		public Expression lhs;
		public Expression rhs;
		public int line;
		public int pos;
		public AndExpContext al;
		public Token o;
		public AndExpContext ar;
		public List<AndExpContext> andExp() {
			return getRuleContexts(AndExpContext.class);
		}
		public AndExpContext andExp(int i) {
			return getRuleContext(AndExpContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(Toorla_ActionsParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Toorla_ActionsParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			((ExpressionContext)_localctx).al = andExp();
			 ((ExpressionContext)_localctx).lhs =  ((ExpressionContext)_localctx).al.value;
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(558);
				((ExpressionContext)_localctx).o = match(OR);
				((ExpressionContext)_localctx).line =  (((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getLine():0); ((ExpressionContext)_localctx).pos =  (((ExpressionContext)_localctx).o!=null?((ExpressionContext)_localctx).o.getCharPositionInLine():0);
				setState(560);
				((ExpressionContext)_localctx).ar = andExp();
				((ExpressionContext)_localctx).rhs =  ((ExpressionContext)_localctx).ar.value;
				((ExpressionContext)_localctx).lhs =  new Or(_localctx.lhs,_localctx.rhs);
				          _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
				         
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExpressionContext)_localctx).value =  _localctx.lhs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpContext extends ParserRuleContext {
		public Expression value;
		public Expression lhs;
		public Expression rhs;
		public int line;
		public int pos;
		public EqualExpContext el;
		public Token a;
		public EqualExpContext er;
		public List<EqualExpContext> equalExp() {
			return getRuleContexts(EqualExpContext.class);
		}
		public EqualExpContext equalExp(int i) {
			return getRuleContext(EqualExpContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Toorla_ActionsParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Toorla_ActionsParser.AND, i);
		}
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpContext andExp() throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((AndExpContext)_localctx).el = equalExp();
			 ((AndExpContext)_localctx).lhs =  ((AndExpContext)_localctx).el.value;
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(573);
				((AndExpContext)_localctx).a = match(AND);
				((AndExpContext)_localctx).line =  (((AndExpContext)_localctx).a!=null?((AndExpContext)_localctx).a.getLine():0); ((AndExpContext)_localctx).pos =  (((AndExpContext)_localctx).a!=null?((AndExpContext)_localctx).a.getCharPositionInLine():0);
				setState(575);
				((AndExpContext)_localctx).er = equalExp();
				((AndExpContext)_localctx).rhs =  ((AndExpContext)_localctx).er.value;
				((AndExpContext)_localctx).lhs =  new And(_localctx.lhs,_localctx.rhs);
				         _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
				        
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((AndExpContext)_localctx).value =  _localctx.lhs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualExpContext extends ParserRuleContext {
		public Expression value;
		public Expression lhs;
		public Expression rhs;
		public int line;
		public int pos;
		public CompareExpContext cl;
		public Token e;
		public EqualExpContext er;
		public Token ne;
		public CompareExpContext compareExp() {
			return getRuleContext(CompareExpContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(Toorla_ActionsParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(Toorla_ActionsParser.EQUAL, i);
		}
		public List<EqualExpContext> equalExp() {
			return getRuleContexts(EqualExpContext.class);
		}
		public EqualExpContext equalExp(int i) {
			return getRuleContext(EqualExpContext.class,i);
		}
		public List<TerminalNode> NEQUAL() { return getTokens(Toorla_ActionsParser.NEQUAL); }
		public TerminalNode NEQUAL(int i) {
			return getToken(Toorla_ActionsParser.NEQUAL, i);
		}
		public EqualExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterEqualExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitEqualExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitEqualExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpContext equalExp() throws RecognitionException {
		EqualExpContext _localctx = new EqualExpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			((EqualExpContext)_localctx).cl = compareExp();
			 ((EqualExpContext)_localctx).lhs =  ((EqualExpContext)_localctx).cl.value;
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(600);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						{
						setState(588);
						((EqualExpContext)_localctx).e = match(EQUAL);
						((EqualExpContext)_localctx).line =  (((EqualExpContext)_localctx).e!=null?((EqualExpContext)_localctx).e.getLine():0); ((EqualExpContext)_localctx).pos =  (((EqualExpContext)_localctx).e!=null?((EqualExpContext)_localctx).e.getCharPositionInLine():0);
						setState(590);
						((EqualExpContext)_localctx).er = equalExp();
						((EqualExpContext)_localctx).rhs =  ((EqualExpContext)_localctx).er.value;
						((EqualExpContext)_localctx).lhs =  new Equals(_localctx.lhs,_localctx.rhs);
						          _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
						         
						}
						}
						break;
					case NEQUAL:
						{
						{
						setState(594);
						((EqualExpContext)_localctx).ne = match(NEQUAL);
						((EqualExpContext)_localctx).line =  (((EqualExpContext)_localctx).ne!=null?((EqualExpContext)_localctx).ne.getLine():0); ((EqualExpContext)_localctx).pos =  (((EqualExpContext)_localctx).ne!=null?((EqualExpContext)_localctx).ne.getCharPositionInLine():0);
						setState(596);
						((EqualExpContext)_localctx).er = equalExp();
						((EqualExpContext)_localctx).rhs =  ((EqualExpContext)_localctx).er.value;
						((EqualExpContext)_localctx).lhs =  new NotEquals(_localctx.lhs,_localctx.rhs);
						          _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
						         
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			((EqualExpContext)_localctx).value =  _localctx.lhs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpContext extends ParserRuleContext {
		public Expression value;
		public Expression lhs;
		public Expression rhs;
		public int line;
		public int pos;
		public AddExpContext adl;
		public Token l;
		public AddExpContext adr;
		public Token g;
		public List<AddExpContext> addExp() {
			return getRuleContexts(AddExpContext.class);
		}
		public AddExpContext addExp(int i) {
			return getRuleContext(AddExpContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(Toorla_ActionsParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Toorla_ActionsParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Toorla_ActionsParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Toorla_ActionsParser.GT, i);
		}
		public CompareExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterCompareExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitCompareExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitCompareExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpContext compareExp() throws RecognitionException {
		CompareExpContext _localctx = new CompareExpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compareExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			((CompareExpContext)_localctx).adl = addExp();
			 ((CompareExpContext)_localctx).lhs =  ((CompareExpContext)_localctx).adl.value;
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT || _la==GT) {
				{
				setState(621);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					{
					setState(609);
					((CompareExpContext)_localctx).l = match(LT);
					((CompareExpContext)_localctx).line =  (((CompareExpContext)_localctx).l!=null?((CompareExpContext)_localctx).l.getLine():0); ((CompareExpContext)_localctx).pos =  (((CompareExpContext)_localctx).l!=null?((CompareExpContext)_localctx).l.getCharPositionInLine():0);
					setState(611);
					((CompareExpContext)_localctx).adr = addExp();
					((CompareExpContext)_localctx).rhs =  ((CompareExpContext)_localctx).adr.value;
					((CompareExpContext)_localctx).lhs =  new LessThan(_localctx.lhs,_localctx.rhs);
					          _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					         
					}
					}
					break;
				case GT:
					{
					{
					setState(615);
					((CompareExpContext)_localctx).g = match(GT);
					((CompareExpContext)_localctx).line =  (((CompareExpContext)_localctx).g!=null?((CompareExpContext)_localctx).g.getLine():0); ((CompareExpContext)_localctx).pos =  (((CompareExpContext)_localctx).g!=null?((CompareExpContext)_localctx).g.getCharPositionInLine():0);
					setState(617);
					((CompareExpContext)_localctx).adr = addExp();
					((CompareExpContext)_localctx).rhs =  ((CompareExpContext)_localctx).adr.value;
					((CompareExpContext)_localctx).lhs =  new GreaterThan(_localctx.lhs,_localctx.rhs);
					          _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					         
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((CompareExpContext)_localctx).value =  _localctx.lhs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpContext extends ParserRuleContext {
		public Expression value;
		public Expression lhs;
		public Expression rhs;
		public int line;
		public int pos;
		public MultExpContext multl;
		public Token p;
		public MultExpContext multr;
		public Token m;
		public List<MultExpContext> multExp() {
			return getRuleContexts(MultExpContext.class);
		}
		public MultExpContext multExp(int i) {
			return getRuleContext(MultExpContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Toorla_ActionsParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Toorla_ActionsParser.PLUS, i);
		}
		public List<TerminalNode> MINUSNEG() { return getTokens(Toorla_ActionsParser.MINUSNEG); }
		public TerminalNode MINUSNEG(int i) {
			return getToken(Toorla_ActionsParser.MINUSNEG, i);
		}
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		AddExpContext _localctx = new AddExpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			((AddExpContext)_localctx).multl = multExp();
			 ((AddExpContext)_localctx).lhs =  ((AddExpContext)_localctx).multl.value;
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUSNEG) {
				{
				setState(642);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(630);
					((AddExpContext)_localctx).p = match(PLUS);
					((AddExpContext)_localctx).line =  (((AddExpContext)_localctx).p!=null?((AddExpContext)_localctx).p.getLine():0); ((AddExpContext)_localctx).pos =  (((AddExpContext)_localctx).p!=null?((AddExpContext)_localctx).p.getCharPositionInLine():0);
					setState(632);
					((AddExpContext)_localctx).multr = multExp();
					((AddExpContext)_localctx).rhs =  ((AddExpContext)_localctx).multr.value;
					((AddExpContext)_localctx).lhs =  new Plus(_localctx.lhs,_localctx.rhs);
					         _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					        
					}
					}
					break;
				case MINUSNEG:
					{
					{
					setState(636);
					((AddExpContext)_localctx).m = match(MINUSNEG);
					((AddExpContext)_localctx).line =  (((AddExpContext)_localctx).m!=null?((AddExpContext)_localctx).m.getLine():0); ((AddExpContext)_localctx).pos =  (((AddExpContext)_localctx).m!=null?((AddExpContext)_localctx).m.getCharPositionInLine():0);
					setState(638);
					((AddExpContext)_localctx).multr = multExp();
					((AddExpContext)_localctx).rhs =  ((AddExpContext)_localctx).multr.value;
					((AddExpContext)_localctx).lhs =  new Minus(_localctx.lhs,_localctx.rhs);
					         _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((AddExpContext)_localctx).value =  _localctx.lhs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpContext extends ParserRuleContext {
		public Expression value;
		public Expression lhs;
		public Expression rhs;
		public int line;
		public int pos;
		public UnaryExpContext unaryl;
		public Token mul;
		public UnaryExpContext unaryr;
		public Token mod;
		public Token d;
		public List<UnaryExpContext> unaryExp() {
			return getRuleContexts(UnaryExpContext.class);
		}
		public UnaryExpContext unaryExp(int i) {
			return getRuleContext(UnaryExpContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(Toorla_ActionsParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Toorla_ActionsParser.MULT, i);
		}
		public List<TerminalNode> MOD() { return getTokens(Toorla_ActionsParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(Toorla_ActionsParser.MOD, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Toorla_ActionsParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Toorla_ActionsParser.DIV, i);
		}
		public MultExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterMultExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitMultExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitMultExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpContext multExp() throws RecognitionException {
		MultExpContext _localctx = new MultExpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			((MultExpContext)_localctx).unaryl = unaryExp();
			 ((MultExpContext)_localctx).lhs =  ((MultExpContext)_localctx).unaryl.value;
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(669);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					{
					setState(651);
					((MultExpContext)_localctx).mul = match(MULT);
					((MultExpContext)_localctx).line =  (((MultExpContext)_localctx).mul!=null?((MultExpContext)_localctx).mul.getLine():0); ((MultExpContext)_localctx).pos =  (((MultExpContext)_localctx).mul!=null?((MultExpContext)_localctx).mul.getCharPositionInLine():0);
					setState(653);
					((MultExpContext)_localctx).unaryr = unaryExp();
					((MultExpContext)_localctx).rhs =  ((MultExpContext)_localctx).unaryr.value;
					((MultExpContext)_localctx).lhs =  new Times(_localctx.lhs,_localctx.rhs);
					         _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					        
					}
					}
					break;
				case MOD:
					{
					{
					setState(657);
					((MultExpContext)_localctx).mod = match(MOD);
					((MultExpContext)_localctx).line =  (((MultExpContext)_localctx).mod!=null?((MultExpContext)_localctx).mod.getLine():0); ((MultExpContext)_localctx).pos =  (((MultExpContext)_localctx).mod!=null?((MultExpContext)_localctx).mod.getCharPositionInLine():0);
					setState(659);
					((MultExpContext)_localctx).unaryr = unaryExp();
					((MultExpContext)_localctx).rhs =  ((MultExpContext)_localctx).unaryr.value;
					((MultExpContext)_localctx).lhs =  new Modulo(_localctx.lhs,_localctx.rhs);
					         _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					        
					}
					}
					break;
				case DIV:
					{
					{
					setState(663);
					((MultExpContext)_localctx).d = match(DIV);
					((MultExpContext)_localctx).line =  (((MultExpContext)_localctx).d!=null?((MultExpContext)_localctx).d.getLine():0); ((MultExpContext)_localctx).pos =  (((MultExpContext)_localctx).d!=null?((MultExpContext)_localctx).d.getCharPositionInLine():0);
					setState(665);
					((MultExpContext)_localctx).unaryr = unaryExp();
					((MultExpContext)_localctx).rhs =  ((MultExpContext)_localctx).unaryr.value;
					((MultExpContext)_localctx).lhs =  new Division(_localctx.lhs,_localctx.rhs);
					         _localctx.lhs.line = _localctx.line; _localctx.lhs.col = _localctx.pos;
					        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MultExpContext)_localctx).value =  _localctx.lhs;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public Expression value;
		public String type;
		public Expression expr;
		public int line;
		public int pos;
		public Token n;
		public Token m;
		public UnaryExpContext u;
		public CallExpContext c;
		public CallExpContext callExp() {
			return getRuleContext(CallExpContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Toorla_ActionsParser.NOT, 0); }
		public TerminalNode MINUSNEG() { return getToken(Toorla_ActionsParser.MINUSNEG, 0); }
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unaryExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUSNEG:
			case NOT:
				{
				{
				setState(680);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(676);
					((UnaryExpContext)_localctx).n = match(NOT);
					 ((UnaryExpContext)_localctx).type =  "NOT";((UnaryExpContext)_localctx).line =  (((UnaryExpContext)_localctx).n!=null?((UnaryExpContext)_localctx).n.getLine():0); ((UnaryExpContext)_localctx).pos =  (((UnaryExpContext)_localctx).n!=null?((UnaryExpContext)_localctx).n.getCharPositionInLine():0);
					}
					break;
				case MINUSNEG:
					{
					setState(678);
					((UnaryExpContext)_localctx).m = match(MINUSNEG);
					((UnaryExpContext)_localctx).type =  "NEG";((UnaryExpContext)_localctx).line =  (((UnaryExpContext)_localctx).n!=null?((UnaryExpContext)_localctx).n.getLine():0); ((UnaryExpContext)_localctx).pos =  (((UnaryExpContext)_localctx).n!=null?((UnaryExpContext)_localctx).n.getCharPositionInLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(682);
				((UnaryExpContext)_localctx).u = unaryExp();
				 ((UnaryExpContext)_localctx).expr =  ((UnaryExpContext)_localctx).u.value;
				}
				}
				break;
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				{
				setState(685);
				((UnaryExpContext)_localctx).c = callExp();
				((UnaryExpContext)_localctx).expr =  ((UnaryExpContext)_localctx).c.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 if( _localctx.type == "NOT"){
			             ((UnaryExpContext)_localctx).value =  new Not(_localctx.expr);
			             _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			          }
			          else if( _localctx.type == "NEG"){
			             ((UnaryExpContext)_localctx).value =  new Neg(_localctx.expr);
			             _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			          }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExpContext extends ParserRuleContext {
		public Expression value;
		public Expression instance;
		public Expression index;
		public int line;
		public int pos;
		public MethodCallContext m;
		public Token r;
		public AddExpContext a;
		public SingleCallContext s;
		public TerminalNode LBRACKET() { return getToken(Toorla_ActionsParser.LBRACKET, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(Toorla_ActionsParser.RBRACKET, 0); }
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public SingleCallContext singleCall() {
			return getRuleContext(SingleCallContext.class,0);
		}
		public CallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitCallExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitCallExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpContext callExp() throws RecognitionException {
		CallExpContext _localctx = new CallExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_callExp);
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(692);
				((CallExpContext)_localctx).m = methodCall();
				 ((CallExpContext)_localctx).instance =  ((CallExpContext)_localctx).m.value;
				setState(694);
				((CallExpContext)_localctx).r = match(RBRACKET);
				((CallExpContext)_localctx).line =  (((CallExpContext)_localctx).r!=null?((CallExpContext)_localctx).r.getLine():0); ((CallExpContext)_localctx).pos =  (((CallExpContext)_localctx).r!=null?((CallExpContext)_localctx).r.getCharPositionInLine():0);
				setState(696);
				((CallExpContext)_localctx).a = addExp();
				 ((CallExpContext)_localctx).index =  ((CallExpContext)_localctx).a.value;
				setState(698);
				match(LBRACKET);
				((CallExpContext)_localctx).value =  new ArrayCall(_localctx.instance,_localctx.index); _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				((CallExpContext)_localctx).m = methodCall();
				 ((CallExpContext)_localctx).value =  ((CallExpContext)_localctx).m.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				((CallExpContext)_localctx).s = singleCall();
				 ((CallExpContext)_localctx).value =  ((CallExpContext)_localctx).s.value;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpContext extends ParserRuleContext {
		public Expression value;
		public Identifier iD;
		public Token i;
		public ArrayContext a;
		public ArrayContext array;
		public TerminalNode NEW() { return getToken(Toorla_ActionsParser.NEW, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public NewExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpContext newExp() throws RecognitionException {
		NewExpContext _localctx = new NewExpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_newExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(NEW);
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				{
				setState(710);
				((NewExpContext)_localctx).i = match(ID);
				 ((NewExpContext)_localctx).iD =  new Identifier(((NewExpContext)_localctx).i.getText());
				          _localctx.iD.line = (((NewExpContext)_localctx).i!=null?((NewExpContext)_localctx).i.getLine():0); _localctx.iD.col = (((NewExpContext)_localctx).i!=null?((NewExpContext)_localctx).i.getCharPositionInLine():0);
				          ((NewExpContext)_localctx).value =  new NewClassInstance(_localctx.iD);
				          _localctx.value.line = _localctx.iD.line; _localctx.value.col = _localctx.iD.col;
				        
				setState(712);
				match(RPARAN);
				setState(713);
				match(LPARAN);
				}
				}
				break;
			case 2:
				{
				setState(714);
				((NewExpContext)_localctx).a = ((NewExpContext)_localctx).array = array();
				 ((NewExpContext)_localctx).value =  ((NewExpContext)_localctx).array.value;
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public NewArray value;
		public SingleType type;
		public IntValue length;
		public int line;
		public int pos;
		public TyppeContext t;
		public Token r;
		public Token n;
		public TerminalNode LBRACKET() { return getToken(Toorla_ActionsParser.LBRACKET, 0); }
		public TyppeContext typpe() {
			return getRuleContext(TyppeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(Toorla_ActionsParser.RBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(Toorla_ActionsParser.NUMBER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			((ArrayContext)_localctx).t = typpe();
			 ((ArrayContext)_localctx).type =  ((ArrayContext)_localctx).t.type; 
			setState(721);
			((ArrayContext)_localctx).r = match(RBRACKET);
			((ArrayContext)_localctx).line =  (((ArrayContext)_localctx).r!=null?((ArrayContext)_localctx).r.getLine():0); ((ArrayContext)_localctx).pos =  (((ArrayContext)_localctx).r!=null?((ArrayContext)_localctx).r.getCharPositionInLine():0);
			setState(723);
			((ArrayContext)_localctx).n = match(NUMBER);
			 ((ArrayContext)_localctx).length =  new IntValue((((ArrayContext)_localctx).n!=null?Integer.valueOf(((ArrayContext)_localctx).n.getText()):0)); _localctx.length.line = (((ArrayContext)_localctx).n!=null?((ArrayContext)_localctx).n.getLine():0); _localctx.length.col = (((ArrayContext)_localctx).n!=null?((ArrayContext)_localctx).n.getCharPositionInLine():0);
			setState(725);
			match(LBRACKET);
			 ((ArrayContext)_localctx).value =  new NewArray( _localctx.type, _localctx.length); _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public Expression value;
		public Expression instance;
		public OtherCallContext o;
		public MethodTempCallContext m;
		public OtherCallContext otherCall() {
			return getRuleContext(OtherCallContext.class,0);
		}
		public MethodTempCallContext methodTempCall() {
			return getRuleContext(MethodTempCallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			((MethodCallContext)_localctx).o = otherCall();
			 ((MethodCallContext)_localctx).instance =  ((MethodCallContext)_localctx).o.value;
			setState(730);
			((MethodCallContext)_localctx).m = methodTempCall(_localctx.instance);
			 ((MethodCallContext)_localctx).value =  ((MethodCallContext)_localctx).m.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherCallContext extends ParserRuleContext {
		public Expression value;
		public NewExpContext n;
		public Token s;
		public Token i;
		public ParanExpContext p;
		public FuncCallContext f;
		public NewExpContext newExp() {
			return getRuleContext(NewExpContext.class,0);
		}
		public TerminalNode SELF() { return getToken(Toorla_ActionsParser.SELF, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public ParanExpContext paranExp() {
			return getRuleContext(ParanExpContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public OtherCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterOtherCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitOtherCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitOtherCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherCallContext otherCall() throws RecognitionException {
		OtherCallContext _localctx = new OtherCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_otherCall);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				((OtherCallContext)_localctx).n = newExp();
				 ((OtherCallContext)_localctx).value =  ((OtherCallContext)_localctx).n.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				((OtherCallContext)_localctx).s = match(SELF);
				 ((OtherCallContext)_localctx).value =  new Self(); _localctx.value.line = (((OtherCallContext)_localctx).s!=null?((OtherCallContext)_localctx).s.getLine():0); _localctx.value.col = (((OtherCallContext)_localctx).s!=null?((OtherCallContext)_localctx).s.getCharPositionInLine():0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				((OtherCallContext)_localctx).i = match(ID);
				 ((OtherCallContext)_localctx).value =  new Identifier(((OtherCallContext)_localctx).i.getText()); _localctx.value.line = (((OtherCallContext)_localctx).i!=null?((OtherCallContext)_localctx).i.getLine():0); _localctx.value.col = (((OtherCallContext)_localctx).i!=null?((OtherCallContext)_localctx).i.getCharPositionInLine():0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(740);
				((OtherCallContext)_localctx).p = paranExp();
				 ((OtherCallContext)_localctx).value =  ((OtherCallContext)_localctx).p.value;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(743);
				((OtherCallContext)_localctx).f = funcCall();
				 ((OtherCallContext)_localctx).value =  ((OtherCallContext)_localctx).f.value;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTempCallContext extends ParserRuleContext {
		public Expression instance;
		public Expression value;
		public Expression index;
		public Identifier name;
		public MethodCall mc;
		public int line;
		public int pos;
		public int cLine;
		public int cPos;
		public Token r;
		public AddExpContext aa;
		public Token d;
		public Token i;
		public ArgCallContext a;
		public Token ii;
		public MethodTempCallContext m;
		public TerminalNode DOT() { return getToken(Toorla_ActionsParser.DOT, 0); }
		public TerminalNode LBRACKET() { return getToken(Toorla_ActionsParser.LBRACKET, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public TerminalNode RBRACKET() { return getToken(Toorla_ActionsParser.RBRACKET, 0); }
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public MethodTempCallContext methodTempCall() {
			return getRuleContext(MethodTempCallContext.class,0);
		}
		public ArgCallContext argCall() {
			return getRuleContext(ArgCallContext.class,0);
		}
		public MethodTempCallContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodTempCallContext(ParserRuleContext parent, int invokingState, Expression instance) {
			super(parent, invokingState);
			this.instance = instance;
		}
		@Override public int getRuleIndex() { return RULE_methodTempCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterMethodTempCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitMethodTempCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitMethodTempCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTempCallContext methodTempCall(Expression instance) throws RecognitionException {
		MethodTempCallContext _localctx = new MethodTempCallContext(_ctx, getState(), instance);
		enterRule(_localctx, 86, RULE_methodTempCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACKET) {
				{
				setState(748);
				((MethodTempCallContext)_localctx).r = match(RBRACKET);
				((MethodTempCallContext)_localctx).line =  (((MethodTempCallContext)_localctx).r!=null?((MethodTempCallContext)_localctx).r.getLine():0); ((MethodTempCallContext)_localctx).pos =  (((MethodTempCallContext)_localctx).r!=null?((MethodTempCallContext)_localctx).r.getCharPositionInLine():0);
				setState(750);
				((MethodTempCallContext)_localctx).aa = addExp();
				 ((MethodTempCallContext)_localctx).index =  ((MethodTempCallContext)_localctx).aa.value;
				setState(752);
				match(LBRACKET);
				((MethodTempCallContext)_localctx).instance =  new ArrayCall(_localctx.instance,_localctx.index); _localctx.instance.line = _localctx.line; _localctx.instance.col = _localctx.pos;
				}
			}

			setState(757);
			((MethodTempCallContext)_localctx).d = match(DOT);
			((MethodTempCallContext)_localctx).cLine =  (((MethodTempCallContext)_localctx).d!=null?((MethodTempCallContext)_localctx).d.getLine():0); ((MethodTempCallContext)_localctx).cPos =  (((MethodTempCallContext)_localctx).d!=null?((MethodTempCallContext)_localctx).d.getCharPositionInLine():0);
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				{
				setState(759);
				((MethodTempCallContext)_localctx).i = match(ID);
				 ((MethodTempCallContext)_localctx).name =  new Identifier(((MethodTempCallContext)_localctx).i.getText()); _localctx.name.line = (((MethodTempCallContext)_localctx).i!=null?((MethodTempCallContext)_localctx).i.getLine():0); _localctx.name.col = (((MethodTempCallContext)_localctx).i!=null?((MethodTempCallContext)_localctx).i.getCharPositionInLine():0);
				setState(761);
				match(RPARAN);
				 ((MethodTempCallContext)_localctx).mc =  new MethodCall(_localctx.instance,_localctx.name); _localctx.mc.line = _localctx.cLine; _localctx.mc.col = _localctx.cPos;
				setState(763);
				((MethodTempCallContext)_localctx).a = argCall(_localctx.mc);
				 ((MethodTempCallContext)_localctx).value =  ((MethodTempCallContext)_localctx).a.value;
				setState(765);
				match(LPARAN);
				}
				}
				break;
			case 2:
				{
				setState(767);
				((MethodTempCallContext)_localctx).ii = match(ID);
				 ((MethodTempCallContext)_localctx).name =  new Identifier(((MethodTempCallContext)_localctx).ii.getText()); _localctx.name.line = (((MethodTempCallContext)_localctx).i!=null?((MethodTempCallContext)_localctx).i.getLine():0); _localctx.name.col = (((MethodTempCallContext)_localctx).i!=null?((MethodTempCallContext)_localctx).i.getCharPositionInLine():0);
				 ((MethodTempCallContext)_localctx).value =  new FieldCall(_localctx.instance,_localctx.name); _localctx.value.line = _localctx.cLine; _localctx.value.col = _localctx.cPos;
				}
				break;
			}
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(772);
				((MethodTempCallContext)_localctx).m = methodTempCall(_localctx.value);
				 ((MethodTempCallContext)_localctx).value =  ((MethodTempCallContext)_localctx).m.value;
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgCallContext extends ParserRuleContext {
		public MethodCall mc;
		public MethodCall value;
		public ExpressionContext e;
		public ArgCallContext ac;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Toorla_ActionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Toorla_ActionsParser.COMMA, i);
		}
		public List<ArgCallContext> argCall() {
			return getRuleContexts(ArgCallContext.class);
		}
		public ArgCallContext argCall(int i) {
			return getRuleContext(ArgCallContext.class,i);
		}
		public ArgCallContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgCallContext(ParserRuleContext parent, int invokingState, MethodCall mc) {
			super(parent, invokingState);
			this.mc = mc;
		}
		@Override public int getRuleIndex() { return RULE_argCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterArgCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitArgCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitArgCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgCallContext argCall(MethodCall mc) throws RecognitionException {
		ArgCallContext _localctx = new ArgCallContext(_ctx, getState(), mc);
		enterRule(_localctx, 88, RULE_argCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case MINUSNEG:
			case NOT:
			case STRTOKEN:
			case RPARAN:
			case NUMBER:
			case ID:
				{
				setState(777);
				((ArgCallContext)_localctx).e = expression();
				 _localctx.mc.addArg(((ArgCallContext)_localctx).e.value); 
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(779);
						match(COMMA);
						setState(780);
						((ArgCallContext)_localctx).ac = argCall(_localctx.mc);
						 ((ArgCallContext)_localctx).mc =  ((ArgCallContext)_localctx).ac.value; 
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case COMMA:
			case LPARAN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((ArgCallContext)_localctx).value =  _localctx.mc; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleCallContext extends ParserRuleContext {
		public Expression value;
		public Token nn;
		public Token s;
		public Token t;
		public Token ff;
		public NewExpContext n;
		public ArrayElementContext a;
		public ParanExpContext p;
		public FuncCallContext f;
		public Token i;
		public TerminalNode NUMBER() { return getToken(Toorla_ActionsParser.NUMBER, 0); }
		public TerminalNode STRTOKEN() { return getToken(Toorla_ActionsParser.STRTOKEN, 0); }
		public TerminalNode TRUE() { return getToken(Toorla_ActionsParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Toorla_ActionsParser.FALSE, 0); }
		public NewExpContext newExp() {
			return getRuleContext(NewExpContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public ParanExpContext paranExp() {
			return getRuleContext(ParanExpContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public SingleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterSingleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitSingleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitSingleCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCallContext singleCall() throws RecognitionException {
		SingleCallContext _localctx = new SingleCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_singleCall);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				((SingleCallContext)_localctx).nn = match(NUMBER);
				 ((SingleCallContext)_localctx).value =  new IntValue((((SingleCallContext)_localctx).nn!=null?Integer.valueOf(((SingleCallContext)_localctx).nn.getText()):0));_localctx.value.line = (((SingleCallContext)_localctx).nn!=null?((SingleCallContext)_localctx).nn.getLine():0); _localctx.value.col = (((SingleCallContext)_localctx).nn!=null?((SingleCallContext)_localctx).nn.getCharPositionInLine():0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				((SingleCallContext)_localctx).s = match(STRTOKEN);
				 ((SingleCallContext)_localctx).value =  new StringValue(((SingleCallContext)_localctx).s.getText());_localctx.value.line = (((SingleCallContext)_localctx).s!=null?((SingleCallContext)_localctx).s.getLine():0); _localctx.value.col = (((SingleCallContext)_localctx).s!=null?((SingleCallContext)_localctx).s.getCharPositionInLine():0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(797);
				((SingleCallContext)_localctx).t = match(TRUE);
				 ((SingleCallContext)_localctx).value =  new BoolValue(true);_localctx.value.line = (((SingleCallContext)_localctx).t!=null?((SingleCallContext)_localctx).t.getLine():0); _localctx.value.col = (((SingleCallContext)_localctx).t!=null?((SingleCallContext)_localctx).t.getCharPositionInLine():0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(799);
				((SingleCallContext)_localctx).ff = match(FALSE);
				 ((SingleCallContext)_localctx).value =  new BoolValue(false);_localctx.value.line = (((SingleCallContext)_localctx).ff!=null?((SingleCallContext)_localctx).ff.getLine():0); _localctx.value.col = (((SingleCallContext)_localctx).ff!=null?((SingleCallContext)_localctx).ff.getCharPositionInLine():0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(801);
				((SingleCallContext)_localctx).n = newExp();
				 ((SingleCallContext)_localctx).value =  ((SingleCallContext)_localctx).n.value;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(804);
				((SingleCallContext)_localctx).a = arrayElement();
				 ((SingleCallContext)_localctx).value =  ((SingleCallContext)_localctx).a.value;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(807);
				((SingleCallContext)_localctx).p = paranExp();
				 ((SingleCallContext)_localctx).value =  ((SingleCallContext)_localctx).p.value;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(810);
				((SingleCallContext)_localctx).f = funcCall();
				 ((SingleCallContext)_localctx).value =  ((SingleCallContext)_localctx).f.value;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(813);
				((SingleCallContext)_localctx).i = match(ID);
				 ((SingleCallContext)_localctx).value =  new Identifier(((SingleCallContext)_localctx).i.getText());_localctx.value.line = (((SingleCallContext)_localctx).i!=null?((SingleCallContext)_localctx).i.getLine():0); _localctx.value.col = (((SingleCallContext)_localctx).i!=null?((SingleCallContext)_localctx).i.getCharPositionInLine():0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public MethodCall value;
		public Identifier name;
		public Expression instance;
		public Token i;
		public ArgCallContext a;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public ArgCallContext argCall() {
			return getRuleContext(ArgCallContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			((FuncCallContext)_localctx).i = match(ID);
			 ((FuncCallContext)_localctx).name =  new Identifier(((FuncCallContext)_localctx).i.getText());_localctx.name.line = (((FuncCallContext)_localctx).i!=null?((FuncCallContext)_localctx).i.getLine():0); _localctx.name.col = (((FuncCallContext)_localctx).i!=null?((FuncCallContext)_localctx).i.getCharPositionInLine():0);
			setState(819);
			match(RPARAN);

			            ((FuncCallContext)_localctx).instance =  new Self(); _localctx.instance.line = _localctx.name.line; _localctx.instance.col = _localctx.name.col;
			            ((FuncCallContext)_localctx).value =  new MethodCall(_localctx.instance,_localctx.name); _localctx.value.line = _localctx.name.line; _localctx.value.col = _localctx.name.col;
			        
			setState(821);
			((FuncCallContext)_localctx).a = argCall(_localctx.value);
			 ((FuncCallContext)_localctx).value =  ((FuncCallContext)_localctx).a.value;
			setState(823);
			match(LPARAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementContext extends ParserRuleContext {
		public ArrayCall value;
		public Expression instance;
		public Expression index;
		public int line;
		public int pos;
		public Token i;
		public ParanExpContext p;
		public Token r;
		public AddExpContext a;
		public TerminalNode LBRACKET() { return getToken(Toorla_ActionsParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Toorla_ActionsParser.RBRACKET, 0); }
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(Toorla_ActionsParser.ID, 0); }
		public ParanExpContext paranExp() {
			return getRuleContext(ParanExpContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(825);
				((ArrayElementContext)_localctx).i = match(ID);
				 ((ArrayElementContext)_localctx).instance =  new Identifier(((ArrayElementContext)_localctx).i.getText()); _localctx.instance.line = (((ArrayElementContext)_localctx).i!=null?((ArrayElementContext)_localctx).i.getLine():0); _localctx.instance.col = (((ArrayElementContext)_localctx).i!=null?((ArrayElementContext)_localctx).i.getCharPositionInLine():0);
				}
				break;
			case RPARAN:
				{
				setState(827);
				((ArrayElementContext)_localctx).p = paranExp();
				 ((ArrayElementContext)_localctx).instance =  ((ArrayElementContext)_localctx).p.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(832);
			((ArrayElementContext)_localctx).r = match(RBRACKET);
			 ((ArrayElementContext)_localctx).line =  (((ArrayElementContext)_localctx).r!=null?((ArrayElementContext)_localctx).r.getLine():0); ((ArrayElementContext)_localctx).pos =  (((ArrayElementContext)_localctx).r!=null?((ArrayElementContext)_localctx).r.getCharPositionInLine():0);
			setState(834);
			((ArrayElementContext)_localctx).a = addExp();
			 ((ArrayElementContext)_localctx).index =  ((ArrayElementContext)_localctx).a.value; 
			setState(836);
			match(LBRACKET);
			 ((ArrayElementContext)_localctx).value =  new ArrayCall( _localctx.instance , _localctx.index); _localctx.value.line = _localctx.line; _localctx.value.col = _localctx.pos;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParanExpContext extends ParserRuleContext {
		public Expression value;
		public ExpressionContext e;
		public TerminalNode RPARAN() { return getToken(Toorla_ActionsParser.RPARAN, 0); }
		public TerminalNode LPARAN() { return getToken(Toorla_ActionsParser.LPARAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParanExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paranExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).enterParanExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Toorla_ActionsListener ) ((Toorla_ActionsListener)listener).exitParanExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Toorla_ActionsVisitor ) return ((Toorla_ActionsVisitor<? extends T>)visitor).visitParanExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParanExpContext paranExp() throws RecognitionException {
		ParanExpContext _localctx = new ParanExpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_paranExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(RPARAN);
			setState(840);
			((ParanExpContext)_localctx).e = expression();
			((ParanExpContext)_localctx).value =  ((ParanExpContext)_localctx).e.value;
			setState(842);
			match(LPARAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u034f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\7"+
		"\2i\n\2\f\2\16\2l\13\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2t\n\2\f\2\16\2w\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0082\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a1\n\5\f\5\16\5\u00a4\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00b6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c0\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00cd\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00d7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e2\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\6\f\u00f9\n\f\r\f\16\f\u00fa\3\f\5\f\u00fe"+
		"\n\f\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0110\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0120\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u012b\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0133\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013d\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0161\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0176\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0184"+
		"\n\26\f\26\16\26\u0187\13\26\3\26\3\26\3\26\5\26\u018c\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0196\n\26\r\26\16\26\u0197\3\26\3"+
		"\26\3\26\5\26\u019d\n\26\3\26\3\26\3\26\5\26\u01a2\n\26\5\26\u01a4\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ae\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01bc\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c7\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d6\n\32\3\32\3\32"+
		"\3\32\6\32\u01db\n\32\r\32\16\32\u01dc\3\32\3\32\3\32\5\32\u01e2\n\32"+
		"\3\32\3\32\3\32\5\32\u01e7\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0208\n\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\5\37\u0211\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u0228\n \r \16 \u0229\3 \5"+
		" \u022d\n \3!\3!\3!\3!\3!\3!\3!\3!\7!\u0237\n!\f!\16!\u023a\13!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0246\n\"\f\"\16\"\u0249\13\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u025b\n#\f#\16#\u025e"+
		"\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0270\n$\f$\16"+
		"$\u0273\13$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0285\n"+
		"%\f%\16%\u0288\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\7&\u02a0\n&\f&\16&\u02a3\13&\3&\3&\3\'\3\'\3\'\3\'\5\'"+
		"\u02ab\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02b3\n\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02c6\n(\3)\3)\3)\3)\3)\3)\3)\3)\5"+
		")\u02d0\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u02ed\n,\3-\3-\3-\3-\3-\3-\3-\5-\u02f6\n-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0305\n-\3-\3-\3-\5-\u030a\n"+
		"-\3.\3.\3.\3.\3.\3.\7.\u0312\n.\f.\16.\u0315\13.\3.\5.\u0318\n.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/"+
		"\u0332\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0341\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\2\2\u0372\2d\3\2\2\2\4z\3\2\2\2"+
		"\6\u008a\3\2\2\2\b\u00a2\3\2\2\2\n\u00aa\3\2\2\2\f\u00cc\3\2\2\2\16\u00d6"+
		"\3\2\2\2\20\u00d8\3\2\2\2\22\u00ed\3\2\2\2\24\u00ef\3\2\2\2\26\u00f4\3"+
		"\2\2\2\30\u00ff\3\2\2\2\32\u0114\3\2\2\2\34\u012a\3\2\2\2\36\u0132\3\2"+
		"\2\2 \u013c\3\2\2\2\"\u0145\3\2\2\2$\u0160\3\2\2\2&\u0162\3\2\2\2(\u0175"+
		"\3\2\2\2*\u0177\3\2\2\2,\u01ad\3\2\2\2.\u01af\3\2\2\2\60\u01c6\3\2\2\2"+
		"\62\u01c8\3\2\2\2\64\u01ea\3\2\2\2\66\u01f1\3\2\2\28\u01f8\3\2\2\2:\u0201"+
		"\3\2\2\2<\u0210\3\2\2\2>\u022c\3\2\2\2@\u022e\3\2\2\2B\u023d\3\2\2\2D"+
		"\u024c\3\2\2\2F\u0261\3\2\2\2H\u0276\3\2\2\2J\u028b\3\2\2\2L\u02b2\3\2"+
		"\2\2N\u02c5\3\2\2\2P\u02c7\3\2\2\2R\u02d1\3\2\2\2T\u02da\3\2\2\2V\u02ec"+
		"\3\2\2\2X\u02f5\3\2\2\2Z\u0317\3\2\2\2\\\u0331\3\2\2\2^\u0333\3\2\2\2"+
		"`\u0340\3\2\2\2b\u0349\3\2\2\2dj\b\2\1\2ef\5\4\3\2fg\b\2\1\2gi\3\2\2\2"+
		"he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\5\6\4\2"+
		"no\b\2\1\2ou\3\2\2\2pq\5\4\3\2qr\b\2\1\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\2\2\3y\3\3\2\2\2z{\7\24\2"+
		"\2{|\b\3\1\2|}\79\2\2}\u0081\b\3\1\2~\177\7\5\2\2\177\u0080\79\2\2\u0080"+
		"\u0082\b\3\1\2\u0081~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\b\3\1\2\u0084\u0085\7\60\2\2\u0085\u0086\5\b\5\2\u0086\u0087"+
		"\b\3\1\2\u0087\u0088\7\4\2\2\u0088\u0089\b\3\1\2\u0089\5\3\2\2\2\u008a"+
		"\u008b\7\25\2\2\u008b\u008c\b\4\1\2\u008c\u008d\79\2\2\u008d\u0091\b\4"+
		"\1\2\u008e\u008f\7\5\2\2\u008f\u0090\79\2\2\u0090\u0092\b\4\1\2\u0091"+
		"\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\4"+
		"\1\2\u0094\u0095\7\60\2\2\u0095\u0096\5\b\5\2\u0096\u0097\b\4\1\2\u0097"+
		"\u0098\7\4\2\2\u0098\u0099\b\4\1\2\u0099\7\3\2\2\2\u009a\u009b\5\n\6\2"+
		"\u009b\u009c\b\5\1\2\u009c\u00a1\3\2\2\2\u009d\u009e\5\30\r\2\u009e\u009f"+
		"\b\5\1\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\5\1\2\u00a6\t\3\2\2\2\u00a7\u00a8"+
		"\5\f\7\2\u00a8\u00a9\b\6\1\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae\b\6"+
		"\1\2\u00ae\u00af\79\2\2\u00af\u00b0\b\6\1\2\u00b0\u00b1\7\64\2\2\u00b1"+
		"\u00b5\b\6\1\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\b\6\1\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7\65\2\2\u00b8\u00bf\7\17\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb"+
		"\b\6\1\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00be\b\6\1\2"+
		"\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\b\6\1\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\60\2\2"+
		"\u00c4\u00c5\5\26\f\2\u00c5\u00c6\b\6\1\2\u00c6\u00c7\7\4\2\2\u00c7\13"+
		"\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00cd\b\7\1\2\u00ca\u00cb\7\34\2\2"+
		"\u00cb\u00cd\b\7\1\2\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\r\3"+
		"\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d7\b\b\1\2\u00d0\u00d1\7\21\2\2\u00d1"+
		"\u00d7\b\b\1\2\u00d2\u00d3\7\20\2\2\u00d3\u00d7\b\b\1\2\u00d4\u00d5\7"+
		"9\2\2\u00d5\u00d7\b\b\1\2\u00d6\u00ce\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\17\3\2\2\2\u00d8\u00d9\79\2\2"+
		"\u00d9\u00da\b\t\1\2\u00da\u00e1\7\60\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd"+
		"\b\t\1\2\u00dd\u00e2\3\2\2\2\u00de\u00df\5\24\13\2\u00df\u00e0\b\t\1\2"+
		"\u00e0\u00e2\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\b\t\1\2"+
		"\u00e6\u00e7\b\t\1\2\u00e7\21\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea"+
		"\5\20\t\2\u00ea\u00eb\b\n\1\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\b\n\1\2"+
		"\u00ed\u00e8\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\23\3\2\2\2\u00ef\u00f0"+
		"\5\16\b\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2\7\66\2\2\u00f2\u00f3\7\67\2"+
		"\2\u00f3\25\3\2\2\2\u00f4\u00fd\b\f\1\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7"+
		"\b\f\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\b\f"+
		"\1\2\u00fd\u00f8\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\27\3\2\2\2\u00ff\u0103"+
		"\b\r\1\2\u0100\u0101\5\f\7\2\u0101\u0102\b\r\1\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\7"+
		"\2\2\u0106\u0107\b\r\1\2\u0107\u0108\5\32\16\2\u0108\u010f\b\r\1\2\u0109"+
		"\u010a\5\16\b\2\u010a\u010b\b\r\1\2\u010b\u0110\3\2\2\2\u010c\u010d\5"+
		"\24\13\2\u010d\u010e\b\r\1\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\r\1\2\u0112\u0113\7-"+
		"\2\2\u0113\31\3\2\2\2\u0114\u011f\b\16\1\2\u0115\u0116\79\2\2\u0116\u0117"+
		"\b\16\1\2\u0117\u0118\b\16\1\2\u0118\u0119\7\61\2\2\u0119\u011a\5\32\16"+
		"\2\u011a\u011b\b\16\1\2\u011b\u0120\3\2\2\2\u011c\u011d\79\2\2\u011d\u011e"+
		"\b\16\1\2\u011e\u0120\b\16\1\2\u011f\u0115\3\2\2\2\u011f\u011c\3\2\2\2"+
		"\u0120\33\3\2\2\2\u0121\u0122\5> \2\u0122\u0123\b\17\1\2\u0123\u012b\3"+
		"\2\2\2\u0124\u0125\5*\26\2\u0125\u0126\b\17\1\2\u0126\u012b\3\2\2\2\u0127"+
		"\u0128\5\66\34\2\u0128\u0129\b\17\1\2\u0129\u012b\3\2\2\2\u012a\u0121"+
		"\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0127\3\2\2\2\u012b\35\3\2\2\2\u012c"+
		"\u012d\5 \21\2\u012d\u012e\b\20\1\2\u012e\u0133\3\2\2\2\u012f\u0130\5"+
		"\"\22\2\u0130\u0131\b\20\1\2\u0131\u0133\3\2\2\2\u0132\u012c\3\2\2\2\u0132"+
		"\u012f\3\2\2\2\u0133\37\3\2\2\2\u0134\u0135\79\2\2\u0135\u013d\b\21\1"+
		"\2\u0136\u0137\5`\61\2\u0137\u0138\b\21\1\2\u0138\u013d\3\2\2\2\u0139"+
		"\u013a\5N(\2\u013a\u013b\b\21\1\2\u013b\u013d\3\2\2\2\u013c\u0134\3\2"+
		"\2\2\u013c\u0136\3\2\2\2\u013c\u0139\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\7)\2\2\u013f\u0140\b\21\1\2\u0140\u0141\5@!\2\u0141\u0142\b\21"+
		"\1\2\u0142\u0143\b\21\1\2\u0143\u0144\7-\2\2\u0144!\3\2\2\2\u0145\u0146"+
		"\b\22\1\2\u0146\u0147\7\23\2\2\u0147\u0148\b\22\1\2\u0148\u0149\79\2\2"+
		"\u0149\u014a\b\22\1\2\u014a\u014b\7)\2\2\u014b\u014c\b\22\1\2\u014c\u014d"+
		"\5@!\2\u014d\u014e\b\22\1\2\u014e\u014f\b\22\1\2\u014f\u0150\5$\23\2\u0150"+
		"\u0151\b\22\1\2\u0151\u0152\b\22\1\2\u0152#\3\2\2\2\u0153\u0154\7\61\2"+
		"\2\u0154\u0155\79\2\2\u0155\u0156\b\23\1\2\u0156\u0157\7)\2\2\u0157\u0158"+
		"\b\23\1\2\u0158\u0159\5@!\2\u0159\u015a\b\23\1\2\u015a\u015b\b\23\1\2"+
		"\u015b\u015c\5$\23\2\u015c\u015d\b\23\1\2\u015d\u0161\3\2\2\2\u015e\u015f"+
		"\7-\2\2\u015f\u0161\b\23\1\2\u0160\u0153\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"%\3\2\2\2\u0162\u0163\7\27\2\2\u0163\u0164\b\24\1\2\u0164\u0165\7\64\2"+
		"\2\u0165\u0166\5@!\2\u0166\u0167\b\24\1\2\u0167\u0168\7\65\2\2\u0168\u0169"+
		"\5(\25\2\u0169\u016a\b\24\1\2\u016a\u016b\b\24\1\2\u016b\'\3\2\2\2\u016c"+
		"\u016d\5\66\34\2\u016d\u016e\b\25\1\2\u016e\u0176\3\2\2\2\u016f\u0170"+
		"\5> \2\u0170\u0171\b\25\1\2\u0171\u0176\3\2\2\2\u0172\u0173\5*\26\2\u0173"+
		"\u0174\b\25\1\2\u0174\u0176\3\2\2\2\u0175\u016c\3\2\2\2\u0175\u016f\3"+
		"\2\2\2\u0175\u0172\3\2\2\2\u0176)\3\2\2\2\u0177\u0178\b\26\1\2\u0178\u0179"+
		"\7\26\2\2\u0179\u017a\b\26\1\2\u017a\u017b\7\64\2\2\u017b\u017c\5@!\2"+
		"\u017c\u017d\b\26\1\2\u017d\u01a3\7\65\2\2\u017e\u017f\5,\27\2\u017f\u0185"+
		"\b\26\1\2\u0180\u0181\5.\30\2\u0181\u0182\b\26\1\2\u0182\u0184\3\2\2\2"+
		"\u0183\u0180\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u018b\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\5\60\31\2"+
		"\u0189\u018a\b\26\1\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u01a4\3\2\2\2\u018d\u018e\5*\26\2\u018e\u018f\b\26\1\2"+
		"\u018f\u01a4\3\2\2\2\u0190\u0191\5\62\32\2\u0191\u0195\b\26\1\2\u0192"+
		"\u0193\5.\30\2\u0193\u0194\b\26\1\2\u0194\u0196\3\2\2\2\u0195\u0192\3"+
		"\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019c\3\2\2\2\u0199\u019a\5\60\31\2\u019a\u019b\b\26\1\2\u019b\u019d"+
		"\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a2\3\2\2\2\u019e"+
		"\u019f\5\60\31\2\u019f\u01a0\b\26\1\2\u01a0\u01a2\3\2\2\2\u01a1\u0190"+
		"\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u017e\3\2\2\2\u01a3"+
		"\u018d\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\b\26"+
		"\1\2\u01a6+\3\2\2\2\u01a7\u01a8\5> \2\u01a8\u01a9\b\27\1\2\u01a9\u01ae"+
		"\3\2\2\2\u01aa\u01ab\5\66\34\2\u01ab\u01ac\b\27\1\2\u01ac\u01ae\3\2\2"+
		"\2\u01ad\u01a7\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae-\3\2\2\2\u01af\u01b0"+
		"\7\f\2\2\u01b0\u01b1\b\30\1\2\u01b1\u01b2\7\64\2\2\u01b2\u01b3\5@!\2\u01b3"+
		"\u01b4\b\30\1\2\u01b4\u01bb\7\65\2\2\u01b5\u01b6\5,\27\2\u01b6\u01b7\b"+
		"\30\1\2\u01b7\u01bc\3\2\2\2\u01b8\u01b9\5*\26\2\u01b9\u01ba\b\30\1\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01be\b\30\1\2\u01be/\3\2\2\2\u01bf\u01c0\7\13\2\2\u01c0\u01c1"+
		"\5,\27\2\u01c1\u01c2\b\31\1\2\u01c2\u01c7\3\2\2\2\u01c3\u01c4\5*\26\2"+
		"\u01c4\u01c5\b\31\1\2\u01c5\u01c7\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c3"+
		"\3\2\2\2\u01c7\61\3\2\2\2\u01c8\u01c9\b\32\1\2\u01c9\u01ca\7\26\2\2\u01ca"+
		"\u01cb\b\32\1\2\u01cb\u01cc\7\64\2\2\u01cc\u01cd\5@!\2\u01cd\u01ce\b\32"+
		"\1\2\u01ce\u01d5\7\65\2\2\u01cf\u01d0\5,\27\2\u01d0\u01d1\b\32\1\2\u01d1"+
		"\u01d6\3\2\2\2\u01d2\u01d3\5\62\32\2\u01d3\u01d4\b\32\1\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01cf\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u01e6\3\2\2\2\u01d7"+
		"\u01d8\5.\30\2\u01d8\u01d9\b\32\1\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01e1\3\2\2\2\u01de\u01df\5\60\31\2\u01df\u01e0\b\32\1\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e7\3\2\2\2\u01e3"+
		"\u01e4\5\60\31\2\u01e4\u01e5\b\32\1\2\u01e5\u01e7\3\2\2\2\u01e6\u01da"+
		"\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\b\32\1\2"+
		"\u01e9\63\3\2\2\2\u01ea\u01eb\7\16\2\2\u01eb\u01ec\b\33\1\2\u01ec\u01ed"+
		"\5@!\2\u01ed\u01ee\b\33\1\2\u01ee\u01ef\7-\2\2\u01ef\u01f0\b\33\1\2\u01f0"+
		"\65\3\2\2\2\u01f1\u01f2\7\3\2\2\u01f2\u01f3\b\34\1\2\u01f3\u01f4\5\26"+
		"\f\2\u01f4\u01f5\b\34\1\2\u01f5\u01f6\7\4\2\2\u01f6\u01f7\b\34\1\2\u01f7"+
		"\67\3\2\2\2\u01f8\u01f9\7\32\2\2\u01f9\u01fa\b\35\1\2\u01fa\u01fb\7\64"+
		"\2\2\u01fb\u01fc\5@!\2\u01fc\u01fd\b\35\1\2\u01fd\u01fe\7\65\2\2\u01fe"+
		"\u01ff\7-\2\2\u01ff\u0200\b\35\1\2\u02009\3\2\2\2\u0201\u0202\5@!\2\u0202"+
		"\u0207\b\36\1\2\u0203\u0204\7.\2\2\u0204\u0208\b\36\1\2\u0205\u0206\7"+
		"/\2\2\u0206\u0208\b\36\1\2\u0207\u0203\3\2\2\2\u0207\u0205\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\7-\2\2\u020a\u020b\b\36\1\2\u020b;\3\2\2\2"+
		"\u020c\u020d\7\31\2\2\u020d\u0211\b\37\1\2\u020e\u020f\7\30\2\2\u020f"+
		"\u0211\b\37\1\2\u0210\u020c\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\3"+
		"\2\2\2\u0212\u0213\7-\2\2\u0213=\3\2\2\2\u0214\u0215\5\36\20\2\u0215\u0216"+
		"\b \1\2\u0216\u022d\3\2\2\2\u0217\u0218\5&\24\2\u0218\u0219\b \1\2\u0219"+
		"\u022d\3\2\2\2\u021a\u021b\5\64\33\2\u021b\u021c\b \1\2\u021c\u022d\3"+
		"\2\2\2\u021d\u021e\58\35\2\u021e\u021f\b \1\2\u021f\u022d\3\2\2\2\u0220"+
		"\u0221\5:\36\2\u0221\u0222\b \1\2\u0222\u022d\3\2\2\2\u0223\u0224\5<\37"+
		"\2\u0224\u0225\b \1\2\u0225\u022d\3\2\2\2\u0226\u0228\7-\2\2\u0227\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\b \1\2\u022c\u0214\3\2\2\2\u022c\u0217\3\2"+
		"\2\2\u022c\u021a\3\2\2\2\u022c\u021d\3\2\2\2\u022c\u0220\3\2\2\2\u022c"+
		"\u0223\3\2\2\2\u022c\u0227\3\2\2\2\u022d?\3\2\2\2\u022e\u022f\5B\"\2\u022f"+
		"\u0238\b!\1\2\u0230\u0231\7\'\2\2\u0231\u0232\b!\1\2\u0232\u0233\5B\""+
		"\2\u0233\u0234\b!\1\2\u0234\u0235\b!\1\2\u0235\u0237\3\2\2\2\u0236\u0230"+
		"\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\b!\1\2\u023cA\3\2\2\2\u023d"+
		"\u023e\5D#\2\u023e\u0247\b\"\1\2\u023f\u0240\7&\2\2\u0240\u0241\b\"\1"+
		"\2\u0241\u0242\5D#\2\u0242\u0243\b\"\1\2\u0243\u0244\b\"\1\2\u0244\u0246"+
		"\3\2\2\2\u0245\u023f\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\b\""+
		"\1\2\u024bC\3\2\2\2\u024c\u024d\5F$\2\u024d\u025c\b#\1\2\u024e\u024f\7"+
		"\"\2\2\u024f\u0250\b#\1\2\u0250\u0251\5D#\2\u0251\u0252\b#\1\2\u0252\u0253"+
		"\b#\1\2\u0253\u025b\3\2\2\2\u0254\u0255\7#\2\2\u0255\u0256\b#\1\2\u0256"+
		"\u0257\5D#\2\u0257\u0258\b#\1\2\u0258\u0259\b#\1\2\u0259\u025b\3\2\2\2"+
		"\u025a\u024e\3\2\2\2\u025a\u0254\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0260\b#\1\2\u0260E\3\2\2\2\u0261\u0262\5H%\2\u0262\u0271\b$\1\2\u0263"+
		"\u0264\7$\2\2\u0264\u0265\b$\1\2\u0265\u0266\5H%\2\u0266\u0267\b$\1\2"+
		"\u0267\u0268\b$\1\2\u0268\u0270\3\2\2\2\u0269\u026a\7%\2\2\u026a\u026b"+
		"\b$\1\2\u026b\u026c\5H%\2\u026c\u026d\b$\1\2\u026d\u026e\b$\1\2\u026e"+
		"\u0270\3\2\2\2\u026f\u0263\3\2\2\2\u026f\u0269\3\2\2\2\u0270\u0273\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0275\b$\1\2\u0275G\3\2\2\2\u0276\u0277\5J&\2\u0277"+
		"\u0286\b%\1\2\u0278\u0279\7\35\2\2\u0279\u027a\b%\1\2\u027a\u027b\5J&"+
		"\2\u027b\u027c\b%\1\2\u027c\u027d\b%\1\2\u027d\u0285\3\2\2\2\u027e\u027f"+
		"\7\36\2\2\u027f\u0280\b%\1\2\u0280\u0281\5J&\2\u0281\u0282\b%\1\2\u0282"+
		"\u0283\b%\1\2\u0283\u0285\3\2\2\2\u0284\u0278\3\2\2\2\u0284\u027e\3\2"+
		"\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0289\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\b%\1\2\u028aI\3\2\2\2\u028b"+
		"\u028c\5L\'\2\u028c\u02a1\b&\1\2\u028d\u028e\7\37\2\2\u028e\u028f\b&\1"+
		"\2\u028f\u0290\5L\'\2\u0290\u0291\b&\1\2\u0291\u0292\b&\1\2\u0292\u02a0"+
		"\3\2\2\2\u0293\u0294\7!\2\2\u0294\u0295\b&\1\2\u0295\u0296\5L\'\2\u0296"+
		"\u0297\b&\1\2\u0297\u0298\b&\1\2\u0298\u02a0\3\2\2\2\u0299\u029a\7 \2"+
		"\2\u029a\u029b\b&\1\2\u029b\u029c\5L\'\2\u029c\u029d\b&\1\2\u029d\u029e"+
		"\b&\1\2\u029e\u02a0\3\2\2\2\u029f\u028d\3\2\2\2\u029f\u0293\3\2\2\2\u029f"+
		"\u0299\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5\b&\1\2\u02a5"+
		"K\3\2\2\2\u02a6\u02a7\7(\2\2\u02a7\u02ab\b\'\1\2\u02a8\u02a9\7\36\2\2"+
		"\u02a9\u02ab\b\'\1\2\u02aa\u02a6\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ad\5L\'\2\u02ad\u02ae\b\'\1\2\u02ae\u02b3\3\2\2\2\u02af"+
		"\u02b0\5N(\2\u02b0\u02b1\b\'\1\2\u02b1\u02b3\3\2\2\2\u02b2\u02aa\3\2\2"+
		"\2\u02b2\u02af\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\b\'\1\2\u02b5M"+
		"\3\2\2\2\u02b6\u02b7\5T+\2\u02b7\u02b8\b(\1\2\u02b8\u02b9\7\66\2\2\u02b9"+
		"\u02ba\b(\1\2\u02ba\u02bb\5H%\2\u02bb\u02bc\b(\1\2\u02bc\u02bd\7\67\2"+
		"\2\u02bd\u02be\b(\1\2\u02be\u02c6\3\2\2\2\u02bf\u02c0\5T+\2\u02c0\u02c1"+
		"\b(\1\2\u02c1\u02c6\3\2\2\2\u02c2\u02c3\5\\/\2\u02c3\u02c4\b(\1\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02b6\3\2\2\2\u02c5\u02bf\3\2\2\2\u02c5\u02c2\3\2"+
		"\2\2\u02c6O\3\2\2\2\u02c7\u02cf\7\r\2\2\u02c8\u02c9\79\2\2\u02c9\u02ca"+
		"\b)\1\2\u02ca\u02cb\7\64\2\2\u02cb\u02d0\7\65\2\2\u02cc\u02cd\5R*\2\u02cd"+
		"\u02ce\b)\1\2\u02ce\u02d0\3\2\2\2\u02cf\u02c8\3\2\2\2\u02cf\u02cc\3\2"+
		"\2\2\u02d0Q\3\2\2\2\u02d1\u02d2\5\16\b\2\u02d2\u02d3\b*\1\2\u02d3\u02d4"+
		"\7\66\2\2\u02d4\u02d5\b*\1\2\u02d5\u02d6\78\2\2\u02d6\u02d7\b*\1\2\u02d7"+
		"\u02d8\7\67\2\2\u02d8\u02d9\b*\1\2\u02d9S\3\2\2\2\u02da\u02db\5V,\2\u02db"+
		"\u02dc\b+\1\2\u02dc\u02dd\5X-\2\u02dd\u02de\b+\1\2\u02deU\3\2\2\2\u02df"+
		"\u02e0\5P)\2\u02e0\u02e1\b,\1\2\u02e1\u02ed\3\2\2\2\u02e2\u02e3\7\b\2"+
		"\2\u02e3\u02ed\b,\1\2\u02e4\u02e5\79\2\2\u02e5\u02ed\b,\1\2\u02e6\u02e7"+
		"\5b\62\2\u02e7\u02e8\b,\1\2\u02e8\u02ed\3\2\2\2\u02e9\u02ea\5^\60\2\u02ea"+
		"\u02eb\b,\1\2\u02eb\u02ed\3\2\2\2\u02ec\u02df\3\2\2\2\u02ec\u02e2\3\2"+
		"\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02e6\3\2\2\2\u02ec\u02e9\3\2\2\2\u02ed"+
		"W\3\2\2\2\u02ee\u02ef\7\66\2\2\u02ef\u02f0\b-\1\2\u02f0\u02f1\5H%\2\u02f1"+
		"\u02f2\b-\1\2\u02f2\u02f3\7\67\2\2\u02f3\u02f4\b-\1\2\u02f4\u02f6\3\2"+
		"\2\2\u02f5\u02ee\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f8\7\62\2\2\u02f8\u0304\b-\1\2\u02f9\u02fa\79\2\2\u02fa\u02fb\b-\1"+
		"\2\u02fb\u02fc\7\64\2\2\u02fc\u02fd\b-\1\2\u02fd\u02fe\5Z.\2\u02fe\u02ff"+
		"\b-\1\2\u02ff\u0300\7\65\2\2\u0300\u0305\3\2\2\2\u0301\u0302\79\2\2\u0302"+
		"\u0303\b-\1\2\u0303\u0305\b-\1\2\u0304\u02f9\3\2\2\2\u0304\u0301\3\2\2"+
		"\2\u0305\u0309\3\2\2\2\u0306\u0307\5X-\2\u0307\u0308\b-\1\2\u0308\u030a"+
		"\3\2\2\2\u0309\u0306\3\2\2\2\u0309\u030a\3\2\2\2\u030aY\3\2\2\2\u030b"+
		"\u030c\5@!\2\u030c\u0313\b.\1\2\u030d\u030e\7\61\2\2\u030e\u030f\5Z.\2"+
		"\u030f\u0310\b.\1\2\u0310\u0312\3\2\2\2\u0311\u030d\3\2\2\2\u0312\u0315"+
		"\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0318\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u030b\3\2\2\2\u0317\u0316\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319\u031a\b.\1\2\u031a[\3\2\2\2\u031b\u031c"+
		"\78\2\2\u031c\u0332\b/\1\2\u031d\u031e\7\63\2\2\u031e\u0332\b/\1\2\u031f"+
		"\u0320\7\t\2\2\u0320\u0332\b/\1\2\u0321\u0322\7\n\2\2\u0322\u0332\b/\1"+
		"\2\u0323\u0324\5P)\2\u0324\u0325\b/\1\2\u0325\u0332\3\2\2\2\u0326\u0327"+
		"\5`\61\2\u0327\u0328\b/\1\2\u0328\u0332\3\2\2\2\u0329\u032a\5b\62\2\u032a"+
		"\u032b\b/\1\2\u032b\u0332\3\2\2\2\u032c\u032d\5^\60\2\u032d\u032e\b/\1"+
		"\2\u032e\u0332\3\2\2\2\u032f\u0330\79\2\2\u0330\u0332\b/\1\2\u0331\u031b"+
		"\3\2\2\2\u0331\u031d\3\2\2\2\u0331\u031f\3\2\2\2\u0331\u0321\3\2\2\2\u0331"+
		"\u0323\3\2\2\2\u0331\u0326\3\2\2\2\u0331\u0329\3\2\2\2\u0331\u032c\3\2"+
		"\2\2\u0331\u032f\3\2\2\2\u0332]\3\2\2\2\u0333\u0334\79\2\2\u0334\u0335"+
		"\b\60\1\2\u0335\u0336\7\64\2\2\u0336\u0337\b\60\1\2\u0337\u0338\5Z.\2"+
		"\u0338\u0339\b\60\1\2\u0339\u033a\7\65\2\2\u033a_\3\2\2\2\u033b\u033c"+
		"\79\2\2\u033c\u0341\b\61\1\2\u033d\u033e\5b\62\2\u033e\u033f\b\61\1\2"+
		"\u033f\u0341\3\2\2\2\u0340\u033b\3\2\2\2\u0340\u033d\3\2\2\2\u0341\u0342"+
		"\3\2\2\2\u0342\u0343\7\66\2\2\u0343\u0344\b\61\1\2\u0344\u0345\5H%\2\u0345"+
		"\u0346\b\61\1\2\u0346\u0347\7\67\2\2\u0347\u0348\b\61\1\2\u0348a\3\2\2"+
		"\2\u0349\u034a\7\64\2\2\u034a\u034b\5@!\2\u034b\u034c\b\62\1\2\u034c\u034d"+
		"\7\65\2\2\u034dc\3\2\2\2@ju\u0081\u0091\u00a0\u00a2\u00aa\u00b5\u00bf"+
		"\u00cc\u00d6\u00e1\u00ed\u00fa\u00fd\u0103\u010f\u011f\u012a\u0132\u013c"+
		"\u0160\u0175\u0185\u018b\u0197\u019c\u01a1\u01a3\u01ad\u01bb\u01c6\u01d5"+
		"\u01dc\u01e1\u01e6\u0207\u0210\u0229\u022c\u0238\u0247\u025a\u025c\u026f"+
		"\u0271\u0284\u0286\u029f\u02a1\u02aa\u02b2\u02c5\u02cf\u02ec\u02f5\u0304"+
		"\u0309\u0313\u0317\u0331\u0340";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}