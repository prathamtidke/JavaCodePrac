import java.util.Scanner;
public class reverseNumber0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,temp,rev,lastDig;
		 n = sc.nextInt();
		 temp = n;
		 rev = 0;
		while(temp>0) {
			lastDig = temp%10;
			temp = temp/10;
			rev  = rev*10 + lastDig;
			System.out.println(rev);
			
			
		}

	}

}
