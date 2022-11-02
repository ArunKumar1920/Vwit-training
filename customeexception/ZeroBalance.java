package customeexception;

public class ZeroBalance extends Exception{
	
	private double currBal;
	private double withAmt;
	private int acctno;
	
	
	public ZeroBalance(double currBal, double withAmt, int acctno) {
		super();
		this.currBal = currBal;
		this.withAmt = withAmt;
		this.acctno = acctno;
	}


	@Override
	public String toString() {
	
		return "ZeroBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
	}

}


