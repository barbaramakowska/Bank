package pl.lodz.uni.math.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int number;
	private String description;
	private float funds=0;
	private static int numberOfTransaction=0;
	private Transaction transaction;
	
	private List<Transaction> transactionList = new ArrayList<Transaction>();

	public Account(int number, String description) {
		this.setNumber(number);
		this.setDescription(description);
	}

	public void deposit(int i) {
		if (i > 0)
		{
			funds = funds + i;
			numberOfTransaction++;
			transaction=new Transaction(numberOfTransaction, i);
			transactionList.add(transaction);
		}
	}

	public void transaction(int i) {
		if (funds >= i) {
			funds = funds - i;
			numberOfTransaction++;
			transaction=new Transaction(numberOfTransaction, -i);
			transactionList.add(transaction);
		} else {

			System.out.println("mozna wyplacic tylko  " + funds);
			funds = 0;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getFunds() {
		return funds;
	}
	public void printTransactionList(){
		System.out.println("Account number: "+ getNumber() + " Current balance: "+ getFunds());
		for(int i=0;i<transactionList.size();i++)
			System.out.println(transactionList.get(i).getNumber()+transactionList.get(i).getCashFlow());
	}
	

}
