package controller;

import java.util.Scanner;
import model.Car;
import rules.FunctionRules;

public class MenuHandler {

    public void executarAcao(Car carro, FunctionRules regras, Scanner scanner) {
        int escolhademenu = carro.menuDoCarro(scanner);

        switch (escolhademenu) {

            case 1: //Desligar carro
                if (regras.checagemParaDesligar(carro.getMarcha(), carro.getVelocidade())) {
                    System.out.println("🛑 Desligando o carro...");
                    carro.desligarCarro();
                } else {
                    System.out.println("⚠️ Para desligar, reduza a velocidade a 0 km/h e coloque no ponto morto.");
                }
                break;

            case 2: //Acelerar
                if (carro.getMarcha() == 0) {
                    System.out.println("🚫 Carro está no ponto morto. Não é possível acelerar!");
                } else if (regras.checarVelocidadeMaxima(carro.getVelocidade())) {
                    System.out.println("🚀 Velocidade máxima atingida!");
                } else if (regras.checarMarcha(carro.getMarcha(), carro.getVelocidade())) {
                    carro.acelerar();
                    System.out.println("💨 Acelerando...");
                } else {
                    System.out.println("⚠️ Marcha inadequada para a velocidade atual.");
                }
                break;

            case 3: //Frear
                if (regras.checarVelocidadeMinima(carro.getVelocidade())) {
                    System.out.println("⚠️ Velocidade já está no mínimo.");
                } else {
                    System.out.println("🛑 Freando...");
                    carro.frear();
                }
                break;

            case 4: //Virar esquerda
                if (regras.checagemParaVirar(carro.getVelocidade())) {
                    System.out.println("↩️ Virando para a esquerda...");
                    carro.virarEsquerda();
                } else {
                    System.out.println("⚠️ Só é possível virar com velocidade entre 1 e 40 km/h.");
                }
                break;

            case 5: //Virar direita
                if (regras.checagemParaVirar(carro.getVelocidade())) {
                    System.out.println("↪️ Virando para a direita...");
                    carro.virarDireita();
                } else {
                    System.out.println("⚠️ Só é possível virar com velocidade entre 1 e 40 km/h.");
                }
                break;

            case 6: //Ver velocidade
                System.out.printf("📊 Velocidade atual: %.1f km/h\n", carro.getVelocidade());
                break;

            case 7: //Aumentar marcha
                if (carro.getMarcha() >= 6) {
                    System.out.println("⚠️ Você já está na marcha máxima.");
                } else {
                    System.out.println("⬆️ Aumentando marcha...");
                    carro.aumentarMarcha();
                }
                break;

            case 8: //Reduzir marcha
                if (carro.getMarcha() <= 0) {
                    System.out.println("⚠️ Você já está na marcha mínima.");
                } else {
                    System.out.println("⬇️ Reduzindo marcha...");
                    carro.reduzirMarcha();
                }
                break;

            default:
                System.out.println("❌ Opção inválida. Escolha um número de 1 a 8.");
                break;
        }
    }
}
