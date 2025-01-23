import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
	
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); 
		for (int i = 0; i < N; i++) {
			
			String temp[] = br.readLine().split(" ");
			
			switch(Integer.parseInt(temp[0])) {
			case 1:
				stack.add(Integer.parseInt(temp[1]));
				break;
				
			case 2:
				bw.write(Integer.toString(stack.isEmpty() ? -1 : stack.pop()) + "\n");
				break;
				
			case 3:
				bw.write(Integer.toString(stack.size()) + "\n");
				break;
				
			case 4:
				bw.write(Integer.toString(stack.isEmpty() ? 1 : 0) + "\n");
				break;
				
			case 5:
				bw.write(Integer.toString(stack.isEmpty() ? -1 : stack.peek()) + "\n");
				break;
			}
		}
		bw.flush();	
	}
}
