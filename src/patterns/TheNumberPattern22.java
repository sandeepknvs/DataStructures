package patterns;

import java.util.Scanner;
import java.lang.Math;
public class TheNumberPattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print AlphaHillPattern17: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < (num*2)-1; i++)
		{
			for(int j = 0; j < (num*2)-1; j++)
			{
				int top = i;
				int left = j;
				int right = (2*num-2)-j;
				int bottom = (2*num-2)-i;
				System.out.print(num-Math.min(Math.min(top,bottom),Math.min(left,right)));
				
			}
			System.out.println();
			
		}
	}

}
