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

//trim() -> ���ڿ��� �� �� ������ �������ش�
//nextLine() -> �Է� ���� �� �� �� ������ �Է� ���� (���� ���� �Է� ����)
/*
split("�μ�") -> �μ��� �����ڷ� �Ͽ� �̸� �������� �ܾ �и��� �迭�� �����Ѵ� 
ex) String arr[] ="aaabcccbd".split("b"); 
���ڿ� "b" �� �������� �и��� �Ǿ�, String arr[] = { "aaa", "ccc", "d" }; �� ���� �迭�� �����ȴ�.
 */