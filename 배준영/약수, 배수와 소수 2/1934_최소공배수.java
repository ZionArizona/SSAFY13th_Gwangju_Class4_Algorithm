import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int small = A < B ? A : B;
			int big = A < B ? B : A;
			
			
			while(big % small != 0) {
				int temp = small;
				small = big % small;
				big = temp;
			}
			
			System.out.println(A*B/small);
			
		}
	}
	

}
