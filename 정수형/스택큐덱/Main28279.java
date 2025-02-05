package 정수형.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (order == 2) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (order == 3) {
                System.out.println(deque.isEmpty() ? -1 : deque.removeFirst());
            } else if (order == 4) {
                System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
            } else if (order == 5) {
                System.out.println(deque.size());
            } else if (order == 6) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            } else if (order == 7) {
                System.out.println(!deque.isEmpty() ? deque.getFirst() : -1);
            } else if (order == 8) {
                System.out.println(!deque.isEmpty() ? deque.getLast() : -1);
            } else {
                System.out.println("1 ~ 8까지의 숫자를 입력해주세요.");
            }
        }
    }
}
