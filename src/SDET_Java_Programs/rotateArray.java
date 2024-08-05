package SDET_Java_Programs;

public class rotateArray {

	public static void main(String[] args) {
		int[] arr= {1,3,5,8,9};
		rotateArrayLefttoRight(arr);
		//rotateArrayRighttoLeft(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		

	}

	private static void rotateArrayLefttoRight(int[] arr) {
	    int len = arr.length;
	    if (len <= 1) {
	        return; // No need to rotate if the array has 0 or 1 element
	    }

	    int end = arr[len - 1]; // Store the last element

	    // Shift each element to the right
	    for (int i = len - 1; i > 0; i--) {
	        arr[i] = arr[i - 1];
	    }

	    arr[0] = end; // Place the stored element at the beginning
	}


}
