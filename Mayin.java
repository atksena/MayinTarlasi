/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayintarlasi;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;


/**
 *
 * @author sena
 */
public class Mayin extends MayinTarlasi implements ActionListener{
    protected int kolsayisi;
    protected int sütnsayisi;
    protected int mayinsayisi; 
    JButton [][] buton;
    int[][] mayin;
    int can;

   
    public void actionPerformed(ActionEvent ae) {
   
    
     JButton btn=(JButton)ae.getSource();
     Point resim=getArrayLocation(btn);
     if(mayin[resim.x][resim.y]<0){
        buton[resim.x][resim.y].setText(""); 
        oyunbitti();
     }
     else if(mayin[resim.x][resim.y]>0){
         if(buton[resim.x][resim.y].getActionCommand()=="Doldur"){                     
         if(mayin[resim.x][resim.y]==1){
         
           
           buton[resim.x][resim.y].setText(""+mayin[resim.x][resim.y]);
           buton[resim.x][resim.y].setOpaque(true);
           buton[resim.x][resim.y].setForeground(Color.yellow);
         }
         if(mayin[resim.x][resim.y]==2){
           buton[resim.x][resim.y].setText(""+mayin[resim.x][resim.y]);;
           buton[resim.x][resim.y].setOpaque(true);
           buton[resim.x][resim.y].setForeground(Color.GREEN);
         }
         if(mayin[resim.x][resim.y]==3){
           buton[resim.x][resim.y].setText(""+mayin[resim.x][resim.y]);
           buton[resim.x][resim.y].setOpaque(true);
           buton[resim.x][resim.y].setForeground(Color.RED);
         }
         if(mayin[resim.x][resim.y]>3) {
           buton[resim.x][resim.y].setText(""+mayin[resim.x][resim.y]);
           buton[resim.x][resim.y].setOpaque(true);
           buton[resim.x][resim.y].setForeground(Color.CYAN);
         }
          can--;
       if(can==0)
          JOptionPane.showMessageDialog(null,"You won.","Result.", JOptionPane.INFORMATION_MESSAGE);
    
       } 
     }
     else if(mayin[resim.x][resim.y]==0){
        butonac(resim.x,resim.y); 
     }
         }
    

    
     public void oyunbitti(){
     
      MayinResim rs=new MayinResim();
      for(int i=0;i<mayin.length;i++){
        for(int j=0;j<mayin.length;j++){
          if(mayin[i][j]<0){
            buton[i][j].setText(" ");
            ImageIcon mayin=rs.mayin();
            buton[i][j].setOpaque(true);
            buton[i][j].setForeground(Color.RED);
            buton[i][j].setIcon(mayin);
          }
          else if(mayin[i][j]==0){
            buton[i][j].setText(" ");
            buton[i][j].setOpaque(true);
            buton[i][j].setForeground(Color.WHITE);
          }
          else{
            buton[i][j].setText(""+mayin[i][j]);
            if(mayin[i][j]==1){
              buton[i][j].setText(""+mayin[i][j]);
              buton[i][j].setOpaque(true);
              buton[i][j].setForeground(Color.yellow);
           }    
           if(mayin[i][j]==2){
              buton[i][j].setText(""+mayin[i][j]);
              buton[i][j].setOpaque(true);
              buton[i][j].setForeground(Color.GREEN);
           }  
           if(mayin[i][j]==3){
              buton[i][j].setText(""+mayin[i][j]);
              buton[i][j].setOpaque(true);
              buton[i][j].setForeground(Color.RED);
           }
           if(mayin[i][j]>3){
              buton[i][j].setText(""+mayin[i][j]);
              buton[i][j].setOpaque(true);
              buton[i][j].setForeground(Color.cyan);
           }
          }
        }  
      }
      JOptionPane.showMessageDialog(null,"Game Over","Minesweeper",JOptionPane.INFORMATION_MESSAGE);
  }
  
