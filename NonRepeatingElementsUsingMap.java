import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElementsUsingMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int x:arr){
            if(map.get(x)==1){
                System.out.println(x);
            }
        }
    }
}
