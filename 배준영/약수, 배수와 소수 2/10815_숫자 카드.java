import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashMap<Integer, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int key = sc.nextInt();
			
			if (map.containsKey(key)) 
				map.replace(key, (map.get(key)+1));
			
			else
				map.put(key, 1);
		}
		
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int key = sc.nextInt();
			
			if (map.containsKey(key))
				System.out.print(map.get(key) + " ");
			else
				System.out.print(0 + " ");
		}
	}
}
