import java.util.Scanner;
public class termsOfap {

	public static void main(String[] args) {     
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int count = 1 ;
	for (int i = 1;count<=x;i++) {
		int ap = 3*i+2;
		if(ap%4!=0) {
			System.out.println(ap);
			count++;
			
		}
		
	}
	
	}
}


