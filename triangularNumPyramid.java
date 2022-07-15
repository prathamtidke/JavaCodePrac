import java.util.*;
public class triangularNumPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while (row<=n) {
			int col = 1;
			while (col<=row) {
				col+=1;
				System.out.print(row);
				
			}
			row+=1;
			System.out.println();
		}

	}

}
