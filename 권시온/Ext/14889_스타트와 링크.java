import java.util.*;
import java.io.*;

public class Main {
    static int[] star;
    static int[] link;
    static int[][] arr;
    static int N;
    static Set<Integer> set;
    static int ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        star = new int[N/2];
        link = new int[N/2];
        set = new HashSet<>();
        ans = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 조합

        go(0,0);

        System.out.println(ans);

    } // main

    static void go(int cnt, int start){

        if(cnt == N/2){
            int starAns = 0;
            int linkAns = 0;
            int size = 0;
            for(int i = 0; i < N; i++){
                if(!set.contains(i)){
                    link[size] = i;
                    size++;
                }
            }

            for(int i = 0; i < N/2-1; i++){
                for(int j = i + 1; j < N/2; j++){
                    starAns += arr[star[i]][star[j]] + arr[star[j]][star[i]];
                    linkAns += arr[link[i]][link[j]] + arr[link[j]][link[i]];
                }
            }

            ans = Math.min(ans, Math.abs(starAns - linkAns));

            return;
        }


        for(int i = start; i < N; i++) {

            star[cnt] = i;
            set.add(i);
            go(cnt+1, i+1);
            set.remove(i);
        }

    }

}