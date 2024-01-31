// @author HamzaEren
package SearchAlgorithms;

public class InterpolationSearch {
    // Kendi çözümüm
    /*public static int interpolationSearch(int[] liste, int low, int high, int target){
        if (target < liste[low])
            return -1;
        
        int p = low + ((high - low) * (target - liste[low])) / (liste[high] - liste[low]);
        
        if (p > liste.length)
            return -1;
        if (liste[p] == target)
            return p;
        else if (liste[p] < target)
            return interpolationSearch(liste, p+1, high, target);
        else
            return interpolationSearch(liste, p-1, high, target);
    }*/
    
    
    // Örnek çözüm
    public static int interpolationSearch(int[] data, int item){
        int highEnd = (data.length - 1);
        int lowEnd = 0;

        while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {
            int probe = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]);
            
            if (highEnd == lowEnd) {
                if (data[lowEnd] == item) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }
            
            if (data[probe] == item) {
                return probe;
            }
            
            if (data[probe] < item) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] liste = { 1, 4, 13, 35, 67, 91, 243, 345, 400 };
        System.out.println(interpolationSearch(liste, 13));
        //System.out.println(interpolationSearch(liste, 0, liste.length - 1, 13));
    }
}
