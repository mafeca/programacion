/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcm.indiv03;

/**
 *
 * @author Manolo
 */
public class Libro {
   private String nombre;
    private String autor;
    private String descripcion;
    private int paginas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public String toString(){
        return "Nombre: "+nombre+" Autor : "+autor+" Descripcion : "+descripcion+" | Páginas : "+paginas;
    } 
}
