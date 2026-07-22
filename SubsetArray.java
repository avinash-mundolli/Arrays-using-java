import java.util.*;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4};
        Set<Integer> set=new HashSet<>();
        for(int x:arr1){
            set.add(x);
        }
        boolean isSubset=true;
        for(int x:arr2){
            if(!set.contains(x)){
                isSubset=false;
                break;
            }
        }
        System.out.println(isSubset);
    }
}
