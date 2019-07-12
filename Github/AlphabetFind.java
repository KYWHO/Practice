import java.util.Scanner;

public class AlphabetFind {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S = new String();
		S = scanner.next();
		int alphaArray[] = new int [26];
		
		for(int i = 0; i < alphaArray.length; i++) {
			alphaArray[i] = -1;
		}
		
		for(int i = 0; i < S.length(); i++) {
			if(alphaArray[S.charAt(i) - 'a'] == -1) {
				alphaArray[S.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i = 0; i < alphaArray.length; i++) {
			System.out.print(alphaArray[i] + " ");
		}

	}

}
