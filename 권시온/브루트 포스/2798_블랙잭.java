import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    
	    st = new StringTokenizer(br.readLine());
	    
	    int[] arr = new int[N];
	    
	    for(int i = 0; i < N; i++){
	        arr[i] = Integer.parseInt(st.nextToken());   
	    }
	    
	    int ans =  Integer.MIN_VALUE;
	    
	    for(int i = 0; i < N-2; i++){
	        for(int j = i+1; j < N - 1; j++){
	            for(int k = j + 1; k < N; k++){
	                int chk = 0;
	                chk = arr[i] + arr[j] + arr[k];
	                
    	           if(chk <= M){
    	           
    	            
    	            ans = Math.max(ans,chk);
    	           }
	            }
	            
	        }
	    }
        	    
	    System.out.println(ans);
	    
	}
}