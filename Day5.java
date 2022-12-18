// Write a program to identify if the number is even or odd

import java.util.*;
class Day5
{
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:..");
		num = sc.nextInt();
		if(num%2 ==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}