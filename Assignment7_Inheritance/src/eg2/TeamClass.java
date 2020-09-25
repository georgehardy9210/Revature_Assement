package eg2;

public class TeamClass {

	
	private int tid;
	private String teamName;
	private String coachName;
	
	public TeamClass() {
		
	}

	public TeamClass(int tid, String teamName, String coachName) {
		super();
		this.tid = tid;
		this.teamName = teamName;
		this.coachName = coachName;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	@Override
	public String toString() {
		return "TeamClass [tid=" + tid + ", teamName=" + teamName + ", coachName=" + coachName + "]";
	}
	
	
	
	
}
