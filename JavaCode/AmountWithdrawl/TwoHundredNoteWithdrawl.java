package JavaCode.AmountWithdrawl;

import JavaCode.ATM;

public class TwoHundredNoteWithdrawl extends AmountWithdrawalProcessor {
    public TwoHundredNoteWithdrawl(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    public void withdrawAmount(ATM atm, int amount) {
        int required200Note = amount/200;
        int remainingAmountNeeded = amount%200;
        
        if (required200Note <= atm.getNoOfTwoHundredNotes()) {
            atm.deductTwoHundredNotes(required200Note);
        }
        else{
            int noOf200NotesPresentInATM = atm.getNoOfTwoHundredNotes();
            atm.deductTwoHundredNotes(noOf200NotesPresentInATM);
            remainingAmountNeeded = remainingAmountNeeded + ((required200Note - noOf200NotesPresentInATM) * 200);
        }

        if (remainingAmountNeeded != 0) {
            super.withdrawAmount(atm, remainingAmountNeeded);
        }
    }
}
