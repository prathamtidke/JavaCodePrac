import java.util.*;
public class charPattern2 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    while(row<=n) {
    	int col = 1;
    	char strr = (char)('A'+row-1);
    	while (col<=row) {
    		char sen = (char)(strr+col-1);
    		System.out.print(sen);
    		col+=1;
    		
    	}
    	row+=1;
    	System.out.println();
    }

	}

}
