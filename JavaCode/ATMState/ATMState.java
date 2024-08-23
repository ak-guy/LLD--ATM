package JavaCode.ATMState;

import JavaCode.*;
import JavaCode.Enum.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("Something went wrong");
    }

    public void validatePin(ATM atm, Card card, int pin) {
        System.out.println("Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount) {
        System.out.println("Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("Something went wrong");
    }

    public void returnCard() {
        System.out.println("Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("Something went wrong");
    }
}
