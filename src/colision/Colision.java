/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colision;

import javax.swing.JFrame;

public class Colision extends JFrame {
    public Colision() {
       initUI();
    }

    private void initUI() {

        add(new Tablero());
        setSize(1024, 800);
        setTitle("Ejercicio 0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        Colision ex = new Colision();
        ex.setVisible(true);
       
    }
}
