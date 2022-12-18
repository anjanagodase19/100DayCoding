// Write a program to find the Quadrants in which coordinates lie

import java.util.*;
class Day6
{
	public static void main(String args[])
	{
		double x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X and Y co-ordinates:");
		x=sc.nextDouble();
		y=sc.nextDouble();

		if(x>0 && y>0)
		{
			System.out.println("This point lies in first quadrant.");
		}
		else if(x<0 && y>0)
		{
			System.out.println("This point lies in second quadrant.");
		}
		else if(x<0 && y<0)
		{
			System.out.println("This point lies in third quadrant.");
		}
		else if(x>0 && y<0)
		{
			System.out.println("This point lies in fourth quadrant.");
		}
		else 
		{
			System.out.println("This point lies at origin.");
		}
	}
}