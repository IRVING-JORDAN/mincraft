package AnalizadorLS; //nombre del paquete en el que se encuentra el analizador

import java_cup.runtime.*;  //se importa la libreria habitual runtime de CUP

%%
%class ALexico      //Se generara un fichero Alexico.java que
                    //incluira la clase Alexico 
%standalone         //La clase Alexico incluirá la función main,
                    //esta función recibirá como argumento el
                    //fichero de texto a analizar
%line               // conmuta la línea contando se puede acceder al número 
                    //de línea actual a través de la variable yyline
%column             //cambia la columna contando se accede a la columna actual 
                    //através de yycolumn
%cup                //cambia al modo de compatibilidad CUP para interactuar 
                    //con un analizador generado por CUP. */

%{
        private Symbol symbol (int type){        
        return  new Symbol(type, yyline , yycolumn);
            }
        private Symbol symbol (int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
        }

public boolean esEOF(){
return zzAtEOF;
}
public int linea(){return yyline+1;}
public int columna(){return yycolumn+1;}

%}

    espacio = [\n\r\t\f ]+
    entero = [1-9][0-9]*
    real = {entero}("."[0-9]+)?
    opRel = ("<"|"<="|">"|">="|"=="|"!=")
    Dato = ("int"|"double"|"char"|"float"|"boolean"|"byte"|"short"|"long")
    identificador = [A-Za-z_][A-Za-z_0-9]*
    comentarioDP="/*"[^"*/"]*"*/"
%%
    "("                 {return symbol (sym.PARA); }
    ")"                 {return symbol (sym.PARC); }
    "{"                 {return symbol (sym.LLAVEA); }
    "}"                 {return symbol (sym.LLAVEC); }
    "="                 {return symbol (sym.IGUAL); }
    ";"                 {return symbol (sym.PUNYCO); }
   
    {Dato}              {return symbol (sym.DATO);}
    {opRel}            {return symbol (sym.OPREL); }
    {real}              {return symbol (sym.NUMREAL); }
    {identificador}     {return symbol (sym.ID); }
     {comentarioDP}   {/*ignorar comentarios*/}

    {espacio}           { }
    .                  { System.out.print ("Error lexico: " + yytext());
                        System.out.println("    Linea:" + (yyline+1) ); }
    