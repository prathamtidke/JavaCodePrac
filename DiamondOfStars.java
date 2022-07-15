import java.util.Scanner;
public class DiamondOfStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = (n+1)/2;
		int n2 = n1-1;
		int row = 1;
		while(row<=n1) {
			int space = 1;
			while (space<=n1-row) {
				System.out.print(' ');
				space+=1;
			}
			int star =1;
			while(star<=2*row-1) {
				System.out.print('*');
				star+=1;
			}
			System.out.println();
			row+=1;
		}
	    row = n2;
		int k = 1;
		while(k<=row) {
			int space = 1;
			while(space<=n1-row) {
				System.out.print(' ');
				space+=1;
			}
			int star = 1;
			while(star<=2*row-1) {
				System.out.print('*');
				star+=1;
			}
			System.out.println();
			row-=1;
		}
		

	}

}
