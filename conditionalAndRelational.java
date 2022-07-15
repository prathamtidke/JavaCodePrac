import java.util.Scanner;
public class conditionalAndRelational {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
//		if(a>0 && b>0) {
//			System.out.println("Both number is possitive");
//		}else{
//			System.out.println("Both number is not possitive");
		if(a>0 || b>0) {
			System.out.println("One number is possitive");
		}else{
			System.out.println("None is  possitive");
				
			}
	}
}
		
	


