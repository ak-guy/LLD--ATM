package JavaCode;

import JavaCode.Enum.TransactionType;

public class Driver {

    public static void main(String[] args) {
        ATM atm = ATM.getATMInstance();
        atm.setCurrentATMBalance(10000, 4, 2, 2, 6);
        User user = creatUser();
        
        atm.printATMStatus();
        atm.currentATMState.insertCard(atm, user.card);
        atm.currentATMState.validatePin(atm, user.card, 123456);
        atm.currentATMState.selectOperation(atm, user.card, TransactionType.CASH_WITHDRAWL);
        atm.currentATMState.cashWithdrawal(atm, user.card, 2600);
        atm.printATMStatus();
        System.out.println(user.card.getBankBalance());
    }

    public static User creatUser() {
        User userObj = new User();
        userObj.setCard(createCard());
        return userObj;
    }

    public static Card createCard() {
        Card card = new Card();
        card.setUserBankAccount(createUserAccount());
        return card;
    }

    public static UserBankAccount createUserAccount() {
        UserBankAccount account = new UserBankAccount(5000);
        return account;
    }
}
