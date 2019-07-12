import java.util.Scanner;

//1157
public class WordStudy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alpha[] = new int [26];
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = 0;
		}
		
		String str = new String();
		str = scanner.next();
		
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
				alpha[str.charAt(i) - 'A']++;
			}
			if('a' <= str.charAt(i) && 'z' >= str.charAt(i)) {
				alpha[str.charAt(i) - 'a']++;
			}
		}
		
		int max = 0;
		int flag = 0;
		for(int i = 0; i < alpha.length; i++) {
			if(max < alpha[i]) {
				max = alpha[i];
				flag = i;
			}
			else if(max != 0 && max == alpha[i]) {
				flag = -1;
			}
		}
		
		if(flag == -1) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(65 + flag));
		}
	}

}
