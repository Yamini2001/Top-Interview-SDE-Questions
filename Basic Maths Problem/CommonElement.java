import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Main {
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> commonElements = new ArrayList<>();
        
        // Add all elements of arr1 to the HashSet
        for (int num : arr1) {
            set.add(num);
        }
        
        // Check for common elements in arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
                set.remove(num); // Remove to avoid duplicates in result
            }
        }
        
        // Convert the list of common elements to an array
        int[] result = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        int[] common = findCommonElements(arr1, arr2);
        
        System.out.println("Common elements: " + java.util.Arrays.toString(common));
    }
}
