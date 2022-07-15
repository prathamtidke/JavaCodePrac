import java.util.Scanner;
public class factFunc {
	
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    
    int FactN = factorial(n);
    int factR = factorial(r);
    int factNR = factorial(n-r);
    
    
   

	}

}
