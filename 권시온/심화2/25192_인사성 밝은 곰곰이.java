import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        
        int ans = 0;
        
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            
            if(str.equals("ENTER")){
                set.clear();
                continue;
            }
            else if(set.contains(str)){
                continue;
            }
            else{
                set.add(str);
                ans++;
            }
        }
        
        System.out.println(ans);
        
        
	}
}
