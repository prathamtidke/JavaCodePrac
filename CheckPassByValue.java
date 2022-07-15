
public class CheckPassByValue {
	public static void func1(int a,int b)
	{
	    int ans=1;
	    for(int i=0;i<b;i++)
	    {
	        ans = ans*a;
	        System.out.println(ans);
	    }
//	    System.out.print(ans);
	}
	public static void main (String[] args) {
	    func1(3,5);
	}
	
//	public static void c(int n) {
//		System.out.println("Inside c " + n);
//		n++;
//	}
//	
//	public static void b(int n) {
//		c(n);
//		System.out.print("Inside b " + n);
//		n++;
//	}
//	
//	public static void a(int n){
//		b(n);
//		System.out.println("Inside a " + n);
//		n++;
//	}
//
//	public static void main(String[] args) {
//		int n = 10;
//		a(n);
//		System.out.println("Inside main " + n);
//	}

}
