// @author HamzaEren
package SortAlgorithms;

class MergeSort {
    public static void merge(int[] liste, int low, int mid, int high){
        int i, j, k;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];
        
        for (i = 0; i < n1; i++)
            LeftArray[i] = liste[low + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = liste[mid + 1 + j];
        
        i = 0;
        j = 0;
        k = low;
        
        while (i < n1 && j < n2){
            if(LeftArray[i] <= RightArray[j]){
                liste[k] = LeftArray[i];
                i++;
            } else{
                liste[k] = RightArray[j];
                j++;
            }
            k++;
        }
        
        while (i<n1){
            liste[k] = LeftArray[i];
            i++;
            k++;
        }
      
        while (j<n2){
            liste[k] = RightArray[j];
            j++;
            k++;
        }
    }
    
    public static void mergeSort(int[] liste, int low, int high){
        if (low < high){
            int mid = (low + high) / 2;
            mergeSort(liste, low, mid);
            mergeSort(liste, mid + 1, high);
            merge(liste, low, mid, high);
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
