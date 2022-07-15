import java.util.Scanner;
public class binarytoDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans,pv,lastDig;
		ans = 0;
		pv = 0;
		while(n>0) {
			lastDig = n%10;
			ans += lastDig*(int)Math.pow(2,pv++);	
			n = n/10;
		}
		
		System.out.print("Decimal number is: " + ans);

	}

}
