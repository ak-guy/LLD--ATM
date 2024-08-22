package JavaCode;

import JavaCode.ATMState.*;

public class ATM {
    ATMState currentATMState;
    private int currentATMBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfTwoHundredNotes;
    int noOfOneHundredNotes;

    // private contructor to help making ATM singleton
    private ATM(){};

    private static class ATMSinglenton {
        private static final ATM atmObject = new ATM();
    }

    // public method to get instance of ATM
    public ATM getATMInstance() {
        ATM atmObj = ATMSinglenton.atmObject;
        atmObj.setATMState(new IdleState());
    }

    public void setATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }


    public int getCurrentATMBalance() {
        return currentATMBalance;
    }

    public void setCurrentATMBalance(int currentATMBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfTwoHundredNotes, int noOfOneHundredNotes) {
        if (currentATMBalance != ((noOfFiveHundredNotes * 500) + (noOfOneHundredNotes * 100) + (noOfTwoHundredNotes * 200) + (noOfTwoThousandNotes * 2000))) {
            System.out.println("Input Principal Amount does not match the total amount from notes");
            return;
        }
        this.currentATMBalance = currentATMBalance;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfTwoHundredNotes = noOfTwoHundredNotes;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfTwoHundredNotes() {
        return noOfTwoHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        this.currentATMBalance = this.currentATMBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductTwoHundredNotes(int number) {
        noOfTwoHundredNotes = noOfTwoHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printATMStatus() {
        System.out.println("Total Balance: " + currentATMBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("200Notes: " + noOfTwoHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }
}