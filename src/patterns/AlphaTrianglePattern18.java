package patterns;

import java.util.Scanner;

public class AlphaTrianglePattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print AlphaHillPattern17: ");
		int num = sc.nextInt();
		char ch = 'A';
		
		for(int i = 1; i <= num; i++)
		{
			
			for(int j = 0; j <i; j++)
			{
				ch = (char) (ch+num-i);
				System.out.print(ch);
				ch++;

			}
			ch--;
			System.out.println();
		}
	}

}
