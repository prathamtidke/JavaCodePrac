import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a%2==0) {
			System.out.println(a +  " is even number");
		}else {
			System.out.println(a +  " is an odd number");
			
		}
		

	}

}
