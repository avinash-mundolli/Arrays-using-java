public class SlideByWindow {
    public static void main(String [] args){
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        int m = 10;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            if(sum>m){
                count++;
            }
        }
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>m){
                count++;
            }
        }
        System.out.println(count);
    }
}
