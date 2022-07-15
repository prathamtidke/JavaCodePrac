import java.util.Scanner;
public class squareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1;i<=n;i++) {
			int multi = i*i;
//			System.out.println(i*i);
			if(multi>=n) {
				System.out.println(i-1);
				break;
			}
			
		}

	}

}
