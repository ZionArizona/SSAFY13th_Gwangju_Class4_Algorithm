import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length() - i; j++){
                set.add(str.substring(j,j+i+1));
            }
        }
        
        System.out.println(set.size());
	}
}
