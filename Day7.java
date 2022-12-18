// Write a program to find Number of days in a given month of a given year

import java.io.*;
import java.util.*;

class Day7{

    public static void main(String args[])
    {
        int month, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month:");
        month = sc.nextInt();
        System.out.println("Enter the year:");
        year = sc.nextInt();
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days is 29");

        else if(month==2)
            System.out.println("Number of days is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");
    }

}