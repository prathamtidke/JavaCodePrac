
public class TripletSum {
	
	public static int findTriplet(int arr[],int x) {
		int n = arr.length;
		int count = 0;
		for (int i = 0;i<n;i++) {
			for (int j = i+1;j<n;j++) {
				for(int k = j+1;k<n;k++) {
					if(arr[i]==arr[j]||arr[j]==arr[k]||arr[i]==arr[k]) {
						count++;
					}
				}
			}
			
		}
		return count ;
	}
	public static void main (String [] args) {
		int arr[] = {1,2,3,4,5,6,7 };
		int x = 7;
		int result = findTriplet(arr,7);
		System.out.println(result);
		
		
	}

}
