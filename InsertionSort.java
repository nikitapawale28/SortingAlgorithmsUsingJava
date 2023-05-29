package code;

public class InsertionSort {

	public static void main(String args[]) {
		int arr[]= {10,5,20,2,30};
		System.out.println("The array without sorting");
		InsertionSort.printData(arr);
		System.out.println("The array after insertion sorting");
		InsertionSort.printData(InsertionSort.getInsertionSortedArray(arr));
	}
	
	/**
	 * @param arr
	 * @return
	 */
	private static int[] getInsertionSortedArray(int arr[]) {
		int key;
		int j;
		for(int i = 0; i<arr.length; i++ ) {
			key = arr[i];
			j=i-1;
			
			while(j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
		return arr;
		
	}
	private static void printData(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
