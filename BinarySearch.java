public class BinarySearch {
	public static int binarySearch(int[] arr, int x) {
    	int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = (start + end )/2;
            if (arr[mid]< x){
                start = mid+1;
            } else if(arr[mid] > x){
                end = mid - 1;
            }else {
                return mid;
            }  
        }
        return -1;
        
    }
 
	public static void main(String[] args) {
		int arr[] = {1,4,5,7,10,14,16};
		int result = binarySearch(arr,14);
		System.out.println(result);

	}

}
