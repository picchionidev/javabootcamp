package app;

import java.util.Scanner;
import controller.MenuHandler;
import model.Car;
import rules.FunctionRules;

public class Main {
    public static void main(String[] args) {
        Car carro = new Car(false, 0, 0);
        Scanner scanner = new Scanner(System.in);
        FunctionRules regras = new FunctionRules();
        MenuHandler menuHandler = new MenuHandler();

        //Loop geral da aplicação
        boolean loopgeral = true;
        while (loopgeral) {

            //Loop enquanto o carro estiver desligado
            while (!carro.isLigado()) {
                carro.ligarCarro(carro, scanner); // Tentativa de ligar o carro
            }

            //Loop enquanto o carro estiver ligado
            while (carro.isLigado()) {
                menuHandler.executarAcao(carro, regras, scanner); // Executa menu
            }
        }

        scanner.close();
    }
}
