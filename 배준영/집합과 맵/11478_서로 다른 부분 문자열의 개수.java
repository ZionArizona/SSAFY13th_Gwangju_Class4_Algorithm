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
	static int count;
	
	
	public static void main(String[] args) throws IOException {
		
		st = br.readLine();
		visit = new boolean[st.length()];
		count = 0;
		
		for (int i = 0; i < st.length(); i++) 
			for (int j = i+1; j <= st.length(); j++) 
				set.add(st.substring(i, j));	
		
		bw.write(Integer.toString(set.size()));
		bw.flush();
	}
}
