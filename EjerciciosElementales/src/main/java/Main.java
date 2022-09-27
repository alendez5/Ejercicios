/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vespertino
 */
public class Main {
    public static void main(String args[]){
        
            System.out.println("Ejercicio 1: ");
            
            System.out.println();
            ejercicio1Func();
            System.out.println();
            
            System.out.println("Ejercicio 2: ");
            
            System.out.println();
            ejercicio2Func();
            System.out.println();
            
            
    }
    
    private static void ejercicio1Func(){
        for(int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }
    }
    
    private static void ejercicio2Func(){
        
        int dividendo = 10;
        int divisor = 2;
        int q = 0;
        
        while (dividendo >= divisor){
            dividendo -= divisor;
            q += 1;
        } 
        
        System.out.println(q);
    }
    
    
}