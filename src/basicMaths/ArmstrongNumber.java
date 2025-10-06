package basicMaths;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Check Armstrong Number or Not: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num > 0)
		{
			int rem = num%10;
			num = num/10;
			sum += rem * rem * rem;
		}
		if(sum == temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
