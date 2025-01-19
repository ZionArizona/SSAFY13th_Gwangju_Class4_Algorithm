import java.util.*;
import java.io.*;
//이중 포문으로 탐색하기에는 시간이 너무 오래 걸린다.
//map의 containsKey()를 통해 시간 복잡도 1 또는 최악 N으로 줄인다.

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    
	        
        Map<Integer,Integer> mp = new HashMap<>();
	    
	    String[] str = br.readLine().split(" ");
	    
	    for(int i = 0; i < N; i++){
	        int num = Integer.parseInt(str[i]);
	        mp.put( num, 1);
	    }
	    
	    int M = Integer.parseInt(br.readLine());
	    
	    int[] arr1 = new int[M];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	   br.close();
	   
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   for(int i = 0; i < M; i++){
	       arr1[i] = Integer.parseInt(st.nextToken());
	       if(mp.containsKey(arr1[i])){
	           bw.write(1 + " ");
	       }
	       else{
	           bw.write(0 + " ");
	       }
	   }
	   
	   bw.flush();
	   bw.close();
	}
}
