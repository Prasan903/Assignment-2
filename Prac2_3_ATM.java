// this is the supportive class file for the pr3_B

public class Prac2_3_ATM {
    private static int cnt;
    private final String id;
    private double blnc;

    //constructor to initialize id and balance
    public Prac2_3_ATM() {
        cnt++;
        if (cnt < 10) {
            id = "AC00" + (cnt);
        } else {
            id = "AC0" + (cnt);
        }
        blnc = 300;
    }

    //getters and setters for balance and ID.
    public void setBalance(double blnc) {
        this.blnc = blnc;
    }
    public String getId() {
        return id;
    }

    public double getBlnc() {
        return blnc;
    }

    //Withdraw method
    public void withdraw(double money) {
        if (blnc - money >= 300) {
            blnc -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + blnc);
        } else {
            System.out.println("Insufficient balance to withdraw amount.");
        }
    }

    //deposit method
    public void deposit(double amt){
        blnc = blnc + amt;
        System.out.println(amt + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + blnc);
    }

    //method to transfer money.
    public void MoneyTransfer(ATM obj, double amt) {
        if (blnc - amt >= 300) {
            blnc = blnc - amt;
            obj.blnc = obj.blnc + amt;
            System.out.println(amt + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + blnc);
        } else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
}