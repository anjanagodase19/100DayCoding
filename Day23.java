// Write a program to Replace all 0’s with 1 in a given integer

import java.util.*;
class Day_23
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to edit: ");
		int rem=0,rev=0,rev1=0,num=sc.nextInt();
		if(num==0)
			System.out.println(1);
		else 
		{
			while(num!=0)
			{
				rem = num % 10;
				if(rem==0)
				{
					rev=rev * 10 + 1;
				}
				else
				{
					rev=rev * 10 + rem;
				}
				num/=10;
			}
			while(rev!=0)
			{
				int rem1 = rev % 10;
				rev1=rev1 * 10 + rem1;
				rev=rev/10;
			}
			System.out.println(rev1);
		}
	}
}