
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jul 08 10:51:56 CDT 2019
//----------------------------------------------------

package AnalizadorLS;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jul 08 10:51:56 CDT 2019
  */
public class ASintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ASintactico() {super();}

  /** Constructor which sets the default scanner. */
  public ASintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ASintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\002\000\002\002" +
    "\003\000\002\011\004\000\002\011\003\000\002\003\003" +
    "\000\002\003\004\000\002\004\005\000\002\004\004\000" +
    "\002\007\006\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\006\002\000\010\004\001\002\000\006\005" +
    "\017\014\016\001\002\000\004\015\015\001\002\000\006" +
    "\002\ufffd\010\ufffd\001\002\000\006\002\uffff\010\004\001" +
    "\002\000\006\002\ufffc\010\ufffc\001\002\000\004\002\012" +
    "\001\002\000\004\002\001\001\002\000\006\002\ufffb\010" +
    "\ufffb\001\002\000\006\002\ufffe\010\ufffe\001\002\000\006" +
    "\002\ufff9\010\ufff9\001\002\000\004\010\025\001\002\000" +
    "\004\012\021\001\002\000\004\006\024\001\002\000\004" +
    "\017\022\001\002\000\004\012\023\001\002\000\004\006" +
    "\ufff7\001\002\000\010\002\ufff8\010\ufff8\015\ufff8\001\002" +
    "\000\004\005\017\001\002\000\006\002\ufffa\010\ufffa\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\014\002\010\003\005\004\007\007\004\011" +
    "\006\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\013\004\007\007\004\001\001\000" +
    "\004\005\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\025\001\001\000\004\010\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ASintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ASintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ASintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    static ALexico scanner=null;

     public void syntax_error(Symbol cur_token){
     System.err.println("Error fatal.");
     report_error("Error de sintaxis:linea" + scanner.linea() +
     ", columna " + scanner.columna(), null);
    }
      
    public static void main(String[] args) {
        ASintactico Parser = null;
    try{
        scanner =new ALexico(new java.io.FileReader("src\\AnalizadorLS\\programa.txt"));
        Parser= new ASintactico(scanner);
        Parser.parse();
    
    }catch (java.io.FileNotFoundException e){
        System.out.println("File not found :  \"" + "programa.txt" + "\"");
        
    }catch(java.io.IOException e){
    System.out.println("IO error scanning file \"" + "programa.txt" + "\"");
    
    System.out.println(e);
    }catch (Exception e){
     System.out.println("Unexpected exception:");
        }
      }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ASintactico$actions {
  private final ASintactico parser;

  /** Constructor */
  CUP$ASintactico$actions(ASintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ASintactico$do_action(
    int                        CUP$ASintactico$act_num,
    java_cup.runtime.lr_parser CUP$ASintactico$parser,
    java.util.Stack            CUP$ASintactico$stack,
    int                        CUP$ASintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ASintactico$result;

      /* select the action based on the action number */
      switch (CUP$ASintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // sentencia ::= NUMREAL PUNYCO NUMREAL 
            {
              Object RESULT =null;

              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("sentencia",6, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // sentencias ::= ID PARA sentencia PARC 
            {
              Object RESULT =null;

              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("sentencias",5, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-3)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // parteIF ::= sentencias LLAVEC 
            {
              Object RESULT =null;

              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("parteIF",2, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // parteIF ::= ID LLAVEA sentencias 
            {
              Object RESULT =null;

              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("parteIF",2, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // estructuraIF ::= parteIF parteELSE 
            {
              Object RESULT =null;
		System.out.println("* IF ELSE COMPLETO *");  
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("estructuraIF",1, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // estructuraIF ::= parteIF 
            {
              Object RESULT =null;
		System.out.println("* cuadrado correcto *");
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("estructuraIF",1, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // estructuraIFELSE ::= estructuraIF 
            {
              Object RESULT =null;

              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("estructuraIFELSE",7, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // estructuraIFELSE ::= estructuraIFELSE estructuraIF 
            {
              Object RESULT =null;

              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("estructuraIFELSE",7, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= estructuraIFELSE 
            {
              Object RESULT =null;
		System.out.println("*ANALISIS COMPLETO*"); 
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= 
            {
              Object RESULT =null;
		System.out.println("*VACIO*");  
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).value;
		RESULT = start_val;
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ASintactico$parser.done_parsing();
          return CUP$ASintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

