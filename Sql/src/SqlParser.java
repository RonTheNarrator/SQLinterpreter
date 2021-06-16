// Generated from Sql.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DatatypeI=2, DatatypeF=3, DatatypeT=4, DatatypeB=5, True=6, False=7, 
		Select=8, From=9, Where=10, And=11, Or=12, In=13, Not=14, Order=15, By=16, 
		Descending=17, Update=18, Set=19, Delete=20, Like=21, Insert=22, Into=23, 
		Values=24, Join=25, Inner=26, Outer=27, Left=28, Right=29, Full=30, Create=31, 
		Table=32, Plus=33, Minus=34, Star=35, Divide=36, Equals=37, Lesser=38, 
		Greater=39, Greater_Equal=40, Leser_Equal=41, Not_Equal=42, BracketL=43, 
		BracketR=44, SColon=45, Coma=46, Id=47, Liczba=48, String=49;
	public static final int
		RULE_start = 0, RULE_select = 1, RULE_selectItemList = 2, RULE_selectItem = 3, 
		RULE_expr = 4, RULE_operator = 5, RULE_exprM = 6, RULE_baseExpr = 7, RULE_variable = 8, 
		RULE_update = 9, RULE_delete = 10, RULE_columns = 11, RULE_column = 12, 
		RULE_table = 13, RULE_join = 14, RULE_condition = 15, RULE_var = 16, RULE_formula = 17, 
		RULE_columnsSetEq = 18, RULE_whereStatement = 19, RULE_operatorL = 20, 
		RULE_operatorC = 21, RULE_operatorM = 22, RULE_create = 23, RULE_createTable = 24, 
		RULE_createTableCol = 25, RULE_datatype = 26, RULE_insert = 27, RULE_insertCol = 28, 
		RULE_insertValues = 29, RULE_insertValue = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "select", "selectItemList", "selectItem", "expr", "operator", 
			"exprM", "baseExpr", "variable", "update", "delete", "columns", "column", 
			"table", "join", "condition", "var", "formula", "columnsSetEq", "whereStatement", 
			"operatorL", "operatorC", "operatorM", "create", "createTable", "createTableCol", 
			"datatype", "insert", "insertCol", "insertValues", "insertValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Int'", "'Float'", "'Text'", "'Bool'", "'True'", "'False'", 
			"'Select'", "'From'", "'Where'", "'And'", "'Or'", "'In'", "'Not'", "'Order'", 
			"'By'", "'Descending'", "'Update'", "'Set'", "'Delete'", "'Like'", "'Insert'", 
			"'Into'", "'Values'", "'Join'", "'Inner'", "'Outer'", "'Left'", "'Right'", 
			"'Full'", "'Create'", "'Table'", "'+'", "'-'", "'*'", "'/'", "'='", "'<'", 
			"'>'", "'>='", "'<='", "'<>'", "'('", "')'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DatatypeI", "DatatypeF", "DatatypeT", "DatatypeB", "True", 
			"False", "Select", "From", "Where", "And", "Or", "In", "Not", "Order", 
			"By", "Descending", "Update", "Set", "Delete", "Like", "Insert", "Into", 
			"Values", "Join", "Inner", "Outer", "Left", "Right", "Full", "Create", 
			"Table", "Plus", "Minus", "Star", "Divide", "Equals", "Lesser", "Greater", 
			"Greater_Equal", "Leser_Equal", "Not_Equal", "BracketL", "BracketR", 
			"SColon", "Coma", "Id", "Liczba", "String"
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
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> SColon() { return getTokens(SqlParser.SColon); }
		public TerminalNode SColon(int i) {
			return getToken(SqlParser.SColon, i);
		}
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public List<InsertContext> insert() {
			return getRuleContexts(InsertContext.class);
		}
		public InsertContext insert(int i) {
			return getRuleContext(InsertContext.class,i);
		}
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Select:
				{
				setState(62);
				select();
				}
				break;
			case Insert:
				{
				setState(63);
				insert();
				}
				break;
			case Create:
				{
				setState(64);
				create();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(67);
			match(SColon);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Select) | (1L << Insert) | (1L << Create))) != 0)) {
				{
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Select:
					{
					setState(68);
					select();
					}
					break;
				case Insert:
					{
					setState(69);
					insert();
					}
					break;
				case Create:
					{
					setState(70);
					create();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73);
				match(SColon);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode Select() { return getToken(SqlParser.Select, 0); }
		public SelectItemListContext selectItemList() {
			return getRuleContext(SelectItemListContext.class,0);
		}
		public TerminalNode From() { return getToken(SqlParser.From, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public TerminalNode Order() { return getToken(SqlParser.Order, 0); }
		public TerminalNode By() { return getToken(SqlParser.By, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public TerminalNode Descending() { return getToken(SqlParser.Descending, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(Select);
			setState(83);
			selectItemList();
			setState(84);
			match(From);
			setState(85);
			table();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(86);
				whereStatement();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Order) {
				{
				setState(89);
				match(Order);
				setState(90);
				match(By);
				setState(91);
				match(Id);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Descending) {
					{
					setState(92);
					match(Descending);
					}
				}

				}
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

	public static class SelectItemListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> Coma() { return getTokens(SqlParser.Coma); }
		public TerminalNode Coma(int i) {
			return getToken(SqlParser.Coma, i);
		}
		public TerminalNode Star() { return getToken(SqlParser.Star, 0); }
		public SelectItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelectItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelectItemList(this);
		}
	}

	public final SelectItemListContext selectItemList() throws RecognitionException {
		SelectItemListContext _localctx = new SelectItemListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectItemList);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case BracketL:
			case Id:
			case Liczba:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				selectItem();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Coma) {
					{
					{
					setState(98);
					match(Coma);
					setState(99);
					selectItem();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(Star);
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

	public static class SelectItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelectItem(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode BracketL() { return getToken(SqlParser.BracketL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BracketR() { return getToken(SqlParser.BracketR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BracketL:
				{
				setState(111);
				match(BracketL);
				setState(112);
				expr(0);
				setState(113);
				match(BracketR);
				}
				break;
			case True:
			case False:
			case Id:
			case Liczba:
			case String:
				{
				setState(115);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(118);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(119);
					operator();
					setState(120);
					expr(4);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorMContext operatorM() {
			return getRuleContext(OperatorMContext.class,0);
		}
		public OperatorCContext operatorC() {
			return getRuleContext(OperatorCContext.class,0);
		}
		public OperatorLContext operatorL() {
			return getRuleContext(OperatorLContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
			case Star:
			case Divide:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				operatorM();
				}
				break;
			case Equals:
			case Lesser:
			case Greater:
			case Greater_Equal:
			case Leser_Equal:
			case Not_Equal:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				operatorC();
				}
				break;
			case And:
			case Or:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				operatorL();
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

	public static class ExprMContext extends ParserRuleContext {
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public List<ExprMContext> exprM() {
			return getRuleContexts(ExprMContext.class);
		}
		public ExprMContext exprM(int i) {
			return getRuleContext(ExprMContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExprM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExprM(this);
		}
	}

	public final ExprMContext exprM() throws RecognitionException {
		ExprMContext _localctx = new ExprMContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			baseExpr();
			setState(133);
			exprM();
			setState(134);
			operator();
			setState(135);
			exprM();
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

	public static class BaseExprContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBaseExpr(this);
		}
	}

	public final BaseExprContext baseExpr() throws RecognitionException {
		BaseExprContext _localctx = new BaseExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_baseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			variable();
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

	public static class VariableContext extends ParserRuleContext {
		public Token numVar;
		public Token textVar;
		public Token boolVar;
		public Token colVar;
		public TerminalNode Liczba() { return getToken(SqlParser.Liczba, 0); }
		public TerminalNode String() { return getToken(SqlParser.String, 0); }
		public TerminalNode True() { return getToken(SqlParser.True, 0); }
		public TerminalNode False() { return getToken(SqlParser.False, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Liczba:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((VariableContext)_localctx).numVar = match(Liczba);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((VariableContext)_localctx).textVar = match(String);
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				((VariableContext)_localctx).boolVar = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
					((VariableContext)_localctx).boolVar = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((VariableContext)_localctx).colVar = match(Id);
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode Update() { return getToken(SqlParser.Update, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public TerminalNode Set() { return getToken(SqlParser.Set, 0); }
		public ColumnsSetEqContext columnsSetEq() {
			return getRuleContext(ColumnsSetEqContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(Update);
			setState(146);
			match(Id);
			setState(147);
			match(Set);
			setState(148);
			columnsSetEq();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(149);
				whereStatement();
				}
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(SqlParser.Delete, 0); }
		public TerminalNode From() { return getToken(SqlParser.From, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Delete);
			setState(153);
			match(From);
			setState(154);
			match(Id);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(155);
				whereStatement();
				}
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

	public static class ColumnsContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<TerminalNode> Coma() { return getTokens(SqlParser.Coma); }
		public TerminalNode Coma(int i) {
			return getToken(SqlParser.Coma, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumns(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			column();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Coma) {
				{
				{
				setState(159);
				match(Coma);
				setState(160);
				column();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Id);
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

	public static class TableContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(SqlParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(SqlParser.Id, i);
		}
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Id);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Join) | (1L << Inner) | (1L << Outer) | (1L << Left) | (1L << Right) | (1L << Full))) != 0)) {
				{
				{
				setState(169);
				join();
				setState(170);
				match(Id);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode Join() { return getToken(SqlParser.Join, 0); }
		public TerminalNode Inner() { return getToken(SqlParser.Inner, 0); }
		public TerminalNode Outer() { return getToken(SqlParser.Outer, 0); }
		public TerminalNode Left() { return getToken(SqlParser.Left, 0); }
		public TerminalNode Right() { return getToken(SqlParser.Right, 0); }
		public TerminalNode Full() { return getToken(SqlParser.Full, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Inner) | (1L << Outer) | (1L << Left) | (1L << Right) | (1L << Full))) != 0)) {
				{
				setState(177);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Inner) | (1L << Outer) | (1L << Left) | (1L << Right) | (1L << Full))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(180);
			match(Join);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode BracketL() { return getToken(SqlParser.BracketL, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode BracketR() { return getToken(SqlParser.BracketR, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public OperatorLContext operatorL() {
			return getRuleContext(OperatorLContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(183);
				match(BracketL);
				setState(184);
				condition(0);
				setState(185);
				match(BracketR);
				}
				break;
			case 2:
				{
				setState(187);
				formula();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(190);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(191);
					operatorL();
					setState(192);
					condition(3);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Liczba() { return getToken(SqlParser.Liczba, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==Id || _la==Liczba) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode BracketL() { return getToken(SqlParser.BracketL, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode BracketR() { return getToken(SqlParser.BracketR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public OperatorCContext operatorC() {
			return getRuleContext(OperatorCContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formula);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BracketL:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(BracketL);
				setState(202);
				formula();
				setState(203);
				match(BracketR);
				}
				break;
			case Id:
			case Liczba:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				var();
				setState(206);
				operatorC();
				setState(207);
				var();
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

	public static class ColumnsSetEqContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(SqlParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(SqlParser.Id, i);
		}
		public List<TerminalNode> Equals() { return getTokens(SqlParser.Equals); }
		public TerminalNode Equals(int i) {
			return getToken(SqlParser.Equals, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> Coma() { return getTokens(SqlParser.Coma); }
		public TerminalNode Coma(int i) {
			return getToken(SqlParser.Coma, i);
		}
		public ColumnsSetEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsSetEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumnsSetEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumnsSetEq(this);
		}
	}

	public final ColumnsSetEqContext columnsSetEq() throws RecognitionException {
		ColumnsSetEqContext _localctx = new ColumnsSetEqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnsSetEq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Id);
			setState(212);
			match(Equals);
			setState(213);
			var();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Coma) {
				{
				{
				setState(214);
				match(Coma);
				setState(215);
				match(Id);
				setState(216);
				match(Equals);
				setState(217);
				var();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WhereStatementContext extends ParserRuleContext {
		public TerminalNode Where() { return getToken(SqlParser.Where, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public TerminalNode Like() { return getToken(SqlParser.Like, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhereStatement(this);
		}
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(Where);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(224);
				condition(0);
				}
				break;
			case 2:
				{
				setState(225);
				match(Id);
				setState(226);
				match(Like);
				setState(227);
				var();
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

	public static class OperatorLContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(SqlParser.And, 0); }
		public TerminalNode Or() { return getToken(SqlParser.Or, 0); }
		public OperatorLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOperatorL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOperatorL(this);
		}
	}

	public final OperatorLContext operatorL() throws RecognitionException {
		OperatorLContext _localctx = new OperatorLContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operatorL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Or) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperatorCContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(SqlParser.Equals, 0); }
		public TerminalNode Leser_Equal() { return getToken(SqlParser.Leser_Equal, 0); }
		public TerminalNode Lesser() { return getToken(SqlParser.Lesser, 0); }
		public TerminalNode Greater() { return getToken(SqlParser.Greater, 0); }
		public TerminalNode Greater_Equal() { return getToken(SqlParser.Greater_Equal, 0); }
		public TerminalNode Not_Equal() { return getToken(SqlParser.Not_Equal, 0); }
		public OperatorCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOperatorC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOperatorC(this);
		}
	}

	public final OperatorCContext operatorC() throws RecognitionException {
		OperatorCContext _localctx = new OperatorCContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operatorC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << Lesser) | (1L << Greater) | (1L << Greater_Equal) | (1L << Leser_Equal) | (1L << Not_Equal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperatorMContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(SqlParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SqlParser.Minus, 0); }
		public TerminalNode Star() { return getToken(SqlParser.Star, 0); }
		public TerminalNode Divide() { return getToken(SqlParser.Divide, 0); }
		public OperatorMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOperatorM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOperatorM(this);
		}
	}

	public final OperatorMContext operatorM() throws RecognitionException {
		OperatorMContext _localctx = new OperatorMContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operatorM);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Divide))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CreateContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			createTable();
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode Create() { return getToken(SqlParser.Create, 0); }
		public TerminalNode Table() { return getToken(SqlParser.Table, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public TerminalNode BracketL() { return getToken(SqlParser.BracketL, 0); }
		public CreateTableColContext createTableCol() {
			return getRuleContext(CreateTableColContext.class,0);
		}
		public TerminalNode BracketR() { return getToken(SqlParser.BracketR, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreateTable(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Create);
			setState(239);
			match(Table);
			setState(240);
			match(Id);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BracketL) {
				{
				setState(241);
				match(BracketL);
				setState(242);
				createTableCol();
				setState(243);
				match(BracketR);
				}
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

	public static class CreateTableColContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Coma() { return getToken(SqlParser.Coma, 0); }
		public CreateTableColContext createTableCol() {
			return getRuleContext(CreateTableColContext.class,0);
		}
		public CreateTableColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreateTableCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreateTableCol(this);
		}
	}

	public final CreateTableColContext createTableCol() throws RecognitionException {
		CreateTableColContext _localctx = new CreateTableColContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createTableCol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(Id);
			setState(248);
			datatype();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Coma) {
				{
				setState(249);
				match(Coma);
				setState(250);
				createTableCol();
				}
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode DatatypeB() { return getToken(SqlParser.DatatypeB, 0); }
		public TerminalNode DatatypeF() { return getToken(SqlParser.DatatypeF, 0); }
		public TerminalNode DatatypeT() { return getToken(SqlParser.DatatypeT, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DatatypeF) | (1L << DatatypeT) | (1L << DatatypeB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode Insert() { return getToken(SqlParser.Insert, 0); }
		public TerminalNode Into() { return getToken(SqlParser.Into, 0); }
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public List<TerminalNode> BracketL() { return getTokens(SqlParser.BracketL); }
		public TerminalNode BracketL(int i) {
			return getToken(SqlParser.BracketL, i);
		}
		public InsertColContext insertCol() {
			return getRuleContext(InsertColContext.class,0);
		}
		public List<TerminalNode> BracketR() { return getTokens(SqlParser.BracketR); }
		public TerminalNode BracketR(int i) {
			return getToken(SqlParser.BracketR, i);
		}
		public TerminalNode Values() { return getToken(SqlParser.Values, 0); }
		public InsertValuesContext insertValues() {
			return getRuleContext(InsertValuesContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Insert);
			setState(256);
			match(Into);
			setState(257);
			match(Id);
			setState(258);
			match(BracketL);
			setState(259);
			insertCol();
			setState(260);
			match(BracketR);
			setState(261);
			match(Values);
			setState(262);
			match(BracketL);
			setState(263);
			insertValues();
			setState(264);
			match(BracketR);
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

	public static class InsertColContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(SqlParser.Id, 0); }
		public TerminalNode Coma() { return getToken(SqlParser.Coma, 0); }
		public InsertColContext insertCol() {
			return getRuleContext(InsertColContext.class,0);
		}
		public InsertColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertCol(this);
		}
	}

	public final InsertColContext insertCol() throws RecognitionException {
		InsertColContext _localctx = new InsertColContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insertCol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(Id);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Coma) {
				{
				setState(267);
				match(Coma);
				setState(268);
				insertCol();
				}
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

	public static class InsertValuesContext extends ParserRuleContext {
		public InsertValueContext insertValue() {
			return getRuleContext(InsertValueContext.class,0);
		}
		public TerminalNode Coma() { return getToken(SqlParser.Coma, 0); }
		public InsertValuesContext insertValues() {
			return getRuleContext(InsertValuesContext.class,0);
		}
		public InsertValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertValues(this);
		}
	}

	public final InsertValuesContext insertValues() throws RecognitionException {
		InsertValuesContext _localctx = new InsertValuesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insertValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			insertValue();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Coma) {
				{
				setState(272);
				match(Coma);
				setState(273);
				insertValues();
				}
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

	public static class InsertValueContext extends ParserRuleContext {
		public Token numVar;
		public Token textVar;
		public Token boolVar;
		public TerminalNode Liczba() { return getToken(SqlParser.Liczba, 0); }
		public TerminalNode String() { return getToken(SqlParser.String, 0); }
		public TerminalNode True() { return getToken(SqlParser.True, 0); }
		public TerminalNode False() { return getToken(SqlParser.False, 0); }
		public InsertValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertValue(this);
		}
	}

	public final InsertValueContext insertValue() throws RecognitionException {
		InsertValueContext _localctx = new InsertValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insertValue);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Liczba:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((InsertValueContext)_localctx).numVar = match(Liczba);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((InsertValueContext)_localctx).textVar = match(String);
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				((InsertValueContext)_localctx).boolVar = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
					((InsertValueContext)_localctx).boolVar = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\5\2D\n\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\2\3\2\7\2N\n\2\f\2\16\2Q"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\3\3\3\3\3\3\3\5\3`\n\3\5"+
		"\3b\n\3\3\4\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\5\4m\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6w\n\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13"+
		"\6\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\n\u0092\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u009f\n\f\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17\3\20"+
		"\5\20\u00b5\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bf\n"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00c5\n\21\f\21\16\21\u00c8\13\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u00dd\n\24\f\24\16\24\u00e0\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f8\n\32\3\33\3\33\3\33"+
		"\3\33\5\33\u00fe\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0110\n\36\3\37\3\37\3\37\5\37\u0115"+
		"\n\37\3 \3 \3 \5 \u011a\n \3 \2\4\n !\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>\2\t\3\2\b\t\3\2\34 \3\2\61\62\3\2\r\16"+
		"\3\2\',\3\2#&\3\2\5\7\2\u011d\2C\3\2\2\2\4T\3\2\2\2\6l\3\2\2\2\bn\3\2"+
		"\2\2\nv\3\2\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u008b\3\2\2\2\22\u0091"+
		"\3\2\2\2\24\u0093\3\2\2\2\26\u009a\3\2\2\2\30\u00a0\3\2\2\2\32\u00a8\3"+
		"\2\2\2\34\u00aa\3\2\2\2\36\u00b4\3\2\2\2 \u00be\3\2\2\2\"\u00c9\3\2\2"+
		"\2$\u00d3\3\2\2\2&\u00d5\3\2\2\2(\u00e1\3\2\2\2*\u00e8\3\2\2\2,\u00ea"+
		"\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2\62\u00f0\3\2\2\2\64\u00f9\3\2"+
		"\2\2\66\u00ff\3\2\2\28\u0101\3\2\2\2:\u010c\3\2\2\2<\u0111\3\2\2\2>\u0119"+
		"\3\2\2\2@D\5\4\3\2AD\58\35\2BD\5\60\31\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2"+
		"DE\3\2\2\2EO\7/\2\2FJ\5\4\3\2GJ\58\35\2HJ\5\60\31\2IF\3\2\2\2IG\3\2\2"+
		"\2IH\3\2\2\2JK\3\2\2\2KL\7/\2\2LN\3\2\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2"+
		"\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TU\7\n\2\2UV\5\6"+
		"\4\2VW\7\13\2\2WY\5\34\17\2XZ\5(\25\2YX\3\2\2\2YZ\3\2\2\2Za\3\2\2\2[\\"+
		"\7\21\2\2\\]\7\22\2\2]_\7\61\2\2^`\7\23\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2"+
		"\2\2a[\3\2\2\2ab\3\2\2\2b\5\3\2\2\2ch\5\b\5\2de\7\60\2\2eg\5\b\5\2fd\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2im\3\2\2\2jh\3\2\2\2km\7%\2\2lc\3"+
		"\2\2\2lk\3\2\2\2m\7\3\2\2\2no\5\n\6\2o\t\3\2\2\2pq\b\6\1\2qr\7-\2\2rs"+
		"\5\n\6\2st\7.\2\2tw\3\2\2\2uw\5\22\n\2vp\3\2\2\2vu\3\2\2\2w~\3\2\2\2x"+
		"y\f\5\2\2yz\5\f\7\2z{\5\n\6\6{}\3\2\2\2|x\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0085\5.\30\2\u0082"+
		"\u0085\5,\27\2\u0083\u0085\5*\26\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\5\20\t\2\u0087\u0088"+
		"\5\16\b\2\u0088\u0089\5\f\7\2\u0089\u008a\5\16\b\2\u008a\17\3\2\2\2\u008b"+
		"\u008c\5\22\n\2\u008c\21\3\2\2\2\u008d\u0092\7\62\2\2\u008e\u0092\7\63"+
		"\2\2\u008f\u0092\t\2\2\2\u0090\u0092\7\61\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2"+
		"\2\u0093\u0094\7\24\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7\25\2\2\u0096"+
		"\u0098\5&\24\2\u0097\u0099\5(\25\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\25\3\2\2\2\u009a\u009b\7\26\2\2\u009b\u009c\7\13\2\2\u009c"+
		"\u009e\7\61\2\2\u009d\u009f\5(\25\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\27\3\2\2\2\u00a0\u00a5\5\32\16\2\u00a1\u00a2\7\60\2\2\u00a2"+
		"\u00a4\5\32\16\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\61\2\2\u00a9\33\3\2\2\2\u00aa\u00b0\7\61\2\2\u00ab\u00ac\5\36"+
		"\20\2\u00ac\u00ad\7\61\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\t\3\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\33\2\2\u00b7\37\3\2\2\2\u00b8"+
		"\u00b9\b\21\1\2\u00b9\u00ba\7-\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7."+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\5$\23\2\u00be\u00b8\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\5*"+
		"\26\2\u00c2\u00c3\5 \21\5\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7!\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca#\3\2\2\2\u00cb\u00cc\7"+
		"-\2\2\u00cc\u00cd\5$\23\2\u00cd\u00ce\7.\2\2\u00ce\u00d4\3\2\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00d1\5,\27\2\u00d1\u00d2\5\"\22\2\u00d2\u00d4\3"+
		"\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d6"+
		"\7\61\2\2\u00d6\u00d7\7\'\2\2\u00d7\u00de\5\"\22\2\u00d8\u00d9\7\60\2"+
		"\2\u00d9\u00da\7\61\2\2\u00da\u00db\7\'\2\2\u00db\u00dd\5\"\22\2\u00dc"+
		"\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\'\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e6\7\f\2\2\u00e2\u00e7"+
		"\5 \21\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7\27\2\2\u00e5\u00e7\5\"\22"+
		"\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00e9"+
		"\t\5\2\2\u00e9+\3\2\2\2\u00ea\u00eb\t\6\2\2\u00eb-\3\2\2\2\u00ec\u00ed"+
		"\t\7\2\2\u00ed/\3\2\2\2\u00ee\u00ef\5\62\32\2\u00ef\61\3\2\2\2\u00f0\u00f1"+
		"\7!\2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f7\7\61\2\2\u00f3\u00f4\7-\2\2\u00f4"+
		"\u00f5\5\64\33\2\u00f5\u00f6\7.\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\63\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa"+
		"\u00fd\5\66\34\2\u00fb\u00fc\7\60\2\2\u00fc\u00fe\5\64\33\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\65\3\2\2\2\u00ff\u0100\t\b\2\2\u0100"+
		"\67\3\2\2\2\u0101\u0102\7\30\2\2\u0102\u0103\7\31\2\2\u0103\u0104\7\61"+
		"\2\2\u0104\u0105\7-\2\2\u0105\u0106\5:\36\2\u0106\u0107\7.\2\2\u0107\u0108"+
		"\7\32\2\2\u0108\u0109\7-\2\2\u0109\u010a\5<\37\2\u010a\u010b\7.\2\2\u010b"+
		"9\3\2\2\2\u010c\u010f\7\61\2\2\u010d\u010e\7\60\2\2\u010e\u0110\5:\36"+
		"\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110;\3\2\2\2\u0111\u0114"+
		"\5> \2\u0112\u0113\7\60\2\2\u0113\u0115\5<\37\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115=\3\2\2\2\u0116\u011a\7\62\2\2\u0117\u011a\7\63\2"+
		"\2\u0118\u011a\t\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a?\3\2\2\2\35CIOY_ahlv~\u0084\u0091\u0098\u009e\u00a5\u00b0"+
		"\u00b4\u00be\u00c6\u00d3\u00de\u00e6\u00f7\u00fd\u010f\u0114\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}