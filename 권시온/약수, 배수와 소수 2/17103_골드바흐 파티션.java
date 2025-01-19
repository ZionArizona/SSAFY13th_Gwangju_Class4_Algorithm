import java.util.*;
import java.io.*;

// 에라토스테네스의 체 알고리즘을 알면 쉽게 풀리는 문제.
// 시간 복잡도 O(Nlog(logN))
public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = 1000000;
        boolean[] bl = new boolean[num + 1];
        
        for(int i = 2; i <= num; i++){
            bl[i] = true;
        }
        for(int i = 2; i <= num; i++){
            if(bl[i] == false){
                continue;
            }
            for(int j = i + i; j <= num ; j += i){
                bl[j] = false;
            }
        }
        
        int T = Integer.parseInt(br.readLine());
        
        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int i = 2 ; i <= (N/2); i++){
                if(bl[i] && bl[N-i]){
                    ans++;
                }
            }
            
            bw.write(ans + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
