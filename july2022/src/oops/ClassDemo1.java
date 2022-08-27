package oops;

public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM sBankATM = new ATM();
		sBankATM.checkBalance();

		int money = sBankATM.withDrawMoney(1000);
		System.out.println("Money withdrawn..."+ money);
		sBankATM.checkBalance();
	}

}
class ATM{
	 int money = 10000;
//	 any var declared outside the method is global var or instance var
//	 This var is accessible across the methods
	 public int withDrawMoney(int amt) {
		 money = money-amt;
		 return amt;
//		 any var declared inside the method is accessible only inside the method
	 }
	 public void checkBalance() {
		 System.out.println("Your balance is "+ money);
	 }
}
