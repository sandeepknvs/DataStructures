package basicMaths;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers to check GCD: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int highest = 1;
		for(int i = Math.min(num1, num2); i>= 1; i--)
		{
			if(num1%i == 0 && num2%i == 0)
			{
				highest = i;
				break;
			}
		}
		System.out.println(highest);
	}

}
