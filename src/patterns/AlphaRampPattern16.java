package patterns;

import java.util.Scanner;

public class AlphaRampPattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print AlphaRampPattern: ");
		int num = sc.nextInt();
		char ch = 'A';
		for(int i = 1; i <= num; i++)
		{
			for(int j = 0; j <i; j++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}

}
