package binarySearch_1;

public class indx_of_first_occurence_element_in_sorted_array {

	static int BinarySearch(int arr[], int key) {
		int l = 0;
		int r = arr.length - 1;
		int ans = -1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (key == arr[mid]) {
				ans = mid;
				r = mid - 1;
			}
			if (key > arr[mid])
				l = mid + 1;
			else
				r = mid - 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 4, 4, 6, 7, 7, 8, 8, 9 };
		int key = 8;
		System.out.println(BinarySearch(arr, key));
	}

}
