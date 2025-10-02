package patterns;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print IncreasingNumberTrianglePattern: ");
		int num = sc.nextInt();
		int temp = 1;
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
