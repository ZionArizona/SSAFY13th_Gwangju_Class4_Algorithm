import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashMap<Integer, Integer> map = new HashMap<>();
	static String st[];
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		
		st = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st[i]);
			if (map.containsKey(temp)) 
				map.replace(temp, map.get(temp)+1);
			else
				map.put(temp, 1);
		}
		
		
		int M = Integer.parseInt(br.readLine());
		
		st = br.readLine().split(" ");
		for (int j = 0; j < M; j++) {
			int temp = Integer.parseInt(st[j]);
			if (map.containsKey(temp))
				bw.write(Integer.toString(map.get(temp)) + " ");
			else
				bw.write(Integer.toString(0) + " ");
		}
		
		bw.flush();
		
	}
}

