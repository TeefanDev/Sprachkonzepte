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
		WS=1, COMMENT=2, DATE=3, TIME=4, KW_BIS=5, KW_RUHETAG=6, KW_UHR=7, DAY=8, 
		IDENTIFIER=9, SEPARATOR=10, DOT=11, COLON=12;
	public static final int
		RULE_openingHours = 0, RULE_location = 1, RULE_dateRange = 2, RULE_openingRule = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"openingHours", "location", "dateRange", "openingRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'bis'", "'Ruhetag'", "'Uhr'", null, null, 
			"','", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "DATE", "TIME", "KW_BIS", "KW_RUHETAG", "KW_UHR", 
			"DAY", "IDENTIFIER", "SEPARATOR", "DOT", "COLON"
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
		enterRule(_localctx, 0, RULE_openingHours);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			location();
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9);
				dateRange();
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(10);
					openingRule();
					}
					}
					setState(13); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DAY );
				}
				}
				setState(17); 
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
		enterRule(_localctx, 2, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				match(IDENTIFIER);
				}
				}
				setState(22); 
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
		public TerminalNode KW_BIS() { return getToken(OpeningHoursParser.KW_BIS, 0); }
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
		enterRule(_localctx, 4, RULE_dateRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DATE);
			setState(25);
			match(KW_BIS);
			setState(26);
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
		public List<TerminalNode> KW_BIS() { return getTokens(OpeningHoursParser.KW_BIS); }
		public TerminalNode KW_BIS(int i) {
			return getToken(OpeningHoursParser.KW_BIS, i);
		}
		public List<TerminalNode> TIME() { return getTokens(OpeningHoursParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(OpeningHoursParser.TIME, i);
		}
		public TerminalNode KW_UHR() { return getToken(OpeningHoursParser.KW_UHR, 0); }
		public TerminalNode KW_RUHETAG() { return getToken(OpeningHoursParser.KW_RUHETAG, 0); }
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
		enterRule(_localctx, 6, RULE_openingRule);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(28);
				match(DAY);
				setState(29);
				match(KW_BIS);
				setState(30);
				match(DAY);
				setState(31);
				match(TIME);
				setState(32);
				match(KW_BIS);
				setState(33);
				match(TIME);
				setState(34);
				match(KW_UHR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(35);
				match(DAY);
				setState(36);
				match(TIME);
				setState(37);
				match(KW_BIS);
				setState(38);
				match(TIME);
				setState(39);
				match(KW_UHR);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(40);
				match(DAY);
				setState(41);
				match(KW_RUHETAG);
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
		"\u0004\u0001\f-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0004\u0000\u0010\b"+
		"\u0000\u000b\u0000\f\u0000\u0011\u0001\u0001\u0004\u0001\u0015\b\u0001"+
		"\u000b\u0001\f\u0001\u0016\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0000\u0000"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0000-\u0000\b\u0001\u0000\u0000"+
		"\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000"+
		"\u0000\u0006*\u0001\u0000\u0000\u0000\b\u000f\u0003\u0002\u0001\u0000"+
		"\t\u000b\u0003\u0004\u0002\u0000\n\f\u0003\u0006\u0003\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000"+
		"\u000f\t\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0001\u0001\u0000\u0000\u0000\u0013\u0015\u0005\t\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0003"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019\u001a"+
		"\u0005\u0005\u0000\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u0005"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\b\u0000\u0000\u001d\u001e\u0005"+
		"\u0005\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f \u0005\u0004"+
		"\u0000\u0000 !\u0005\u0005\u0000\u0000!\"\u0005\u0004\u0000\u0000\"+\u0005"+
		"\u0007\u0000\u0000#$\u0005\b\u0000\u0000$%\u0005\u0004\u0000\u0000%&\u0005"+
		"\u0005\u0000\u0000&\'\u0005\u0004\u0000\u0000\'+\u0005\u0007\u0000\u0000"+
		"()\u0005\b\u0000\u0000)+\u0005\u0006\u0000\u0000*\u001c\u0001\u0000\u0000"+
		"\u0000*#\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+\u0007\u0001"+
		"\u0000\u0000\u0000\u0004\r\u0011\u0016*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}