import java.util.*;

public class DisjointArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 9, 8};
        Set<Integer> set=new HashSet<>();
        for(int x:arr1){
            set.add(x);
        }
        boolean isDisjoint=true;
        for(int x:arr2){
            if (set.contains(x)) {
                isDisjoint=false;
                break;
            }
            
        }
        System.out.println(isDisjoint);
    }
}
