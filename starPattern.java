import java.util.Scanner;
public class starPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row<=n) {
			int space = 1;
			while(space<=n-row) {
				System.out.print(' ');
				space+=1;
			}
			int star = 1;
			while(star<=row) {
				System.out.print('*');
				star+=1;
			int k = row-1;
			while(k>=1) {
				System.out.print('*');
				k-=1;
			}
			
			}
			row+=1;
			System.out.println();
		}


	}

}
