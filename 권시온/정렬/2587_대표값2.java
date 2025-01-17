import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int[] arr = new int[5];
	    
	    for(int i = 0; i < 5; i++){
	        int a = Integer.parseInt(br.readLine());
	        arr[i] = a;
	    }
	    
	    
	    Arrays.sort(arr);
	    
	    int sum = 0;
	    for(int i = 0; i < 5; i++){
	        sum += arr[i];
	    }
	    
	    System.out.println((int)(double)sum/5);
	    System.out.println(arr[2]);
	    
	}
}
