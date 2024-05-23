import java.util.*;
class Main{
    public static int UnionArray(int[] arr1,int n,int[] arr2,int m){
        Set<Integer> unionSet = new HashSet<>();
        for(int i=0;i<n;i++){
            unionSet.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            unionSet.add(arr2[i]);
        }
        return unionSet.size();
    }

}