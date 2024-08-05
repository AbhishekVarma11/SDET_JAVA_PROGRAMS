import java.util.Scanner;

public class Kth_Largest_Element {

	public static void main(String[] args) {
    int arr[]= {20,10,2,30,3};
    Scanner s=new Scanner(System.in);
    System.out.println("enter the kth larget you want:");
    int k=s.nextInt();
    int len=arr.length-1;
    System.out.println("Kth largest element is:"+findKthLargest(arr, k));
	s.close();

}


	public static int findKthLargest(int[] array, int k) {
	        if (k > 0 && k <= array.length) {
	            return quickSelect(array, 0, array.length - 1, array.length - k);
	        }
	        return -1; // Invalid input for k
	    }

	private static int quickSelect(int[] array, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(array, low, high);

            if (pivotIndex == k) {
                return array[pivotIndex];
            } else if (pivotIndex < k) {
                return quickSelect(array, pivotIndex + 1, high, k);
            } else {
                return quickSelect(array, low, pivotIndex - 1, k);
            }
        }
        return -1; 
    }
	public static int partition(int[] arr, int l, int r) {
	    int pivot = arr[r];
	    int i = l - 1;

	    for (int j = l; j < r; j++) {
	        if (arr[j] <= pivot) {
	            i++;


	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }


	    int temp = arr[i + 1];
	    arr[i + 1] = arr[r];
	    arr[r] = temp;

	    return i + 1;
	}

	}
	

