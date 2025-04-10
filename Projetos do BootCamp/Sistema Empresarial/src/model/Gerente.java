package model;


//Classe que representa um Gerente, que é um tipo de funcionário.
//Herda da classe Funcionario.

public class Gerente extends Funcionario {
    private String departament;

   // Construtor da classe Gerente.
    
    public Gerente(String name, long cpf, double salary, String departament) {
        super(name, cpf, salary); // Chama o construtor da superclasse
        this.departament = departament;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // Exibe os dados do funcionário
        System.out.printf("Departamento: %s\n", departament); // Exibe o departamento
    }

    @Override
    public double calcularBonus() {
        return getSalary() * 0.20; // O bônus para gerentes é 20% do salário
    }
}
