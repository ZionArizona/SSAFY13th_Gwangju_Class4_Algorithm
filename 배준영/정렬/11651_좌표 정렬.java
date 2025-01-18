import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point other) {
		if (this.y == other.y)
			return Integer.compare(this.x, other.x);
		else 
			return Integer.compare(this.y, other.y);
	}
}

class Main {
	
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static PriorityQueue<Point> array = new PriorityQueue<>();
	
	public static void main(String[] args) throws IOException {
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			array.add(new Point(x, y));
		}
		
		for (int i = 0; i < T; i++) {
			Point point = array.remove();
			bw.write(point.x + " " + point.y);
			bw.newLine();
		}
		bw.flush();
	}
}



