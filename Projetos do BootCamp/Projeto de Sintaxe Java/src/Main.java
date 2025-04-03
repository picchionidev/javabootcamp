import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Cria o objeto Scanner para ler entradas do usuário
        try(Scanner scanner = new Scanner(System.in)){

            // Entrada do saldo inicial
            System.out.println("Olá, Digite o Saldo inicial");
            double saldo = scanner.nextDouble(); // Lê o saldo inicial do usuário

            int i;
            // Loop para entrada das operações (vai rodar 3 vezes)
            for(i = 0; i < 3; i++){
                
                boolean check1 = false;
                int choice = 0;
                // Loop para garantir que o usuário escolha 1 ou 2 (Depósito ou Saque)
                while(!check1){
                
                    // Exibe a mensagem para o usuário escolher a operação
                    System.out.println("Deseja fazer Um:\n[1]Depósito\n[2]Saque");
                    choice = scanner.nextInt(); // Lê a escolha do usuário
                    
                    try{
                        // Se a escolha não for 1 nem 2, lança uma exceção personalizada
                        if(choice != 1 && choice != 2)
                            throw new EscolhaInexistenteException();
                        check1 = true; // Sai do loop caso a escolha seja válida
                    }
                    catch(EscolhaInexistenteException e){
                        // Caso a exceção seja lançada, avisa o usuário para digitar uma escolha válida
                        System.out.println("Digite um número igual a 1 ou 2");
                    }
                }

                // Caso a escolha seja depósito
                if(choice == 1){
                    System.out.println("Quanto você deseja depositar?");
                    double deposito = scanner.nextDouble(); // Lê o valor do depósito
                    saldo += deposito; // Atualiza o saldo com o valor depositado
                }
                // Caso a escolha seja saque
                else if(choice == 2){
                    boolean check2 = false;
                    // Loop para garantir que o saque não seja superior ao saldo
                    while(!check2){
                        try{
                            System.out.println("Quanto você deseja sacar?");
                            double saque = scanner.nextDouble(); // Lê o valor do saque
                            
                            // Verifica se o saque é maior que o saldo disponível
                            if(saque > saldo)
                                throw new SaldoInsuficienteException(); // Lança exceção se o saldo for insuficiente
                            saldo -= saque; // Atualiza o saldo com o valor sacado
                            check2 = true; // Sai do loop caso o saque seja possível
                        }
                        
                        catch(SaldoInsuficienteException e){
                            // Caso o saldo seja insuficiente, avisa o usuário
                            System.out.println("Saldo insuficiente");
                        }
                    }
                }
            }
            
            // Exibe o saldo final após as operações
            System.out.printf("Seu saldo final é %.2f Reais\n", saldo);
            
        }
    }
}
