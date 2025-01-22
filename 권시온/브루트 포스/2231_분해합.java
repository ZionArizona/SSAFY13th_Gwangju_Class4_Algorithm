import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		int answer = 0;
		
		for(int i = 1; i <= N; i++){
		    ans = i;
		    int chk = i;
		    while(chk!=0){
		        ans += (chk%10);
		        chk /= 10;
		    }
		    if(ans == N){
		        answer = i;
		        break;
		    }
		    
		}
		
		System.out.println(answer);
	}
}