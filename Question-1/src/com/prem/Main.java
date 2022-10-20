package com.prem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Number of Clients");
            int n = in.nextInt();
            int i = 0;
            Client[] cObjArr = new Client[n];
            while(n-- != 0){
                cObjArr[i] = new Client();
                Country cnt = new Country();
                System.out.println("Enter client " + (i+1) + " details:");
                System.out.println("Enter the client id");
                int clientID = sc.nextInt();
                cObjArr[i].setClientid(clientID);
                System.out.println("Enter the client name");
                String clientName = sc.next();
                cObjArr[i].setClientName(clientName);
                System.out.println("Enter the phone number");
                String phoneNumber = sc.next();
                cObjArr[i].setPhoneNumber(phoneNumber);
                System.out.println("Enter the email id");
                String emailID = sc.next();
                cObjArr[i].setEmail(emailID);
                System.out.println("Enter the passport number");
                String passport = sc.next();
                cObjArr[i].setPassport(passport);
                System.out.println("Enter the iata country code");
                String countryCode = sc.next();
                cnt.setIataCountryCode(countryCode);
                System.out.println("Enter the country name");
                String countryName = sc.next();
                cnt.setCountryName(countryName);
                cObjArr[i].setCountry(cnt);
                i++;
            }

            ClientBO cBo = new ClientBO();
            int choice;
            do{
                System.out.println("MENU:");
                System.out.println("1.View client details");
                System.out.println("2.Filter client with country");
                System.out.println("3.Exit");

                choice = in.nextInt();

                switch(choice){
                    case 1 :
                        cBo.viewDetails(cObjArr);
                        break;
                    case 2 :
                        System.out.println("Enter country name");
                        String searchCountry = sc.next();
                        cBo.printClientDetailsWithCountry(cObjArr, searchCountry);
                        break;
                    case 3 :
                        break;
                    default :
                        System.out.println("Invalid Input Break");
                        break;
                }

            } while(choice != 1 || choice != 2);
        } catch(Exception e){
            System.out.println(e);
        }
        in.close();
        sc.close();
    }
}

