package Entities;

import java.util.Date;

public class Customer {
int id;
private String firstName;
private String lastName;
private String tcNumber;
private int dateOfYear;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String tcNumber, int dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcNumber = tcNumber;
        this.dateOfYear = dateOfYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTcNumber() {
        return tcNumber;
    }

    public void setTcNumber(String tcNumber) {
        this.tcNumber = tcNumber;
    }

    public int getDateOfYear() {
        return dateOfYear;
    }

    public void setDateOfYear(int dateOfYear) {
        this.dateOfYear = dateOfYear;
    }
}
