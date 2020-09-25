package override_equals_method;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player p1 = new Player(100, "Giri");
		System.out.println(p1);
		
		Player p2 = new Player(100, "Giri");
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			
			System.out.println("Both players are same");
			
		}else {
			
			System.out.println("Players are different");
			
		}
		
		Employee e1 = new Employee("Beverly Hills", 29999.99);
		Employee e2 = new Employee("Beverly Hills", 29999.99);
		
		
		if(e1.equals(e2)) {
			
			System.out.println("Both Employees are the same");
			
		}
		else {
			
			System.out.println("Employees are different");
			
		}
		
		
		
	}

}
