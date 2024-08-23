package JavaCode.AmountWithdrawl;

import JavaCode.ATM;

public class FiveHundredNoteWithdrawl extends AmountWithdrawalProcessor {
    public FiveHundredNoteWithdrawl(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    public void withdrawAmount(ATM atm, int amount) {
        int required500Note = amount/500;
        int remainingAmountNeeded = amount%500;
        
        if (required500Note <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required500Note);
        }
        else{
            int noOf500NotesPresentInATM = atm.getNoOfFiveHundredNotes();
            atm.deductFiveHundredNotes(noOf500NotesPresentInATM);
            remainingAmountNeeded = remainingAmountNeeded + ((required500Note - noOf500NotesPresentInATM) * 500);
        }

        if (remainingAmountNeeded != 0) {
            super.withdrawAmount(atm, remainingAmountNeeded);
        }
    }
}
