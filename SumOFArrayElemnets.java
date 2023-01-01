// Write Program to find sum of elements in an array

import  java.util.*;
class SumOFArrayElemnets
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int sum=0;

		System.out.println("Enter the element of array: ");
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		for (int i = 0;i < arr.length; i++){  
           sum = sum + arr[i];  
        }  
		System.out.println("sum of array element:"+sum);
	}
}