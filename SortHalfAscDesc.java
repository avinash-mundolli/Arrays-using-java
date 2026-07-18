public class SortHalfAscDesc {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3, 7, 4};
        int mid=arr.length/2;
        for(int i=0;i<mid;i++){
            for(int j=i+1;j<mid;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }for(int i=mid;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
