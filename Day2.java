// Write a program to identify if the character is an alphabet or not.

import java.util.*;
class Day2
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the Character :  ");
		char ch = sc.next().charAt(0);

		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not an alphabet");		
		}
	}
}