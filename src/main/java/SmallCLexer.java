// Generated from SmallC.g4 by ANTLR 4.13.1
 package gramatica; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SmallCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, GE=16, LE=17, 
		EQ=18, NEQ=19, GT=20, LT=21, ID=22, INT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "GE", "LE", "EQ", 
			"NEQ", "GT", "LT", "ID", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'('", "')'", "'{'", "'}'", "';'", "'int'", "'='", "'if'", 
			"'else'", "'while'", "'+'", "'-'", "'*'", "'/'", "'>='", "'<='", "'=='", 
			"'!='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "GE", "LE", "EQ", "NEQ", "GT", "LT", "ID", "INT", 
			"WS"
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


	public SmallCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SmallC.g4"; }

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
		"\u0004\u0000\u0018\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015o\b\u0015\n\u0015\f\u0015r\t\u0015\u0001\u0016"+
		"\u0004\u0016u\b\u0016\u000b\u0016\f\u0016v\u0001\u0017\u0004\u0017z\b"+
		"\u0017\u000b\u0017\f\u0017{\u0001\u0017\u0001\u0017\u0000\u0000\u0018"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u0018\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u0081\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001"+
		"\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u00058\u0001\u0000\u0000"+
		"\u0000\u0007:\u0001\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000b"+
		">\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000\u000fD\u0001\u0000"+
		"\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000"+
		"\u0015N\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019V"+
		"\u0001\u0000\u0000\u0000\u001bX\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000"+
		"\u0000\u0000\u001f\\\u0001\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000"+
		"#b\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000\u0000\'h\u0001\u0000\u0000"+
		"\u0000)j\u0001\u0000\u0000\u0000+l\u0001\u0000\u0000\u0000-t\u0001\u0000"+
		"\u0000\u0000/y\u0001\u0000\u0000\u000012\u0005f\u0000\u000023\u0005u\u0000"+
		"\u000034\u0005n\u0000\u000045\u0005c\u0000\u00005\u0002\u0001\u0000\u0000"+
		"\u000067\u0005(\u0000\u00007\u0004\u0001\u0000\u0000\u000089\u0005)\u0000"+
		"\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005{\u0000\u0000;\b\u0001\u0000"+
		"\u0000\u0000<=\u0005}\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005;"+
		"\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005i\u0000\u0000AB\u0005n"+
		"\u0000\u0000BC\u0005t\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005"+
		"=\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005i\u0000\u0000GH\u0005"+
		"f\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005"+
		"l\u0000\u0000KL\u0005s\u0000\u0000LM\u0005e\u0000\u0000M\u0014\u0001\u0000"+
		"\u0000\u0000NO\u0005w\u0000\u0000OP\u0005h\u0000\u0000PQ\u0005i\u0000"+
		"\u0000QR\u0005l\u0000\u0000RS\u0005e\u0000\u0000S\u0016\u0001\u0000\u0000"+
		"\u0000TU\u0005+\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VW\u0005-\u0000"+
		"\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005*\u0000\u0000Y\u001c\u0001"+
		"\u0000\u0000\u0000Z[\u0005/\u0000\u0000[\u001e\u0001\u0000\u0000\u0000"+
		"\\]\u0005>\u0000\u0000]^\u0005=\u0000\u0000^ \u0001\u0000\u0000\u0000"+
		"_`\u0005<\u0000\u0000`a\u0005=\u0000\u0000a\"\u0001\u0000\u0000\u0000"+
		"bc\u0005=\u0000\u0000cd\u0005=\u0000\u0000d$\u0001\u0000\u0000\u0000e"+
		"f\u0005!\u0000\u0000fg\u0005=\u0000\u0000g&\u0001\u0000\u0000\u0000hi"+
		"\u0005>\u0000\u0000i(\u0001\u0000\u0000\u0000jk\u0005<\u0000\u0000k*\u0001"+
		"\u0000\u0000\u0000lp\u0007\u0000\u0000\u0000mo\u0007\u0001\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q,\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000su\u0007\u0002\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w.\u0001\u0000\u0000\u0000xz\u0007\u0003\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0006\u0017\u0000\u0000~0\u0001"+
		"\u0000\u0000\u0000\u0004\u0000pv{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}