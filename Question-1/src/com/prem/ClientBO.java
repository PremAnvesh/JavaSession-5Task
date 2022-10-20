package com.prem;

public class ClientBO {
    void viewDetails(Client[] clientList){
        System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s","ClientId","ClientName","PhoneNumber","Email","Passport","IATACountryCode","CountryName");
        System.out.println();
        for(Client c : clientList){
            System.out.println(c);
        }
    }

    void printClientDetailsWithCountry(Client[] clientList, String countryName){
        System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s","ClientId","ClientName","PhoneNumber","Email","Passport","IATACountryCode","CountryName");
        for(Client c : clientList){
            if(c.getCountry().getCountryName().equalsIgnoreCase(countryName)){
                System.out.println(c);
            }
        }
    }
}

