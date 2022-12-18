// Write a program to identify if the number is Perfect number or not

import java.util.*;  
class Day16 
{  
	public static void main(String args[])    
	{  
		long n, sum=0;  
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=sc.nextLong();  
		int i=1;  
		while(i <= n/2)  
		{  
			if(n % i == 0)  
			{
				sum = sum + i;  
			} 
			i++;  
		}
		if(sum==n)  
		{  
			System.out.println("perfect number.");  
		} 
		else 
		{ 
			System.out.println(" Not a perfect number.");
		}   
	}  
}  