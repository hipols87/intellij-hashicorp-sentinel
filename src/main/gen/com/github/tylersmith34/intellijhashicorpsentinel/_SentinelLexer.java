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
 * from the specification file <tt>Sentinel.flex</tt>
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
    "\11\0\1\6\1\2\2\5\1\2\22\0\1\6\1\0\1\7\1\21\3\0\1\11\1\27\1\30\1\22\1\17\1"+
    "\31\1\12\1\15\1\20\1\13\11\4\3\0\1\32\3\0\2\3\1\54\1\3\1\16\1\57\5\3\1\56"+
    "\5\3\1\55\10\3\1\23\1\10\1\24\1\0\1\3\1\0\1\40\1\61\1\46\1\44\1\36\1\37\1"+
    "\53\1\3\1\45\1\62\1\3\1\41\1\50\1\43\1\52\1\51\1\3\1\34\1\42\1\33\1\35\1\47"+
    "\1\3\1\14\1\60\1\3\1\25\1\0\1\26\7\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\4\1\1\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\17\3\2\0\1\5\2\0\1\6"+
    "\1\0\1\20\7\3\1\21\13\3\2\4\1\0\1\20"+
    "\13\3\1\22\3\3\1\23\3\3\1\20\1\24\1\25"+
    "\2\3\1\26\2\3\1\27\1\3\1\30\3\3\1\31"+
    "\2\3\1\32\2\3\1\33\1\34\3\3\1\35\1\36"+
    "\1\3\1\37\1\3\1\40\1\3\1\41\1\42\1\3"+
    "\1\43\1\3\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[122];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u01cb\0\u01fe\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f\0\u0462\0\u0495"+
    "\0\u04c8\0\u04fb\0\u052e\0\u0561\0\63\0\u0594\0\u05c7\0\63"+
    "\0\u05fa\0\u062d\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f"+
    "\0\u0792\0\231\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4"+
    "\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0a29"+
    "\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1"+
    "\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\231\0\u0cc0\0\u0cf3\0\u0d26"+
    "\0\231\0\u0d59\0\u0d8c\0\u0dbf\0\63\0\231\0\231\0\u0df2"+
    "\0\u0e25\0\231\0\u0e58\0\u0e8b\0\231\0\u0ebe\0\231\0\u0ef1"+
    "\0\u0f24\0\u0f57\0\231\0\u0f8a\0\u0fbd\0\231\0\u0ff0\0\u1023"+
    "\0\231\0\231\0\u1056\0\u1089\0\u10bc\0\231\0\231\0\u10ef"+
    "\0\231\0\u1122\0\231\0\u1155\0\231\0\231\0\u1188\0\231"+
    "\0\u11bb\0\231";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[122];
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
    "\1\10\1\11\1\4\1\2\1\4\1\2\1\12\1\13"+
    "\1\2\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\4\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\4\1\36\1\37\1\40"+
    "\1\41\1\4\1\42\6\4\65\0\1\3\2\0\2\3"+
    "\57\0\2\4\6\0\2\4\1\0\1\4\14\0\30\4"+
    "\4\0\1\5\6\0\1\5\1\0\1\43\1\44\17\0"+
    "\1\44\24\0\2\6\1\0\4\6\1\45\1\46\52\6"+
    "\2\7\1\0\5\7\1\47\1\50\51\7\4\0\1\5"+
    "\6\0\1\11\53\0\1\5\6\0\1\5\1\51\1\43"+
    "\1\44\17\0\1\44\44\0\1\13\1\0\1\52\40\0"+
    "\1\13\2\0\2\13\1\0\55\13\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\1\4\1\53\26\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\2\4\1\54"+
    "\1\55\24\4\3\0\2\4\6\0\2\4\1\0\1\4"+
    "\14\0\10\4\1\56\17\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\2\4\1\57\2\4\1\60\22\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\1\4"+
    "\1\61\5\4\1\62\20\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\12\4\1\63\15\4\3\0\2\4"+
    "\6\0\2\4\1\0\1\4\14\0\1\64\27\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\2\4\1\65"+
    "\25\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\3\4\1\66\24\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\10\4\1\67\4\4\1\70\12\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\5\4\1\71"+
    "\22\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\5\4\1\72\22\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\5\4\1\73\22\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\26\4\1\74\1\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\22\4\1\75"+
    "\5\4\4\0\1\76\6\0\1\76\53\0\1\77\5\0"+
    "\1\100\1\77\3\0\1\100\43\0\2\6\1\0\60\6"+
    "\2\7\1\0\60\7\4\0\1\5\6\0\1\5\47\0"+
    "\22\52\1\101\40\52\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\2\4\1\102\25\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\6\4\1\103\21\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\1\104\27\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\11\4"+
    "\1\105\16\4\3\0\2\4\6\0\2\4\1\0\1\4"+
    "\14\0\10\4\1\106\17\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\6\4\1\107\21\4\3\0\2\4"+
    "\6\0\2\4\1\0\1\4\14\0\1\4\1\110\26\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\7\4"+
    "\1\111\20\4\3\0\2\4\6\0\2\4\1\0\1\4"+
    "\14\0\1\4\1\112\26\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\6\4\1\113\21\4\3\0\2\4"+
    "\6\0\2\4\1\0\1\4\14\0\4\4\1\114\23\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\1\115"+
    "\27\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\16\4\1\116\11\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\6\4\1\117\21\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\12\4\1\120\3\4\1\121"+
    "\11\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\1\4\1\122\26\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\27\4\1\123\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\23\4\1\124\4\4\4\0\1\76"+
    "\6\0\1\76\2\0\1\44\17\0\1\44\30\0\1\77"+
    "\6\0\1\77\47\0\20\52\1\125\42\52\3\0\2\4"+
    "\6\0\2\4\1\0\1\4\14\0\3\4\1\126\24\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\3\4"+
    "\1\127\24\4\3\0\2\4\6\0\2\4\1\0\1\4"+
    "\14\0\2\4\1\130\25\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\3\4\1\131\24\4\3\0\2\4"+
    "\6\0\2\4\1\0\1\4\14\0\13\4\1\132\14\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\7\4"+
    "\1\133\20\4\3\0\2\4\6\0\2\4\1\0\1\4"+
    "\14\0\5\4\1\134\22\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\1\135\27\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\12\4\1\136\15\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\6\4\1\137"+
    "\21\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\5\4\1\140\22\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\17\4\1\141\10\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\2\4\1\142\25\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\10\4\1\143"+
    "\17\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\5\4\1\144\22\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\3\4\1\145\24\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\24\4\1\146\3\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\1\4\1\147"+
    "\26\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\4\4\1\150\23\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\3\4\1\151\24\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\25\4\1\152\2\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\10\4\1\153"+
    "\17\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\2\4\1\154\25\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\1\4\1\155\26\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\3\4\1\156\24\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\15\4\1\157"+
    "\12\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\13\4\1\160\14\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\10\4\1\161\17\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\12\4\1\162\15\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\20\4\1\163"+
    "\7\4\3\0\2\4\6\0\2\4\1\0\1\4\14\0"+
    "\6\4\1\164\21\4\3\0\2\4\6\0\2\4\1\0"+
    "\1\4\14\0\1\165\27\4\3\0\2\4\6\0\2\4"+
    "\1\0\1\4\14\0\1\166\27\4\3\0\2\4\6\0"+
    "\2\4\1\0\1\4\14\0\10\4\1\167\17\4\3\0"+
    "\2\4\6\0\2\4\1\0\1\4\14\0\1\170\27\4"+
    "\3\0\2\4\6\0\2\4\1\0\1\4\14\0\3\4"+
    "\1\171\24\4\3\0\2\4\6\0\2\4\1\0\1\4"+
    "\14\0\11\4\1\172\16\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4590];
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
    "\1\0\1\11\11\1\10\11\17\1\2\0\1\11\2\0"+
    "\1\11\1\0\26\1\1\0\24\1\1\11\45\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[122];
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
          case 37: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 38: break;
          case 3: 
            { return IDENTIFIER;
            } 
            // fall through
          case 39: break;
          case 4: 
            { return NUMBER;
            } 
            // fall through
          case 40: break;
          case 5: 
            { return DOUBLE_QUOTED_STRING;
            } 
            // fall through
          case 41: break;
          case 6: 
            { return SINGLE_QUOTED_STRING;
            } 
            // fall through
          case 42: break;
          case 7: 
            { return COMMENT;
            } 
            // fall through
          case 43: break;
          case 8: 
            { return L_BRACKET;
            } 
            // fall through
          case 44: break;
          case 9: 
            { return R_BRACKET;
            } 
            // fall through
          case 45: break;
          case 10: 
            { return L_CURLY;
            } 
            // fall through
          case 46: break;
          case 11: 
            { return R_CURLY;
            } 
            // fall through
          case 47: break;
          case 12: 
            { return L_PAREN;
            } 
            // fall through
          case 48: break;
          case 13: 
            { return R_PAREN;
            } 
            // fall through
          case 49: break;
          case 14: 
            { return COMMA;
            } 
            // fall through
          case 50: break;
          case 15: 
            { return EQUALS;
            } 
            // fall through
          case 51: break;
          case 16: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 52: break;
          case 17: 
            { return AS;
            } 
            // fall through
          case 53: break;
          case 18: 
            { return INT;
            } 
            // fall through
          case 54: break;
          case 19: 
            { return MAP;
            } 
            // fall through
          case 55: break;
          case 20: 
            { return TRUE;
            } 
            // fall through
          case 56: break;
          case 21: 
            { return RULE;
            } 
            // fall through
          case 57: break;
          case 22: 
            { return FUNC;
            } 
            // fall through
          case 58: break;
          case 23: 
            { return LIST;
            } 
            // fall through
          case 59: break;
          case 24: 
            { return NULL;
            } 
            // fall through
          case 60: break;
          case 25: 
            { return MAIN;
            } 
            // fall through
          case 61: break;
          case 26: 
            { return CRLF;
            } 
            // fall through
          case 62: break;
          case 27: 
            { return FALSE;
            } 
            // fall through
          case 63: break;
          case 28: 
            { return ARRAY;
            } 
            // fall through
          case 64: break;
          case 29: 
            { return VALUE;
            } 
            // fall through
          case 65: break;
          case 30: 
            { return PARAM;
            } 
            // fall through
          case 66: break;
          case 31: 
            { return RETURN;
            } 
            // fall through
          case 67: break;
          case 32: 
            { return STRING;
            } 
            // fall through
          case 68: break;
          case 33: 
            { return IMPORT;
            } 
            // fall through
          case 69: break;
          case 34: 
            { return OBJECT;
            } 
            // fall through
          case 70: break;
          case 35: 
            { return DEFAULT;
            } 
            // fall through
          case 71: break;
          case 36: 
            { return UNDEFINED;
            } 
            // fall through
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
