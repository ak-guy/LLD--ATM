package JavaCode.AmountWithdrawl;

import JavaCode.ATM;

public class TwoThousandNoteWithdrawl extends AmountWithdrawalProcessor{
    public TwoThousandNoteWithdrawl(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        super(amountWithdrawalProcessor);
    }

    public void withdrawAmount(ATM atm, int amount) {
        int required2KNote = amount/2000;
        int remainingAmountNeeded = amount%2000;
        
        if (required2KNote <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required2KNote);
        }
        else{
            int noOf2KNotesPresentInATM = atm.getNoOfTwoThousandNotes();
            atm.deductTwoThousandNotes(noOf2KNotesPresentInATM);
            remainingAmountNeeded = remainingAmountNeeded + ((required2KNote - noOf2KNotesPresentInATM) * 2000);
        }

        if (remainingAmountNeeded != 0) {
            super.withdrawAmount(atm, remainingAmountNeeded);
        }
    }
}
