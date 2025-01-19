import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        Map<Integer,Integer> mp = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
                
            if(mp.containsKey(num)){
                int chk = mp.getOrDefault(num,0);
                mp.replace(num,++chk);
            }
            else{
                mp.put(num,1);
            }
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < M; i++){
            int chk = Integer.parseInt(st.nextToken());
            
            bw.write(mp.getOrDefault(chk,0) + " ");
        }
        bw.flush();
        bw.close();
        
	}
}