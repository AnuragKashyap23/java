package searching;

import java.util.Scanner;

public class Linear {
	public static int linearSearch(int arr[], int key) {
		for (int i=0; i<arr.length; i++) {
			if (key==arr[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//Linear search
		int arr[]= {91,29,13,42,6,78};
		int index= linearSearch(arr, 77);
		
		if (index>=0) {
		System.out.println("Linear Search \nindex: "+index);
	}
		else
			System.out.println("Linear Search \nkey not found\n");
		
		// Binary Search
		int arr2[]= {1,12,34,44,54,76};
		int index2 = binarySearch(arr2, 54);
		if (index2 == -1)
			System.out.println("Binary Search\nKey not found!");
		else
			System.out.println("Binary Search\nIndex :"+index2);
}
	
	public static int binarySearch(int arr[], int key) {
		int left=0;
		int right=arr.length;
		int mid;
		while(left<=right) {
			mid=(left+right)/2;
			if ( arr[mid] == key )
				return mid;
			else if( key < arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		return -1;
	}
}
