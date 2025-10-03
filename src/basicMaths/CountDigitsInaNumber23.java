package basicMaths;

import java.util.Scanner;

public class CountDigitsInaNumber23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print CountDigitsInaNumber: ");
		int num = sc.nextInt();
		int count = 0;
		while(num > 0)
		{
			 int rem = num%10;
			 //System.out.println(rem);
			 count++;

			 num/=10;
			 //System.out.println(num);		
		}
		System.out.println(count);
		
	}

}
