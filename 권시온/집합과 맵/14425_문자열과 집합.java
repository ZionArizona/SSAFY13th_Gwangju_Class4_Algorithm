import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        	    
	    int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int ans = 0;
        
        Set<String> str = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            str.add(br.readLine());
        }
        
        for(int i = 0; i < M; i++){
            if(str.contains(br.readLine())){
                ans++;
            }
        }
        
        System.out.println(ans);
        
	}
}