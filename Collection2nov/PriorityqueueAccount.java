package collections;

import java.util.PriorityQueue;
import java.util.Queue;

class Account implements Comparable<Account> {
	private String accountHolderName;
    private int acctNo;
    private double balance;
    
    public Account(String accountHolderName, int acctNo,double balance ) {
        this.accountHolderName = accountHolderName;
        this.acctNo=acctNo;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "acctNo:" + this.acctNo + ", balance:" + this.balance + ", accountHolderName:" + this.accountHolderName;
    }
	@Override
	public int compareTo(Account o) {
		return o.balance<this.balance? -1:1;
	}
}

public class PriorityqueueAccount {

	public static void main(String[] args) {
		Account c1 = new Account("Arun", 1001,5000);
		Account c2 = new Account("Ayush",1002, 2000);
		Account c3 = new Account("Arman", 1003, 6000);

		Queue<Account> Account = new PriorityQueue<>();
		Account.offer(c1);
		Account.offer(c2);
		Account.offer(c3);
		while (!Account.isEmpty()) {
			System.out.println(Account.poll());
		}

	}

}
