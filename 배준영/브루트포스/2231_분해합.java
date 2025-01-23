import java.util.Scanner;

class Main {
	
	static int array[], N, M;
	static boolean visit[];
	static int max_card;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		
		for (int i = 0; i < 9 * number.length(); i++)
		{
			String cur_number = Integer.toString((Integer.parseInt(number) - (9 * number.length()) + i));			
			int sum = Integer.parseInt(cur_number);
			
			for (int index = 0; index < cur_number.length(); index++)
			{
				sum += cur_number.charAt(index) - '0';
			}
			
			if (sum == Integer.parseInt(number))
			{
				System.out.println(cur_number);
				return;
			}
 		}
		System.out.println(0);
	}
	
}
