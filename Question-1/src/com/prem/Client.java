package com.prem;

public class Client extends Country {
    private int Clientid;
    private String clientName;
    private String phoneNumber;
    private String email;
    private String passport;
    private Country country = new Country();


    public Client() {
    }


    public Client(int Clientid, String clientName, String phoneNumber, String email, String passport,Country country) {
        this.Clientid = Clientid;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passport = passport;
        this.country = country;
    }


    public int getClientid() {
        return this.Clientid;
    }

    public void setClientid(int Clientid) {
        this.Clientid = Clientid;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return this.passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country.setCountryName(country.getCountryName());
        this.country.setIataCountryCode(country.getIataCountryCode());
    }


    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s %-25s %-25s %s",getClientid(),getClientName(),getPhoneNumber(),getEmail(),getPassport(),getCountry());
    }

}

