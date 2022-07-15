import java.util.Scanner;
public class DivideNum {
	
    public static int deno (int num,int din) {
    	if (din==0) {
    		return Integer.MIN_VALUE;
    	}
    	return num/din;
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int din = sc.nextInt();
	int result = deno(num,din);
	System.out.println(result);

	}

}
