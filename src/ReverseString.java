import java.io.*;
import java.util.*;

public class ReverseString {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(t --> 0) {
				
			String str =  br.readLine() + "\n";
			
			Stack<Character> s = new Stack<>();
			for(char ch : str.toCharArray()) {
				
				if(ch =='\n'|| ch ==' ') {
					while(!s.isEmpty()) {
						bw.write(s.pop());
						
					}
					bw.write(ch);
			}else {
				
				s.push(ch);
			}
				
				
					
		}
			
			
		}
		
			bw.flush();
	}

}
