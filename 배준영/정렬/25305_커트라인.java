// 선택 정렬로 풀었습니다
// 시간 복잡도 O(N^2)
import java.util.Arrays;
import java.util.Scanner;

class Main {

	static int array[];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		int K = sc.nextInt();
		
		array = new int[T];
		
		for (int i = 0; i < T; i++)
			array[i] = sc.nextInt();
		
		
		for (int i = 0; i < array.length-1; i++) {
			int index = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[index] > array[j]) 
					index = j;				
			}
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		
		System.out.println(array[array.length-K]);
	}
}
