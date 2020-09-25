package override_equals_method;

public class Employee {

	
		private String Designation;
		private double salary;
		
		public Employee() {
			
		}
		
		
		public Employee(String designation, double salary) {
			super();
			Designation = designation;
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [Designation=" + Designation + ", salary=" + salary + "]";
		}
		public String getDesignation() {
			return Designation;
		}
		public void setDesignation(String designation) {
			Designation = designation;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
		
		@Override
		public boolean equals(Object o) {
			
			boolean b = false;
			Employee p2 = (Employee)o;
			if(this.Designation == p2.Designation) {
				
				b = true;
				
			}
			
			return b;
			
		}
	
}
