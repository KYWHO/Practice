import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String Ascii = scanner.next();
		int result = Ascii.charAt(0);
		
		System.out.println(result);

	}

}

//	next() : ���๮��, ������ �����ϰ� ���ڸ� �Է� �޴� ��
//	nextline() : �� �� ������ �Է� ����, ���๮�ڵ� �� �ٷ� �ν�
//	charAt(index) : index ��°�� ���ڸ� �д´�
//	indexOf(char) : char(����)�� ����ִ� ��ġ�� ��ȯ (��, ���ڰ� ������ -1 ��ȯ)
//	substring(�μ�, �μ�) : ���ڿ��� �о��, ù��° �μ��� �������� ����(��ȯ���� ����), �ι�° �μ��� �� ������ ���� ����(��ȯ���� ���Ե��� �ʴ´�)
//	length() : ���ڿ��� ���̸� ��Ÿ����