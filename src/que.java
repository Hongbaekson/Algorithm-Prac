import java.util.Scanner;

public class que {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] que = new int[t];
		int begin = 0;
		int end = 0;

		while (t-- > 0) {

			String cmd = sc.next();

			if (cmd.equals("push")) {
				int num = Integer.parseInt(sc.next());
				que[end++] = num;
			} else if (cmd.equals("front")) {
				if (begin == end) {
					System.out.println("-1");
				} else {
					System.out.println(que[begin]);
				}
			} else if (cmd.equals("back")) {

				if (begin == end) {
					System.out.println("-1");
				} else {

					System.out.println(que[end - 1]);
				}

			} else if (cmd.equals("size")) {
				System.out.println(end - begin);
			} else if (cmd.equals("empty")) {
				if (begin == end) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}

			} else if (cmd.equals("pop")) {
				if (begin == end) {
					System.out.println("-1");
				} else {
					System.out.println(que[begin]);
					begin += 1;
				}
			}

		}
	}
}