import java.util.Arrays;
import java.util.Scanner;

class Solution {
	
	static int array[], length[];
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		
		array = new int[T];
		length = new int[T-1];
		
		for (int test_case = 0; test_case < T; test_case++)
			array[test_case] = sc.nextInt();
		
		for (int i = 1; i < T; i++) 
			length[i-1] = array[i] - array[i-1];

		
		int min_length = length[0];
		
		for (int i = 1; i < length.length; i++) 
		{
			int big = length[i] < min_length ? min_length : length[i];
			int small = length[i] < min_length ? length[i] : min_length;
			
			while (big % small != 0) 
			{
				int temp = big;
				big = small;
				small = temp % small;
			}
			
			if (min_length > small)
				min_length = small;
		}
		
		for (int i = 0; i < length.length; i++)
		{
			sum += length[i] / min_length - 1;
		}
		
		System.out.println(sum);
	}
}
