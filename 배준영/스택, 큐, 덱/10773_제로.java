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
		
		int K = Integer.parseInt(br.readLine());
		
		for (int number = 0; number < K; number++)
		{
			int temp = Integer.parseInt(br.readLine());
			
			if (temp == 0 && !stack.isEmpty())
				stack.pop();
			
			else
				stack.add(temp);
		}
		
		int sum = 0;
		for (int number : stack)
			sum += number;
		
		System.out.println(sum);
	}
}
