import java.util.Arrays;

public class ResizeArray {
    // Method to resize an array
    public static int[] resizeArray(int[] originalArray, int newSize) {
        // Create a new array with the desired size
        int[] newArray = new int[newSize];
        System.arraycopy(originalArray, 0, newArray, 0, Math.min(originalArray.length, newSize));
        return newArray;
    }
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int newSize = 8;
        int[] largerArray = resizeArray(originalArray, newSize);
        System.out.println("Larger Array: " + Arrays.toString(largerArray));
        newSize = 3;
        int[] smallerArray = resizeArray(originalArray, newSize);
        System.out.println("Smaller Array: " + Arrays.toString(smallerArray));
    }
}
