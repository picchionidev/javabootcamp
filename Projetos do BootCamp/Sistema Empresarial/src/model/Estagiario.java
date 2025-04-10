package model;

//Classe que representa um Estagiário, que é um tipo de funcionário.
//Herda da classe Funcionario.

public class Estagiario extends Funcionario {
    private int workedHours;

    //Construtor da classe Estagiário.

    public Estagiario(String name, long cpf, double salary, int workedHours) {
        super(name, cpf, salary); // Chama o construtor da superclasse
        this.workedHours = workedHours;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // Exibe os dados do funcionário
        System.out.printf("Horas trabalhadas: %d\n", workedHours); // Exibe as horas trabalhadas
    }

    @Override
    public double calcularBonus() {
        return 100; // O bônus para estagiários é fixo: 100
    }
}
