package 정수형.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main28278 {
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);
            } else if (order == 2) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int temp = stack.pop();
                    System.out.println(temp);
                }
            } else if (order == 3) {
                System.out.println(stack.size());
            } else if (order == 4) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (order == 5) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int temp = stack.peek();
                    System.out.println(temp);
                }
            }
        }
    }
}
