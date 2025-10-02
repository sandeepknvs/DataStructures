package patterns;

import java.util.Scanner;

public class AlphaHillPattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print AlphaHillPattern17: ");
		int num = sc.nextInt();
		//int temp = num-1;
		for(int i = 1; i <= num; i++)
		{
			
			for(int j = 1; j < num-i+1;j++)
			{
				System.out.print("*");
			}
			char ch = 'A';
			int breakpoint = (2*i+1)/2;
			for(int j = 1;j <= 2*i-1;j++)
			{
				System.out.print(ch);
				if(j<=breakpoint)
				ch++;
				else
					ch--;
			}
			for(int j = 1; j < num-i+1;j++)
			{
				System.out.print("*");
			}
			//temp--;
			System.out.println();
		}
	}

}
