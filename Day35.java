import java.util.*;
class Day35
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		int sum=0;
		for (int i = 0; i < str.length(); i++) 
		{
      		if(Character.isDigit(str.charAt(i))) 
      		{
      			sum=sum+Character.getNumericValue(str.charAt(i));
      		}
        }
		System.out.println(sum);
	}
}