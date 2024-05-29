import java.util.Arrays;
class Main{
    public static int[] removeElement(int[] arr,int key){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=key){
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=key){
                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 15, 19, 15, 54};
        int key = 15;
        int[] newArr = removeElement(arr, key);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removing " + key + ": " + Arrays.toString(newArr));

    }
}