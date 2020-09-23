package searching_Array;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 10, 22, 33, 11, 10, 10, 11, 22, 44, 22 };
		int searchElement = 44;
		boolean b = false;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == searchElement) {

				b = true;
				break;

			}

		}
		if (b) {
			System.out.println(searchElement + "found");
		} else {
			System.out.println(searchElement + "not found");
		}

		b = false;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == searchElement) {

				b = true;
				System.out.println(searchElement+ " found at position " + (i+1));
				
			}
		}
		if(!b) {
			
			System.out.println(searchElement + " not found!");
			
		}

		
		System.out.println("Searching all the even numbers in array");
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0) {
				
				System.out.println(ar[i] + " ");
				
			}
			
		}
		
		
		
	}

}
