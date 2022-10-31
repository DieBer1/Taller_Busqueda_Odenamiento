/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedainsertarposicion;

import java.util.Arrays;


/**
 *
 * @author COMPUMAX
 */
public class Busqueda 
{
    
    public int searchInsert(int[] nums, int target) 
    {
        //Ordenamiento de la lista
        Arrays.sort(nums);
        //Busqueda Binaria de la lista
        Arrays.binarySearch(nums, target);
        
        //En caso de que el taget sea menor a 0
        if(target < 0){return (Arrays.binarySearch(nums, target))+1;}
        //En caso de que el valor dentro de la busqueda binaria sea igual al target
        else if(Arrays.binarySearch(nums, target)==target)
        {
            //regresea la posicion
            return Arrays.binarySearch(nums, target);
           //En caso de que la busqueda sea menor al target
        }else if(Arrays.binarySearch(nums, target)<0)
        {
            //retorna el valor de la busqueda por menos uno, y luego le restamos uno
            return ((Arrays.binarySearch(nums, target))*-1)-1;
        }
        
        //Al final regresa el valor de la busqueda
        else return Arrays.binarySearch(nums, target);
        
    }
    
}
