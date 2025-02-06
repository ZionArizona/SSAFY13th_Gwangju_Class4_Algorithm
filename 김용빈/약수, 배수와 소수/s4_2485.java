import java.util.Scanner;

public class s4_2485 {
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
	int N = sc.nextInt();
	int[] arr = new int[N];
	
	for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
	
	int dist = 0;
	for(int i=0; i<N-1; i++) {
		dist = gcd(arr[i+1]-arr[i], dist);
	}
	
	int result = ((arr[arr.length-1]-arr[0]) / dist)+1 - N;
	
	System.out.println(result);
}
}
