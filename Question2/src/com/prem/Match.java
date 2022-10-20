package com.prem;

abstract class Match {
    private int currentScore;
    private float currentOver;
    private int target;

    abstract void display();
    abstract float calculateRunrate();
    abstract int calculateBalls();

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public float getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(float currentOver) {
        this.currentOver = currentOver;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
}
