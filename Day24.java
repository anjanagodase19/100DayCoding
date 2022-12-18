// Write a program to print Pyramid pattern using stars

import java.util.*;
class Day24
{
	public static void main(String[] args) 
	{
		int n,k = 0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();

		for (int i=1;i<=n;i++,k=0) 
		{
			while(k != 2 * i - 1) 
	    	{
		        System.out.print("*");
		        k++;
	    	}
			System.out.println();
		}
	}
}