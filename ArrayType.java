// Write Program to find the array type
// Day43

import java.util.*;
class ArrayType
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();

		System.out.println("Enter the element of array: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int odd=0,even=0;
        for (int i = 0; i < n; i++) {
	        if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		if(odd == n){
			System.out.print("Odd");
		}
		else if(even == n){
			System.out.print("Even");
		}
		else{
			System.out.print("Mixed");
		}
	}
}