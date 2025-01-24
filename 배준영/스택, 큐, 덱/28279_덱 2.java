import java.util.*;
import java.io.*;

class Main {
	
	static ArrayDeque<Integer> queue = new ArrayDeque<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= T; test++) 
		{
			String st[] = br.readLine().split(" ");
			
			switch (Integer.parseInt(st[0])) {
			case 1:
				queue.addFirst(Integer.parseInt(st[1]));
				break;
				
			case 2:
				queue.addLast(Integer.parseInt(st[1]));
				break;
				
			case 3:
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.removeFirst() + "\n");
				break;
				
			case 4:
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.removeLast() + "\n");
				break;
				
			case 5:
				bw.write(queue.size() + "\n");
				break;
				
			case 6:
				if (queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
				
			case 7:
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.getFirst() + "\n");
				break;
				
			case 8:
				if (queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.getLast() + "\n");
				break;
				
			}			
		}
		
		bw.flush();
	}
}

