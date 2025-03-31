import java.util.Scanner;
import java.util.InputMismatchException; // Importação necessária

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Digite o segundo número: ");
                int num2 = scanner.nextInt();
                
                int resultado = num1 / num2; // Pode gerar ArithmeticException
                System.out.println("Resultado: " + resultado);

                sucesso = true; // Sai do loop se a divisão for bem-sucedida

            } catch (ArithmeticException e) {
                System.out.println("Jamais Dividirás por Zero. Tente novamente.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
                scanner.nextLine();
                
            }
        }

        scanner.close(); // Fecha o scanner corretamente após o sucesso
    }
}
