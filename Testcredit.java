package bank;
abstract class AbstractBankAccount {
    String name;
    int accountNumber;
    double balance;

    public AbstractBankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void print(); // Abstract method to be implemented by subclasses
}

class Account extends AbstractBankAccount {
    public Account(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void print() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class CreditAccount extends AbstractBankAccount {
    double creditLimit;

    public CreditAccount(String name, int accountNumber, double balance, double creditLimit) {
        super(name, accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void print() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Credit Limit: $" + creditLimit);
    }
}

public class Testcredit {
    public static void main(String[] args) {
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5]; 
        
        // Instantiate 3 regular accounts
        bankAccount[0] = new Account("Sanjay Gupta", 11556, 300);
        bankAccount[1] = new Account("He Xai", 22338, 500);
        bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000);
        bankAccount[3] = new CreditAccount("A.N Other", 88776, 500, 1000);
        bankAccount[4] = new CreditAccount("Another", 66778, 1000, 500);
        
        // Print details of all accounts
        for (AbstractBankAccount account : bankAccount) {
            account.print();
            System.out.println();
        }
    }
}

