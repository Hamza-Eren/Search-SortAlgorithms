// @author HamzaEren
package SearchAlgorithms;

public class ExponentialSearch {
    public static int exponentialSearch(int[] liste, int length, int target){
        if (liste[0] == target)
            return 0;
     
        int i = 1;
        while (i < length && liste[i] <= target)
            i = i*2;
        
        // Linear Search kısmı
        for(int j = i/2; j < Math.min(i, length-1); j++){
            if (liste[j] == target)
                return j;
        }
        
        return -1;
    }
    
    public static void main(String args[])
    {
        int[] liste = {2, 3, 4, 10, 40};
        System.out.println(exponentialSearch(liste, liste.length, 10));
    }
}
