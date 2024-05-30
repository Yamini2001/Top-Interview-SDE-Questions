import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
        arrayList.add("D");
        System.out.println("Modified ArrayList: " + arrayList);
    }
}
