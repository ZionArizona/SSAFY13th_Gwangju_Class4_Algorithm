import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            arr[i][1] = sc.nextInt();
            arr[i][0] = sc.nextInt();
        }

        Arrays.sort(arr, (n1, n2) -> {
            if(n1[0] == n2[0]) {
                return n1[1] - n2[1];
            } else {
                return n1[0] - n2[0];
            }
        });

        for(int i=0; i<N; i++) {
            System.out.print(arr[i][1] + " ");
            System.out.println(arr[i][0]);
        }
    }
}
