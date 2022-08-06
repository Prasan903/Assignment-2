/*(Subclasses of Account) In Programming Exercise 2, the Account class was defined to model a bank account.
        An account has the properties account number, balance, annual interest rate, and date created,
        and methods to deposit and withdraw funds. Create two subclasses for checking and saving accounts.
        A checking account has an overdraft limit, but a savings account cannot be overdrawn. Draw the UML diagram for the
        classes and then implement them. Write a test program that
        creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.*/
//Prepared by Prasan_21CE121

import java.util.ArrayList;
import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id1 = "";
        String id2 = ""; // for if we want transfer money to other
        boolean flag = true; // for looping
        int choice;
        double amt;
        // array list for 10 people's account.
        ArrayList<ATM> people = new ArrayList<ATM>(); 
        for (int i = 1; i <= 10; i++) {
            people.add(new ATM());
        }
        System.out.print("Enter Your Account Number : ");
        id1 = sc.next();

        // this method is used for finding particular ID in array-list
        int usrNumber = usrID(id1, people);

        while (flag) {
            // listing choice
            System.out.println();
            System.out.println("Make a choice......");
            System.out.println("1.Balance inquiry ");
            System.out.println("2.Withdraw money ");
            System.out.println("3.Deposit money");
            System.out.println("4.Money Transfer ");
            System.out.println("5.Create Account ");
            System.out.println("6.Deactivate Account");
            System.out.println("7.Exit ");
            choice = sc.nextInt();
            switch (choice) {
                // get method is used to access the member of array list at a particular index
                // (Here That index is received by userID() method and stored in userNumber.)
                case 1 : {
                    System.out.println("Account Number : " + id1);
                    System.out.println("Current Balance : " + people.get(usrNumber).getBlnc());
                    break;
                }
                case 2 : {
                    System.out.print("Enter Amount To Withdraw : ");
                    amt = sc.nextDouble();
                    people.get(usrNumber).withdraw(amt);
                    break;
                }
                case 3 : {
                    System.out.print("Enter Amount To Deposit : ");
                    amt = sc.nextInt();
                    people.get(usrNumber).deposit(amt);
                    break;
                }
                case 4 : {
                    System.out.print("Enter Account Number To Transfer Money1 :");
                    id2 = sc.next();
                    int u2 = usrID(id2, people);
                    System.out.print("Enter Amount To Transfer : ");
                    amt = sc.nextInt();
                    people.get(usrNumber).MoneyTransfer(people.get(u2), amt);
                    break;
                }
                case 5 : {
                    people.add(new ATM());
                    System.out.println("Account Created Successfully.");
                    System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                    break;
                }
                case 6 : {
                    people.remove(usrNumber);
                    System.out.println("Account Deleted Successfully.");
                    flag = false;
                    break;
                }
                case 7 :
                {
                    flag = false;
                    break;
                } 
                default : 
                {
                    System.out.println("Make a valid choice..");
                    break;
                }
            }
        }
    }
// for finding the account from the array list
    public static int usrID(String id1, ArrayList<ATM> people) {
        Scanner s = new Scanner(System.in);
        int usr = 10000;
        int i;
        for (i = 0; i < people.size(); i++) 
        {
            if (id1.equals(people.get(i).getId())) {
                usr = i;
                break;
            }
        }
        if (i == people.size()) 
        {
            System.out.println("No Such Account Exists.\nTry Again..");
            System.out.print("Enter your account id :");
            id1 = s.next();
            retursrID(id1, people);
        } 
        else 
        return usr;
        return i;
    }
    private static void retursrID(String id1, ArrayList<ATM> people) {
    }
}