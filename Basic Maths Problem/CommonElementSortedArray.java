import java.util.ArrayList;
import java.util.List;

class Main {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> commonElements = new ArrayList<>();
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // If all three elements are equal
            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            } 
            // Move the pointer which is pointing to the smallest element
            else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return commonElements;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> common = findCommonElements(arr1, arr2, arr3);
        System.out.println("Common elements: " + common);
    }
}
