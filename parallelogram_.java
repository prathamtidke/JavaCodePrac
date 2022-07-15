import java.util.Scanner;
public class parallelogram_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int p = n;
		while(row<=n) {
			int space = 1;
			while(space<=n-p) {
				System.out.print(' ');
				space+=1;
			}
			int star = 1;
			while(star<=n) {
				System.out.print('*');
				star+=1;
			}
			System.out.println();
			row+=1;
			p-=1;
		}
		

	}

}
