// package models;
package models;

// Abstract class representing a person
public abstract class Person {
    private String name;
    private int age;
    private String cpf;

    // Constructor
    public Person(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Method to display personal data
    public void showData() {
        System.out.printf("Name = %s\n", name);
        System.out.printf("Age = %d\n", age);
        System.out.printf("CPF = %s\n", cpf);
    }

    // Abstract method to be implemented by subclasses
    abstract void takeAction();
}
