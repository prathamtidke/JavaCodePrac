import java.util.Scanner;
public class charPatters {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row<=n){
            int col = 1;
            while(col<=row){
                char strr = (char) ('A'+row-1);
                System.out.print(strr);
                col+=1;
            }
            row+=1;
            System.out.println();
        }
	}

}
