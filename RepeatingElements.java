public class RepeatingElements{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3,7,8,7};
        for(int i=0;i<arr.length;i++){
            boolean isRepeated=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isRepeated=true;
                }
            }
            if(isRepeated){
                System.out.print(arr[i]+" ");
            }
        }
    }
}