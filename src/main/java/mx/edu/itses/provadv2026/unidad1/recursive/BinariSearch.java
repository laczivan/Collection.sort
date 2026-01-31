/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.provadv2026.unidad1.recursive;

/**
 *
 * @author zunig
 */
public class BinariSearch {
    /*
    divide y conquista
    la lista debe estar ordenada
    */
    public static Integer binarySearch(int [] list, int item){
        int low =0;
        int high = list.length-1;
        int contador=0;
        
        while(low<=high){
            contador++;
            System.out.println("Contador: " + contador);
            int mid=low+ (high-low)/2;
            int guess =list[mid];
            if(guess==item){
               
                return mid;
            }
            if(guess>item){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return null;
    }
    public static Integer busquedaNormal(int[] list, int item){
        //busqueda normal del numero de 1 en uno recorriendo toda la lista
        int contador =0;
        for (int i = 0; i < list.length; i++) {
            contador++;
            System.out.println("contador" + contador);   
            if(list[i]==item){
                return 1;
            }
        }
        return null;
           
        
    }
}
