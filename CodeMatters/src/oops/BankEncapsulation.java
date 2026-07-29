package oops;
class Account {
	public void greetings() {
		System.out.println("hello this is ABC bank");
	}
		
}
class Savings_Account extends Account {
	private int balance=1000;
	public int getbalance() {
		return balance;
	}
	public int deposit(int x) {
		if(x>0) {
			balance=balance+x;
		}
		return balance;
	}
	public int withdraw(int x) {
		if(x>0 && balance>x) {
			balance=balance-x;
		}
		return balance;
	}
	public void greetings() {
		System.out.println("hello this is your savings account in abc bank");
	}
}

public class BankEncapsulation {

	public static void main(String[] args) {
		Account ac=new Savings_Account();
		ac.greetings();

	}

}
//encapsulation is used in savings account to hide balance
//it is encapsulation because without accesing variables directly we can update them

//run time binding decides which method to call when we call greetings
