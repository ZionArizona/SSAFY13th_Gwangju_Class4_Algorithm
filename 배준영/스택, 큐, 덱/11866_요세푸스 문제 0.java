import java.util.*;
import java.io.*;

class Main {
	
	static LinkedList<Integer> queue = new LinkedList<>();
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st[] = br.readLine().split(" ");
		
		for (int number = 1; number <= Integer.parseInt(st[0]); number++)
			queue.add(number);
		
		int K = Integer.parseInt(st[1]);
		int index = 0;
		
		while (!queue.isEmpty()) {
			index = (index+K-1) % queue.size();
			list.add(queue.remove(index));
		}
		
		bw.write("<");
		for (int index1 = 0; index1 < list.size()-1; index1++)
			bw.write(list.get(index1) + ", ");
		
		bw.write(list.get(list.size()-1) +">");
		bw.flush();
	}
}

