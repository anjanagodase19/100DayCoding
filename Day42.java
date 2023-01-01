//Write Program to check if two arrays are the same or not

import java.util.*;
class Day42{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array :");
		int x= sc.nextInt();

		System.out.println("Enter the size of second array:");
		int y= sc.nextInt();

		System.out.println("Enter elements of first array:");
		int[] arrx = new int[x];
        for (int i = 0; i < x;i++){
            arrx[i] = sc.nextInt();
        }
		
		System.out.println("Enter elements of second array:");
		int[] arry = new int[y];
        for (int i = 0; i < y; i++) {
            arry[i] = sc.nextInt();
        }
  
        if (Arrays.equals(arrx, arry)){
        	System.out.println("Same");
        }
        else{
        	System.out.println("Not Same");
        }
	}
}