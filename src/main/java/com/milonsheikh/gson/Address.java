package com.milonsheikh.gson;

/**
 *
 * @author Milon
 */
public class Address {

    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", city=" + city + '}';
    }
    
}
