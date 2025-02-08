import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<T;i++) {
            int tmp = sc.nextInt();
            if(tmp == 0) {
                st.pop();
                continue;
            }
            st.push(tmp);
        }
        
        int sum = 0;
        for(int a : st) {
            sum += a;
        }
        System.out.println(sum);
    }
}
