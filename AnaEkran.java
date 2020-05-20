/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayintarlasi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author sena
 */
public class AnaEkran {
    protected int kolsayisi=9;
    protected int sütunsayisi=9;
    protected int mayin=10;
    JFrame frm=new JFrame("Minesweeper");
    
    public static void main(String [] args){
       
        AnaEkran ekrn=new AnaEkran();
        ekrn.ilkekran();  
        
    }  
     public void ilkekran(){
    
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new Mayin(9,9,10).getContent());
      frm.setSize(450,320);
      frm.setLocation(300,100);
      frm.setVisible(true);
      JMenuBar secenek=new JMenuBar();
      secenek.setSize(550,100);
      oyunsecenekleri(secenek);
      frm.setJMenuBar(secenek);
      frm.repaint();
      frm.revalidate();
}
     
     public void oyunsecenekleri(JMenuBar secenek){
   
        JMenu dosya=new JMenu("GAME");
        secenek.add(dosya);
        JMenuItem New=new JMenuItem("NEW");
        dosya.add(New);
        JMenuItem beginner=new JMenuItem("Beginner");
        dosya.add(beginner);
        JMenuItem intermediate=new JMenuItem("Intermediate");
        dosya.add(intermediate);
        JMenuItem expert=new JMenuItem("Expert");
        dosya.add(expert);
        JMenuItem exit=new JMenuItem("Exit");
        dosya.add(exit);
        
        
         exit.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent ae) {
               System.exit(0);                      
                  }
            }); 
         
         
           New.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent ae) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);            
                AnaEkran ekrn=new AnaEkran();
                JFrame frame=new JFrame("Minesweeper");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Mayin(9,9,10).getContent());
                frame.setSize(450,320);
                frame.setLocation(300,100); 
                frame.setVisible(true);
                JMenuBar secenek=new JMenuBar();
                frame.setJMenuBar(secenek);
                ekrn.oyunsecenekleri(secenek);
                ekrn.frm=frame;
                  }
            }); 
           
           
            beginner.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent ae) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                AnaEkran ekrn=new AnaEkran();
                JFrame frame=new JFrame("Minesweeper");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Mayin(9,9,10).getContent());
                frame.setSize(450,320);
                frame.setLocation(300,100);
                frame.setVisible(true);
                JMenuBar secenek=new JMenuBar();
                frame.setJMenuBar(secenek);
                ekrn.oyunsecenekleri(secenek); 
                ekrn.frm=frame;
                  }
            }); 
            
             intermediate.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent ae) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                AnaEkran ekrn=new AnaEkran();
                JFrame frame=new JFrame("Minesweeper");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Mayin(16,16,40).getContent());
                frame.setSize(830,500);
                frame.setLocation(300,50);
                frame.setVisible(true);  
                JMenuBar secenek=new JMenuBar();
                frame.setJMenuBar(secenek);
                ekrn.oyunsecenekleri(secenek);  
                ekrn.frm=frame;
                  }
            }); 
             
             
             expert.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent ae) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                AnaEkran ekrn=new AnaEkran();
                JFrame frame=new JFrame("Minesweeper");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Mayin(16,30,99).getContent());
                frame.setSize(1320,500);
                frame.setLocation(200,30);
                frame.setVisible(true);  
                JMenuBar secenek=new JMenuBar();
                frame.setJMenuBar(secenek);
                ekrn.oyunsecenekleri(secenek);   
                ekrn.frm=frame;
                  }
            }); 
            
}
}
   
