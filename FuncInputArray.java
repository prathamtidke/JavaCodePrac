import java.util.Scanner;
public class FuncInputArray {
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int [] takeInput() { //function
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int [n];  //creating input value arrays;
	for (int i =0;i<n;i++) {
		System.out.println("Enter element at " + i + " index");
		arr[i] = sc.nextInt();
		
	}
	return arr;
		
	}
    public static void main (String [] args) {
    	
    	int arr[] = takeInput();
    	printArray(arr);
    	
    }
}
