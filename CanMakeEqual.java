public class CanMakeEqual {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target=arr[0]%2;
        boolean isEqual=true;
        for(int x:arr){
            if(x%2!=target){
                isEqual=false;
                break;
            }
        }
        System.out.println(isEqual);
    }
}
