import java.util.HashSet;
import java.util.Set;

public class RepeatingElementsUsingSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        Set<Integer> seen=new HashSet<>();
        Set<Integer> repeat=new HashSet<>();
        for(int x:arr){
            if(seen.contains(x)){
                repeat.add(x);
            }else{
                seen.add(x);
            }
        }
        System.out.println(repeat);
        
    }
}
