import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long big = A < B ? B : A;
		long small = A < B ? A : B;
		
		while(big % small != 0) {
			long temp = big;
			big = small;
			small = temp % small;
		}
		
		System.out.println(A*B/small);
	}
	

}
