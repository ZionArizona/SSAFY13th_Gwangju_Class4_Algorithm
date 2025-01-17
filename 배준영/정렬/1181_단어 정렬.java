import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashMap<Integer, ArrayList<String>> map = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String temp = sc.next();
			int length = temp.length();
			
			if (map.containsKey(length)) {
				if (!map.get(length).contains(temp))
					map.get(length).add(temp);
			}
			
			else {
				map.put(length, new ArrayList<>());
				map.get(length).add(temp);
			}
		}
		
		ArrayList<Integer> sort_key = new ArrayList<>(map.keySet());
		Collections.sort(sort_key);
		
		for (int key : sort_key) {
			ArrayList<String> temp = map.get(key);
			Collections.sort(temp);
			for (int i = 0; i < temp.size(); i++)
				bw.write(temp.get(i) + "\n");
		}
		
		bw.flush();
	}
}

