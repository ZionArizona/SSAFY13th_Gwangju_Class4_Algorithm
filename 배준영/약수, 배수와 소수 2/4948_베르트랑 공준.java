import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		
		while(true) {
			
			number = sc.nextInt();
			
			if(number == 0)
				break;
			
			int count = 0;
			
			for (int n = number+1; n <= 2 * number; n++)
			{
				if(is_Prime(n))
					count++;
			}
			
			System.out.println(count);
			
		}	
		
	}
	
	
	public static boolean is_Prime(int x) {
		
		boolean is_prime = true;
		
		if (x == 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(x); i++)
		{
			if (x % i == 0) 
			{
				is_prime = false;
				break;
			}
		}		
			
		return is_prime;
	}
	

}
