import java.util.Arrays;

public class Selection {
	
	public static void main(String[] args) {
		int arr[] = {23,9,12,55,8};
		minMaxNum(arr);
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int arr[]) {
		for (int i=0; i<arr.length-1; i++) {
			int min=i;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void minMaxNum(int arr[]) {
		int min,max;
		min=max=arr[0];
		for ( int i=1; i<arr.length; i++) {
			if (arr[i]<min)
				min = arr[i];
			if (arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum number: "+max);
		System.out.println("Minimum Number: "+min);
	}
}
