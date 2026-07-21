import java.util.Set;
import java.util.TreeSet;

public class DistinctElementsUsingSet{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        Set<Integer> set=new TreeSet<>();
        for(int x:arr){
            set.add(x);
        }
        System.out.println(set);
    }
}