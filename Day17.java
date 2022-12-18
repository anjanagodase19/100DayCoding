// Write a program to find the Factors of a number

import java.util.*;
class Day17
{
public static void main(String[] args) 
{
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for (int i = 1; i <= n; ++i) 
	{
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
}
}