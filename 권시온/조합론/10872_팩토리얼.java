import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        if(N==0){
            System.out.println(1);
        }
        else{
            int ans = 1;
            for(int num = N; num >= 1; num--){
                ans *= num;
            }
            
            System.out.println(ans);
            
        }
        
        
    }
}
