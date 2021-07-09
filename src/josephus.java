import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class josephus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();  // 7
		int m = sc.nextInt();  // 3
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');

		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i <= n; i++) {
			queue.offer(i);
		}
		
		for(int i =0; i<n-1; i++) {   // 7 - 1 
			for(int j =0; j<m-1; j++) { // 3 - 1
                queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
			
		}
		
			sb.append(queue.poll() + ">");
			System.out.println(sb);
		
	}
}
