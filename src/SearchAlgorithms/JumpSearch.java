/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithms;
/**
 *
 * @author HamzaEren
 */
public class JumpSearch {
    public static int jumpSearch(int[] arr, int target){
        int m = (int)Math.sqrt(arr.length);
        int k = 0;
        for(;; k++){
            if(k*m < arr.length){
                if(arr[k*m] == target)
                    return k*m;
                if(arr[k*m] > target)
                    break;
                else
                    System.out.println("denendi");
            } else
                break;
        }
        
        int i = (k - 1)*m + 1;
        for(; i < k*m; i++){
            if(i < arr.length)
                if(arr[i] == target)
                    return i;
                else
                    System.out.println("denendi");
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] arr = new int[] {1, 4, 6, 7, 13, 19, 24, 35, 36};
        int target = 14 ;
        System.out.println(jumpSearch(arr, target));
    }
}
