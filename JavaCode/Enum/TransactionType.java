package JavaCode.Enum;

public enum TransactionType {
    CASH_WITHDRAWL,
    CHECK_BALANCE;

    public void showAllTransaction() { 
        System.out.println("These are the available transaction type");
        for (TransactionType t: TransactionType.values()) {
            System.out.println(t.name());
        }
    }
}
