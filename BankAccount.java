public class BankAccount{

  private int accountID;
  private double balance;
  private String password;

  public BankAccount(double currentBalance, int currentAccountID, String currentPassword){

    accountID = currentAccountID;
    balance = currentBalance;
    password = currentPassword;
  }

  public int getAccountID(){
    return accountID;
  }

  public double getBalance(){
    return balance;
  }

  public String getPassword(){
   return password;
  }

  public String toString(){
    return accountID + "\t" + balance;
  }

  public void setPassword (String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if (amount > 0){
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount){
    if ((amount > 0) && (amount <= balance)){
      balance -= amount;
      return true;
    }
      return false;
    }

private boolean authenticate(String password){
    return (password.equals(password));
  }

public boolean transferTo(BankAccount other, double amount, String password){
    return ((authenticate(other.password)) && (amount > 0));
}

}
