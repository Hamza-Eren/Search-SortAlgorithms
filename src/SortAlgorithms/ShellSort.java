// @author HamzaEren
package SortAlgorithms;

// Bu algoritma Kabuk(Shell) algoritmasıdır fakat Türkçe'ye çevrilmesi yanlıştır.
// Çünkü ismi, bu algoritmayı bulan kişinin (Donald Shell) soyismidir.
public class ShellSort {
    public static void shellSort(int[] liste) {
        for (int i = liste.length / 2; i > 0; i = (i == 2 ? 1 : (int) Math.round(i / 2.2))) {
            for (int j = i; j < liste.length; j++) {
                int temp = liste[j];
                for (int k = j; k >= i && liste[k - i] > temp; k -= i){
                    liste[k] = liste[k - i];
                    liste[k - i] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] liste = new int[] {1, 5, 8, 3, 7, 2, 9, 4, 6};
        shellSort(liste);
        System.out.print("Sıralı liste: ");
        for (int i : liste)
            System.out.print(i + " ");
        System.out.println();
    }
}
