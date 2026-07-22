public class MaximumSubarrayKadanes {
    public static void main(String[] args) {
        int[] arr={-2,-5,6,-2,-3,1,5,-6};
        System.out.println(MaxSub(arr));
    }
    public static int MaxSub(int[] nums){
        int max_sub_arr=nums[0];
        int current_max=nums[0];
        for(int i=1;i<nums.length;i++){
            current_max=Math.max(nums[i], current_max+nums[i]);
            max_sub_arr=Math.max(max_sub_arr, current_max);
        }
        return max_sub_arr;
    }
}
