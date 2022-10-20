package com.prem;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cricket Format :");
        System.out.println("1.ODI");
        System.out.println("2.T20");
        System.out.println("3.Test");
        int ch = in.nextInt();
        switch (ch){
            case 1 :
                ODI oObj = new ODI();
                System.out.println("Enter the Current Score");
                oObj.setCurrentScore(in.nextInt());
                System.out.println("Enter the Current Over");
                oObj.setCurrentOver(in.nextFloat());
                System.out.println("Enter the target");
                oObj.setTarget(in.nextInt());
                oObj.display();
                break;
            case 2 :
                T20 tObj = new T20();
                System.out.println("Enter the Current Score");
                tObj.setCurrentScore(in.nextInt());
                System.out.println("Enter the Current Over");
                tObj.setCurrentOver(in.nextFloat());
                System.out.println("Enter the target");
                tObj.setTarget(in.nextInt());
                tObj.display();
                break;
            case 3 :
                TEST teObj = new TEST();
                System.out.println("Enter the Current Score");
                teObj.setCurrentScore(in.nextInt());
                System.out.println("Enter the Current Over");
                teObj.setCurrentOver(in.nextFloat());
                System.out.println("Enter the target");
                teObj.setTarget(in.nextInt());
                teObj.display();
                break;
            default :
                System.out.println("Invalid Format type");
                break;
        }
    }
}
