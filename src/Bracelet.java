
import java.util.*;

public class Bracelet {
	public  static String isValid(String str) {
		
		int len = str.length();
		int cnt  = 0;
		
		
		for(int i = 0; i<len; i++) {
		
			if(str.charAt(i) == '(') {
				cnt += 1;
				
			}else {
				cnt -= 1;
				
			}
			if(cnt < 0) {
				return "NO";
			}
		
		}
		

		if(cnt == 0 ) {
			return "Yes";
		}else {
			return "No";
		}
	
		
		
		
		
	}
		
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0 ) {
			System.out.println(isValid(sc.next()));
		}
		
		
		
	}
	
	
}
