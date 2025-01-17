// 버블 정렬로 풀었습니다
// 시간 복잡도 O(N^2)
import java.util.Scanner;

class Main {

	static int array[];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		array = new int[5];
		
		for (int i = 0; i < 5; i++)
			array[i] = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j-1] > array[j]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		
		double sum = 0;
		
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		
		System.out.println((int)(sum/5));
		System.out.println(array[2]);

	}
}
