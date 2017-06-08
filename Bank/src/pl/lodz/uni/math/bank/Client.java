package pl.lodz.uni.math.bank;

import java.util.List;

public class Client{
	String firstName;
	String lastName;
	//Address address;
	//String phoneNumber;
	Account account=null;
	static Account [] accountList;
	public Account getAccountByNumber(int i) {
		//if(accountList[i]!=null)
			return accountList[i];
		
	}
	public void addAccount(int number, float funds, String description)
	{
		if(accountList[number]==null)
		{
			System.out.println("takie konto juz istnieje");
		}
		else
		{
			accountList[number].funds=funds;
			accountList[number].description=description;
		}
	}
	
	
}
