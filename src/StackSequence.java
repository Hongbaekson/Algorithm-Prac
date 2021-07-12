import java.util.Scanner;
import java.util.Stack;


public class StackSequence {
	
	public static void solve(int[] arr) {
		int n = arr.length;
		Stack<Integer> stack = new Stack<>();
		int m =0;
		StringBuilder sb = new StringBuilder();
		
		for(int x : arr) {
			if(x > m ) {
				while(x > m) {
					stack.push(++m);
					sb.append("+\n");
					
				}
				stack.pop();
				sb.append("-\n");
			} else {
				
				if(stack.peek() != x) {
					System.out.println("NO");
					return;
				}
				stack.pop();
				sb.append("-\n");
			}
			
		}
		System.out.println(sb);
		
	}
	
	
	
	
	public static void main(String[]args) {
		
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			int[] arr = new int[t] ;
			
		for(int i =0; i<t; i++) {
			arr[i] = sc.nextInt();
		}
			
			
		
			solve(arr);
	}
	
	
		  
		

    
}
