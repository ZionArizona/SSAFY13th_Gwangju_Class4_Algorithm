import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


class Main {
	
	static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			String st = br.readLine();
			boolean success = true;
			
			if (st.equals("."))
				break;
			
			for (int index = 0; index < st.length(); index++)
			{
				char ch = st.charAt(index);
				
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == ' ' || ch == '.')
					continue;
				
				else if (ch == '(' || ch == '[')
					stack.add(ch);
				
				else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				
				else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				
				else {
					success = false;
					break;
				}
			}
			
			if (success && stack.isEmpty())
				bw.write("yes\n");
			else
				bw.write("no\n");
			
			stack.clear();
		}
		
		bw.flush();
	}
}
