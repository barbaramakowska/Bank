package pl.lodz.uni.math.bank;

import java.util.List;
import java.util.ArrayList;

public class Client {
	private String firstName;
	private String lastName;
	private Address address=null;
	String phoneNumber;
	//Account account = null;
	private List<Account> accountList = new ArrayList<Account>();

	public Account getAccountByNumber(int i) {
		// if(accountList[i]!=null)
		return accountList.get(i);
	}

	public Client(String firstName, String lastName, String phoneNumber) {
		 this.setFirstName(firstName);
		 this.setLastName(lastName);
		 this.phoneNumber=phoneNumber;
	}
	

	public void addAccount(Account account) {
			accountList.add(account);
		}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printAccountList(){
		for(int i=0;i<accountList.size();i++)
			System.out.println("Account number: "+accountList.get(i).getNumber()+"\t Description: "+accountList.get(i).getDescription());

	}

}
