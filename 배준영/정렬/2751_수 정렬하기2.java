// 병합 정렬로 풀었습니다
// 시간 복잡도 O(NlogN)
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	static int array[], temp[];
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = sc.nextInt();
		array = new int[T];
		temp = new int[T];
		
		for (int i = 0; i < T; i++)
			array[i] = sc.nextInt();
		
		mergeSort(0, array.length-1);
		
		for (int i = 0; i < T; i++) {
			bw.write(array[i] + "\n");
		}
		
		bw.flush();
	}
	
	public static void mergeSort(int start, int end) {
		
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			
			merge(start, mid, end);
		}
		
	}
	
	public static void merge(int start, int mid, int end) {
		
		int p = start;
		int q = mid+1;
		int index = start;
		
		while(p <= mid && q <= end) {
			if (array[p] < array[q])
				temp[index++] = array[p++];
			else
				temp[index++] = array[q++];
		}
		
		while (p <= mid) 
			temp[index++] = array[p++];
		
		
		while(q <= end)
			temp[index++] = array[q++];
		
		for (int i = start; i <= end; i++)
			array[i] = temp[i];
	}
}
