import java.util.Scanner;
public class FibonacciNum {
	
	public static boolean checkMember(int n){
		if (n==0 || n == 1 || n==2) {
			return true;
		}
		int a = 0;
		int b = 1;
		while(b<n) {
			int c = a+b;
			a = b;
			b = c;
		}
		if (b==n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = checkMember(n);
		System.out.println(result);
		

	}

}
