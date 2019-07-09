/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorLS;

/**
 *
 * @author juan
 */
public class Compilacup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opciones[] = new String[5];
        //sleccionamos la opcion de direccion de destino
          opciones[0]= "-destdir";
          //damos la direccion 
          opciones[1]= "src\\AnalizadorLS\\";
          //Seleccionamos la opcion de nombre del archivo 
          opciones[2]="-parser";
          //Le damos el nombre que queramos
          opciones[3]="ASintactico";
          //le decimos donde se muestra el archivo .cup
          opciones[4]="src\\AnalizadorLS\\espsintIF.cup";
     try {
         java_cup.Main.main(opciones);
     } catch (Exception e) {
     System.out.print(e);
     
     }
   }
 }
    
