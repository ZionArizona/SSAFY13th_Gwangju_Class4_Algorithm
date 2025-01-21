import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int ans = -1;
        
        
        for(int i = 0; i <= N/5; i++){
            int num5bag = N - 5*i;
            
            if(num5bag % 3==0){
                int num3bag = num5bag/3;
                ans = i + num3bag;
            }
            
        }
        System.out.println(ans);
        
	}
	
}
