package vs.hibernate.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // entity is telling hibernate that UserDetails needs to be saved
public class UserDetails {

	@Id //this shows hibernate that userId is the primary key
	private int userId;
	private String userName;
	
		
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
