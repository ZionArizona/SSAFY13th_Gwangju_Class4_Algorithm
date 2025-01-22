package acmicpc;
import java.util.Arrays;
import java.util.Scanner;

public class bk_2750 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ar[] = new int[N]; 
		
		for(int i=0; i<N; i++) {
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		for(int i=0; i<N; i++) {
			System.out.println(ar[i]);
		}
	}
}
