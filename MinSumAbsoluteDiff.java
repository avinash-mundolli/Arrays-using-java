
import java.util.Arrays;

public class MinSumAbsoluteDiff {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        Arrays.sort(arr);
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum=sum+Math.abs(arr[i]-arr[i-1]);
        }
        System.out.println(sum);
    }
}
