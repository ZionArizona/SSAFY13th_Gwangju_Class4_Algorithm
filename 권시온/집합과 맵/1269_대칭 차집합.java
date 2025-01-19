import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            B.add(Integer.parseInt(st.nextToken()));
        }
        
        int AB = 0;
        int BA = 0;
        
        for(int a: B){
            if(!A.contains(a)){
                AB++;
            }
        }
        for(int b: A){
            if(!B.contains(b)){
                BA++;
            }
        }
        
        System.out.println(AB+BA);
	}
}