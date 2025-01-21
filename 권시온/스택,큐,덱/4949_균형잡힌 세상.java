import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	    
        String str;
        while(!(str = br.readLine()).equals(".")){
            Stack<String> stack = new Stack<>();
            //System.out.println(str);
            boolean c = true;
            String[] arr = str.split("");
            for(int i = 0; i < arr.length; i++){
                String chk = arr[i];
                //( 또는 [ 괄호 stack에 푸시
                if(chk.equals("(")){
                    stack.add("(");
                }
                else if(chk.equals("[")){
                    stack.add("[");
                }
                
                // ) 또는 ] 괄호 나올시 검사.
                if(chk.equals(")")){  // ) 나올 때
                    if(stack.isEmpty()){
                        System.out.println("no");
                        c = false;
                        break;
                    }
                    else{
                        String check = stack.peek();
                        if(!check.equals("(")){
                            System.out.println("no");
                            c = false;
                            break;
                        }
                        else{
                            if(stack.isEmpty()){
                                System.out.println("no");
                                c = false;
                                break;
                            }
                            else{
                                stack.pop();
                            }
                        }
                    }
                }
                else if(chk.equals("]")){
                    if(stack.isEmpty()){
                        System.out.println("no");
                        c = false;
                        break;
                    }
                    else{
                        String check = stack.peek();
                        if(!check.equals("[")){
                            System.out.println("no");
                            c = false;
                            break;
                        }
                        else{
                            if(stack.isEmpty()){
                                System.out.println("no");
                                c = false;
                                break;
                            }
                            else{
                                stack.pop();
                            }
                        }
                    }
                }    
                
            }
            if(stack.isEmpty() && c == true){
                System.out.println("yes");
            }
            else if(!stack.isEmpty() && c == true){
                System.out.println("no");
            }
        }
	}
}
