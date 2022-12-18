// Write a program to find ASCII values of a character

import java.util.*;
class Day3
{
	public static void main(String[] args) 
	{

		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Character:  ");
		ch = sc.next().charAt(0);

		int asciiValue = ch;

		System.out.println(asciiValue);
			
	}	
}