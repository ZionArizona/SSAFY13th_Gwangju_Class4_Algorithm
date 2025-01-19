import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int top_f = Integer.parseInt(st.nextToken());
        int bot_f = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int top_s = Integer.parseInt(st.nextToken());
        int bot_s = Integer.parseInt(st.nextToken());
        
        int top = (top_f*bot_s) + (top_s * bot_f);
        int bot = bot_f * bot_s;
        
        int a = top;
        int b = bot;
        
        while(a != 0){
            int res = b%a;
            b = a;
            a = res;
        }
        
        System.out.println((top/b) + " " +(bot/b));
        
	}
}