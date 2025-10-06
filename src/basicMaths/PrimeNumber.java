package basicMaths;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Check Prime Number or Not: ");
		int num = sc.nextInt();
		boolean prime = true;;
		for(int i = 2; i <= num/2;i++)
		{
			if(num%i == 0)
			{
				prime = false;
			}
		}
		
		if(prime == true)
		{
			System.out.println("Prime");
			
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}

}
