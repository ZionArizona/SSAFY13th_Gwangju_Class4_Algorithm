import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int array[], temp[];
	
	public static void main(String[] args) throws IOException {
		
		String st = sc.next();
		
		array = new int[st.length()];
		temp = new int[st.length()];
		
		for (int i = 0; i < st.length(); i++)
			array[i] = st.charAt(i) - '0';
			
		mergeSort(0, array.length - 1);
		bw.write(Arrays.toString(array).replaceAll("[\\[, \\]]", ""));
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
		int q = mid + 1;
		int index = start;
		
		while (p <= mid && q <= end) {
			if (array[p] > array[q])
				temp[index++] = array[p++]; 
			else
				temp[index++] = array[q++];
		}
		
		while (p <= mid)
			temp[index++] = array[p++];
		
		while (q <= end)
			temp[index++] = array[q++];
		
		for (int i = start; i <= end; i++)
			array[i] = temp[i];
	}
}




