import java.util.*;
import java.lang.*;

public class Main {
    public static int[] fix(int[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != -1 && A[i] != i) 
            {
                int x = A[i];
                while (A[x] != -1 && A[x] != x)
                {
                    int y = A[x];
                    A[x] = x;
                    x = y;
                }

                A[x] = x;                
                if (A[i] != i) 
                {
                    
                    A[i] = -1;
                }
            }
        }
        return A;
    }

    public static void main(String[] args)
    {
        int A[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        System.out.println(Arrays.toString(fix(A)));
    }
}
