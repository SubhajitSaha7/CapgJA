package LabBook;
import java.util.*;

public class Excercise6 {
	public int calculateDifference(int n)
	{
		int sum1=0, sum2=0, diff=0;
		for(int i=1; i<=n; i++)
		{
			sum1+=i*i;
			sum2+=i;
		}
		sum2*=sum2;
		diff=sum1-sum2;
		return diff;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Excercise6 e=new Excercise6();
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int difference=e.calculateDifference(n);
		System.out.println("The difference between the sum of the squares "
				+ "and the square of their sum: "+difference);
		
	}

}
