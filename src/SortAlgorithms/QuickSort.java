// @author HamzaEren
package SortAlgorithms;

public class QuickSort {
    static void swap(int[] liste, int i, int j){
        liste[i] = liste[i] + liste[j];
        liste[j] = liste[i] - liste[j];
        liste[i] = liste[i] - liste[j];
    }

    static int section(int[] liste, int low, int high){
        int pivot = liste[high];
        int i = (low - 1);
            
        for (int j = low; j < high; j++) {
            if (liste[j] < pivot) {
                i++;
                swap(liste, i, j);
            }
        }
        
        swap(liste, i + 1, high);
        return (i + 1);
    }
    
    static void quickSort(int[] liste, int low, int high){
        if (low < high) {
            int pi = section(liste, low, high);
            quickSort(liste, low, pi - 1);
            quickSort(liste, pi + 1, high);
        }
    }

    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
            
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}