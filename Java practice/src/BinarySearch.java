import java.util.Scanner;
import java.util.stream.Stream;

public class BinarySearch {

	public static int binarySearch(int[] arr, int low, int high, int key) {
		if(high>=low) {	
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid] > key) {
				return binarySearch(arr, low, mid-1, key);
			}
			else {
				return binarySearch(arr, mid + 1, high, key);
			}
		}
		return -1;
	}
	
	public static void main(String ar[]) {
		int[] arr = {10,20,30,40,50,60,70};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int l = 0;
		int h = arr.length-1;
		System.out.println("Location: "+binarySearch(arr, l, h, a));
	}
}
