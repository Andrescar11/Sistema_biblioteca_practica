/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op = 0;
        
        String a;
        
        boolean encontrado = false;
        
        Libro unidad;
        
        ArrayList<Libro> libros=new ArrayList<>();
        
        String autor,titulo,codigo;
        boolean estado;
        
        while (op!=6) {            
            
            op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion disponible en el menú" + "\n" +
                                                        "1 Registrar libro " + "\n" + 
                                                        "2 Prestar libro " + "\n" +
                                                        "3 Devolver libro " + "\n" + 
                                                        "4 Mostrar libros disponible" + "\n" +
                                                        "5 Buscar libro por codigo " + "\n" + 
                                                        "6 Salir"));
            
            switch (op) {
            case 1:
                
                codigo=JOptionPane.showInputDialog("Ingrese el codigo del libro");
                titulo=JOptionPane.showInputDialog("Ingrese el titulo del libro");
                autor=JOptionPane.showInputDialog("Ingrese el nombre del autor del libro");
                estado=true;
                
                unidad=new Libro(titulo, autor, codigo, estado);
                
                libros.add(unidad);
                
                JOptionPane.showMessageDialog(null, "Libro resgistrado exitosamente");
                
                break;
                
            case 2:
                
                encontrado=false;
                
                a=JOptionPane.showInputDialog("Ingrese el codigo del libro a prestar");
                
                for (Libro l : libros) {
                    
                    if (a.equals(l.getCodigo())) {
                        
                        encontrado=true;
                        
                        l.setDisponible(false);
                        
                        JOptionPane.showMessageDialog(null, "El libro " + l.getTitulo() + "ha sido prestado");
                        
                    } 
                    
                }
                
                if (encontrado==false) {
                    JOptionPane.showMessageDialog(null, "No se encontró el libro");
                }
                
                break;
                
            case 3:
                
                encontrado=false;
                
                a=JOptionPane.showInputDialog("Ingrese el codigo del libro a devolver");
                
                for (Libro l : libros) {
                    
                    if (a.equals(l.getCodigo())) {
                        
                        encontrado=true;
                        
                        l.setDisponible(true);
                        
                        JOptionPane.showMessageDialog(null, "El libro " + l.getTitulo() + "ha sido devuelto");
                        
                    } 
                    
                }
                
                if (encontrado==false) {
                    JOptionPane.showMessageDialog(null, "No se encontró el libro");
                }
                
                break;
                
            case 4:

                    javax.swing.JTextArea area = new javax.swing.JTextArea(15, 40);
                    area.setEditable(false);

                    if (libros.isEmpty()) {
                        area.setText("No hay libros registrados.");
                    } else {

                        for (Libro l : libros) {
                            area.append(l.mostrarInfo() + "\n");
                        }
                    }

                    javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(area);

                    JOptionPane.showMessageDialog(null, scroll,
                            "LIBROS REGISTRADOS",
                            JOptionPane.INFORMATION_MESSAGE);

                    break;

            case 5:
                
                a=JOptionPane.showInputDialog("Ingrese el codigo del libro a buscar");
                
                for (Libro l : libros) {
                    
                    if (a.equals(l.getCodigo())) {
                        
                        encontrado=true;
                        
                        JOptionPane.showMessageDialog(null, l.mostrarInfo() );
                        
                    } 
                    
                }
                
                if (encontrado==false) {
                    JOptionPane.showMessageDialog(null, "No se encontró el libro");
                }
                
                break;
                
            case 6:
                
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion disponible");
        }
            
       }
        
    }
    
}
