package ServletDemo;

public class LibUserInput {
	
	private String collegeId;
	private String username;
	private String password;
	
	public LibUserInput(String collegeId, String username, String password) {
		super();
		this.collegeId = collegeId;
		this.username = username;
		this.password = password;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}