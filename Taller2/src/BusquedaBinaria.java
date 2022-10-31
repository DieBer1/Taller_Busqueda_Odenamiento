/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package ordenamiento;

/**
 *
 * @author Usuario
 */
public class BusquedaBinaria {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            
            else if(target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
