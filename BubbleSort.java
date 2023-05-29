package code;

public class BubbleSort {
public static void main(String args[]) {
	int arr[] = {6,12,0,88,70};
	System.out.println("Elements of array");
	BubbleSort.displayArray(arr);
	System.out.println("Elements of array");
	BubbleSort.displayArray(BubbleSort.sortArrayElementWithBubbleSort(arr));
}

/**
 * @param arr
 */
public static void displayArray(int arr[]) {
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}

public static int[] sortArrayElementWithBubbleSort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		boolean arrayIsSwapped=false;
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				arrayIsSwapped =true;
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
		if(!arrayIsSwapped) {
			break;
		}
	}
	return arr;
}
}
