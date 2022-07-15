import java.util.*;
public class invertedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int p = n;
		while(row<=n) {
			int col = 1;
			while(col<=n-row+1) {
				System.out.print(p);
				col+=1;	
			}
			p-=1;
			row+=1;
			System.out.println();
			
		}

	}

}
