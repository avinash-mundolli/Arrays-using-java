public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }
        System.out.println("minimum: "+min+" "+" maximum :"+max);
    }
}
