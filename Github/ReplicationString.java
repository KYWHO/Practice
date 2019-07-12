// 2675
import java.util.Scanner;

public class ReplicationString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = new String();
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int R = scanner.nextInt();
			S = scanner.next();

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();

		}

	}

}
