import java.util.*;
class Query{ 
	int L; 
	int R; 
	Query(int L, int R){
		this.L = L;
		this.R = R;
	}
} 
class Main
{
	static void printQuerySums(int a[], int n, ArrayList<Query> q, int m)
	{
		for (int i=0; i<m; i++)
		{
			int L = q.get(i).L, R = q.get(i).R;
			int sum = 0;
			for (int j=L; j<=R; j++)
				sum += a[j];
			System.out.println("Sum of [" + L +
						", " + R + "] is " + sum);
		}
	}
	public static void main(String argv[])
	{
		int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
		int n = a.length;
		
		ArrayList<Query> q = new ArrayList<Query>();
		q.add(new Query(0,4));
		q.add(new Query(1,3));
		q.add(new Query(2,4));
		
		int m = q.size();
		printQuerySums(a, n, q, m);
	}
}
