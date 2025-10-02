package patterns;

import java.util.Scanner;

public class InvertedNumberedRightPyramid6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print InvertedNumberedRightPyramid6: ");
		int num = sc.nextInt();
		
		//
		//* * * * * 
		//* * * * 
		//* * * 
		//* * 
		//* 
		
		
		/*1->5
		 2->4
		 3-3
		 4-2
		 5-1
		 
		 */
		
		/*
		 5-1+1
		 5-2+1
		 5-3+1
		 */
		for(int i = 1; i <= num; i++)
		{
			//int k = 1;
			for(int j = 1; j <= num-i+1; j++)
			{
				System.out.print(j+" ");
				//k++;
			}
			System.out.println();
		}

	}

}
