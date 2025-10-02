package patterns;

import java.util.Scanner;

public class ReverseLetterTrianglePattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print ReverseLetterTrianglePattern: ");
		int num = sc.nextInt();
		int temp = num;
		for(int i = 0; i < num; i++)
		{
			for(char ch = 'A'; ch < 'A'+temp; ch++)
			{
				System.out.print(ch+" ");
			}
			temp--;
			System.out.println();
		}
		
		
	}

}
