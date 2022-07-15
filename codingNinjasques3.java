import java.util.Scanner;
public class codingNinjasques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter basic and uppercase letter");
        int basic = sc.nextInt();
	    char c = sc.next().charAt(0);
		double hra  = basic*20/100;
		double da = basic*50/100;
		double allow = 0;
		double pf = basic*11/100;
//        System.out.println(hra);
//       System.out.println(da);
        if(c== 'A') {
        	 allow = 1700;
        	}
        else if(c == 'B') {
        	 allow = 1500;
        }
        else {
             allow = 1300;
        	
        }
        
        
double totalsalary = basic + hra + da + allow - pf ;
System.out.println(Math.round(totalsalary));
		
		
		

	}

}

//Total Salary

//Write a program to calculate the total salary of a person. The user has to enter the basic 
//salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//    totalSalary = basic + hra + da + allow – pf
//where :
//hra   = 20% of basic
//da    = 50% of basic
//allow = 1700 if grade = ‘A’
//allow = 1500 if grade = ‘B’
//allow = 1300 if grade = ‘C' or any other character
//pf    = 11% of basic.