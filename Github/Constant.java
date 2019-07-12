import java.util.Scanner;

public class Constant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int changedNum1 = change(num1);
		int changedNum2 = change(num2);
		if(changedNum1 > changedNum2) {
			System.out.println(changedNum1);
		} else {
			System.out.println(changedNum2);
		}
	}
	
	public static int change(int num) {
		int [] arr = new int [3];
		for(int i = 0; i < 3; i++) {
			arr[i] = num % 10;
			num /= 10;
		}
		int changedNum = 100 * arr[0] + 10 * arr[1] + arr[2];
		return changedNum;
	}
	
}