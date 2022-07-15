import java.util.Scanner;
public class ArrangeNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0){
            System.out.println("*");
            System.out.print("*");
            return;
        }
		int i=1;
        while(i<=n+1){

            int star=1;
            while(star==1){
                System.out.print("*");
                star=star+1;
            }

	}
}
}
