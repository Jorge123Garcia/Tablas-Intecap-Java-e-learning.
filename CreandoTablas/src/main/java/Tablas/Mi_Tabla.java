
package Tablas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Mi_Tabla {
    
    public static void main(String[] args) {
        
        
        String [] cabezera = {"Codigo","Nombre","Lugar"};
        
        String[][] datos ={
            {"1","Maria","San Jose"},
                {"2","Javier","Villa Nueva"},
                {"3","Lucia","Amatitlan"}
                
        };
        
        DefaultTableModel mod = new DefaultTableModel(datos,cabezera);
        JTable tabla = new JTable(mod);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(40,40,400,200);
        
        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500,500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana.add(scroll);
        ventana.setVisible(true);
        
        
        
    }
    
}
