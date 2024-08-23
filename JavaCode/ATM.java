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
    public static ATM getATMInstance() {
        ATM atmObj = ATMSinglenton.atmObject;
        atmObj.setATMState(new IdleState());
        return atmObj;
    }

    public void setATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }


    public int getCurrentATMBalance() {
        return currentATMBalance;
    }

    public void setCurrentATMBalance(int addATMBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfTwoHundredNotes, int noOfOneHundredNotes) {
        int totalCalculatedAmount = ((noOfFiveHundredNotes * 500) + (noOfOneHundredNotes * 100) + (noOfTwoHundredNotes * 200) + (noOfTwoThousandNotes * 2000));
        if (addATMBalance != totalCalculatedAmount) {
            System.out.println("Input Principal Amount does not match the total amount from notes" + addATMBalance + " -> " + totalCalculatedAmount );
            return;
        }
        this.currentATMBalance = addATMBalance;
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
        System.out.println("Total ATM Balance: " + currentATMBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("200Notes: " + noOfTwoHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }
}