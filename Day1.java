// Write a program to identify if the character is a vowel or consonant.

import java.util.*;
class Day1
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the Character :  ");
		char ch = sc.next().charAt(0);

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Consonent");

		}
		else
		{
			System.out.println("Invalid Input");		
		}
	}
}