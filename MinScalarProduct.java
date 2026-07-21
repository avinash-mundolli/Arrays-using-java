import java.util.Arrays;

public class MinScalarProduct {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4};
        int[] v2 = {5, 6, 7, 8};
        Arrays.sort(v1);
        Arrays.sort(v2);
        int product=0;
        for(int i=0;i<v1.length;i++){
            product+=v1[i]*v2[v2.length-1-i];
        }
        System.out.println(product);
    }
}
