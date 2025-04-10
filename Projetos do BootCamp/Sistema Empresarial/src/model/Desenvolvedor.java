package model;

//Classe que representa um Desenvolvedor, que é um tipo de funcionário.
//Herda da classe Funcionario.

public class Desenvolvedor extends Funcionario {
    private String favoriteLanguage;

    // Construtor da classe Desenvolvedor.

    public Desenvolvedor(String name, long cpf, double salary, String favoriteLanguage) {
        super(name, cpf, salary); // Chama o construtor da superclasse
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // Exibe os dados do funcionário
        System.out.printf("Linguagem favorita: %s\n", favoriteLanguage); // Exibe a linguagem favorita
    }

    @Override
    public double calcularBonus() {
        return getSalary() * 0.15; // O bônus para desenvolvedores é 15% do salário
    }
}
