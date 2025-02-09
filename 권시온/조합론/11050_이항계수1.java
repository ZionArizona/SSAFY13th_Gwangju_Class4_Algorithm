import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        System.out.println(coff(N,K));
        
    }
    
    
    
    public static int coff(int N, int K){
        if(K == 0 || N == K){
            return 1;
        }
        
        return coff(N-1,K-1) + coff(N-1,K);
    }
    
    
}
