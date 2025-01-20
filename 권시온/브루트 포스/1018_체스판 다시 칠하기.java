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
	    
	    System.out.println();
	    System.out.println();
	    
	    for(int i = 0; i < N; i++){
	        for(int j = 0; j < M; j++){
	            System.out.print(arr[i][j]);
	        }
	        System.out.println();
	    }
	    
	    
//         int Min = Integer.MAX_VALUE;
        
//         for(int i = 0; i <= N-8; i++){
//             for(int j = 0; j <= M-8; j++){
//                 int ansbw = bwChk(i,j);
//                 int answb = wbChk(i,j);
                
//                 Min = Math.min(Min,Math.min(ansbw, answb));
                
//             }
//         }
// 	}
	
// 	public static int bwChk(int row, int col){
// 	    for(int i = 0; i < a)
// 	}
	
// 	public static int wbChk(int row, int col){
	    
// 	}
}
}
