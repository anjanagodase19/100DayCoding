// Write a program to identify if the number is Armstrong number or not

import java.util.*;
class Day19
{
	public static void main(String[] args) {
		int number, originalNumber, remainder, result = 0;

		Scanner sc = new Scanner(System.in);
	  	number = sc.nextInt();   
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("Armstrong number.");
        else
            System.out.println("not an Armstrong number.");
	}
}