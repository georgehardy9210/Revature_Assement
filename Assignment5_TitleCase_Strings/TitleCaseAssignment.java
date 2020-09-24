package eg3;

public class TitleCaseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="hello hi how are you today";
		String ar[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		

		for (int i = 0; i < ar.length; i++) {
			
			System.out.println(ar[i]);
			
		}
		
	
		for (int i = 0; i < ar.length; i++) {
			

			String word = ar[i];
			int len = word.length()-1;
			
//	sb.append(Character.toUpperCase(ar[i].charAt(len))).append(ar[i].substring(0,len)).append(" ");
			sb.append(ar[i].substring(0,len)).append(Character.toUpperCase(ar[i].charAt(len))).append(" ");
		
			
		}
	
		System.out.println(sb.toString().trim());
	
		
	}

}
