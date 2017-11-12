/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.ArrayList;

/**
 *
 * @author GUSTAVOADOLFO
 */
public class Ahorcado {
    public static void main(String[] args){
        Tablero tablero = new Tablero();
        Archivo archivo = new Archivo();
        Niveles niveles = new Niveles();
        ArrayList<String> al = new ArrayList();
        
        archivo.cargar("Palabras.dat");
        
        
        
        int b = 0;
        
        tablero.setTitle("Ahorcado");
        //tablero.setVisible(true);
        
        
    }
    
}