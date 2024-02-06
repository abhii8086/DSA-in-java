package binarySearch_1;

public class binarySearch_1 {

	static int BinarySearch(int arr[], int key) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (key == arr[mid])
				return mid;
			if (key > arr[mid])
				return l = mid + 1;
			else
				return r = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 6, 8, 9 };
		int key = 5;
		System.out.println(BinarySearch(arr, key));

	}

}
