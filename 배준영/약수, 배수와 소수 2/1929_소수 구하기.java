import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for (int i = M; i <= N; i++) 
		{
			if (i == 1)
				continue;
			
			else if (is_prime(i))
				System.out.println(i);
		}
	}
	
	public static boolean is_prime(int number) {
		
		boolean success = true;
		
		for (int i = 2; i <= (int)Math.sqrt(number); i++) 
		{
			if (number % i == 0)
				success = false;
		}
		
		return success;
		
	}
}
