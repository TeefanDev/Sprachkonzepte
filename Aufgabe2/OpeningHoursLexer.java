// Generated from OpeningHoursLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OpeningHoursLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, DATE=3, TIME=4, KW_BIS=5, KW_RUHETAG=6, KW_UHR=7, DAY=8, 
		IDENTIFIER=9, SEPARATOR=10, DOT=11, COLON=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "DATE", "TIME", "KW_BIS", "KW_RUHETAG", "KW_UHR", "DAY", 
			"IDENTIFIER", "SEPARATOR", "DOT", "COLON"
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


	public OpeningHoursLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OpeningHoursLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\f\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001\u0002"+
		"\u0001\u0002\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0004\u0003:\b\u0003\u000b\u0003\f\u0003;\u0001\u0003"+
		"\u0001\u0003\u0004\u0003@\b\u0003\u000b\u0003\f\u0003A\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\b\u0004\b\u008c\b\b"+
		"\u000b\b\f\b\u008d\u0001\b\u0001\b\u0004\b\u0092\b\b\u000b\b\f\b\u0093"+
		"\u0005\b\u0096\b\b\n\b\f\b\u0099\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0001"+
		"\u000009\t\u0000AZaz\u00c4\u00c4\u00d6\u00d6\u00dc\u00dc\u00df\u00df\u00e4"+
		"\u00e4\u00f6\u00f6\u00fc\u00fc\u0002\u0000\t\t  \u00ae\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000"+
		"\u0000\u0003 \u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007"+
		"9\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bG\u0001\u0000"+
		"\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000f\u0088\u0001\u0000\u0000"+
		"\u0000\u0011\u008b\u0001\u0000\u0000\u0000\u0013\u009a\u0001\u0000\u0000"+
		"\u0000\u0015\u009c\u0001\u0000\u0000\u0000\u0017\u009e\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\u0007\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0006\u0000\u0000\u0000\u001f\u0002\u0001\u0000\u0000"+
		"\u0000 !\u0005/\u0000\u0000!\"\u0005/\u0000\u0000\"&\u0001\u0000\u0000"+
		"\u0000#%\b\u0001\u0000\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0006\u0001\u0000\u0000*\u0004"+
		"\u0001\u0000\u0000\u0000+-\u0007\u0002\u0000\u0000,+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000002\u0005.\u0000\u000013\u0007\u0002"+
		"\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0005.\u0000\u00007\u0006\u0001\u0000\u0000\u00008:\u0007\u0002\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0005"+
		":\u0000\u0000>@\u0007\u0002\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B\b\u0001\u0000\u0000\u0000CD\u0005b\u0000\u0000DE\u0005i\u0000\u0000"+
		"EF\u0005s\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005R\u0000\u0000"+
		"HI\u0005u\u0000\u0000IJ\u0005h\u0000\u0000JK\u0005e\u0000\u0000KL\u0005"+
		"t\u0000\u0000LM\u0005a\u0000\u0000MN\u0005g\u0000\u0000N\f\u0001\u0000"+
		"\u0000\u0000OP\u0005U\u0000\u0000PQ\u0005h\u0000\u0000QR\u0005r\u0000"+
		"\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005M\u0000\u0000TU\u0005o\u0000"+
		"\u0000UV\u0005n\u0000\u0000VW\u0005t\u0000\u0000WX\u0005a\u0000\u0000"+
		"X\u0089\u0005g\u0000\u0000YZ\u0005D\u0000\u0000Z[\u0005i\u0000\u0000["+
		"\\\u0005e\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005s\u0000\u0000^_\u0005"+
		"t\u0000\u0000_`\u0005a\u0000\u0000`\u0089\u0005g\u0000\u0000ab\u0005M"+
		"\u0000\u0000bc\u0005i\u0000\u0000cd\u0005t\u0000\u0000de\u0005t\u0000"+
		"\u0000ef\u0005w\u0000\u0000fg\u0005o\u0000\u0000gh\u0005c\u0000\u0000"+
		"h\u0089\u0005h\u0000\u0000ij\u0005D\u0000\u0000jk\u0005o\u0000\u0000k"+
		"l\u0005n\u0000\u0000lm\u0005n\u0000\u0000mn\u0005e\u0000\u0000no\u0005"+
		"r\u0000\u0000op\u0005s\u0000\u0000pq\u0005t\u0000\u0000qr\u0005a\u0000"+
		"\u0000r\u0089\u0005g\u0000\u0000st\u0005F\u0000\u0000tu\u0005r\u0000\u0000"+
		"uv\u0005e\u0000\u0000vw\u0005i\u0000\u0000wx\u0005t\u0000\u0000xy\u0005"+
		"a\u0000\u0000y\u0089\u0005g\u0000\u0000z{\u0005S\u0000\u0000{|\u0005a"+
		"\u0000\u0000|}\u0005m\u0000\u0000}~\u0005s\u0000\u0000~\u007f\u0005t\u0000"+
		"\u0000\u007f\u0080\u0005a\u0000\u0000\u0080\u0089\u0005g\u0000\u0000\u0081"+
		"\u0082\u0005S\u0000\u0000\u0082\u0083\u0005o\u0000\u0000\u0083\u0084\u0005"+
		"n\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085\u0086\u0005t\u0000"+
		"\u0000\u0086\u0087\u0005a\u0000\u0000\u0087\u0089\u0005g\u0000\u0000\u0088"+
		"S\u0001\u0000\u0000\u0000\u0088Y\u0001\u0000\u0000\u0000\u0088a\u0001"+
		"\u0000\u0000\u0000\u0088i\u0001\u0000\u0000\u0000\u0088s\u0001\u0000\u0000"+
		"\u0000\u0088z\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000"+
		"\u0089\u0010\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0003\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0097\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0004\u0000\u0000"+
		"\u0090\u0092\u0007\u0003\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u008f\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0012\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005,\u0000\u0000\u009b\u0014\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005.\u0000\u0000\u009d\u0016\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005:\u0000\u0000\u009f\u0018\u0001\u0000\u0000\u0000\u000b\u0000\u001c"+
		"&.4;A\u0088\u008d\u0093\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}