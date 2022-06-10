package paquete.paquete1;
import javax.swing.*;//importa la libreria de interfaces graficas de java
import java.awt.*;//kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//importa la libreria de eventos por perifericos
import java.util.*;


public class Img1 extends JPanel implements ActionListener{
      
      private JButton btnCancelar;
      
      
      //Metodo constructor
      public Img1(){
         setLayout(new GridLayout(2,1));
      
            ImageIcon JEEP = new ImageIcon("JEEP.jpg");
            JLabel foto1 = new JLabel(JEEP);
            add(foto1);
            
            ImageIcon fotoNum2 = new ImageIcon("foto2.jpg");
            JLabel foto2 = new JLabel(fotoNum2);
            add(foto2);
            
            ImageIcon fotoNum3 = new ImageIcon("foto3.jpg");
            JLabel foto3 = new JLabel(fotoNum3);
            add(foto3);
          
            
            ImageIcon fotoNum4 = new ImageIcon("foto4.jpg");
            JLabel foto4 = new JLabel(fotoNum4);
            add(foto4);
            
            ImageIcon fotoNum5 = new ImageIcon("foto5.jpg");
            JLabel foto5 = new JLabel(fotoNum5);
            add(foto5);
            
           btnCancelar = new JButton("Cancelar");
            btnCancelar.addActionListener(this);
            add(btnCancelar);
      }//constructor    
      public void actionPerformed(ActionEvent e){
         if(e.getSource()==btnCancelar)
               System.exit(0);
      }        
}//class