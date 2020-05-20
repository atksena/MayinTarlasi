
package mayintarlasi;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;


public class MayinResim extends MayinTarlasi{
    
    
    
  public ImageIcon mayin(){
   java.net.URL dosya = getClass().getResource("mayin.jpg");
   ImageIcon resim = new ImageIcon(dosya);
   return resim;
 }   
}
