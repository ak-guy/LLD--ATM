package JavaCode.AmountWithdrawl;

import JavaCode.ATM;

public abstract class AmountWithdrawalProcessor {
    AmountWithdrawalProcessor nextAmountWithdrawalProcessor;

    public AmountWithdrawalProcessor(AmountWithdrawalProcessor amountWithdrawalProcessor) {
        this.nextAmountWithdrawalProcessor = amountWithdrawalProcessor;
    }

    public void withdrawAmount(ATM atm, int amount) {
        if (nextAmountWithdrawalProcessor != null) {
            nextAmountWithdrawalProcessor.withdrawAmount(atm, amount);
        }
    }
}
