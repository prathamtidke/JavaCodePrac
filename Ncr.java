import java.util.Scanner;
public class Ncr {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	  int n=10,r=6;
//	    int factn=1,factr=1,factnr=1;
//	    for(int i=2;i<=n;i++)
//	    {
//	        factn*=i;
//	        if(i<=r)
//	            factr*=i;
//	        if(i<=n-r)
//	            factnr*=i;
//	    }
//	    int ncr=factn/(factr*factnr);
//	    System.out.print(ncr);
//	}
//}
	int n = sc.nextInt();
	int r = sc.nextInt();
	int factN = 1;
	
	for (int i = 1;i<=n;i++) {
		factN = factN *i;
		
	}
	int factR = 1;
	for (int i = 1; i<=r;i++) {
		factR = factR*i;
	}
	int factNR = 1;
	for (int i = 1;i<=n-r;i++) {
		factNR = factNR * i ;
	}
	int result = factN/ (factR* factNR);
	System.out.println(result);
	}
}


