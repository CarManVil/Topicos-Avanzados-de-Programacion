package paquete.paquete1;
import javax.swing.*;//importa la libreria de interfaces graficas de java
import java.awt.*;//kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//importa la libreria de eventos por perifericos
import java.util.*;
public class Imagen1 extends JFrame{


  Img1 img1 = new Img1();
   
   public Imagen1(){
      initComponents();
   }//constructor
   
   private void initComponents(){
      setSize(1100,2000);
      setTitle("INTERFAZ IMAGEN 1 ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(img1);
      setVisible(true);
   
   }//initComponents
   
   
   
}//class
