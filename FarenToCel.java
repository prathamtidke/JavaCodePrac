import java.util.Scanner;
public class FarenToCel {
    
	public static int farToCel(int num) {
		int convert = (num-32)*5/9;
		return convert;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int S = sc.nextInt(); //start
	int E = sc.nextInt(); // end 
	int W = sc.nextInt(); // step
	for (int i = S; i<=E; i+=W ) {
		int result = farToCel(i);
		System.out.println(i + "  " + result);
	}
	}

}
