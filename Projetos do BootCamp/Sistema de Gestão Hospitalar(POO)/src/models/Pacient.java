// package models;
package models;

// Class representing a Pacient
public class Pacient extends Person {
    private String diagnostic;

    public Pacient(String name, int age, String cpf, String diagnostic) {
        super(name, age, cpf);
        this.diagnostic = diagnostic;
    }

    // Overridden method to show data
    @Override
    public void showData() {
        super.showData();
        System.out.printf("Diagnostic = %s\n", diagnostic);
    }

    // Overridden abstract method from Person
    @Override
    public void takeAction() {
        System.out.println("Taking Medicines...");
    }

    // Pacient specific method
    public void rest() {
        System.out.println("Resting...");
    }
}
