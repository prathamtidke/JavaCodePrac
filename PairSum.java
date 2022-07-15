
public class PairSum {
	public static int PairSumm(int arr [],int x) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]+arr[j]== x) {
					return 
					
				}
			}
			
		}
		return 0;
		
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 2, 4,5,6};
		int x = 5;
		int result = PairSumm(arr,x);
		System.out.println(result);
	}

}
