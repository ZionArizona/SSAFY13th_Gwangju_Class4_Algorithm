import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            Stack<String> stack = new Stack<>();
            String ins = br.readLine();
            boolean flag = true;
            for(int j = 0; j < ins.length(); j++){
                String str = String.valueOf(ins.charAt(j));
                
                if(str.equals("(")){
                    stack.add("(");
                }
                else{
                    if(stack.isEmpty()){
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                
            }
            
            if(stack.isEmpty() && flag == true){
                System.out.println("YES");
            }
            else if(flag==true){
                System.out.println("NO");
            }
            
        }
        
	}
}
