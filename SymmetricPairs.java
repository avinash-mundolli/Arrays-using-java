
import java.util.*;

public class SymmetricPairs {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {3, 4}, {2, 1}, {5, 6}, {4, 3}};
        Set<String> set=new HashSet<>();
        for(int[] x:pairs){
            String pair=x[0]+","+x[1];
            String reverse=x[1]+","+x[0];
            if(set.contains(reverse)){
                System.out.println(x[1]+","+x[0]);
            }else{
                set.add(pair);
            }
        }
    }
}
