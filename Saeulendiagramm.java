import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 15.09.2017
  * @author 
  */

public class Saeulendiagramm extends JFrame {
  // Anfang Attribute
  private paint paint1 = new paint();
  // Ende Attribute
  
  public Saeulendiagramm() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 689; 
    int frameHeight = 412;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Formular");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    paint1.setBounds(16, 16, 641, 345);
    cp.add(paint1);
    
    
    ArrayList<Umfrage> ergebnisse = new ArrayList<Umfrage>();
    
    ergebnisse.add(new Umfrage("java", 8));
    ergebnisse.add(new Umfrage("csharp", 10));
    ergebnisse.add(new Umfrage("phyton", 4));
    ergebnisse.add(new Umfrage("lisp", 2));
    
    paint1.setErgebnisse(ergebnisse);
    
    // Ende Komponenten
    
    setVisible(true);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Saeulendiagramm();
  }
  // Ende Methoden
}