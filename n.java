import java.util.Scanner;
public class n {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n+1){

            int star=1;
            while(star==1){
                System.out.print("*");
                star=star+1;
            }
            int increment1 = 1;
            while(increment1<=n-i){
                System.out.print(increment1);
                increment1= increment1+1;
            }
            i+=1;
            System.out.println();
            		
	}
		
	}
}
	
