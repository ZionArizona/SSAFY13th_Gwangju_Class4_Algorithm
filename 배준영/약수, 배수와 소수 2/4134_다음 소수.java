import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
			long number = sc.nextLong();
			int index = 0;
			
			if (number <= 2) {
				System.out.println(2);
				continue;
			}
			
			while(true) {
				long temp = number + index;
				boolean success = true;
				
				for (int i = 2; i <= (int)Math.sqrt(temp); i++) {
					if (temp % i == 0) {
						success = false;
						break;
					}
				}
				
				if (success) {
					System.out.println(temp);
					break;
				}
							
				index++;
			}
		}
		
	}
	

}
