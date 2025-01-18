import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (map.containsKey(x))
				map.get(x).add(y);
				
			else {
				map.put(x, new ArrayList<>());
				map.get(x).add(y);
			}
		}
		
		ArrayList<Integer> key_sort = new ArrayList<>(map.keySet());
		Collections.sort(key_sort);
		
		for (int key : key_sort) {
			ArrayList<Integer> temp = map.get(key);
			Collections.sort(temp);
			for (int y : temp)
				System.out.println(key + " " + y);
		}
 	}
}
