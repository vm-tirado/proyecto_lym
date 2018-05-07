/* Generated By:JavaCC: Do not edit this line. Proyecto.java */
package Proyecto;

public class Proyecto implements ProyectoConstants {

  static final public void one_line() throws ParseException {
    jj_consume_token(P_RED);
    jj_consume_token(PALABRA);
    contenido();
    jj_consume_token(FIN_RED);
  }

  static final public void contenido() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      declaracionVariable();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SITIO:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      declaracionSitio();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TRANSICION:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      declaracionTransicion();
    }
  }

  static final public void declaracionVariable() throws ParseException {
    jj_consume_token(VAR);
    jj_consume_token(PALABRA);
    jj_consume_token(IGUAL);
    jj_consume_token(NUMERO);
  }

  static final public void declaracionSitio() throws ParseException {
    jj_consume_token(SITIO);
    jj_consume_token(DOS_PUNTOS);
    jj_consume_token(PALABRA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case capacidad:
      jj_consume_token(capacidad);
      jj_consume_token(DOS_PUNTOS_IGUAL);
      jj_consume_token(NUMERO);
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    jj_consume_token(marcacion_i);
    jj_consume_token(DOS_PUNTOS_IGUAL);
    jj_consume_token(NUMERO);
  }

  static final public void declaracionTransicion() throws ParseException {
    jj_consume_token(TRANSICION);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PALABRA:
      transicionTipo1();
      break;
    case PARENTESIS_ABIERTO:
      transicionTipo2();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void transicionTipo1() throws ParseException {
    jj_consume_token(PALABRA);
  }

  static final public void transicionTipo2() throws ParseException {
    jj_consume_token(PARENTESIS_ABIERTO);
    jj_consume_token(PALABRA);
    jj_consume_token(COMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case UNIFORME:
      transicionUniforme();
      break;
    case EXPONENCIAL:
      transicionExponencial();
      break;
    case DETERMINISTICO:
      transicionDeterministico();
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PARENTESIS_CERRADO);
  }

  static final public void transicionUniforme() throws ParseException {
    jj_consume_token(UNIFORME);
    jj_consume_token(COMA);
    jj_consume_token(NUMERO);
    jj_consume_token(COMA);
    jj_consume_token(NUMERO);
  }

  static final public void transicionExponencial() throws ParseException {
    jj_consume_token(EXPONENCIAL);
    jj_consume_token(COMA);
    jj_consume_token(NUMERO);
    jj_consume_token(COMA);
    jj_consume_token(NUMERO);
  }

  static final public void transicionDeterministico() throws ParseException {
    jj_consume_token(DETERMINISTICO);
    jj_consume_token(COMA);
    jj_consume_token(NUMERO);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ProyectoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x8000,0x10000,0x40000,0x400000,0x10000400,0x380000,};
   }

  /** Constructor with InputStream. */
  public Proyecto(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Proyecto(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ProyectoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Proyecto(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ProyectoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Proyecto(ProyectoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ProyectoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[30];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 6; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
