import java.util.Scanner;
public class FuncEven {
    public static void evenNum(int start,int end) {
    	if(start%2!=0) {
    		start++;
    	}
    	for (int i = start;i<=end;i+=2) {
  
    	System.out.println(i);
    	}
    }
    
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
		evenNum(3,25);
	}

}
