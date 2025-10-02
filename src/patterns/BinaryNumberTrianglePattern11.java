package patterns;

import java.util.Scanner;

public class BinaryNumberTrianglePattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print BinaryNumberTrianglePattern11: ");
		int num = sc.nextInt();
		int temp = num;
		for(int i = 1; i<= num; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i%2 != 0)
				{
					if(j%2 == 0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
				else
				{
					if(j%2 == 0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				
			}
			System.out.println();
		}

	}

}
