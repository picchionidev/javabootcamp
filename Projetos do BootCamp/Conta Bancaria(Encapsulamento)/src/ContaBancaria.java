import java.util.Scanner;

// Classe ContaBancaria responsável pelas operações bancárias básicas
public class ContaBancaria {
    private Scanner scanner = new Scanner(System.in);
    private double saldo; // Armazena o saldo da conta

    // Construtor que inicializa a conta com um saldo inicial
    ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Retorna o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Realiza um depósito na conta
    public void Depositar() {
        System.out.print("Qual o valor a ser depositado? ");
        double deposito = scanner.nextDouble();
        saldo += deposito;
        System.out.println("Depósito realizado com sucesso!");
    }

    // Realiza um saque da conta
    public void Sacar() {
        System.out.print("Qual o valor a ser sacado? ");
        double saque = scanner.nextDouble();
        saldo -= saque;
        System.out.println("Saque realizado com sucesso!");
    }

    // Simula o pagamento de um boleto
    public void PagarBoleto() {
        System.out.println("Boleto pago com sucesso!");
    }
}
