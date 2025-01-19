import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int fir = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        
        for(int i = fir; i <= sec; i++){
            if(check(i)){
                //소수가 아니면
                continue;
            }
            else{
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        
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
