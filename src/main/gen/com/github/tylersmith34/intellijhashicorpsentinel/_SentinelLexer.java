/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_SentinelLexer.flex</tt>
 */
public class _SentinelLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\6\1\2\2\5\1\2\22\0\1\6\1\36\1\7\1\13\1\0\1\34\1\0\1\11\1\27\1\30\1"+
    "\14\1\22\1\31\1\15\1\20\1\12\1\16\11\4\1\35\1\0\1\33\1\32\1\37\2\0\4\3\1\21"+
    "\25\3\1\23\1\10\1\24\1\0\1\3\1\0\1\46\1\61\1\60\1\50\1\51\1\52\1\3\1\57\1"+
    "\40\1\3\1\62\1\54\1\41\1\55\1\43\1\42\1\3\1\44\1\47\1\45\1\53\1\3\1\56\1\17"+
    "\1\63\1\3\1\25\1\0\1\26\7\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\4\1\3\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\17\3\2\0\1\5\2\0"+
    "\1\6\1\32\1\0\1\3\1\33\1\34\1\35\1\36"+
    "\1\3\1\37\1\40\1\41\2\3\1\42\3\3\1\43"+
    "\17\3\2\4\1\0\1\32\1\44\7\3\1\45\1\46"+
    "\1\47\3\3\1\50\3\3\1\51\5\3\1\32\1\3"+
    "\1\52\3\3\1\53\1\54\1\3\1\55\2\3\1\56"+
    "\1\3\1\57\1\60\1\3\1\61\3\3\1\62\3\3"+
    "\1\63\3\3\1\64\1\65\1\3\1\66\1\3\1\67"+
    "\3\3\1\70\1\71\4\3\1\72\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[157];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\64\0\u01d4\0\u0208\0\u023c\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\u0270\0\u02a4"+
    "\0\64\0\64\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc"+
    "\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c"+
    "\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\64\0\u06b4\0\u06e8"+
    "\0\64\0\u071c\0\u0750\0\u0784\0\64\0\64\0\64\0\64"+
    "\0\u07b8\0\234\0\234\0\234\0\u07ec\0\u0820\0\234\0\u0854"+
    "\0\u0888\0\u08bc\0\234\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0"+
    "\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60"+
    "\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c30\0\u0c64\0\234\0\u0c98"+
    "\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\234\0\234"+
    "\0\234\0\u0e04\0\u0e38\0\u0e6c\0\234\0\u0ea0\0\u0ed4\0\u0f08"+
    "\0\234\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\64\0\u1040"+
    "\0\234\0\u1074\0\u10a8\0\u10dc\0\234\0\234\0\u1110\0\234"+
    "\0\u1144\0\u1178\0\234\0\u11ac\0\234\0\234\0\u11e0\0\234"+
    "\0\u1214\0\u1248\0\u127c\0\234\0\u12b0\0\u12e4\0\u1318\0\234"+
    "\0\u134c\0\u1380\0\u13b4\0\234\0\234\0\u13e8\0\234\0\u141c"+
    "\0\234\0\u1450\0\u1484\0\u14b8\0\234\0\234\0\u14ec\0\u1520"+
    "\0\u1554\0\u1588\0\234\0\234\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[157];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\2\3\1\6\1\2\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\4"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\4\1\44\1\45"+
    "\1\46\1\47\1\4\1\50\1\51\1\4\1\52\1\53"+
    "\2\4\66\0\1\3\2\0\2\3\60\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\24\4\4\0\1\5\11\0"+
    "\1\5\1\0\1\54\1\55\27\0\1\55\12\0\2\6"+
    "\1\0\4\6\1\56\1\57\53\6\2\7\1\0\5\7"+
    "\1\60\1\61\52\7\12\0\1\11\1\0\1\62\47\0"+
    "\1\11\2\0\2\11\1\0\56\11\4\0\1\5\11\0"+
    "\1\14\51\0\1\5\11\0\1\5\1\63\1\54\1\55"+
    "\27\0\1\55\15\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\3\4\1\64\20\4\32\0\1\65\63\0\1\66"+
    "\63\0\1\67\63\0\1\70\34\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\1\4\1\71\5\4\1\72\2\4"+
    "\1\73\2\4\1\74\6\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\6\4\1\75\15\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\6\4\1\76\15\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\4\4"+
    "\1\77\17\4\3\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\11\4\1\100\1\4\1\101\10\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\4\4\1\102\17\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\7\4"+
    "\1\103\4\4\1\104\1\105\6\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\11\4\1\106\12\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\14\4\1\107"+
    "\7\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\1\110\2\4\1\111\2\4\1\112\4\4\1\113\10\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\15\4"+
    "\1\114\6\4\3\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\3\4\1\115\7\4\1\116\10\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\17\4\1\117\4\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\3\4"+
    "\1\120\2\4\1\121\15\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\4\4\1\122\17\4\4\0\1\123"+
    "\11\0\1\123\51\0\1\124\10\0\1\125\1\124\3\0"+
    "\1\125\41\0\2\6\1\0\61\6\2\7\1\0\61\7"+
    "\14\62\1\126\47\62\4\0\1\5\11\0\1\5\50\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\4\4\1\127"+
    "\17\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\2\4\1\130\21\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\1\131\4\4\1\132\16\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\4\4\1\133\17\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\5\4"+
    "\1\134\16\4\3\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\14\4\1\135\7\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\13\4\1\136\10\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\14\4\1\137\7\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\10\4"+
    "\1\140\12\4\1\141\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\12\4\1\142\11\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\7\4\1\143\14\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\14\4\1\144"+
    "\7\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\4\4\1\145\17\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\14\4\1\146\7\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\15\4\1\147\6\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\10\4\1\150"+
    "\13\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\5\4\1\151\16\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\14\4\1\152\7\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\11\4\1\153\12\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\15\4\1\154"+
    "\6\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\7\4\1\155\14\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\11\4\1\156\12\4\4\0\1\123\11\0"+
    "\1\123\2\0\1\55\27\0\1\55\16\0\1\124\11\0"+
    "\1\124\45\0\12\62\1\157\51\62\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\3\4\1\160\20\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\15\4\1\161"+
    "\6\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\20\4\1\162\3\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\6\4\1\163\15\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\13\4\1\164\10\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\11\4\1\165"+
    "\12\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\11\4\1\166\12\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\6\4\1\167\15\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\11\4\1\170\12\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\5\4\1\171"+
    "\16\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\7\4\1\172\14\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\20\4\1\173\3\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\11\4\1\174\12\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\14\4\1\175"+
    "\7\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\15\4\1\176\6\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\5\4\1\177\16\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\11\4\1\200\12\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\6\4\1\201"+
    "\15\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\4\4\1\202\17\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\17\4\1\203\4\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\1\4\1\204\22\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\4\4\1\205"+
    "\17\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\13\4\1\206\10\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\11\4\1\207\12\4\3\0\2\4\11\0"+
    "\2\4\1\0\1\4\16\0\11\4\1\210\12\4\3\0"+
    "\2\4\11\0\2\4\1\0\1\4\16\0\12\4\1\211"+
    "\11\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\1\212\5\4\1\213\15\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\22\4\1\214\1\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\5\4\1\215\16\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\11\4"+
    "\1\216\12\4\3\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\15\4\1\217\6\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\14\4\1\220\7\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\4\4\1\221\17\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\1\222"+
    "\23\4\3\0\2\4\11\0\2\4\1\0\1\4\16\0"+
    "\15\4\1\223\6\4\3\0\2\4\11\0\2\4\1\0"+
    "\1\4\16\0\1\224\23\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\7\4\1\225\14\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\5\4\1\226\16\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\15\4"+
    "\1\227\6\4\3\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\13\4\1\230\10\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\15\4\1\231\6\4\3\0\2\4"+
    "\11\0\2\4\1\0\1\4\16\0\11\4\1\232\12\4"+
    "\3\0\2\4\11\0\2\4\1\0\1\4\16\0\11\4"+
    "\1\233\12\4\3\0\2\4\11\0\2\4\1\0\1\4"+
    "\16\0\7\4\1\234\14\4\3\0\2\4\11\0\2\4"+
    "\1\0\1\4\16\0\10\4\1\235\13\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5564];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\3\1\11\11\2\1\2\11"+
    "\21\1\2\0\1\11\2\0\1\11\1\1\1\0\1\1"+
    "\4\11\34\1\1\0\31\1\1\11\56\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[157];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _SentinelLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SentinelLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 61: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 62: break;
          case 3: 
            { return IDENTIFIER;
            } 
            // fall through
          case 63: break;
          case 4: 
            { return NUMBER;
            } 
            // fall through
          case 64: break;
          case 5: 
            { return DOUBLE_QUOTED_STRING;
            } 
            // fall through
          case 65: break;
          case 6: 
            { return SINGLE_QUOTED_STRING;
            } 
            // fall through
          case 66: break;
          case 7: 
            { return SLASH;
            } 
            // fall through
          case 67: break;
          case 8: 
            { return COMMENT;
            } 
            // fall through
          case 68: break;
          case 9: 
            { return SPLAT;
            } 
            // fall through
          case 69: break;
          case 10: 
            { return MINUS;
            } 
            // fall through
          case 70: break;
          case 11: 
            { return PERIOD;
            } 
            // fall through
          case 71: break;
          case 12: 
            { return PLUS;
            } 
            // fall through
          case 72: break;
          case 13: 
            { return L_BRACKET;
            } 
            // fall through
          case 73: break;
          case 14: 
            { return R_BRACKET;
            } 
            // fall through
          case 74: break;
          case 15: 
            { return L_CURLY;
            } 
            // fall through
          case 75: break;
          case 16: 
            { return R_CURLY;
            } 
            // fall through
          case 76: break;
          case 17: 
            { return L_PAREN;
            } 
            // fall through
          case 77: break;
          case 18: 
            { return R_PAREN;
            } 
            // fall through
          case 78: break;
          case 19: 
            { return COMMA;
            } 
            // fall through
          case 79: break;
          case 20: 
            { return EQUALS;
            } 
            // fall through
          case 80: break;
          case 21: 
            { return LESS_THAN;
            } 
            // fall through
          case 81: break;
          case 22: 
            { return PERCENT;
            } 
            // fall through
          case 82: break;
          case 23: 
            { return COLON;
            } 
            // fall through
          case 83: break;
          case 24: 
            { return EXCLAMATION;
            } 
            // fall through
          case 84: break;
          case 25: 
            { return GREATER_THAN;
            } 
            // fall through
          case 85: break;
          case 26: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 86: break;
          case 27: 
            { return DOUBLE_EQUALS;
            } 
            // fall through
          case 87: break;
          case 28: 
            { return LESS_THAN_EQUALS;
            } 
            // fall through
          case 88: break;
          case 29: 
            { return NOT_EQUALS;
            } 
            // fall through
          case 89: break;
          case 30: 
            { return GREATER_THAN_EQUALS;
            } 
            // fall through
          case 90: break;
          case 31: 
            { return IS;
            } 
            // fall through
          case 91: break;
          case 32: 
            { return IF;
            } 
            // fall through
          case 92: break;
          case 33: 
            { return IN;
            } 
            // fall through
          case 93: break;
          case 34: 
            { return OR;
            } 
            // fall through
          case 94: break;
          case 35: 
            { return AS;
            } 
            // fall through
          case 95: break;
          case 36: 
            { return XOR;
            } 
            // fall through
          case 96: break;
          case 37: 
            { return ALL;
            } 
            // fall through
          case 97: break;
          case 38: 
            { return AND;
            } 
            // fall through
          case 98: break;
          case 39: 
            { return ANY;
            } 
            // fall through
          case 99: break;
          case 40: 
            { return FOR;
            } 
            // fall through
          case 100: break;
          case 41: 
            { return NOT;
            } 
            // fall through
          case 101: break;
          case 42: 
            { return MAIN;
            } 
            // fall through
          case 102: break;
          case 43: 
            { return RULE;
            } 
            // fall through
          case 103: break;
          case 44: 
            { return TRUE;
            } 
            // fall through
          case 104: break;
          case 45: 
            { return ELSE;
            } 
            // fall through
          case 105: break;
          case 46: 
            { return FUNC;
            } 
            // fall through
          case 106: break;
          case 47: 
            { return NULL;
            } 
            // fall through
          case 107: break;
          case 48: 
            { return WHEN;
            } 
            // fall through
          case 108: break;
          case 49: 
            { return CASE;
            } 
            // fall through
          case 109: break;
          case 50: 
            { return PARAM;
            } 
            // fall through
          case 110: break;
          case 51: 
            { return FALSE;
            } 
            // fall through
          case 111: break;
          case 52: 
            { return BREAK;
            } 
            // fall through
          case 112: break;
          case 53: 
            { return IMPORT;
            } 
            // fall through
          case 113: break;
          case 54: 
            { return RETURN;
            } 
            // fall through
          case 114: break;
          case 55: 
            { return FILTER;
            } 
            // fall through
          case 115: break;
          case 56: 
            { return MATCHES;
            } 
            // fall through
          case 116: break;
          case 57: 
            { return DEFAULT;
            } 
            // fall through
          case 117: break;
          case 58: 
            { return CONTINUE;
            } 
            // fall through
          case 118: break;
          case 59: 
            { return CONTAINS;
            } 
            // fall through
          case 119: break;
          case 60: 
            { return UNDEFINED;
            } 
            // fall through
          case 120: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
