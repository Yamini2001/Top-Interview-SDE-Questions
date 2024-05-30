import java.sql.Array;
import java.util.Arrays;

class Main{
    public static int[] insertingElement(int[] arr,int key,int position){
        int n = arr.length;
        int[] newArray = new int[n+1];
        for(int i=0;i<position;i++){
            newArray[i] = arr[i];
        }
        newArray[position] = key;
        for(int i=position;i<n;i++){
            newArray[i+1] = arr[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {65,32,12,34,20,36};
        int n = arr.length;
        int key = 24;
        int position = 4;
        int[] newArray = insertingElement(arr,key,position);
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Insert element in the array: "+ Arrays.toString(newArray));
    }
}