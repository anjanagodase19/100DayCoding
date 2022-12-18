//  Write a Program to print Length of the string without using strlen() function

import java.util.*;
class Day30
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		int i = 0;
      	for(char c: str.toCharArray()) 
      	{
         	i++;
      	}
      	System.out.println(i);
	}
}