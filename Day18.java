// Write a program to Add two fractions

import java.util.Scanner;
class Day18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();    
        int den2 = sc.nextInt();
        int num, den, x;
        if(den1 == den2)
        {
            num = num1 + num2 ;
            den = den1 ;
        }
        else
        {
            num = (num1*den2) + (num2*den1);
            den = den1 * den2;
        }
        if(num > den)
            x = num;
        else
            x = den;
        for(int i = 1 ; i <= x ; i++)
        {
            if(num%i == 0 && den%i == 0)
            {
                num = num/i;
                den = den/i;
            }
        }
        System.out.println(num/den+" / "+den/den);                                 
    }
}