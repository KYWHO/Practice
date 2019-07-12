import java.util.Scanner;

//1152
public class NumOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		
		if(str.isEmpty()) {
			System.out.println("0");
		}
		else if(!str.isEmpty()) {
			System.out.println(str.split(" ").length);
		}
	}

}

//trim() -> 문자열의 앞 뒤 공백을 제거해준다
//nextLine() -> 입력 받을 때 한 줄 단위로 입력 받음 (공백 또한 입력 받음)
/*
split("인수") -> 인수를 구분자로 하여 이를 기준으로 단어를 분리해 배열을 생성한다 
ex) String arr[] ="aaabcccbd".split("b"); 
문자열 "b" 를 기준으로 분리가 되어, String arr[] = { "aaa", "ccc", "d" }; 와 같은 배열이 생성된다.
 */