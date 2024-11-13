// Generated from OpeningHoursParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OpeningHoursParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, COMMENT=3, DATE=4, TIME=5, BIS=6, RUHETAG=7, UHR=8, DAY=9, 
		IDENTIFIER=10, InvalidChar=11;
	public static final int
		RULE_openingHoursFile = 0, RULE_openingHours = 1, RULE_location = 2, RULE_dateRange = 3, 
		RULE_openingRule = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"openingHoursFile", "openingHours", "location", "dateRange", "openingRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'bis'", "'Ruhetag'", "'Uhr'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "COMMENT", "DATE", "TIME", "BIS", "RUHETAG", "UHR", 
			"DAY", "IDENTIFIER", "InvalidChar"
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
	public String getGrammarFileName() { return "OpeningHoursParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpeningHoursParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningHoursFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OpeningHoursParser.EOF, 0); }
		public List<OpeningHoursContext> openingHours() {
			return getRuleContexts(OpeningHoursContext.class);
		}
		public OpeningHoursContext openingHours(int i) {
			return getRuleContext(OpeningHoursContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(OpeningHoursParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpeningHoursParser.NEWLINE, i);
		}
		public OpeningHoursFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingHoursFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).enterOpeningHoursFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).exitOpeningHoursFile(this);
		}
	}

	public final OpeningHoursFileContext openingHoursFile() throws RecognitionException {
		OpeningHoursFileContext _localctx = new OpeningHoursFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_openingHoursFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				openingHours();
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(11);
					match(NEWLINE);
					}
				}

				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningHoursContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<DateRangeContext> dateRange() {
			return getRuleContexts(DateRangeContext.class);
		}
		public DateRangeContext dateRange(int i) {
			return getRuleContext(DateRangeContext.class,i);
		}
		public List<OpeningRuleContext> openingRule() {
			return getRuleContexts(OpeningRuleContext.class);
		}
		public OpeningRuleContext openingRule(int i) {
			return getRuleContext(OpeningRuleContext.class,i);
		}
		public OpeningHoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingHours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).enterOpeningHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).exitOpeningHours(this);
		}
	}

	public final OpeningHoursContext openingHours() throws RecognitionException {
		OpeningHoursContext _localctx = new OpeningHoursContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_openingHours);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			location();
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				dateRange();
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					openingRule();
					}
					}
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DAY );
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OpeningHoursParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OpeningHoursParser.IDENTIFIER, i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				match(IDENTIFIER);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DateRangeContext extends ParserRuleContext {
		public List<TerminalNode> DATE() { return getTokens(OpeningHoursParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(OpeningHoursParser.DATE, i);
		}
		public TerminalNode BIS() { return getToken(OpeningHoursParser.BIS, 0); }
		public DateRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).enterDateRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).exitDateRange(this);
		}
	}

	public final DateRangeContext dateRange() throws RecognitionException {
		DateRangeContext _localctx = new DateRangeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dateRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(DATE);
			setState(37);
			match(BIS);
			setState(38);
			match(DATE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningRuleContext extends ParserRuleContext {
		public List<TerminalNode> DAY() { return getTokens(OpeningHoursParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(OpeningHoursParser.DAY, i);
		}
		public List<TerminalNode> BIS() { return getTokens(OpeningHoursParser.BIS); }
		public TerminalNode BIS(int i) {
			return getToken(OpeningHoursParser.BIS, i);
		}
		public List<TerminalNode> TIME() { return getTokens(OpeningHoursParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(OpeningHoursParser.TIME, i);
		}
		public TerminalNode UHR() { return getToken(OpeningHoursParser.UHR, 0); }
		public TerminalNode RUHETAG() { return getToken(OpeningHoursParser.RUHETAG, 0); }
		public OpeningRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).enterOpeningRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpeningHoursParserListener ) ((OpeningHoursParserListener)listener).exitOpeningRule(this);
		}
	}

	public final OpeningRuleContext openingRule() throws RecognitionException {
		OpeningRuleContext _localctx = new OpeningRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_openingRule);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(40);
				match(DAY);
				setState(41);
				match(BIS);
				setState(42);
				match(DAY);
				setState(43);
				match(TIME);
				setState(44);
				match(BIS);
				setState(45);
				match(TIME);
				setState(46);
				match(UHR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(47);
				match(DAY);
				setState(48);
				match(TIME);
				setState(49);
				match(BIS);
				setState(50);
				match(TIME);
				setState(51);
				match(UHR);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(52);
				match(DAY);
				setState(53);
				match(RUHETAG);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0004\u0000\u000f\b\u0000\u000b"+
		"\u0000\f\u0000\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u0018\b\u0001\u000b\u0001\f\u0001\u0019\u0004\u0001"+
		"\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0004\u0002!\b\u0002"+
		"\u000b\u0002\f\u0002\"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000:\u0000\u000e\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000"+
		"\u0000\u0006$\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n\f\u0003"+
		"\u0002\u0001\u0000\u000b\r\u0005\u0001\u0000\u0000\f\u000b\u0001\u0000"+
		"\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000f\u0001\u0000\u0000\u0000"+
		"\u000e\n\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013"+
		"\u0001\u0001\u0000\u0000\u0000\u0014\u001b\u0003\u0004\u0002\u0000\u0015"+
		"\u0017\u0003\u0006\u0003\u0000\u0016\u0018\u0003\b\u0004\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f!\u0005"+
		"\n\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0005\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0004\u0000\u0000%&\u0005\u0006\u0000\u0000&\'\u0005"+
		"\u0004\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0005\t\u0000\u0000"+
		")*\u0005\u0006\u0000\u0000*+\u0005\t\u0000\u0000+,\u0005\u0005\u0000\u0000"+
		",-\u0005\u0006\u0000\u0000-.\u0005\u0005\u0000\u0000.7\u0005\b\u0000\u0000"+
		"/0\u0005\t\u0000\u000001\u0005\u0005\u0000\u000012\u0005\u0006\u0000\u0000"+
		"23\u0005\u0005\u0000\u000037\u0005\b\u0000\u000045\u0005\t\u0000\u0000"+
		"57\u0005\u0007\u0000\u00006(\u0001\u0000\u0000\u00006/\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u0000\u0006\f\u0010"+
		"\u0019\u001d\"6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}