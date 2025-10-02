package patterns;

import java.util.Scanner;

public class InvertedRightPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print InvertedRightPattern: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}