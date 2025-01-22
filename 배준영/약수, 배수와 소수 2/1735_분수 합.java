import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A_up = sc.nextInt();
		int A_down = sc.nextInt();
		
		int B_up = sc.nextInt();
		int B_down = sc.nextInt();
		
		int small = A_down < B_down ? A_down : B_down;
		int big = A_down < B_down ? B_down : A_down; 
		
		while (big % small != 0) {
			int temp = big;
			big = small;
			small = temp % small;
		}
		
		int new_down = A_down * B_down / small;
		int new_up = (A_up*(new_down/A_down))+(B_up*(new_down/B_down));
		
		small = new_up;
		big = new_down;
		
		while (big % small != 0) {
			int temp = big;
			big = small;
			small = temp % small;
		}
		
		
		
		System.out.println(new_up/small + " " + new_down/small);
	}
	

}
