package com.prem;

public class Country  {
    private String iataCountryCode;
    private String countryName;


    public Country() {
    }


    public Country(String iataCountryCode, String countryName) {
        this.iataCountryCode = iataCountryCode;
        this.countryName = countryName;
    }


    public String getIataCountryCode() {
        return this.iataCountryCode;
    }

    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString(){
        return String.format("%-25s %s\n", getIataCountryCode(),getCountryName());
    }
}

