public class Driver{
	public static void main(String[] args){

    BankAccount a = new BankAccount(1, 7000.00, "pwtest");


  	System.out.println(a.toString());
		System.out.println(a.getPassword());



		if (a.deposit(-100.00)){
			System.out.println("Deposit success!");
		}
			else {
				System.out.println("Deposit failure");
			}

		if(a.withdraw(10.00)){
    	System.out.println("Withdrawal success!");
       }
			 else{
      System.out.println("Withdrawal failure");
       }

			// Testing for get.password()
			BankAccount b = new BankAccount(2, -200.50, "pwtest2");

			b.setPassword("newPassword");
			System.out.println(b.getPassword());


  }
}
