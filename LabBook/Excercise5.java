package LabBook;
import java.util.*;

public class Excercise5 {
	
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Excercise5 e=new Excercise5();
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int s=e.calculateSum(n);
		System.out.println("The sum of numbers divisible by 3 or 5 is "+s);
	}

}
