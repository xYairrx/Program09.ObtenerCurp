/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program09.obtenercurp;

/**
 *
 * @author Yair
 */
public class Program09ObtenerCurp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenerarCurp generar = new GenerarCurp("Yair Ernesto", 
                "Almanza", 
                "Guzman", 
                2001, 
                9, 
                30, 
                "Masculino", 
                "Estado de México");
        
        generar.generarCurp();
        
    }
    
}