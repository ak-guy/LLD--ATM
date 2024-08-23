package JavaCode.AmountWithdrawl;

import JavaCode.ATM;

public class OneHundredNoteWithdrawl extends AmountWithdrawalProcessor {
    public OneHundredNoteWithdrawl(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    public void withdrawAmount(ATM atm, int amount) {
        int required100Note = amount/100;
        int remainingAmountNeeded = amount%100;
        
        if (required100Note <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required100Note);
        }
        else{
            int noOf100NotesPresentInATM = atm.getNoOfOneHundredNotes();
            atm.deductFiveHundredNotes(noOf100NotesPresentInATM);
            remainingAmountNeeded = remainingAmountNeeded + ((required100Note - noOf100NotesPresentInATM) * 500);
        }

        if (remainingAmountNeeded != 0) {
            super.withdrawAmount(atm, remainingAmountNeeded);
        }
    }
}