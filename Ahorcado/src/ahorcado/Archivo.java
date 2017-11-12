/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.io.*;
import java.util.*;

/**
 *
 * @author GUSTAVOADOLFO
 */
public class Archivo {
    private String palabra;
    private String frase;
    private String texto;
    private Niveles nivel;
    private ArrayList<Niveles> hola = new ArrayList<>();
    
    
    
    public void cargar(String ruta){  
       File lectura = new File(ruta);
       Scanner sc = null;
       String tipo;
       nivel = new Niveles();
       
       if(lectura.exists()){
           try{
               sc = new Scanner(lectura);
               sc.useDelimiter(",");
                   
               while(sc.hasNext()){
                   
                   tipo = sc.next().trim();
                   
                   if(tipo.equals("p")){
                       palabra = sc.next().trim();
                       nivel.setPalabras(palabra);
                   }
                   if(tipo.equals("f")){
                       frase = sc.next();
                       nivel.setFrases(frase);
                   }
                   if(tipo.equals("t")){
                       texto = sc.next();
                       nivel.setTextos(texto);
                   }
               }
           
           }catch (FileNotFoundException ex){
               System.out.println("No se encuentra el archivo: " + ruta);
           }
           
       }
    }
}