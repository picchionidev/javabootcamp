package model;


//Classe abstrata que representa um funcionário.
//As subclasses (Gerente, Desenvolvedor, Estagiário) irão herdar essa classe.

public abstract class Funcionario {
    private String name;
    private long cpf;
    private double salary;


    //Construtor da classe Funcionario.
    
    public Funcionario(String name, long cpf, double salary) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getCpf() {
        return cpf;
    }

    public double getSalary() {
        return salary;
    }

  
    public void aumentarSalario(double aumentoSalarial) {
        salary *= 1 + (0.01 * aumentoSalarial);
    }

   
    public abstract double calcularBonus();

    public void exibirDados() {
        System.out.printf("\nNome: %s\n", name);
        System.out.printf("Salário: %.2f\n", salary);
    }
}
