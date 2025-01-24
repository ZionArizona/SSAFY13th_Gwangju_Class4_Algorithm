import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;

class Main {
	
	static ArrayDeque<Integer> queue = new ArrayDeque<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		for (int cur_number = 1; cur_number <= number; cur_number++)
			queue.add(cur_number);
		
		while (queue.size() != 1) {
			
			queue.poll();
			queue.add(queue.poll());
					
		}
		
		bw.write(queue.getFirst() + "\n");
		bw.flush();
	}
}