    public void butonac(int x,int y){
    if(x<0 || y<0 || x>buton.length-1 ||y>buton.length-1)
       return;
     if(buton[x][y].getText()=="  "){
        
       if(mayin[x][y]>0){
         if(mayin[x][y]==1){
           buton[x][y].setText(""+mayin[x][y]);
           buton[x][y].setOpaque(true);
           buton[x][y].setForeground(Color.yellow);
         }
         if(mayin[x][y]==2){
           buton[x][y].setText(""+mayin[x][y]);
           buton[x][y].setOpaque(true);
           buton[x][y].setForeground(Color.GREEN);
         }
         if(mayin[x][y]==3){
           buton[x][y].setText(""+mayin[x][y]);
           buton[x][y].setOpaque(true);
           buton[x][y].setForeground(Color.yellow);
         }
         if(mayin[x][y]>3){
           buton[x][y].setText(""+mayin[x][y]);
           buton[x][y].setOpaque(true);
           buton[x][y].setForeground(Color.cyan);
         }
          can--;
         if(can==0)
           JOptionPane.showMessageDialog(null,"You won.", "Result", JOptionPane.INFORMATION_MESSAGE);
       }
       
       if(mayin[x][y]==0){
           buton[x][y].setText(" ");
           buton[x][y].setOpaque(true);
           buton[x][y].setForeground(Color.WHITE);
           can--;
         if(can==0)
           JOptionPane.showMessageDialog(null,"You won", "Result", JOptionPane.INFORMATION_MESSAGE);
        
         butonac(x-1, y-1); butonac(x-1, y+1); butonac(x+1, y); butonac(x+1, y-1);
         butonac(x-1, y); butonac(x, y+1); butonac(x, y-1); butonac(x+1, y+1);
       }
        
     }}
    


    public Point getArrayLocation(JButton btn){
         Point pt=new Point(-1, -1);
         for(int j=0;j<buton.length;j++){
            for(int k=0;k<buton[j].length;k++){
          if(buton[j][k]==btn){
           pt.setLocation(j, k);
           return pt;
         }
       }
     }
     return pt; 
  }
    

    public JPanel getContent(){
        
        JPanel panel  = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weighty = 0;
        gbc.weightx = 0;
        for(int j = 0; j < buton.length; j++) {
            for(int k = 0; k < buton[j].length; k++) {
                int n = j*buton[j].length + k + 1;
                buton[j][k] = new JButton(" ");
                buton[j][k].addActionListener(this);
                buton[j][k].setActionCommand("Doldur");
                gbc.gridwidth = (k < buton[j].length-1) ? 1 :GridBagConstraints.REMAINDER;
                panel.add(buton[j][k], gbc);
            }
        }
        return panel;
  }

    
     public Mayin(int kolsayisi,int sütnsayisi, int mayinsayisi){
     this.kolsayisi=kolsayisi;
     this.sütnsayisi=sütnsayisi;
     this.mayinsayisi=mayinsayisi;
     buton=new JButton[kolsayisi][sütnsayisi];  
     mayin=new int[kolsayisi][sütnsayisi]; 
     Random rnd=new Random();
     int x,y;
     for(int i=0;i<mayin.length;i++){
       for(int j=0;j<mayin.length;j++){
          mayin[i][j]=0;
       }
     }
     
     for(int j=0;j<mayinsayisi;j++){
       x=rnd.nextInt(kolsayisi);
       y=rnd.nextInt(sütnsayisi);
       if(mayin[x][y]<0){
         j--;
         continue;
       }
       mayin[x][y]=-100;
       try{mayin[x-1][y]++;}catch(Exception e){}
       try{mayin[x+1][y]++;}catch(Exception e){}
       try{mayin[x][y-1]++;}catch(Exception e){}
       try{mayin[x][y+1]++;}catch(Exception e){}
       try{mayin[x-1][y-1]++;}catch(Exception e){}
       try{mayin[x-1][y+1]++;}catch(Exception e){}
       try{mayin[x+1][y-1]++;}catch(Exception e){}
       try{mayin[x+1][y+1]++;}catch(Exception e){}
     }  
  }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}