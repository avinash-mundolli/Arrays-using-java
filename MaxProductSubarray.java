public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr={2,3,-2,-5,6,-1,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums){
        int l=nums.length;
        int rightproduct=1;
        int leftproduct=1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(rightproduct==0){
                rightproduct=1;
            }
            if(leftproduct==0){
                leftproduct=1;
            }
            leftproduct=leftproduct*nums[i];
            rightproduct=rightproduct*nums[l-1-i];
            max=Math.max(max, Math.max(leftproduct, rightproduct));
        }
        return max;
    }
}
