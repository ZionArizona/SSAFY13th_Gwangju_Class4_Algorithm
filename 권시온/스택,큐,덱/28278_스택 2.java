import java.util.*;
import java.io.*;


public class Main
{
    static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            String ins = br.readLine();
            int in = 0;
            int x = 0;
            if(ins.length() > 1){
                String[] st = ins.split(" ");
                in = Integer.parseInt(st[0]);
                x = Integer.parseInt(st[1]);
                add(x);
            }
            else{
                in = Integer.parseInt(ins);
                
                switch(in){
                    case 2:
                        if(stack.isEmpty()){
                            //비어있다면.
                            System.out.println(-1);
                        }
                        else{
                            
                            System.out.println(stack.peek());
                            stack.pop();
                        }
                        break;
                    case 3:
                        System.out.println(stack.size());
                        break;
                    case 4:
                       if(stack.isEmpty()){
                            //비어있다면.
                            System.out.println(1);
                        }
                        else{
                            System.out.println(0);
                        } 
                        break;
                    case 5:
                        if(!stack.isEmpty()){
                            System.out.println(stack.peek());
                        }
                        else{
                            System.out.println(-1);
                        }
                        break;
                }
            }
            
        }
        
	}
	public static void add(int x){
	    stack.add(x);
	}
}
