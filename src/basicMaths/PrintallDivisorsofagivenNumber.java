
package basicMaths;

import java.util.Scanner;

public class PrintallDivisorsofagivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Print all Divisors of a Give Number: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num/2; i++)
		{
			if(num%i == 0)
			{
				System.out.print(i+",");
			}
		}
		System.out.print(num);

	}

}
