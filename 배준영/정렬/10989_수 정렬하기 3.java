import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;


class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int array[], cnt[], answer[]; 
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		
		array = new int[T];
		cnt = new int[10001];
		answer = new int[T];
		
		for (int i = 0; i < T; i++) {
			int temp = Integer.parseInt(br.readLine());
			array[i] = temp;
			cnt[temp] += 1;
		}
		
		for (int i = 1; i <= 10000; i++)
			cnt[i] += cnt[i-1];
		
		for (int i = 0; i < T; i++) {
			int temp = array[i];
			answer[cnt[temp]-1] = temp;
			cnt[temp]--;
		}
		
		for (int i = 0; i < T; i++)
			bw.write(answer[i]+"\n");
		bw.flush();
	}
}








