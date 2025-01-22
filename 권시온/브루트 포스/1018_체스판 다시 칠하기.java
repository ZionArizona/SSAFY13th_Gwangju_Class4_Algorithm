import java.util.*;
import java.io.*;

public class Main
{
    public static String[][] bw = new String[8][8];
    public static String[][] wb = new String[8][8];
    
    public static void setup(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i%2 == 0){
                    if(j%2 == 0){
                        bw[i][j] = "B";
                        wb[i][j] = "W";
                    }
                    else{
                        bw[i][j] = "W";
                        wb[i][j] = "B";
                    }
                }
                else{
                    if(j%2 == 0){
                        bw[i][j] = "W";
                        wb[i][j] = "B";
                    }
                    else{
                        bw[i][j] = "B";
                        wb[i][j] = "W";
                    }
                }
            }
        }    
        
        // for(int i = 0; i < 8; i++){
        //     for(int j = 0; j < 8; j++){
        //         System.out.print(bw[i][j]);
        //     }
        //     System.out.println();
        // }
        
        //     System.out.println();
        //     System.out.println();
        
        // for(int i = 0; i < 8; i++){
        //     for(int j = 0; j < 8; j++){
        //         System.out.print(wb[i][j]);
        //     }
        //     System.out.println();
        // }
        
    }
    
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    setup();
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    
	    String[][] arr = new String[N][M];
	    for(int i = 0; i < N; i++){
	        String str = br.readLine();
	        for(int j = 0; j < M; j++){
	            arr[i][j] = String.valueOf(str.charAt(j));
	        }
	    }
	    
	   // System.out.println();
	   // System.out.println();
	    
	   // for(int i = 0; i < N; i++){
	   //     for(int j = 0; j < M; j++){
	   //         System.out.print(arr[i][j]);
	   //     }
	   //     System.out.println();
	   // }
	    
	    
        int Min = Integer.MAX_VALUE;
        
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){
                int ansbw = bwChk(i,j,arr);
                int answb = wbChk(i,j, arr);
                
                Min = Math.min(Min,Math.min(ansbw, answb));
                
            }
        }
        
        System.out.println(Min);
	}
	
	public static int bwChk(int row, int col, String[][] str){
	    int sum = 0;
	    for(int i = 0; i < 8; i++){
	        for(int j = 0; j < 8; j++){
	            if(i % 2 == 0){
	                if(j % 2 == 0){
	                    if(!str[row+i][col+j].equals("B")){
                            sum++;
	                    }
	                   // else { //B인데 W 인 경우
	                   //     sum++;
	                   // }
	                }
	                else{ //열이 홀수인 경우 -- > W가 정상
	                    if(!str[row+i][col+j].equals("W")){
	                        sum++;
	                    }
	                   // else{
	                   //     sum++;
	                   // }
	                }
	            }
	            else{ // 행이 홀수인 경우
	                if(j%2==0){ //열이 짝수인 경우
	                    if(!str[row+i][col+j].equals("W")){
	                        sum++;
	                    }
	                }
	                else{ // 열이 홀수인 경우
	                    if(!str[row+i][col+j].equals("B")){
	                        sum++;
	                    }
	                }
	            }
	        }
	    }
	    
	    return sum;
	}
	
	public static int wbChk(int row, int col,String[][] str){
	    int sum = 0;
	    for(int i = 0; i < 8; i++){
	        for(int j = 0; j < 8; j++){
	            if(i % 2 == 0){ //행이 짝수인 경우 
	                if(j % 2 == 0){  //열이 짝수인 경우 --- > W가 정상
	                    if(!str[row+i][col+j].equals("W")){
                            sum++;
	                    }
	                   // else { //B인데 W 인 경우
	                   //     sum++;
	                   // }
	                }
	                else{ //열이 홀수인 경우 -- > B가 정상
	                    if(!str[row+i][col+j].equals("B")){
	                        sum++;
	                    }
	                   // else{
	                   //     sum++;
	                   // }
	                }
	            }
	            else{ // 행이 홀수인 경우
	                if(j%2==0){ //열이 짝수인 경우 ---> B가 정상
	                    if(!str[row+i][col+j].equals("B")){
	                        sum++;
	                    }
	                }
	                else{ // 열이 홀수인 경우  --> W 가 정상
	                    if(!str[row+i][col+j].equals("W")){
	                        sum++;
	                    }
	                }
	            }
	        }
	    }
	    
	    return sum;
	}
    
}
