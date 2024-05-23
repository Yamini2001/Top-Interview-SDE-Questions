import java.util.*;
class Main{
    public static int IntersectionArray(int[] a,int n,int[] b,int m){
        Set<Integer> IntersectionArray = new HashSet<>();
        for(int i=0;i<n;i++){
            IntersectionArray.add(a[i]);
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(b[i]);
        }
        return set.size();
    }

}