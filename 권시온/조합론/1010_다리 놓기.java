import java.util.*;
import java.io.*;

public class Main
{
    static int[][] mp = new int[30][30];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());        
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            sb.append(nCr(M, N)).append("\n");
            
        }
        System.out.println(sb);   
    }
    
    
    
    public static long nCr(int M, int N) {
        long result = 1;

        // C(M, N) = M! / (N! * (M-N)!) 
        // => (M / N) * ((M-1) / (N-1)) * ... * ((M-N+1) / 1)
        for (int i = 0; i < N; i++) {
            result = result * (M - i) / (i + 1);
        }

        return result;
    }
    
    
}
