package ingresso;

import java.util.Scanner;

/**
 * Classe abstrata selada que define a estrutura comum para todos os tipos de ingresso.
 * Apenas as subclasses permitidas podem herdá-la.
 */
public abstract sealed class Ingresso permits IngressoFamilia, IngressoMeia, IngressoNormal {
    private double price;
    private String filmName;
    private int audioType;
    private int ticketsNumber;

    // Método abstrato para cálculo e exibição do valor total
    public abstract void mostrarValorTotal(Scanner scanner);

    // Getters e Setters
    public int getTicketsNumber() {
        return ticketsNumber;
    }

    public void setTicketsNumber(int ticketsNumber) {
        this.ticketsNumber = ticketsNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getAudioType() {
        return audioType;
    }

    public void setAudioType(int audioType) {
        this.audioType = audioType;
    }

    /**
     * Solicita os dados básicos do ingresso ao usuário via Scanner.
     */
    public void dataRequisition(Scanner scanner) {
        System.out.println("Qual o nome do filme?");
        setFilmName(scanner.nextLine());

        System.out.println("Qual o valor do Ingresso?");
        setPrice(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer

        System.out.println("O Filme é\n[1] Dublado\n[2] Legendado");
        setAudioType(scanner.nextInt());
        scanner.nextLine();
    }
}
