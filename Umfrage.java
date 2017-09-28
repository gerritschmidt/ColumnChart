import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Umfrage{
  private String ps;
  private int anzahl;
  
  public Umfrage(String ps, int anzahl){
    this.ps = ps;
    this.anzahl = anzahl;
  }
  public String getPs(){
    return this.ps;
  }
  public int getAnzahl(){
    return this.anzahl;
  }

  public void setps(String neuPs){
    this.ps = neuPs;
  }
  public void setanzahl(int neuAnzahl){
    this.anzahl = neuAnzahl;
  }
}