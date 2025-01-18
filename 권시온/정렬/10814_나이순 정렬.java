import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    String[][] str = new String[N][2];
	    
	    for(int i = 0; i < N; i++){
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        str[i][0] = st.nextToken();
	        str[i][1] = st.nextToken();
	        
	    }
	    
	    Arrays.sort(str,(st1,st2) -> {
	        if(Integer.parseInt(st1[0]) != Integer.parseInt(st2[0])){
	            return Integer.parseInt(st1[0]) - Integer.parseInt(st2[0]);
	        }
	            return Integer.parseInt(st1[0]) - Integer.parseInt(st2[0]);
	    });
	    
	    br.close();
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    for(int i = 0; i < N; i++){
            bw.write(str[i][0] + " " + str[i][1] + "\n");
	    }
	    
	    bw.flush();
	    bw.close();
	    
	}
}