import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;

class Main {
	
	static ArrayDeque<Integer> queue = new ArrayDeque<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++)
		{
			String st[] = br.readLine().split(" ");
			
			if (st[0].equals("push")) {
				queue.add(Integer.parseInt(st[1]));
				continue;
			}
			else if (st[0].equals("pop")) {
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.poll()+"\n");
				continue;
			}
			else if (st[0].equals("size")) {
				bw.write(queue.size()+"\n");
				continue;
			}
			else if (st[0].equals("empty")) {
				if (queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				continue;
			}
			else if (st[0].equals("front")) {
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.peekFirst()+"\n");
				continue;
			}
			else if (st[0].equals("back")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.peekLast()+"\n");
				continue;
			}	
				
		}
		
		bw.flush();
	}
}

