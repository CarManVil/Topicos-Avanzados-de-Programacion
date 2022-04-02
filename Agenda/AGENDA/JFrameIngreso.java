import javax.swing.*;//Importa la libreria de interfaces graficas de java
import java.awt.*;//Kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//Importa la libreria de eventos por perifericos
import java.util.*;

public class JFrameIngreso extends JFrame{


   Ingreso ing = new Ingreso();
   
   public JFrameIngreso(){
      initComponents();
   }//Constructor
   
   private void initComponents(){
      setSize(300,200);
      setTitle("Menu Principal");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(ing);
      setVisible(true);
   
   }//initComponents

}//class