import java.util.Scanner;

public class s3_1735 {
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
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int o1 = sc.nextInt();
		int o2 = sc.nextInt();

		int parent = n2*o2;
		int child = n2*o1 + o2*n1;
		
		int gcd = gcd(parent, child);
		parent /= gcd;
		child /= gcd;
		
		System.out.print(child + " ");
		System.out.println(parent);
		
	}
}
