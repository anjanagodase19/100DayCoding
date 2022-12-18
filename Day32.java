// Write a Program to Remove vowels from a string

import java.util.*;
class Day32
{
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.next();

		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || 
				str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || 
				str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				continue;
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}
}