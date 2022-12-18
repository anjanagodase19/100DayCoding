//Write a Program to reverse a string.

import java.util.*;
class Day28
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.next();

		StringBuilder str2 = new StringBuilder(str);
		str2.reverse();
        System.out.println(str2);
	}
}