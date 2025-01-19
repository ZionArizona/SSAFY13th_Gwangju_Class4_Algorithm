import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = 0;
        while((N = Integer.parseInt(br.readLine())) != 0){
            int ans = 0;
            for(int i = N + 1; i <= (2*N); i++){
                if(check(i)){
                    //소수가 아니면
                    continue;
                }
                else{
                    ans++;
                }
            }
            System.out.println(ans);
            
        }
        
    }
    public static boolean check(int N){
        if(N < 2) return true;
        if(N == 2 || N == 3) return false;
        for(long i = 2; i <= Math.sqrt(N); i++){
            if(N%i ==0){
                return true;
            }
        }
        return false;
    }
}
