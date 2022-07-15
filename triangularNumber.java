import java.util.Scanner;
public class triangularNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row<=n) {
			int space = 1;
			while (space<n-row) {
				System.out.print(' ');
				space+=1;
			}
		int num = 1;
		while(num<=row){
			System.out.print(num+row-1);
			num+=1;
		}
		int  k = row-1;
		while (k>=1) {
			System.out.print(k+row-1);
			k-=1;
		}
		row+=1;
		System.out.println();
		}


	}

}
