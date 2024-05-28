class Main{
    public static void printSubArrays(int[] arr,int start,int end){
        if(end==arr.length)
            return;
        else if(start>end)
            printSubArrays(arr,0,end+1);
        else{
            System.out.println("[");
            for(int i=start;i<end;i++)
                System.out.println(arr[i]+", ");
            System.out.println(arr[end]+"]");
            printSubArrays(arr,start+1,end);
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,7,3,0};
        printSubArrays(arr,0,0);
    }
}