import java.util.Scanner;

public class conditionLoops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a>b) {
			System.out.println("The first no is greater");
			
		}else {
			System.out.println("Second number is greater");
			
		}
		System.out.println("Outside if else statement");
	}

}
