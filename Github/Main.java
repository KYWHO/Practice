import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String Ascii = scanner.next();
		int result = Ascii.charAt(0);
		
		System.out.println(result);

	}

}

//	next() : 개행문자, 공백은 무시하고 문자를 입력 받는 것
//	nextline() : 한 줄 단위로 입력 받음, 개행문자도 한 줄로 인식
//	charAt(index) : index 번째의 문자를 읽는다
//	indexOf(char) : char(문자)가 들어있는 위치를 반환 (단, 문자가 없으면 -1 반환)
//	substring(인수, 인수) : 문자열을 읽어낸다, 첫번째 인수는 시작지점 문자(반환값에 포함), 두번째 인수는 끝 지점의 다음 문자(반환값에 포함되지 않는다)
//	length() : 문자열의 길이를 나타낸다