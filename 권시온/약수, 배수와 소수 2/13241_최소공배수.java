import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long a = 0;
        long b = 0;
        
        
        if(B > A){
            long temp = A;
            a = B;
            b = temp;
        }
        else{
            a = A;
            b = B;
        }
        
        while(b!=0){
            long res = a%b;
            a = b;
            b = res;
        }
        
        long ans = a * (A/a) * (B/a);
        
        System.out.println(ans);
        
	}
}