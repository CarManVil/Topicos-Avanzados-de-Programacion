package paquete.paquete1;
import javax.swing.*;//importa la libreria de interfaces graficas de java
import java.awt.*;//kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//importa la libreria de eventos por perifericos
import java.util.*;


public class Ingreso extends JPanel implements ActionListener{
      
      //Decaramos variables de tipo JPanel
      private JButton btnImagen1,btnImagen2,btnImagen3,btnImagen4,
      btnImagen5;
      
      
      //Metodo constructor
      public Ingreso(){
         setLayout(new GridLayout(3,2));
         
         //creacion de botones de la interfaz
         btnImagen1 = new JButton("IMAGENES 1-5");
         btnImagen1.addActionListener(this);
         add(btnImagen1);
         
         
         
      }//constructor
      
      public void actionPerformed(ActionEvent e){
         
         
         if(e.getSource()== btnImagen1){
            //AQUI PODRIAMOS LA IMAGEN 1,2,3,4,5
            JOptionPane.showMessageDialog(null, "FOTO 1,2,3,4,5 ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            Imagen1 img1 = new Imagen1();
         }   
                            
                  
      }//actionPerformed
   
}//class