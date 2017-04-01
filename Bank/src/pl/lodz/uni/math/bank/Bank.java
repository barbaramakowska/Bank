package pl.lodz.uni.math.bank;

public class Bank extends Address {
	private static Bank instance = null;
	String name;

	private Bank() {
	}

	public static Bank getInstance() {
		System.out.println("yes getInstance");
		return instance;
	}
}
