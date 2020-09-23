package deletion_Array;

public class Deletion {

	public static void main(String[] args) {

		int[] ar = new int[10];
		ar[0] = 99;
		ar[1] = 22;
		ar[2] = 11;
		ar[3] = 23;

		int n = 4;

		System.out.println("\nElements in array before deletion");
		for (int i = 0; i < n; i++) {

			System.out.println(ar[i] + " ");

		}

		int pos = 2;

		for (int j = pos - 1; j < n; j++) {

			ar[j] = ar[j + 1];

		}
		n--;

		System.out.println("\nElements in array after deletion");
		for (int i = 0; i < n; i++) {

			System.out.println(ar[i] + " ");

		}

	}
}
