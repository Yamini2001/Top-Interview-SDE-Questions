import java.util.Arrays;

class Main{
    public static int[] CopyArray(int[] arr){
        int n = arr.length;
        int[] newArray = new int[n];
        for(int i=0;i<n;i++){
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr={4,3,2,5,12,9,43};
        int n = arr.length;
        int[] newArray = CopyArray(arr);
        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Copy Array: "+Arrays.toString(newArray));
    }
}