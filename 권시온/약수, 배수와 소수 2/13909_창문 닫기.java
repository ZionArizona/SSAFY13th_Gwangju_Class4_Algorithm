import java.util.*;
import java.io.*;

//쉬운면서도 어려운 문제
public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Long.parseLong(br.readLine());
        
        long ans = (long)Math.sqrt(N);
        
        System.out.println(ans);
        
    }
}
