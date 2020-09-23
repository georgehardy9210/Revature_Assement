package ArraysUtilityClass;

import java.util.Arrays;

public class Utility_Demo {

	public static void main(String[] args) {
		int[] ar = { 10, 22, 33, 11, 10, 10, 11, 22, 44, 22, 32 };
		
		System.out.println(ar);
		System.out.println(Arrays.toString(ar)); //to print the contents of Array
	
		Arrays.sort(ar);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));
		
		int ar2[] = Arrays.copyOf(ar, ar.length+5);
		System.out.println("ar2 = " + Arrays.toString(ar2));
		
		System.out.println("\nBinary Searching");
		
		//binarysearch() must have sorted arrays in ascending orders
		//returns  negative - (arr.length) if not found
		System.out.println(Arrays.binarySearch(ar, 1000));
		System.out.println(Arrays.binarySearch(ar, 22));

	}
}
