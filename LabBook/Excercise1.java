//Create a method to find the sum of the cubes of the digits
//of an n digit number
package LabBook;
import java.util.*;

public class Excercise1 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits in the number");
		int n=sc.nextInt();
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0, d, c=num;
		if(n>=1)
			{
				for(int i=1;i<=n;i++)
				{
					d=num%10;
					sum+=d*d*d;
					num/=10;
				}
				System.out.println("Sum of the cubes of the digits of "+c
						+" is "+sum);
			}
		else
			System.out.println("Wrong Input");
	}

	
}
