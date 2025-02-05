import java.util.Scanner;

// 11050 이항 계수 1
public class b1_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(IHJL(N, K));
	}
	public static int IHJL(int N, int K) {
		if(N == K | K == 0)
			return 1;
		
		// 그 유명한 파스칼의 정리
		return IHJL(N-1, K-1) + IHJL(N-1, K);
	}
}
