/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.provadv2026.unidad1.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author zunig
 */
public class Recursive {

    public static void main(String[] args) {    
        int[] myList = {
    85, 12, 59, 3, 91, 44, 27, 68, 15, 99,
    36, 74, 8, 51, 62, 21, 40, 88, 5, 65,
    33, 77, 19, 95, 47, 55, 2, 71, 10, 81
};
        List<Integer> list = new ArrayList<>(Arrays.stream(myList).boxed().toList());
        Collections.sort(list);
        System.out.println("Lista ordenada: " + list);
        int[] sortedArray = list.stream().mapToInt(Integer::intValue).toArray();
       Integer result = BinariSearch.binarySearch(sortedArray, 17);
       //comtador 10 2.998 seg busqyeda normal
       //busqueda binaria
        if(result!=null){
            System.out.println("Elemento encontrado: "+ result);
        }else{
            System.out.println("Elemento no encontrado");
        }
    }
}
