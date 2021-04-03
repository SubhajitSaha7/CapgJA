package LabBook;
import java.util.*;

public class Excercise8 {
	public boolean checkNumber(int n)
	{
		boolean flag=true;
		if (n==0)
            flag= false;
         
        while (n!=1)
        {
            if (n%2!=0)
                flag=false;
            n=n/2;
        }
        flag=true;
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Excercise8 e=new Excercise8();
		System.out.println("Enter the number to be checked:");
		int n=sc.nextInt();
		boolean flag=e.checkNumber(n);
		if(flag)
			System.out.println(n+" is a power of 2.");
		else
			System.out.println(n+" is not a power of 2.");
		
	}

}
