import java.util.Scanner;

// 1010 : 다리 놓기
public class s5_1010 {
	public static void main(String[] args) {
		int[][] df = new int[30][30];
		for(int i = 0; i < 30; i++) {
			df[i][0] = 1;
			df[i][i] = 1;
		}
		
		for(int i = 2; i < 30; i++) {
			for(int j = 1; j < 30; j++) {
				df[i][j] = df[i-1][j-1] + df[i-1][j];
			}
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.println(df[M][N]);
			
		}
	}
}
