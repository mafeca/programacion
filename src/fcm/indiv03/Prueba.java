/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcm.indiv03;

//import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Manolo
 */
public class Prueba {
    
    public static void main(String[] args){
        
        //declaramos variables e inicializamos
        
        Scanner entrada = new Scanner(System.in);
        int miopcion;
        boolean salir = false;
        Usuario usr = new Usuario("","",0,"");
        Producto prod = new Producto(0,"",0);
        
        while (salir == false){
                   // System.out.println("======== MENU ========");
                    System.out.println("********** MENU PPAL **********");
                    System.out.println("_______________________________");
                    System.out.println(
                                        "1. Agregar usuario\n"
+                                       "2. Agregar producto\n"
+                                       "3. Modificar usuario\n"
+                                       "4. Modificar producto\n"
+                                       "5. Leer datos usuario\n"
+                                       "6. Leer datos producto\n"
+                                       "0. Salir"
                                        );
            try {
                miopcion = entrada.nextInt();
                switch(miopcion){
                        
                    case 1: 
                            try{
                            
                            System.out.println("Introduce Nombre : ");
                            usr.setNombre(entrada.next());
                            System.out.println("Introduce apellidos :");
                            usr.setApellidos(entrada.next());
                            System.out.println("Introduce la edad :");
                            usr.setEdad(entrada.nextInt());
                            System.out.println("Introduce el dni :");
                            usr.setDni(entrada.next());
                            System.out.println(usr);
                            } catch (Exception e) {
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                             }    
                            break;
                    case 2: 
                            try{
                            
                            System.out.println("Introduce Referencia : ");
                            prod.setReferencia(entrada.nextInt());
                            System.out.println("Introduce nombre :");
                            prod.setNombre(entrada.next());
                            System.out.println("Introduce la cantidad :");
                            prod.setUnidades(entrada.nextInt());
                            System.out.println(prod);
                            } catch (Exception e) {
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                             }          
                            break;
                     case 3: 
                                                      
                            System.out.println(
                                    "1.- Modificar nombre.\n"
                                   + "2.- Modificar apellidos.\n"
                                   + "3.- Modificar edad.\n"
                                   + "4.- Modificar dni.\n"
                                    );
                            try{   
                                
                                switch(entrada.nextInt()){
                                    case 1: usr.setNombre(entrada.next());
                                            break;
                                    case 2: usr.setApellidos(entrada.next());
                                            break;
                                    case 3: usr.setEdad(entrada.nextInt());
                                            break;
                                    case 4: usr.setDni(entrada.next());
                                            break;
                                    default:
                                            System.out.println("ERROR! Debes introducir un nro del menú.");
                                            break;
                                }
                                
                            } catch (InputMismatchException e){
                                  System.out.println("ERROR! Debes de introducir datos válidos.");
                             }          
                            break;
                      case 4: 
                                                      
                            System.out.println(
                                    "1.- Modificar referencia.\n"
                                   + "2.- Modificar nombre.\n"
                                   + "3.- Modificar unidades.\n"
                                   ); 
                            
                            try{
                                switch(entrada.nextInt()){
                                    case 1: prod.setReferencia(entrada.nextInt());
                                            break;
                                    case 2: prod.setNombre(entrada.next());
                                            break;
                                    case 3: prod.setUnidades(entrada.nextInt());
                                            break;
                                    default:
                                            System.out.println("ERROR! Debes introducir un nro del menú.");
                                            break;
                                }
                                
                            } catch (InputMismatchException e){
                                  System.out.println("ERROR! Debes de introducir datos válidos.");
                             }          
                            break;
                            
                      case 5: 
                             System.out.println(
                                    "1. Leer Nombre\n"
                                  + "2. Leer Apellidos\n"
                                  + "3. Leer Edad\n"
                                  + "4. Leer DNI\n"
                                  + "5. Leer completo"
                                );
                             try{
                                 switch (entrada.nextInt()) {
                                   
                                     case 1: System.out.println(usr.getNombre());
                                     break;
                                     case 2: System.out.println(usr.getApellidos());
                                     break;
                                     case 3: System.out.println(usr.getEdad());
                                     break;
                                     case 4: System.out.println(usr.getDni());
                                     break;
                                     case 5: System.out.println(usr.getNombre()+" "+ usr.getApellidos()+" ," + usr.getEdad()+" ,"+usr.getDni());
                                     break;
                                     default:
                                            System.out.println("ERROR! Debes introducir un nro del menú.");
                                     break;
                                 }
                             }
                             catch (InputMismatchException e) {
                                    System.out.println("ERROR! Debes de introducir datos válidos.");
                                    }
                             break;
                            
                      case 6:
                            System.out.println(
                                    "1. Leer Referencia\n"
                                    + "2. Leer Nombre\n"
                                    + "3. Leer Unidades\n"
                                    + "4. Leer completo"
                                  ); 
                            try {
                                 switch (entrada.nextInt()) {
                                 case 1: System.out.println(prod.getReferencia());
                                    break;
                                 case 2: System.out.println(prod.getNombre());
                                    break;
                                 case 3: System.out.println(prod.getUnidades());
                                    break;
                                 case 4: System.out.println("Referencia :"+prod.getReferencia()+", Nombre :"+ prod.getNombre()+", Unidades :" + prod.getUnidades());
                                    break;
                                default:
                                    System.out.println("ERROR! Debes introducir un nro del menú.");
                                    break;
                                    }
                                } catch (InputMismatchException e){
                                            System.out.println("ERROR! Debes de introducir datos válidos.");
                                        }
                                break;
                      case 0: 
                            salir = true;
                            break;
                            default:
                                    System.out.println("ERROR! Debes introducir un nro del menú.");
                                    break;
                                    }
                            } catch (InputMismatchException e){
                                    System.out.println("ERROR! Debes de introducir SOLO Números.");
                                    System.out.println("ERROR! Carácter no válido.");
                                    salir = true;
                                    }
            }
    }
}
    