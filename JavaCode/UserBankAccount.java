package JavaCode;

public class UserBankAccount {
    int balance;

    public UserBankAccount(int balance) {
        this.balance = balance;
    }

    public void withdrawAmount(int amount) {
        balance = balance - amount;
    }

    public int getBalance() {
        return this.balance;
    }
    
}
