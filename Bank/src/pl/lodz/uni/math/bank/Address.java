package pl.lodz.uni.math.bank;

public class Address {
	private String city;
	private String state;
	private int zip;
	private String street;
	private int number;
	public Address(String city, String state, int zip, String street, int number){
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setStreet(street);
		this.setNumber(number);
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
