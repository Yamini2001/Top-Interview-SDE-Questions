import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("B");
        String[] array = new String[arrayList.size()];
        array = arrayList.toArray(array);
        System.out.println("ArrayList: "+arrayList);
        System.out.println("Arrays: "+ Arrays.toString(array));
    }
}