import java.util.*;
public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row<=n) {
			int col = 1;
			int p = row;
			while (col<=row) {
				System.out.print(p);
				col+=1;
				p-=1;
			}
			row+=1;
			System.out.println();
			
		}
		

	}

}
