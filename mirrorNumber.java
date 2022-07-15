import java.util.Scanner;
public class mirrorNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row<=n) {
			int space = 1;
			while (space<=n-row) {
				System.out.print(' ');
				space+=1;
			}
			int num = 1;
			while (num<=row) {
				System.out.print(num);
				num+=1;
			}
			row+=1;
			System.out.println();
			
		}
	}

}
