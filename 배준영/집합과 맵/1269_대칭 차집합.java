import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.TreeMap;

// Hashset 사용

class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<Integer> a_map = new HashSet<>();
	static HashSet<Integer> b_map = new HashSet<>();

	
	public static void main(String[] args) throws IOException {
		
		String st[] = br.readLine().split(" ");
		int A = Integer.parseInt(st[0]);
		int B = Integer.parseInt(st[1]);
		int count = 0;
		
		st = br.readLine().split(" ");
		for (int i = 0; i < A; i++)
			a_map.add(Integer.parseInt(st[i]));
		
		st = br.readLine().split(" ");
		for (int i = 0; i < B; i++)
			b_map.add(Integer.parseInt(st[i]));
		
		
		for (int temp : a_map) 
			if(!b_map.contains(temp))
				count++;
		
		for (int temp : b_map)
			if(!a_map.contains(temp))
				count++;
		
		bw.write(Integer.toString(count));
		bw.flush();
	}
	
}
