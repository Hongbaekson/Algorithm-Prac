import java.util.*;

public class stack {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] stack = new int[t];
		int size =0;
		
		while(t-- >0 ) {
			
			String cmd = sc.next();
			
			if(cmd.equals("push")) {
				int num = Integer.parseInt(sc.next());
				
				stack[size++] = num;
			}else if(cmd.equals("top")) {
				if(size == 0) {
				System.out.println("-1");
				}else {
				System.out.println(stack[size-1]);
				}
				
				
				
			}else if(cmd.equals("size")) {
				System.out.println(size);
			}else if(cmd.equals("empty")) {
			
				if(size == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(cmd.equals("pop")) {
				if(size == 0) {
					System.out.println("-1");
				}else {
				
					System.out.println(stack[size-1]);
					size -= 1;
				}
			}
			
					
			
		}
	}
}
