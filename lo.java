import java.util.Scanner;
public class lo {
	public static void main (String[] args) {
	       Scanner sc = new Scanner(System.in);
	        char ch  = sc.next().charAt(0);
	        int m1 = sc.nextInt();
	        int m2 = sc.nextInt();
	        int m3 = sc.nextInt();
	        double avg = (m1+m2+m3)/3;
	        System.out.println(ch);
	        System.out.println(avg);

	}
}

