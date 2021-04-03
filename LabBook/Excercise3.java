//print fibonacci series till nth value 
//using recursive and non-recursive functions
package LabBook;
import java.util.*;
public class Excercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int n1=1, n2=1;
		Excercise3 a=new Excercise3();
		
		System.out.println("Enter 0 to use non-recursive method\n"
				+ "Enter 1 to use recursive function:");
		int s=sc.nextInt();
		System.out.print(n1+"  "+n2+"  ");
		
		switch(s)
		{
		case 0:
			a.nonrecFibo(n1,n2,n);
			break;
				
		case 1:
			a.recFibo(n,n1,n2);
			break;
			
		default:
			System.out.println("Wrong Entry");
			
		}
	}
	
	
	
	public void nonrecFibo(int num1, int num2, int m)
	{
		int num3=0;
		for(int i=3; i<=m; i++)
		{
			num3=num1+num2;
			System.out.print(num3+"  ");
			num1=num2;
			num2=num3;
		}
	}
	
	public void recFibo(int m, int num1, int num2)
	{
		int num3=0;
		if(m>2)
		{
			num3=num1+num2;
			System.out.print(num3+"  ");
			num1=num2;
			num2=num3;
			recFibo(m-1,num1,num2);
		}
	}

}
