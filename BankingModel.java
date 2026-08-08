package Banking;

public class BankingModel {

    private String accountNo;
    private String name;
    private String Amount;
    private double balance;

    public BankingModel(String accountNo, String name, String Amount, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.Amount =Amount;
        this.balance = balance;
    }

    public String getAccountNo() { return accountNo; }
    public String getName()      { return name; }
    public String getAmount()      { return Amount; }
    public double getBalance()   { return balance; }

    public void setAccountNo(String accountNo) { this.accountNo = accountNo; }
    public void setName(String name)           { this.name = name; }
    public void setType(String Amount)           { this.Amount = Amount; }
    public void setBalance(double balance)     { this.balance = balance; }
}

