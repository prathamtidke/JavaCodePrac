
public class PostIncrement {

	public static void main(String[] args) {
    
		int a  = 5;
		int b = 15;
		if(++a>5 || ++b>15) {
			System.out.println("Inside if ");
		}else {
			System.out.println("Inside else");
		}
		System.out.println("a " + a + " b " + b);
	}

}
