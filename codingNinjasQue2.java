import java.util.Scanner;
public class codingNinjasQue2 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		char c = ch.next().charAt(0);
//		System.out.println(c);
		int ascii = c;
//		System.out.println(ascii);
	    if (ascii <= 90 && ascii>=65) {
	    	System.out.println( " Uppercase letter");
	    }

	    else {
	    	if (ascii <=97 && ascii>=122) {
	 		   System.out.println(" Lower Case");
	    	
	    }  else {
	    	System.out.println("the letter is number");
	    }    	
}
	}
}
	    


//65 to 90