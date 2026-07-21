public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,0};
        int odd=0,even=0;
        for(int x:arr){
            if(x%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("odd numbers :"+odd+" "+" even numbers: "+even);
    }
}
