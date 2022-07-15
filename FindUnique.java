
public class FindUnique {
    public static void Unique(int arr[]) {
    	int n = arr.length;
    	for(int i = 0;i<n;i++) {
    		for (int j = i+1;j<n;j++) {
    			if(arr[i] == arr[j]) {
    				System.out.println(j);
    			}else {
    				System.out.println("-1");
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int arr[] = {4,5,8,6,6};
		Unique(arr);
	}

}
