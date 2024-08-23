package JavaCode.ATMState;

import JavaCode.ATM;
import JavaCode.Card;
import JavaCode.AmountWithdrawl.AmountWithdrawalProcessor;
import JavaCode.AmountWithdrawl.FiveHundredNoteWithdrawl;
import JavaCode.AmountWithdrawl.OneHundredNoteWithdrawl;
import JavaCode.AmountWithdrawl.TwoHundredNoteWithdrawl;
import JavaCode.AmountWithdrawl.TwoThousandNoteWithdrawl;

public class WithdrawlState extends ATMState{

    public WithdrawlState() {
        System.out.println("Enter the amount to withdraw: ");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int amount) {
        if (amount > atm.getCurrentATMBalance()) {
            System.out.println("Insufficient cash in ATM");
            exit(atm);
        } else if (card.getBankBalance() < amount) {
            System.out.println("Insufficient cash in your Bank Account");
            exit(atm);
        }else {
            card.withdrawAmount(amount);

            // using chain of responsibility
            AmountWithdrawalProcessor withdrawalProcessor = new TwoThousandNoteWithdrawl(new FiveHundredNoteWithdrawl(new TwoHundredNoteWithdrawl(new OneHundredNoteWithdrawl(null))));
            withdrawalProcessor.withdrawAmount(atm, amount);
            atm.deductATMBalance(amount);
            atm.printATMStatus();
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
