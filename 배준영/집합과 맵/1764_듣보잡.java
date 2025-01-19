import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// 값 존재하는지는 HashSet을 이용해서 비교 (Set 이 시간복잡도가 적음)
// answer 부분은 ArrayList로 넣어서 정렬 (Set는 정렬 기능을 제공하지 않음)

class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<String> array = new HashSet<>();
	static ArrayList<String> answer = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		String st[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(st[0]);
		int M = Integer.parseInt(st[1]);
		
		for (int i = 0; i < N; i++)
			array.add(br.readLine());

		for (int i = 0; i < M; i++) {
			String temp = br.readLine();
			if(array.contains(temp))
				answer.add(temp);
		}
		
		Collections.sort(answer);
		
		bw.write(Integer.toString(answer.size()));
		bw.newLine();
		bw.write(answer.toString().replace(", ", "\n").replaceAll("[\\[\\]]", ""));
		bw.flush();
	}
}

