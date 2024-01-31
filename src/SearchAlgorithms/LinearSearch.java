// @author HamzaEren
package SearchAlgorithms;

public class LinearSearch {
    public static int LinearSearch(int[] liste, int target){
        for(int i = 0; i < liste.length; i++){
            if(liste[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] liste = { 11, 30, 24, 7, 31, 16, 39, 41 };
        System.out.println(LinearSearch(liste, 24));
    }
}
