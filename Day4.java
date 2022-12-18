//  Write a program to identify of the a number is positive or negative

import java.util.*;
class Day4
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber:  ");
		num = sc.nextInt();
		if(num<0)
		{
			System.out.println("Negative Number");
		}
		else if(num>0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Neither positive nor negative");
		}
	}
}