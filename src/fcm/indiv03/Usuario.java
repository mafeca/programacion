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
// clse usuario

public class Usuario {
    // declaracion de variables
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    
    // constructor
    
    public Usuario(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
       
    // métodos get y set de cada atributo
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    @Override //esto me lo pide, pero no sé muy bien su fumción
    
    //método toString para mostrar la información de los atributos
    
    public String toString(){
        return("Nombre :"+nombre+" ,apellidos :"+apellidos+", edad :"+edad+" ,dni :"+dni);
    }
}
