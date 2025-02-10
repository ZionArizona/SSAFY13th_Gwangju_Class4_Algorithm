import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        
        
        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            String fir = str[0];
            String sec = str[1];
            
            
            if(fir.equals("ChongChong") || sec.equals("ChongChong")){
                set.add(fir);
                set.add(sec);
            }
            else if(!set.contains("ChongChong")){
                continue;
            }
            else if(set.contains(fir) || set.contains(sec)){
                set.add(fir);
                set.add(sec);
            }
            
        }
        
        System.out.println(set.size());
        
	}
}
