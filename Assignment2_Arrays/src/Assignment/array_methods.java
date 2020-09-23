package Assignment;

public class array_methods {

	public static void main(String[] args) {

		int[] ar = { 10, 22, 33, 11, 10, 10, 11, 22, 44, 22 };
		String[] cat = {"racecar", "car", "sas"};

		OddPrint(ar);

		boolean b = isPrime(11);

		System.out.println(b);
		
		boolean palindrome = isPalindrome(cat,1);
		if(palindrome){ System.out.println(cat[1] + " is a Palindrome"); }
		else{ System.out.println(cat[1] + " is not a Palindrome!");}
	}

	public static void OddPrint(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (!(arr[i] % 2 == 0)) {

				System.out.print(arr[i] + " ");

			}

		}

	}

	public static boolean isPrime(int arr) {

		for (int i = 2; i < arr; i++) {

			if (arr % 2 == 0) {

				return false;

			}

			if (arr % i == 0) {

				return false;

			}

		}

		return true;

	}

	public static bool isPalindrome(String val, int pos){
	
		int len-1 = val.length;
		String temp = val;
		
		
		
		for(int i=0;i<val[pos].length;i++){
			
		
			if((val[pos].charAt(i) != temp[pos].charAt(len))){
			
				return false;
				
			}
			
			len--;
			 
		}
		
		return true;
		
		
		
		
	}
	
}
