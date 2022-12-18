//  Write a Program to Toggle each character in a string

import java.util.*;
class Day31
{
	public static void main(String[] args) 
	{
		String str1;
		Scanner sc= new Scanner(System.in);
		str1=sc.next();
		char str[]=str1.toCharArray();
		for (int i=0; i<str.length; i++)
	    {
	        if (str[i]>='A' && str[i]<='Z')
	            str[i] = (char) (str[i] + 'a' - 'A');
	        else if (str[i]>='a' && str[i]<='z')
	            str[i] = (char) (str[i] + 'A' - 'a');
	    }
	    System.out.println(str1);
	}
}