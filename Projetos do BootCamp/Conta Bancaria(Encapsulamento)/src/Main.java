import java.util.Scanner;

// Classe principal que gerencia as interações com o usuário e o menu da conta bancária
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o saldo inicial da conta
        System.out.print("Digite o saldo inicial: ");
        double saldoinicial = scanner.nextDouble();

        // Cria uma conta bancária com o saldo informado
        ContaBancaria conta = new ContaBancaria(saldoinicial);

        // Define o valor do cheque especial com base no saldo inicial
        double valorchequeespecial;
        if (saldoinicial <= 500 && saldoinicial > 0) {
            valorchequeespecial = 50; // Valor fixo para saldo baixo
        } else {
            valorchequeespecial = saldoinicial / 2; // Metade do saldo para saldo maior
        }

        boolean loop = false;

        // Loop do menu até o usuário decidir sair
        while (!loop) {
            // Exibe as opções do menu
            System.out.println("\n-----------------MENU-----------------\n");
            System.out.println("[1] Consultar saldo");
            System.out.println("[2] Consultar cheque especial");
            System.out.println("[3] Depositar dinheiro");
            System.out.println("[4] Sacar dinheiro");
            System.out.println("[5] Pagar um boleto");
            System.out.println("[6] Verificar se a conta está usando cheque especial");
            System.out.println("[7] Sair do Menu");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (escolha) {
                case 1: // Consulta o saldo total (incluindo o limite do cheque especial)
                    System.out.printf("Seu saldo é igual a %.2f\n", conta.getSaldo() + valorchequeespecial);
                    break;

                case 2: // Mostra o valor do cheque especial
                    System.out.printf("Seu cheque especial é de %.2f\n", valorchequeespecial);
                    break;

                case 3: // Realiza um depósito
                    conta.Depositar();
                    break;

                case 4: // Realiza um saque
                    conta.Sacar();
                    break;

                case 5: // Simula o pagamento de um boleto
                    conta.PagarBoleto();
                    break;

                case 6: // Verifica se o saldo está negativo (usando cheque especial)
                    if (conta.getSaldo() < 0) {
                        System.out.printf("Sim! Você está usando %.2f de cheque especial\n", Math.abs(conta.getSaldo()));
                    } else {
                        System.out.println("Não, você não está usando o cheque especial");
                    }
                    break;

                case 7: // Encerra o menu
                    loop = true;
                    break;

                default: // Opção inválida
                    System.out.println("Opção inválida. Por favor, escolha um número de 1 a 7.");
                    break;
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
