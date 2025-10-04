package basicMaths;

import java.util.Scanner;

public class ReverseDigitsofANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print ReverseDigitsofANumber: ");
		int num = sc.nextInt();
		int sum = 0;
		int sign = 1;
		if(num < 0)
		{
			sign = -1;
		}
		num = Math.abs(num);
		
		while(num > 0)
		{
			int rem = num%10;
			num/=10;
			sum = (sum * 10)+rem;
		}
		sum *= sign;
		
		System.out.println(sum);
	}

}
