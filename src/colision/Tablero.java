/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colision;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import jdk.internal.dynalink.support.AbstractRelinkableCallSite;


public class Tablero extends JPanel implements ActionListener{
    private int xref;
    private int yref;
    private int xGato;
    private int numImagen ;
    private Timer timer; 
    
    public Tablero(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        this.xref = 10;
        this.yref = 0;
        this.xGato = 0;
        this.numImagen = 0;
        this.timer = new Timer(25 , this);
        this.timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        
        Image cielo = loadImage("blue_background.png");
        for (int i = 0; i < 47; i++) {
            int x = 22;
            g.drawImage(cielo, x*i, 0, this);
        }
        
        Image tierra = loadImage("ground_loop.png");
        for (int i = 0; i < 9; i++) {
            int x = 112;
            g.drawImage(tierra, i*x, 695 , this);
        }
        
        
        Image walk = loadImage("walking.png");
        g.drawImage(walk, this.xGato, 561, (this.xGato+116), (561+134), (this.numImagen*116), 0, (this.numImagen*116) + 116, 134, this);
        
        
        /*
        if(carro.intersects(oval)){
          this.timer.stop();
        }*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xref++;
        this.yref++;
        this.xGato++;
        this.numImagen++;
        
        if(this.numImagen == 4)
           this.numImagen=0;
        else
          repaint();
    }
    
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    private class TAdapter extends KeyAdapter{
       
        public void keyReleased(KeyEvent e){
            
            int key = e.getKeyCode();
            
            if (key == KeyEvent.VK_SPACE){
                System.out.println("VK_SPACE");
            }
        }
        
        @Override
        public void keyPressed(KeyEvent e){
            
        }
    }  
}
