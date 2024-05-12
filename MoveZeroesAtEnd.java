class Main{
    public static void moveZeroesToEnd(int[] arr,int n){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args){
        int[] arr={45,0,3,0,0,2,1,5,0,4};
        int n = arr.length;
        moveZeroesToEnd(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}