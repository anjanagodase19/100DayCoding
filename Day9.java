// Write a program to find Number of digits in an integer

import java.util.*;
class Day9 {
  public static void main(String[] args) 
  {

    int count = 0, num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:...");
    num = sc.nextInt();

    while (num != 0) 
    {
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }
}