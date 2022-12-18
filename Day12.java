//Write a program to find Sum of digits of a number

import java.util.*;

class Day12
{
	public static void main(String[] args) 
	{

		int number,digit,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Number:....");
		number=sc.nextInt();

		while(number>0)
		{
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println(sum);
	}
}