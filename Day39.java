//  Write a Program to check if two strings are Anagram or not

import java.util.*;
class Day39
{
	public static void main(String[] args) 
	{
		String str1 ,str2;
	    Scanner sc=new Scanner(System.in);
	    str1=sc.next();
	    str2=sc.next();
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    if(str1.length() == str2.length()) {

		    char[] charArray1 = str1.toCharArray();
		    char[] charArray2 = str2.toCharArray();

		    Arrays.sort(charArray1);
		    Arrays.sort(charArray2);

		    boolean result = Arrays.equals(charArray1, charArray2);

		    if(result) 
		    {
		       System.out.println("Anagram.");
		    }
		    else 
		    {
		      System.out.println("Not Anagram.");
		    }
	    }
	    else 
	    {
	      System.out.println("Not anagram.");
	    }
	}
} 