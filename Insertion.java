package insertion;

import java.util.Arrays;

public class Insertion {

	public static void sort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int temp=arr[i];
			int j;
			for (j=i-1; j>=0; j--) {
				if(arr[j]>temp)
					arr[j+1]=arr[j];
				else
					break;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {23,3,45,9,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
