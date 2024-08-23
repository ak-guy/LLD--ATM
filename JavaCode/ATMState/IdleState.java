package JavaCode.ATMState;

import JavaCode.*;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card has been entered: " + card.getCardNumber());
        atm.setATMState(new HasCardState());
    }
}
