public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
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
