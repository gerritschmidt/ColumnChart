import java.awt.*;
import java.util.*;
import javax.swing.*;

public class paint extends JPanel{
  private ArrayList<Umfrage> ergebnisse;
    
  public void setErgebnisse(ArrayList<Umfrage> Um){
    this.ergebnisse = Um;
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    
    /*if(ergebnisse == null){
    return;
    } */
    
    g2d.drawLine(10,330,600,330);
    
    int j=1;
    for(int i = 0; i<ergebnisse.size()-1; i++){
      if(ergebnisse.get(i).getAnzahl()>ergebnisse.get(j).getAnzahl()){
        i=j;
      }
    }
    
    Random rnd = new Random();
    int t = 0;
    int x = 30;
    double max = ergebnisse.get(j).getAnzahl();
    double factor = 250.0 / max;
    
    for(int i = 0; i<ergebnisse.size(); i++){
      int hoehe = (int) Math.round(ergebnisse.get(t).getAnzahl() * factor); 
      
      for(int c=0; c<1; c++){
        float r = rnd.nextFloat();
        float n = rnd.nextFloat();
        float d = rnd.nextFloat();     
        Color randomColor = new Color(r,n,d);
        g2d.setColor(randomColor);
      }
      
      g2d.drawString(ergebnisse.get(t).getPs() + " " + ergebnisse.get(t).getAnzahl(),x,20);   
      g2d.fillRect(x,330 - hoehe,30,hoehe);
      x+=60;
      t++;                                 
    }    
  }  
}