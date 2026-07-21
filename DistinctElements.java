

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        boolean[] visted=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visted[i]){
                continue;
            }
            System.out.print(arr[i]+" ");
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visted[j]=true;
                }
        }
        }
        
    }
}

