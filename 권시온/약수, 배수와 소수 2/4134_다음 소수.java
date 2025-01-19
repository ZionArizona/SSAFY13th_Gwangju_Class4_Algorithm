import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int k = 0; k < T; k++){
            long N = Long.parseLong(br.readLine());
            boolean key = true;
            while(key){
                key = check(N);
                if(key == true){
                    N++;
                }
                else{
                    bw.write(N + "\n");
                    break;
                }
            }
            
        }
        bw.flush();
        bw.close();
        
    }
    public static boolean check(long N){
        if(N < 2) return true;
        for(long i = 2; i <= Math.sqrt(N); i++){
            if(N%i ==0){
                return true;
            }
        }
        return false;
    }
}
