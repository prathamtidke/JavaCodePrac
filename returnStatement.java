import java.util.Scanner;
public class returnStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		
		int div = 2;
		
		while(div<=n/2){
			
			if(n%div==0) {
//				System.out.println(div + "" + "composite");	
//				isPrime = false;
				System.out.println("Composite number");
				return;
			}
			div+=1;
		}
		System.out.println("Prime number");
		
//		if (isPrime) {
//			System.out.println	("Prime number");
//			
//		}else {
//			System.out.println("Composite number");
//		}
//		

	}

}


