// package models;
package models;

// Class representing an Employee
public class Employee extends Person {
    private String sector;

    public Employee(String name, int age, String cpf, String sector) {
        super(name, age, cpf);
        this.sector = sector;
    }

    // Overridden method to show data
    @Override
    public void showData() {
        super.showData();
        System.out.printf("Sector = %s\n", sector);
    }

    // Overridden abstract method from Person
    @Override
    public void takeAction() {
        System.out.println("Checking Timetables...");
    }

    // Employee specific method
    public void makingSpreadsheets() {
        System.out.println("Making Spreadsheets...");
    }
}
