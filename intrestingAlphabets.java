import java.util.Scanner;
public class intrestingAlphabets {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int p = n;
    while(row<=n) {
    	int col = 1;
    	char str = (char)('A'+p-1);
    	while(col<=row) {
    		char sen = (char)(str+col-1);
    		System.out.print(sen);
    		col+=1;
    		
    	}
    	p-=1;
    	row+=1;
    	System.out.println();
 
    }
	}

}
