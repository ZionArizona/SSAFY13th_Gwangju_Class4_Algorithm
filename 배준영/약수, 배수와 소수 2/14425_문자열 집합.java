import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.TreeMap;


class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<String> set = new HashSet<>();
	static String st;
	static boolean visit[];
	static int count = 0;
	
	
	public static void main(String[] args) throws IOException {
		
		String st[] = br.readLine().split(" ");
		int N = Integer.parseInt(st[0]);
		int M = Integer.parseInt(st[1]);
		count = 0;
		
		for (int i = 0; i < N; i++)
			set.add(br.readLine());
		
		for (int i = 0; i < M; i++)
			if (set.contains(br.readLine()))
				count++;
		
		bw.write(Integer.toString(count));
		bw.flush();
	}
}

