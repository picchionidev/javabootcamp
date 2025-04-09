package ingresso;

import java.util.Scanner;

/**
 * Representa um ingresso do tipo família.
 * Oferece desconto de 5% caso sejam comprados mais de 3 ingressos.
 */
public final class IngressoFamilia extends Ingresso {

    /**
     * Calcula o valor total com possível desconto.
     * @return valor total a pagar
     */
    private double calcularValorTotal(Scanner scanner) {
        System.out.println("Quantos Ingressos serão comprados?");
        setTicketsNumber(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer

        double valorTotal;
        if (getTicketsNumber() > 3) {
            valorTotal = getPrice() * getTicketsNumber() * 0.95; // 5% de desconto
        } else {
            valorTotal = getPrice() * getTicketsNumber();
        }
        return valorTotal;
    }

   
    public void mostrarValorTotal(Scanner scanner) {
        System.out.printf("O valor total a ser pago é %.2f%n", calcularValorTotal(scanner));
    }
}
