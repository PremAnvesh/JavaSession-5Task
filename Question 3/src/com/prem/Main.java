package com.prem;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    System.out.println("Select the Bank Name");
    System.out.println("1.ICICI");
    System.out.println("2.HDFC");
    int ch = in.nextInt();
    in.nextLine();
    String holderName;
    String accountNumber;
    double creditScore;
    double amountToBePaid;
    switch (ch){
        case 1 :
            ICICI iObj = new ICICI();
            System.out.println("Enter the Holder Name");
            holderName = in.nextLine();
            iObj.setHolderName(holderName);
            System.out.println("Enter the Account Number");
            accountNumber = in.nextLine();
            iObj.setAccountNumber(accountNumber);
            System.out.println("Enter the Previous Credit Score");
            creditScore = in.nextDouble();
            iObj.setCreditScore(creditScore);
            System.out.println("Enter the Amount to be Paid");
            amountToBePaid = in.nextDouble();
            iObj.setAmountToBePaid(amountToBePaid);
            iObj.calculateCreditScore();
            iObj.display();
            break;
        case 2 :
            HDFC hObj = new HDFC();
            System.out.println("Enter the Holder Name");
            holderName = in.nextLine();
            hObj.setHolderName(holderName);
            System.out.println("Enter the Account Number");
            accountNumber = in.nextLine();
            hObj.setAccountNumber(accountNumber);
            System.out.println("Enter the Previous Credit Score");
            creditScore = in.nextDouble();
            hObj.setCreditScore(creditScore);
            System.out.println("Enter the Amount to be Paid");
            amountToBePaid = in.nextDouble();
            hObj.setAmountToBePaid(amountToBePaid);
            hObj.calculateCreditScore();
            hObj.display();
            break;
        default :
            System.out.println("Invalid Bank type");
            break;
    }
    }
}
