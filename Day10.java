// Write a program to find Factorial of a number

import java.util.*;
class Day10
{
  public static void main(String args[])
  {
    int i,number,fact=1;  
    Scanner sc = new Scanner(System.in);
    number = sc,nextInt();
    
    for(i=1;i<=number;i++)
    {    
      fact=fact*i;    
    }    
    System.out.println("Factorial of "+number+" is: "+fact);    
  }  
}  