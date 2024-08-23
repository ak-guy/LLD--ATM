package JavaCode;

import java.util.Date;

public class Card {
    private String cardNumber;
    private int cvv;
    private Date expiry;
    private String cardHolderName;
    static int PIN_NUMBER = 123456;
    private UserBankAccount userBankAccount;

    public Card(String cardNumber, int cvv, Date expiry, String cardHolderName, UserBankAccount userBankAccount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiry = expiry;
        this.cardHolderName = cardHolderName;
        this.userBankAccount = userBankAccount;
    }

    public boolean checkPin(int inputPin) {
        if (PIN_NUMBER == inputPin) {
            return true;
        }

        return false;
    }

    public int getBankBalance() {
        return userBankAccount.getBalance();
    }

    public void withdrawAmount(int amount) {
        userBankAccount.withdrawAmount(amount);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public UserBankAccount getUserBankAccount() {
        return userBankAccount;
    }

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }

}
