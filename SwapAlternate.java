
public class SwapAlternate {

	public static void swaperAlt(int [] arr) {
		int n = arr.length;
		for (int i = 0;i<n-1;i++) {
			for (int j = i+1;j<n;j++) {
				System.out.println("(" + arr[j]  + "," +arr[i] + ")");
			}
		}
	}
	public static void main(String[] args) {
		int arr [] = {1,4,7,9};
		swaperAlt(arr);
		}

}
