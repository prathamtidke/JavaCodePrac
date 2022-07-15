import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Now for nested loop;
        
        for (int i = 1;i<=n;i++) {
        	for(int j = 1;j<=i;j++) {
        		if(i==j) {
        			break;
//        			return;
        		}
        		System.out.print(j);
        	}
        	System.out.println();
        }
        
        

//        while(i<=n) {
//        	if(i==4) {
//        		break;
//        	}
//        	System.out.println(i);
//        	i++;
//        }
//        System.out.println("Outside while loop");
//        
//        
//        for (int j = 1;j<=n;j++) {
//        	if (j==4) {
//        		break;
//        	}
//        	System.out.println(j);
//        }
//        System.out.println("outside for loop");
	}

}
