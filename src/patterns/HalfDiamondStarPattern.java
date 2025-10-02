package patterns;

import java.util.Scanner;

public class HalfDiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print InvertedRightPattern: ");
		int num = sc.nextInt();
		int temp = 1;
		for(int i = 0; i < num*2-1; i++)
		{
			if(i < num)
			{
				for(int j = 0; j<temp; j++)
				{
					System.out.print("*");
				}
				temp++;
			}
			else
			{
				temp--;
				for(int j = 1; j<temp; j++)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
