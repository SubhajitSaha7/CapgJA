package LabBook;
import java.util.*;

public class Excercise7 {
	public boolean checkNumber(int number)
	{
		int n=number, d1;
		boolean flag=true;
		int d2=n%10;
		n/=10;
		while(n!=0)
		{
			d1=n%10;
			n=n/10;
			if(d1>d2)
			{
				flag=false;
				break;
			}
			else
			{
				d2=d1;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Excercise7 e=new Excercise7();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean f=e.checkNumber(n);
		if(f==true)
		{
			System.out.println(n+" is an Increasing Number");
		}
		else
		{
			System.out.println(n+" is not an Increasing Number");
		}
	}

}
