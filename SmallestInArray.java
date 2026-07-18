public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min=Integer.MAX_VALUE;
        for(int x:arr){
            if(x<min){
                min=x;
            }
        }
        System.out.println(min);
    }
}
