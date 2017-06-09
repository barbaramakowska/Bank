package pl.lodz.uni.math.bank;

public class Transaction {
	private int number;
	private float cashFlow;
	public Transaction(int number, float cashFlow){
	this.setNumber(number);
	this.setCashFlow(cashFlow);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getCashFlow() {
		return cashFlow;
	}
	public void setCashFlow(float cashFlow) {
		this.cashFlow = cashFlow;
	}
	

}
