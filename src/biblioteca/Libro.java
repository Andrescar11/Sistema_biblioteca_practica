/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Libro {
    
    private String titulo;
    private String autor;;
    private String codigo;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, String codigo, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponible = disponible;
    }
    
    public boolean prestarLibro(boolean disponible){
        
        if (disponible==true) {
            
            disponible=false;
            
            JOptionPane.showMessageDialog(null, "El libro se ha prestado");
            
                    
            return disponible;
            
        } else {
            JOptionPane.showMessageDialog(null, "Este libro está ocupado");
        }
        return false;
        
    }
    
    public boolean devolverLibro(boolean disponible){
        
        if (disponible==false) {
            
            disponible=true;
            
            JOptionPane.showMessageDialog(null, "El libro se ha devuelto");
            
                    
            return disponible;
            
        } else {
            JOptionPane.showMessageDialog(null, "Este libro no se ha prestado");
        }
        return false;
        
    }
    
    public String mostrarInfo(){
        
        String x;
        
        if (disponible=true) {
            
            x ="Disponible";
            
        } else {
            
            x="No disponible";
            
        }
        
           return "Titulo del libro: " + titulo + "\n" +
                  "Autor del libro: " + autor + "\n" +
                  "Codigo del libro: " + codigo + "\n" + 
                  "Estado: " + x + "\n" + 
                  "-------------------------------------" + "\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
    
    
}
