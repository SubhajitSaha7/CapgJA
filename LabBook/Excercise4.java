//WAP that prompts the user for an integer and then
//prints out all the prime numbers up to that integer
package LabBook;
import java.util.*;
public class Excercise4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		
		boolean flag=false;
		if(n<=1)
			System.out.println("There is no prime number up to "+n);
		else
		{
			for(int i=2;i<=n;i++)
			{
				int c=0, b=1;
				while(b<=n)
				{
					if(i%b==0)
						c++;
					b++;
				}
				if(c==2)
					System.out.print(i+"\t");
			}
		}
	}		
}
