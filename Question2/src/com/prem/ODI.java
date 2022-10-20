package com.prem;

public class ODI extends Match {
    @Override
    void display() {
        int requiredScore = getTarget() - getCurrentScore();
        int balls = calculateBalls();
        System.out.println("Requirements:");
        System.out.println("Need " + requiredScore + " runs in " + balls + " balls." );
        System.out.println("Require Run Rate - " + String.format("%.2f", calculateRunrate()));
    }

    @Override
    float calculateRunrate() {
        int remainingBalls = calculateBalls();
        int requiredScore = getTarget() - getCurrentScore();
        return (requiredScore/remainingBalls)*6;
    }

    @Override
    int calculateBalls() {
        int totalBalls = 50*6;
        float overs = getCurrentOver();
        int ans = totalBalls - (int)Math.round(((Math.floor(overs)*6) + (overs % Math.floor(overs))*10));
        return ans;
    }
}
