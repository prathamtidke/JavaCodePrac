import java.util.Scanner;
public class solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int start = sc.nextInt();
		 int end = sc.nextInt();
		 int step = sc.nextInt();
		 while (start<=end ) {
			 int cel = ((start - 32)*5)/9;
			 System.out.println(start + "\t" + cel);
			 start+=step;
			 
		 }

	}

}
