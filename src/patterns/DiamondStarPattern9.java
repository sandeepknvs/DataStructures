package patterns;

import java.util.Scanner;

public class DiamondStarPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print InvertedRightPattern: ");
		int num = sc.nextInt();
		int temp = num;
		for(int i = 0; i < num; i++)
		{
			for(int j = num-i-1; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i * 2 + 1; k++)
			{
				System.out.print("*");
			}
			for(int j = num-i-1; j > 0; j--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 0; i < num; i++)
		{
		
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k < temp*2 - 1; k++)
			{
				System.out.print("*");	
			}
			temp--;
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
