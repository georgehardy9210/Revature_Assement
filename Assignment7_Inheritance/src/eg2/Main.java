package eg2;

public class Main {

	public static void main(String[] args) {
		Person person=new Person(100, "Sachin");
		System.out.println(person);
		
		Address a=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
		Employee employee=new Employee(102, "Raj", "Manager", 123344.44d);
		employee.setPermenantAddress(a);
		System.out.println(employee);
		
		Address a2 = new Address(3453, "406 Ponderosa", "Killeen" , "Texas", 32134);
		employee.setPresentAddress(a2);
				
		System.out.println(employee);
		
		ClientName c = new ClientName(66675, "George Hardy", 299.99);
		employee.setClientName(c);
		System.out.println("NEW EMPLOYEE WITH CLIENT NAMES");
		System.out.println(employee);
		
		//
		System.out.println();
		
		Player player=new Player(900, "Chris Morris", 100, "Cricket");
		System.out.println(player);

		
		TeamClass team = new TeamClass(232,"Steelers","Mike Tomlin");
		System.out.println("NEW Player with TEAM!");
		player.setTeam(team);
		System.out.println(player);
		
		
	}
	
	

}
