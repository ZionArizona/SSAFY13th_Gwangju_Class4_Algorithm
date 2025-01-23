import java.util.Scanner;

class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for (int number = 666; number <= 9999999; number++)
		{
			String st = Integer.toString(number);
			if (st.contains("666")) 
				count++;
			
			if (count == N) 
			{
				System.out.println(number);
				return;
			}
				
		}
		
	}
}
