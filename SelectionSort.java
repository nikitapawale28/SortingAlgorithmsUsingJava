package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]){
		List<Integer> inputList = new ArrayList<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter element 5 in list to sort");
			for (int i=0; i<5;i++) {
				inputList.add(sc.nextInt());
			}
		System.out.println("given input list"+inputList);
		System.out.println("sorted input list using Selection Sort "+SelectionSort.sortElementsBySelectionSort(inputList));
		   
		}
        
	}
    /**
     * @param inputList
     * @return
     */
    private static List<Integer> sortElementsBySelectionSort(List<Integer> inputList) {
    	for(int i=0;i<inputList.size();i++) {
    		for(int j=i+1;j<inputList.size();j++) {
    			if(inputList.get(i)>inputList.get(j)) {
    				Integer temp = inputList.get(i);
    				//inputList.replace(inputList.get(i),inputList.get(j));
    				inputList.set(i, inputList.get(j));
    				inputList.set(j, temp);
    				
    			}
    		}
    	}  	
		return inputList;
    	
    }
}
