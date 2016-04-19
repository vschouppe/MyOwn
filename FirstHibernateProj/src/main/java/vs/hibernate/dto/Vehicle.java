package vs.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;

@Entity
@Inheritance
@DiscriminatorColumn (
		name = "vehicleType",
		discriminatorType= DiscriminatorType.STRING
		)
public class Vehicle {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;
	private String vehicleName;
	
	@ManyToMany 
	private Collection<UserDetails> userdetailList = new ArrayList();
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Collection<UserDetails> getUserdetailList() {
		return userdetailList;
	}
	public void setUserdetailList(Collection<UserDetails> userdetailList) {
		this.userdetailList = userdetailList;
	}
	
	
	
	
}
