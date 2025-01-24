import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;


class Main {
	
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		String st[] = br.readLine().split(" ");
		int wait_line[] = new int[st.length];
		//  wait_line 배열 만들기
		for(int index = 0; index < st.length; index++)
			wait_line[index] = Integer.parseInt(st[index]);
		
		int cur_number = 1; // 현재 번호표 (간식을 받아야하는 번호)
		int index = 0; //  인덱스
		boolean success = true; // 성공 여부
		
		while (cur_number != wait_line.length+1) {
			
			if (index != wait_line.length) {
				
				if (wait_line[index] == cur_number) {
					index++;
					cur_number++;
					continue;
				}
				
				else if (!stack.isEmpty() && stack.peek() == cur_number) {
					stack.pop();
					cur_number++;
					continue;
				}
				
				else {
					stack.add(wait_line[index]);
					index++;
				}			
				
			} 
			
			else {
				
				if (!stack.isEmpty() && stack.peek() == cur_number) {
					stack.pop();
					cur_number++;
					continue;
				}
				
				else {
					success = false;
					break;
				}
			}
		}
		
		if (success)
			bw.write("Nice\n");
		else
			bw.write("Sad\n");
	
		bw.flush();
	}
}
