import java.util.*;
import java.io.*;



public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int i = 666;
        
        int ans = 0;
        int answer = 0;
        while(true){
            String chk = String.valueOf(i);
            
            if(chk.contains("666")){
                ans++;
            }
            if(ans == N){
                break;
            }
            
            i++;
        }
		
		System.out.println(i);
	}
	
}
