// Write a Program to Replace substring in a string

import java.util.*;
class Day40
{
	public static void main(String[] args) 
	{
		String str,str2,str3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		str = sc.next();

		System.out.println("Enter the substring to be removed :");
		str2 = sc.next();

		System.out.println("Enter the new substring :");
		str3 = sc.next();

        String str4 = str.replace(str2, str3);
        System.out.println(str4);
	}
}