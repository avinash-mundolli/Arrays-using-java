public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 1};
        int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int x:arr){
            if(x<min){
                min2=min;
                min=x;
            }
            else if(x<min2 && x!=min){
                min2=x;
            }
        }
        System.out.println(min2);
    }
}
