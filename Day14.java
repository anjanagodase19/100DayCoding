// Write a program to reverse a given number

import java.util.*;

class Day14
{
	public static void main(String[] args) 
	{
		int num, reverse = 0;
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		while(num !=  0)
		{
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num/10;
		}
		System.out.println(reverse);
	}
}