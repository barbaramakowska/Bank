package pl.lodz.uni.math.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
	private Address address;
	private static List<Client> clientList = new ArrayList<Client>();
	private static Bank instance = null;

	public static Bank getInstance() {
		if (instance == null) {
			instance = new Bank();
		}
		return instance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Client getClientByID(int i) {
		return clientList.get(i);
	}

	public void addClient(Client client) {
		clientList.add(client);
	}

}
