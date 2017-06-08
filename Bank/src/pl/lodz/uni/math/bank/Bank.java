package pl.lodz.uni.math.bank;

import java.util.List;

public class Bank {
	private static Bank instance = null;
	//static Client[] clientList;
	public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
	private Bank() {
		System.out.println("konstr");
    }



	String name;
	Address address;
	static List<Client> clientList;

	public static Client getClientByID(int i) {
		// if (clientList[i]!=null)
		return clientList.get(i);
	}






	public static void addClient(String firstName, String lastName) {
		Client newClient = new Client();
		

		newClient.firstName = firstName;
	newClient.lastName = lastName;
		clientList.add(newClient);


		System.out.println("wusweknvkjf kvhfkdb fbkdf");

	}
	
}
