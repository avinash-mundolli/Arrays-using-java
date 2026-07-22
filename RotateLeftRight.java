import java.util.Arrays;

public class RotateLeftRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println(Arrays.toString(arr));
        int last=arr1[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[0]=last;
        System.out.println(Arrays.toString(arr1));
        
    }
}
