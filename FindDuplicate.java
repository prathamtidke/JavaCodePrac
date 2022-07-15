
public class FindDuplicate {
    public static int  Unique(int arr[]) {
    	int n = arr.length;
    	for(int i = 0;i<n;i++) {
    		for (int j = i+1;j<n;j++) {
    			if(arr[i] == arr[j]) {
    				return arr[i];
    			}
    		}
    		}
    	return 0;
    	}
    
	public static void main(String[] args) {
		int arr[] = {1,2,3,6,6};
		int result = Unique(arr);
		System.out.println(result);
	}
}		
	


