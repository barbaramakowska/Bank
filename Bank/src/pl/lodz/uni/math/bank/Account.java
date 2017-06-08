package pl.lodz.uni.math.bank;

public class Account {
	int number;
	String description;
	float funds;

	public void deposit(int i) {
		if (i > 0)
			funds = funds + i;

	}

	public void transaction(int i) {
		if (funds >= i) {
			funds = funds - i;
		} else {

			System.out.println("mozna wyplacic tylko  " + funds);
			funds = 0;
		}
	}

}
