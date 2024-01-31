// @author HamzaEren
package SortAlgorithms;

public class SelectionSort {
    public static void insertionSort(int liste[]) {
        for(int i = 1; i < liste.length; i++) {
            int value = liste[i];
            int j = i - 1;
            while(j >= 0 && liste[j] > value) {
                liste[j + 1] = liste[j];
                j = j - 1;
            }
            liste[j + 1] = value;
        }
    }
    
    public static void main(String[] args) {
        int[] liste = new int[] {1, 5, 8, 3, 7, 2, 9, 4, 6};
        insertionSort(liste);
        System.out.print("Sıralı liste: ");
        for (int i : liste)
            System.out.print(i + " ");
        System.out.println();
    }
}