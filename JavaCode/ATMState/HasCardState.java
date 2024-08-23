package JavaCode.ATMState;

import JavaCode.ATM;
import JavaCode.Card;

public class HasCardState extends ATMState{

    public HasCardState() {
        System.out.println("Please enter pin number");
    }

    @Override
    public void validatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPinEntered = card.checkPin(pin);

        if (isCorrectPinEntered) {
            atm.setATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid pin");
            exit(atm);
        }
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
