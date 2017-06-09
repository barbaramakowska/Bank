package pl.lodz.uni.math.bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank pko=Bank.getInstance();

		Address addressClient1=new Address("Denver", "Colorado", 80014, "Garfield St", 33);
		Client client1= new Client("krzysztof","kowalczyk","690345654");
		client1.setAddress(addressClient1);
		Address addressClient2=new Address("lodz", "lodzkie", 55555, "podhalanska", 23);
		Client client2= new Client("grzegorz","kowalczyk","888567765");
		client1.setAddress(addressClient2);
	
		
		pko.addClient(client1);
		pko.addClient(client2);
		Account account1Client1= new Account(12,"konto vip");
		client1.addAccount(account1Client1);
		Account account2Client1= new Account(15,"konto nr 2");
		client1.addAccount(account2Client1);
		Account account1Client2= new Account(55,"ROR");
		client2.addAccount(account1Client2);

		pko.getClientByID(1).getAccountByNumber(0).deposit(100000);
		pko.getClientByID(1).getAccountByNumber(0).transaction(50000);
		pko.getClientByID(1).getAccountByNumber(0).deposit(60000);
		pko.getClientByID(1).getAccountByNumber(0).printTransactionList();
		
		
		pko.getClientByID(0).printAccountList();
		


	}

}
