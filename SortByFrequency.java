
import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 3, 3, 1};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1 );
            }
        }
        Integer[] nums=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums,(a,b)->{
            if(map.get(b)!=map.get(a)){
                return map.get(b)-map.get(a);
            }
            return a-b;
        });
        
        for(int x:nums){
            System.out.print(x+" ");
        }
    }
}
