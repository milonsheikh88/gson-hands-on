
package com.milonsheikh.gson;

/**
 *
 * @author Milon
 */
public class Employees {
    private String firstName;
    private int age;
    private String mail;
    private Address address;

    
    public Employees(String firstName, int age, String mail, Address address) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employees{" + "firstName=" + firstName + ", age=" + age + ", mail=" + mail + ", address=" + address.toString() + '}';
    }
  
}
