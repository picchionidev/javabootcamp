// package models;
package models;

// Class representing a Doctor
public class Doctor extends Person {
    private String medicalSpecialty;

    public Doctor(String name, int age, String cpf, String medicalSpecialty) {
        super(name, age, cpf);
        this.medicalSpecialty = medicalSpecialty;
    }

    // Overridden method to show data
    @Override
    public void showData() {
        super.showData();
        System.out.printf("Medical Specialty = %s\n", medicalSpecialty);
    }

    // Overridden abstract method from Person
    @Override
    public void takeAction() {
        System.out.println("Preparing Medicines...");
    }

    // Doctor specific method
    public void performingSurgery() {
        System.out.println("Performing Surgery...");
    }
}
