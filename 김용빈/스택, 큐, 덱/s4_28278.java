import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 28276 : 스택 2
public class s4_28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = null;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			tk = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(tk.nextToken());
			
			switch(command) {
			case 1:
				st.push(Integer.parseInt(tk.nextToken()));
				break;
			case 2:
				if(st.isEmpty())
					System.out.println(-1);
				else
					System.out.println(st.pop());
				break;
			case 3:
				System.out.println(st.size());
				break;
			case 4:
				if(st.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case 5:
				if(!(st.isEmpty()))
					System.out.println(st.peek());
				else
					System.out.println(-1);
			}
		}
	}
}
