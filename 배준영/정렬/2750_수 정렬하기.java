// 삽입 정렬를 사용 
// 시간 복잡도 최대 : O(N^2), 최소 : O(NlogN)
import java.util.Scanner;

class Main {

	static int array[];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		array = new int[T];
		
		for (int i = 0; i < T; i++)
			array[i] = sc.nextInt();
		
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int index = i - 1;
			
			while (index >= 0 && array[index] > temp) {
				array[index+1] = array[index];
				index--;
			}
			
			array[index+1] = temp;
		}
		
		for(int i = 0; i < T; i++) 
			System.out.println(array[i]);

	}
}
