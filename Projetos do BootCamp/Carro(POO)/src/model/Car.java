package model;

import java.util.Scanner;

public class Car {
    private boolean ligado;
    private int marcha;
    private double velocidade;

    //Construtor
    public Car(boolean ligado, int marcha, double velocidade) {
        this.ligado = ligado;
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    //Getters e Setters
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    //Métodos principais
    public void ligarCarro(Car carro, Scanner scanner) {
        System.out.println("\n🔑 Deseja ligar o carro?\n[1] SIM\n[2] NÃO");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 2) {
            System.out.println("❌ Carro permanece desligado.");
        } else if (escolha == 1) {
            System.out.println("✅ Carro ligado!");
            carro.setLigado(true);
        }
    }

    public void desligarCarro() {
        setLigado(false);
    }

    public void acelerar() {
        velocidade += 1;
    }

    public void frear() {
        velocidade -= 1;
    }

    public void virarDireita() {
        System.out.println("↪️ Virando à direita...");
    }

    public void virarEsquerda() {
        System.out.println("↩️ Virando à esquerda...");
    }

    public double checarVelocidade() {
        return velocidade;
    }

    public void aumentarMarcha() {
        marcha += 1;
    }

    public void reduzirMarcha() {
        marcha -= 1;
    }

    // 📋 Menu interativo
    public int menuDoCarro(Scanner scanner) {
        System.out.println("\n🚘 ===== MENU DO CARRO ===== 🚘");
        System.out.println("[1] 🛑 Desligar o carro");
        System.out.println("[2] 💨 Acelerar");
        System.out.println("[3] 🛑 Frear");
        System.out.println("[4] ↩️ Virar à esquerda");
        System.out.println("[5] ↪️ Virar à direita");
        System.out.println("[6] 📊 Ver velocidade");
        System.out.println("[7] ⬆️ Aumentar marcha");
        System.out.println("[8] ⬇️ Reduzir marcha");
        System.out.print("➡️ Escolha uma opção: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
