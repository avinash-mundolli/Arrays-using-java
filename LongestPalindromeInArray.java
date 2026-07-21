public class LongestPalindromeInArray {
    public static void main(String[] args) {
        int[] arr = {121, 45, 1331, 789, 12321, 55};
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(isPalindrome(x)&&x>max){
                max=x;
            }
        }
        System.out.println(max);

    }
    static boolean isPalindrome(int n) {
        int temp=n,sum=0;
        while(n!=0){
            sum=sum*10+n%10;
            n=n/10;
        }
        return sum==temp;
    }
}
