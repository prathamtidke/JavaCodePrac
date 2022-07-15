import java.util.Scanner;
public class sumOfProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int p = 1;
		if (c==1) {
			for (int i = 1;i<=n;i++) {
				sum+=i;
			}System.out.println(sum);
		}
		else if (c==2) {
			for (int i = 1;i<=n;i++) {
				p=p*i;	
			}System.out.println(p);
			
		}

	}

}
