package eg2;

public class ClientName {

		private int projectPID;
		private String ClientName;
		private double cost;
		
		public ClientName(int projectPID, String clientName, double cost) {
			super();
			this.projectPID = projectPID;
			ClientName = clientName;
			this.cost = cost;
		}
		
		
		public int getProjectPID() {
			return projectPID;
		}
		public void setProjectPID(int projectPID) {
			this.projectPID = projectPID;
		}
		public String getClientName() {
			return ClientName;
		}
		public void setClientName(String clientName) {
			ClientName = clientName;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "ClientName [projectPID=" + projectPID + ", ClientName=" + ClientName + ", cost=" + cost + "]";
		}

		
	
	
}
