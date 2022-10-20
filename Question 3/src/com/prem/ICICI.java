package com.prem;

public class ICICI extends RBI{
    private double amountToBePaid;
    private double credit;
    private double totalCreditScore;

    public void setAmountToBePaid(double amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }

    @Override
    public double calculateCreditScore() {
        credit = amountToBePaid * CREDIT;
        totalCreditScore = credit + getCreditScore();
        return totalCreditScore;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("You have gained " + String.format("%.2f", credit) + " credit score for the payment of " + amountToBePaid);
        System.out.println("Your Total Credit Score is " + String.format("%.2f", totalCreditScore));
    }
}
