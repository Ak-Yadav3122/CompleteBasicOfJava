package EncapulationChallenge.Challenge02;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        accountBalance = accountBalance + money;
        System.out.println("Successfull Deposite.");
        System.out.println("Your AccountNumber is: "+ accountNumber);
        System.out.println("Your AccountHolderName is: "+ accountHolderName);
        System.out.println("Your AccountBalance is: "+ accountBalance);
    }

    public double withdrawMoney(double money) {
        if (accountBalance >= money) {

            accountBalance = accountBalance - money;

        } else {
            System.out.println("You can not withdraw money. Because you have only "+ accountBalance+"\nPlease Add money");
        }
        return accountBalance;

    }
}
