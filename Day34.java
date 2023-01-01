// Write a Program to Remove brackets from an algebraic expression

import java.util.*;
class Day34
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		String result = str.replaceAll("[(){}]","");
     	System.out.println(result);
	}
}