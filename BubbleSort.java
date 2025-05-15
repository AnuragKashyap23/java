package bubble;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int flag=0;
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 2, 32, 5, 19};
		bubbleSort(arr);  
		System.out.println(Arrays.toString(arr));
	}
}
