import java.util.Scanner;

public class s4_4134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			long n = 0;
			n = sc.nextLong();
			
			if(n == 0 | n == 1) {
				System.out.println(2);
				continue;
			}
			
			while(true) {
				for(int j=2; j<=Math.sqrt(n); j++) {
					if(n%j == 0) {
						n++; j=1;
						continue;
					}
				}
				break;
			}
			System.out.println(n);
		}
	}
}
