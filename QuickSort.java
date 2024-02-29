
public class QuickSort {

	public static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}

		int pivotLocation = partition(arr, left, right);
		quickSort(arr, left, pivotLocation - 1);
		quickSort(arr, pivotLocation + 1, right);
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[left];

		while (left < right) {
			while (arr[right] > pivot && left < right) {
				right--;
			}
			if (left < right) {
				arr[left] = arr[right];
				left++;
			}

			while (arr[left] < pivot && left < right) {
				left++;
			}
			if (left < right) {
				arr[right] = arr[left];
				right--;
			}
		}

		arr[left] = pivot;
		return right;
	}

	public static void display(int arr[]) {
		for (int iCnt = 0; iCnt < arr.length; iCnt++) {
			System.out.println(arr[iCnt] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 4,2,1,3 };
		quickSort(arr, 0, arr.length - 1);
		display(arr);
	}

}
