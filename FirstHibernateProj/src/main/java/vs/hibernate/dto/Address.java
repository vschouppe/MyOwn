package vs.hibernate.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String streetName;
	private String city;
	private String postcode;
	private String streetNr;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getStreetNr() {
		return streetNr;
	}
	public void setStreetNr(String streetNr) {
		this.streetNr = streetNr;
	}
	
	
}
