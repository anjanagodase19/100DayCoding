// Write a program to identify if the number is Strong number or not

import java.util.*;
class Day15
{
public static void main(String[] args) 
{
	int n, i , fact_n, lastdig;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int total = 0,temp_n = n;
	while(n != 0)
	{
		i = 1;
		fact_n = 1;
		lastdig = n % 10;
		while(i <= lastdig)
		{
			fact_n = fact_n * i;
			i++;
		}
		total = total + fact_n;
		n = n / 10;
	}
	if(total == temp_n)
	{
		System.out.println("Strong number\n");
	}
	else
	{
		System.out.println("Not a strong number\n");
	}
	System.out.println();
}
}