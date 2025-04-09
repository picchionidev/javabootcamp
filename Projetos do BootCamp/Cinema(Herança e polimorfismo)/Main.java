import java.util.Scanner;
import ingresso.Ingresso;
import ingresso.IngressoNormal;
import ingresso.IngressoFamilia;
import ingresso.IngressoMeia;

/**
 * Classe principal responsável por inicializar a aplicação e controlar o fluxo principal.
 */
public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = null;
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de tipos de ingresso
        System.out.println("O seu ingresso é\n[1] Normal\n[2] Família\n[3] Meia Entrada");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        // Instancia a subclasse correspondente ao tipo de ingresso escolhido
        switch (tipo) {
            case 1:
                ingresso = new IngressoNormal();
                break;
            case 2:
                ingresso = new IngressoFamilia();
                break;
            case 3:
                ingresso = new IngressoMeia();
                break;
            default:
                System.out.println("Tipo inválido.");
                scanner.close();
                return;
        }

        // Coleta dados comuns ao ingresso e mostra valor total
        ingresso.dataRequisition(scanner);
        ingresso.mostrarValorTotal(scanner);

        scanner.close(); // Libera o recurso
    }
}
