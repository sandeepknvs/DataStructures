package patterns;

import java.util.Scanner;

public class RightAngledNumberPyramidII4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print RightAngledNumberPyramid: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();

	}

		
	}

}
