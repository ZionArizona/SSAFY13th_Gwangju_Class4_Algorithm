package acmicpc;
import java.util.*;

public class bk_2587
{
	public static void main(String[] args) {
	    int number[] = new int[5];
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    
	    for(int i = 0; i < 5; i++){
	        number[i] = sc.nextInt();
	        sum += number[i];
	    }
        Arrays.sort(number);
    		System.out.printf("%d\n%d", sum/5, number[2]);
		
	}
}
