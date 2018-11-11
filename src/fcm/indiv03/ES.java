/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcm.indiv03;

import java.util.Scanner;

/**
 *
 * @author Manolo
 */
public class ES {
    Scanner sc = new Scanner(System.in);
    
    public ES(){
    }
    public int leerEntero(){
    
        return sc.nextInt();
    }
    public long LeerEnteroLargo(){
        return sc.nextLong();
        
    }
    public float LeerReal(){
        return sc.nextFloat();
    }
    public double LeerRealLargo(){
        return sc.nextDouble();
    }   
    public String LeerCadena(){
        return sc.next();
    }
    public Character Caracter(){
        return sc.next().charAt(0);
    } 
    public boolean LeerBooleano(){
        return sc.nextBoolean();
    }
    public void Escribir(String a){
        System.out.print(a);
    }
    public void EscribirLn(String a){
        System.out.print(a);
    }
    public static void main(String [] args){
        ES sc = new ES();
        System.out.println(sc.leerEntero());
    }
}
