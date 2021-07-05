import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor {

	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        //스택 보다 링크드리스트가 효율적, 연습겸 스택 사용 
        Stack<Character> left = new Stack<Character>(); // 커서기준 왼쪽 
        Stack<Character> right = new Stack<Character>(); // 커서기준 오른쪽
        
        for (int i=0; i<s.length(); i++) {
            left.push(s.charAt(i));
        } // 첫 문자열 입력 후 왼쪽푸시 
        
        int m = Integer.parseInt(br.readLine()); // 테스트 케이스 몇번 입력 
        
        while (m-- > 0) {
            String[] line = br.readLine().split(" ");
            char what = line[0].charAt(0);
            if (what == 'L') {
                if (!left.empty()) {
                    right.push(left.pop());
                }
            } else if (what == 'D') {
                if (!right.empty()) {
                    left.push(right.pop());
                }
            } else if (what == 'P') {
                char c = line[1].charAt(0);
                left.push(c);
            } else if (what == 'B') {
                if (!left.empty()) {
                    left.pop();
                }
            }
        }
        while (!left.empty()) {
            right.push(left.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!right.empty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}