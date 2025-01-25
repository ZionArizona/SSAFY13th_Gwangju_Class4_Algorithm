import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	static int init_array[], array[], answer[];
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = sc.nextInt();
		array = new int[N];
		init_array = new int[N];
		answer = new int[N];
		
		for (int index = 0; index < N; index++)
		{
			array[index] = sc.nextInt();
			init_array[index] = array[index];
		}
		
		MergeSort(0, array.length-1);
		
		int number = 0;
		
		for (int index = 0; index < N; index++) {
			if (!map.containsKey(array[index]))
				map.put(array[index], number++);
		}
		
		for (int index = 0; index < N; index++) {
			bw.write(map.get(init_array[index]) + " ");
		}
		
		bw.flush();
		
	}
	
	public static void MergeSort(int start, int end) {
		
		if (start < end) {
			int mid = (start + end) / 2;
			MergeSort(start, mid);
			MergeSort(mid+1, end);
			Merge(start, mid, end);
		}
	}
	
	public static void Merge(int start, int mid, int end) {
		
		int p = start;
		int q = mid+1;
		int index = start;
		
		while (p <= mid && q <= end) {
			
			if (array[p] < array[q]) 
				answer[index++] = array[p++];
			else
				answer[index++] = array[q++];
	
		}
		
		while (p <= mid)
			answer[index++] = array[p++];
		while (q <= end)
			answer[index++] = array[q++];
		
		for (int i = start; i <= end; i++)
			array[i] = answer[i];
		
	}
	
}
