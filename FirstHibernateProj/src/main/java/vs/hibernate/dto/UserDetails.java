package vs.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "USER_DETAILS")// entity is telling hibernate that UserDetails needs to be saved
public class UserDetails {


	private int userId;
	private String userName;
	
	@Id //this shows hibernate that userId is the primary key
	@Column (name = "USER_ID")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column (name ="USER_NAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
