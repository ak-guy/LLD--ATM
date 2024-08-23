package JavaCode.ATMState;

import JavaCode.ATM;
import JavaCode.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Total User balance: " + card.getBankBalance());
        exit(atm);
    }

    public void exit(ATM atm){
        returnCard();
        atm.setATMState(new IdleState());
        System.out.println("Atm back to Idle state");
    }

    public void returnCard() {
        System.out.println("Collect your card");
    }
}
