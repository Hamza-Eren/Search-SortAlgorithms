// @author HamzaEren
package SearchAlgorithms;

public class BinarySearch {
    public static int BinarySearch2(int[] liste, int low, int high, int key){
        int m;
        
        while(low < high){
            m = low + (high-low)/2;
            
            if(liste[m] == key)
                return m;
            
            if(liste[m] < key)
                low = m + 1;
            else
                high = m - 1;
        }
        return -1;
    }
    
    public static int BinarySearch(int[] liste, int low, int high, int key){
        if(low < high){
            int m = low + (high-low)/2;
            
            if(liste[m] == key)
                return m;
            
            if(liste[m] < key)
                return BinarySearch(liste, m+1, high, key);
            else
                return BinarySearch(liste, low, m-1, key);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] liste = { 1, 4, 13, 35, 67, 91, 243, 345, 400 };
        System.out.println(BinarySearch(liste, 0, liste.length, 13));
    }
}
