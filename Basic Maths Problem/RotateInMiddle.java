class Main{
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void RotateInMiddle(int[] arr,int start,int end,int k){
        int n = end-start+1;
        k = k%n;
        reverse(arr,start,start+k-1);
        reverse(arr,start+k,end);
        reverse(arr,start,end);
    }

    public static void main(String[] args) {
        int[] arr={45,23,12,65,20};
        int n = arr.length;
        int k=4;
        int start = 1;
        int end = 4;
        RotateInMiddle(arr,start,end,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}