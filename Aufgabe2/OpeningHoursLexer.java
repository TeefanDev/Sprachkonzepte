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
		NEWLINE=1, WS=2, COMMENT=3, DATE=4, TIME=5, BIS=6, RUHETAG=7, UHR=8, DAY=9, 
		IDENTIFIER=10, InvalidChar=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "COMMENT", "DATE", "TIME", "BIS", "RUHETAG", "UHR", 
			"DAY", "IDENTIFIER", "InvalidChar"
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
		"\u0004\u0000\u000b\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0004\u0000\u001c\b\u0000"+
		"\u000b\u0000\f\u0000\u001d\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"#\b\u0001\u000b\u0001\f\u0001$\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003?\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u0004D\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0096"+
		"\b\b\u0001\t\u0004\t\u0099\b\t\u000b\t\f\t\u009a\u0001\n\u0001\n\u0000"+
		"\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\n\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0001\u000019\u0001\u000012\u0001"+
		"\u000009\u0001\u000001\u0001\u000002\u0001\u000003\u0001\u000005\u000b"+
		"\u0000AZaz\u00c4\u00c4\u00c8\u00c9\u00d6\u00d6\u00dc\u00dc\u00df\u00df"+
		"\u00e4\u00e4\u00e8\u00e9\u00f6\u00f6\u00fc\u00fc\u00ae\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000"+
		"\u0005(\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\tJ\u0001"+
		"\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rT\u0001\u0000\u0000"+
		"\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011\u0095\u0001\u0000\u0000\u0000"+
		"\u0013\u0098\u0001\u0000\u0000\u0000\u0015\u009c\u0001\u0000\u0000\u0000"+
		"\u0017\u0019\u0005\r\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0005\n\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0006"+
		"\u0000\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!#\u0007\u0000\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0006"+
		"\u0001\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005/\u0000\u0000"+
		")*\u0005/\u0000\u0000*.\u0001\u0000\u0000\u0000+-\b\u0001\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000012\u0006\u0002\u0000\u00002\u0006\u0001\u0000\u0000\u0000"+
		"39\u0007\u0002\u0000\u000045\u0007\u0003\u0000\u000059\u0007\u0004\u0000"+
		"\u000067\u00053\u0000\u000079\u0007\u0005\u0000\u000083\u0001\u0000\u0000"+
		"\u000084\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:>\u0005.\u0000\u0000;?\u0007\u0002\u0000\u0000<=\u00051\u0000"+
		"\u0000=?\u0007\u0006\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005.\u0000\u0000A\b\u0001\u0000"+
		"\u0000\u0000BD\u00050\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EK\u0007\u0004\u0000\u0000FG\u0005"+
		"1\u0000\u0000GK\u0007\u0004\u0000\u0000HI\u00052\u0000\u0000IK\u0007\u0007"+
		"\u0000\u0000JC\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005:\u0000\u0000MN\u0007"+
		"\b\u0000\u0000NO\u0007\u0004\u0000\u0000O\n\u0001\u0000\u0000\u0000PQ"+
		"\u0005b\u0000\u0000QR\u0005i\u0000\u0000RS\u0005s\u0000\u0000S\f\u0001"+
		"\u0000\u0000\u0000TU\u0005R\u0000\u0000UV\u0005u\u0000\u0000VW\u0005h"+
		"\u0000\u0000WX\u0005e\u0000\u0000XY\u0005t\u0000\u0000YZ\u0005a\u0000"+
		"\u0000Z[\u0005g\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005U\u0000"+
		"\u0000]^\u0005h\u0000\u0000^_\u0005r\u0000\u0000_\u0010\u0001\u0000\u0000"+
		"\u0000`a\u0005M\u0000\u0000ab\u0005o\u0000\u0000bc\u0005n\u0000\u0000"+
		"cd\u0005t\u0000\u0000de\u0005a\u0000\u0000e\u0096\u0005g\u0000\u0000f"+
		"g\u0005D\u0000\u0000gh\u0005i\u0000\u0000hi\u0005e\u0000\u0000ij\u0005"+
		"n\u0000\u0000jk\u0005s\u0000\u0000kl\u0005t\u0000\u0000lm\u0005a\u0000"+
		"\u0000m\u0096\u0005g\u0000\u0000no\u0005M\u0000\u0000op\u0005i\u0000\u0000"+
		"pq\u0005t\u0000\u0000qr\u0005t\u0000\u0000rs\u0005w\u0000\u0000st\u0005"+
		"o\u0000\u0000tu\u0005c\u0000\u0000u\u0096\u0005h\u0000\u0000vw\u0005D"+
		"\u0000\u0000wx\u0005o\u0000\u0000xy\u0005n\u0000\u0000yz\u0005n\u0000"+
		"\u0000z{\u0005e\u0000\u0000{|\u0005r\u0000\u0000|}\u0005s\u0000\u0000"+
		"}~\u0005t\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f\u0096\u0005g\u0000"+
		"\u0000\u0080\u0081\u0005F\u0000\u0000\u0081\u0082\u0005r\u0000\u0000\u0082"+
		"\u0083\u0005e\u0000\u0000\u0083\u0084\u0005i\u0000\u0000\u0084\u0085\u0005"+
		"t\u0000\u0000\u0085\u0086\u0005a\u0000\u0000\u0086\u0096\u0005g\u0000"+
		"\u0000\u0087\u0088\u0005S\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089"+
		"\u008a\u0005m\u0000\u0000\u008a\u008b\u0005s\u0000\u0000\u008b\u008c\u0005"+
		"t\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u0096\u0005g\u0000"+
		"\u0000\u008e\u008f\u0005S\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090"+
		"\u0091\u0005n\u0000\u0000\u0091\u0092\u0005n\u0000\u0000\u0092\u0093\u0005"+
		"t\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0096\u0005g\u0000"+
		"\u0000\u0095`\u0001\u0000\u0000\u0000\u0095f\u0001\u0000\u0000\u0000\u0095"+
		"n\u0001\u0000\u0000\u0000\u0095v\u0001\u0000\u0000\u0000\u0095\u0080\u0001"+
		"\u0000\u0000\u0000\u0095\u0087\u0001\u0000\u0000\u0000\u0095\u008e\u0001"+
		"\u0000\u0000\u0000\u0096\u0012\u0001\u0000\u0000\u0000\u0097\u0099\u0007"+
		"\t\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u0014\u0001\u0000\u0000\u0000\u009c\u009d\t\u0000\u0000"+
		"\u0000\u009d\u0016\u0001\u0000\u0000\u0000\u000b\u0000\u0018\u001d$.8"+
		">CJ\u0095\u009a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}