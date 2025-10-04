package basicMaths;

import java.util.Scanner;

public class CheckifanumberisPalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print ReverseDigitsofANumber: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while(num > 0)
		{
			int rem = num%10;
			num/=10;
			sum = (sum * 10)+rem;
		}
		
		if(sum == temp)
		{
			System.out.println("True");
	}
		else
		{
			System.out.println("False");
		}

	}

}
