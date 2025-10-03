package patterns;

import java.util.Scanner;

public class HollowRectanglePattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print HollowRectanglePattern: ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				if(i == 0 || i == num-1 || j == 0 || j == num-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
