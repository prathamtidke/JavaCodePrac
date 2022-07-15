import java.util.Scanner;

public class LinearSearch {
//In this we have to enter one number it return that num index 
public static int indexer(int arr[],int s){
	for (int i = 0;i<arr.length;i++) {
		if (arr[i]==s) {
			return i;
		}
		}
	return -1;
	
		
	}
	public static int [] takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to store in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			System.out.println("Enter elements : " + i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		System.out.println("Enter Number to find");
		int s = sc.nextInt();
		int result = indexer(arr,s);
		System.out.println(result);

	}
}