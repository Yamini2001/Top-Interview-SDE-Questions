// Java code to implement the approach
import java.io.*;
class Main
{
public static String addStars(String s, int stars[])
{
	String ans = "";

	int j = 0;

	for (int i = 0; i < s.length(); i++) {
	if (j < stars.length && i == stars[j]) {
		ans += '*';
		j++;
	}
	ans += s.charAt(i);
	}

	return ans;
}
public static void main(String[] args)
{
	String str = "geeksforgeeks";
	int chars[] = { 1, 5, 7, 9 };
	String ans = addStars(str, chars);
	System.out.println(ans);
}
}

