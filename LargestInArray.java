public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);
    }
}
