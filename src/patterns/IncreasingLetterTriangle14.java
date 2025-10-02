package patterns;

import java.util.Scanner;

public class IncreasingLetterTriangle14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print InvertedRightPattern: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++)
		{
			char ch = 'A';
			for(int j = 0; j < i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
