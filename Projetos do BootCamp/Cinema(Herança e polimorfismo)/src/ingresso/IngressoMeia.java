package ingresso;

import java.util.Scanner;

/**
 * Representa um ingresso do tipo meia-entrada, com 50% de desconto.
 */
public final class IngressoMeia extends Ingresso {

    /**
     * Calcula o valor da meia entrada.
     * @return valor com 50% de desconto
     */
    private double calcularValorTotal() {
        return getPrice() / 2;
    }

    
    public void mostrarValorTotal(Scanner scanner) {
        System.out.printf("O valor total a ser pago é %.2f%n", calcularValorTotal());
    }
}
