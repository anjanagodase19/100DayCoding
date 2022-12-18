// Java program to find maximum number of handshakes.

import java.util.*;
class Day26
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println((n * (n - 1)) / 2);
	}
	
}