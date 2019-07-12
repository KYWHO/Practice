import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char alpha = scanner.nextLine().charAt(0);
		int ialpha = (int)alpha;
		
		System.out.println(ialpha);
	}

}
