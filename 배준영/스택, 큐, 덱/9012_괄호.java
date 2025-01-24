import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;


class Main {
	
	static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
			String st = sc.nextLine();
			boolean success = true;
			
			for (int index = 0; index < st.length(); index++)
			{
				if (st.charAt(index) == '(')
					stack.add(st.charAt(index));
				
				else {
					if (stack.isEmpty()) {
						success = false;
						break;
					} else {
						stack.pop();
					}
				}
			}
			
			if (success && stack.isEmpty()) 
				bw.write("YES\n");
			else
				bw.write("NO\n");
			
			stack.clear();
		}
		
		bw.flush();
	}
}
