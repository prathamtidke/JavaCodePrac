import java.util.Scanner;
public class codingNinjasQue8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 2;
		while(d<n) {
			if(n%d==0) {
				System.out.print(d+" ");
				
			}
            d+=1;
		}
		

	}
	

}
