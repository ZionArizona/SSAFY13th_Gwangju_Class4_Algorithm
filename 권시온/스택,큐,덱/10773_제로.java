import java.util.*;
import java.io.*;

public class Main
{
    static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        stack.add(0);
        
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N ; i++){
            int chk = Integer.parseInt(br.readLine());
            
            if(chk == 0){
                stack.pop();
            }
            else{
                stack.add(chk);
            }
        }
        
        int sum = 0;
            
        for(int ck : stack){
            sum += ck;
        }
        
        System.out.println(sum);
        
	}
}
