/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.provadv2026.unidad1.recursive;

/**
 *
 * @author zunig
 */
public class Metod {
    public int Factorial(int x){ 
        if(x==1 || x==0){
            System.out.println("factorial "+ 1);
            return 1;
        }else{
            /*
            3*Factorial(3-1)x
            //Otra vuelta
            //2*Factorial(2-1)x
            Otra vuelta
            entre a la condicional x ==1 x
            return 1
            2*1
            return 2
            return 6
            como funciona en un diagrama estos cometarios
            */
            return x*Factorial(x-1);
        }   
    }    
}
