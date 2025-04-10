package model;

/**
 * Classe abstrata que representa um funcionário.
 * As subclasses (Gerente, Desenvolvedor, Estagiário) irão herdar essa classe.
 */
public abstract class Funcionario {
    private String name;
    private long cpf;
    private double salary;

    /**
     * Construtor da classe Funcionario.
     *
     * @param name   Nome do funcionário.
     * @param cpf    CPF do funcionário.
     * @param salary Salário do funcionário.
     */
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

    /**
     * Aumenta o salário do funcionário com base em um percentual.
     *
     * @param aumentoSalarial Percentual de aumento.
     */
    public void aumentarSalario(double aumentoSalarial) {
        salary *= 1 + (0.01 * aumentoSalarial);
    }

    /**
     * Método abstrato para calcular o bônus de um funcionário.
     * As subclasses devem implementar esse método.
     *
     * @return Bônus calculado.
     */
    public abstract double calcularBonus();

    /**
     * Exibe os dados do funcionário.
     */
    public void exibirDados() {
        System.out.printf("\nNome: %s\n", name);
        System.out.printf("Salário: %.2f\n", salary);
    }
}
