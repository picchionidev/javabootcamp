package ingresso;

import java.util.Scanner;

/**
 * Representa um ingresso normal, sem descontos ou regras adicionais.
 */
public final class IngressoNormal extends Ingresso {

    /**
     * Exibe o valor total baseado no preço unitário informado.
     */
    public void mostrarValorTotal(Scanner scanner) {
        System.out.printf("O valor total a ser pago é de %.2f%n", getPrice());
    }
}
