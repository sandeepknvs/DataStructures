package arrays;

public class FindtheLargestelementinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,10,5,7,9};
		int highest = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > highest)
			{
				highest = arr[i];
			}
		}
		
		System.out.println(highest);
		

	}

}
