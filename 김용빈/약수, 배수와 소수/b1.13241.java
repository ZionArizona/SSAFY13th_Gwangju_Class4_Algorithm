import java.util.Scanner;

public class b1_13241 {
	public static Long gcd(Long A, Long B) {
		Long R = (long) 0;

		while(B != 0) {
			R = A%B;
			A = B;
			B = R;
		}
		return A;
	}
	public static long lcm(Long A, Long B) {
		return (A*B) / gcd(A, B);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		long A = sc.nextLong();
		long B = sc.nextLong();

		System.out.println(lcm(A, B));
	}
}
