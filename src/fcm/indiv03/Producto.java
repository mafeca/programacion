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

// clase producto

public class Producto {
    //declaracion de variables
    
   private int referencia;
   private String nombre;
   private int unidades;
   
   //constructor

    public Producto(int referencia, String nombre, int unidades) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.unidades = unidades;
    }
    
    //métodos get y set de los atributos

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
   @Override //esto me lo pide, pero no sé muy bien su fumción
   
   //método toString para mostrar la información de los atributos
   
   public String toString(){
       return("Referencia :"+referencia+" ,Nombre :"+nombre+", Cantidad :"+unidades);
        
   }
}
