import java.util.Scanner;
public class LinerSearch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int arr [] = new int[5];
    arr[0] = 1;
    arr[1] = 5;
    arr[2] = 10;
    arr[3] = 15;
    arr[4] = 20;
    for (int i = 0;i<arr.length;i++) {
//        System.out.println(arr[i]);
        if (arr[i] == n) {
        	System.out.print(i);
        }
    }
    
 
//    System.out.println(arr[0]);

	}
}
