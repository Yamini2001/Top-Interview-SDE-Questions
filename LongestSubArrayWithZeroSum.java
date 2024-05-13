import java.util.*;
class Main{
    public static int solve(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    max = Math.max(max,j-i+1); 
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={5,-2,-1,4,-9,6};
        System.out.println(solve(arr));
    }
}