import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int k = 0; k < T; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int a = 0;
            int b = 0;
            
            if(B > A){
                int temp = A;
                a = B;
                b = temp;
            }
            else{
                a = A;
                b = B;
            }
            
            while(b!=0){
                int res = a%b;
                a = b;
                b = res;
            }
            
            bw.write((a*(A/a)*(B/a)) + "\n");
        }
        
        bw.flush();
        bw.close();
	}
}
