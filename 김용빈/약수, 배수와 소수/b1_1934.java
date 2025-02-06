import java.util.Scanner;

public class b1_1934 {
	public static int gcd(int A, int B) {
		int R = 0;
		
		while(B != 0) {
			R = A%B;
			A = B;
			B = R;
		}
		return A;
	}
	public static int lcm(int A, int B) {
		return (A*B) / gcd(A, B);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(lcm(A, B));
		}
	}
}
