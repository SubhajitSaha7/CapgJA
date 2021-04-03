/*
  1
  2 4
  3 5 7
  6 8 10 12
  9 11 13 15 17		*/
package Pattern;
import java.util.*;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int odd=1, even=2;
		for (int i=1; i<=n; i++) 
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(even+" ");
					even+=2;
				}
				else
				{
					System.out.print(odd+" ");
					odd+=2;
				}
			}
			System.out.println("");
		}
	}

}
