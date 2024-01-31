/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithms;

/**
 *
 * @author HamzaEren
 */
public class MergeDeneme {
    public static void merge(int[] arr, int low, int mid, int high){
        int i, j, k;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        for(i=0; i<n1; i++)
            leftArray[i] = arr[low + i];
        for(j=0; j<n2; j++)
            rightArray[j] = arr[mid + 1 + j];
        
        i = j = 0;
        k = low;
        
        while(i<n1 && j<n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            } else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }   
    }
    
    public static void mergeSort(int[] arr, int low, int high){
        if (low < high){
            int m = low + (high - low) / 2;
            mergeSort(arr, low, m);
            mergeSort(arr, m+1, high);
            merge(arr, low, m, high);
        }
    }
    
    public static void main(String args[]){
        int[] liste = { 11, 30, 24, 7, 31, 16, 39, 41 };
        
        System.out.println("Sırasız liste: ");
        for (int i = 0; i < liste.length; i++)
            System.out.print(liste[i] + " ");
        System.out.println("");
        
        mergeSort(liste, 0, liste.length - 1);
        
        System.out.println("Sıralı liste: ");
        for (int i = 0; i < liste.length; i++)
            System.out.print(liste[i] + " ");
        System.out.println("");
    }
}
