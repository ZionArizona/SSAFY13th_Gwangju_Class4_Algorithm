import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int sugar = sc.nextInt();
		
		for (int five_kg = sugar/5; five_kg >= 0; five_kg--) {
			
			int temp = sugar - five_kg * 5;
			
			if (temp % 3 == 0) {
				System.out.println(five_kg + temp/3);
				return;
			}
		}
		
		System.out.println(-1);
	
	}
}
