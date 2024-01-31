/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithms;

/**
 *
 * @author HamzaEren
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] liste = {7, 3, 6, 4, 2, 9, 1};
        bubbleSort(liste);
        for(int x : liste)
            System.out.print(x + " ");
    }
    
    public static void bubbleSort(int[] liste){
        for(int i = 0; i < liste.length - 1; i++)
            for(int j = 0; j < liste.length - 1 - i; j++)
                if (liste[j] > liste[j+1])
                    swap(liste, j, j+1);
    }
    
    public static void swap(int[] liste, int i, int j){
        liste[i] = liste[i] + liste[j];
        liste[j] = liste[i] - liste[j];
        liste[i] = liste[i] - liste[j];
    }
}
