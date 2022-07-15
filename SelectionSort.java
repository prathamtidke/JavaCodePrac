
public class SelectionSort {
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
	}
	public static void selectionSort(int [] arr) {
//	Insert element at ith index 
		int n = arr.length;
		
		for (int i = 0;i<n;i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int j = i ;j<n;j++) {
				if (arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
				
			}
//			For swapping 
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

			
	public static void main(String[] args) {
		int arr [] = {1,10,5,12,6};
		selectionSort(arr);
		printArray(arr);
		

	}

}
