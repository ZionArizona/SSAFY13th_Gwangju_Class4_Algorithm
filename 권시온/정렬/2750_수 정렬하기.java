import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    int[] arr = new int[N];
	    
	    for(int i = 0; i < N; i++){
	        int a = Integer.parseInt(br.readLine());
	        arr[i] = a;
	    }
	    
	    
	    Arrays.sort(arr);
	    
	    for(int i = 0; i < N; i++){
	        System.out.println(arr[i]);
	    }
	    
	}
}
