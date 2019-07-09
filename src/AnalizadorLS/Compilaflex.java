/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorLS;

import java.io.File;

/**
 *
 * @author juan
 */
public class Compilaflex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  jflex.Main.generate(new File("src\\AnalizadorLS\\esplexIF.flex"));
    }
    
}
