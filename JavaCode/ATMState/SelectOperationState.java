package JavaCode.ATMState;

import JavaCode.ATM;
import JavaCode.Card;
import JavaCode.Enum.TransactionType;

public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        showOperation();
    }

    public void showOperation() {
        System.out.println("Please select the operation: ");
        TransactionType.showAllTransaction();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        
        switch (transactionType) {
            case CASH_WITHDRAWL:
                atm.setATMState(new WithdrawlState());
                break;
            case CHECK_BALANCE:
                atm.setATMState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
                exit(atm);
                break;
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
