

import java.util.Scanner;

import controller.Rh;

public class Main {
   
    public static void main(String[] args) {
       Rh rh = new Rh();
       rh.criarLista();
       
       Scanner scanner = new Scanner(System.in);
       int opcao= 0;

       while (opcao != 4);{
           // Exibindo o menu
           System.out.println("\n---- MENU ----");
           System.out.println("1. Exibir dados dos funcionários");
           System.out.println("2. Aplicar aumento");
           System.out.println("3. Exibir bônus dos funcionários");
           System.out.println("4. Sair");
           System.out.print("Escolha uma opção: ");
           opcao = scanner.nextInt();

           switch (opcao) {
               case 1:
                   System.out.println("------------ Dados sem Aumento ------------");
                   rh.exibirDados();
                   break;
               case 2:
                   rh.aplicarAumento();
                   System.out.println("------------ Dados com Aumento ------------");
                   rh.exibirDados();
                   break;
               case 3:
                   System.out.println("------------ Bônus ------------");
                   rh.exibirBonus();
                   break;
               case 4:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida, tente novamente.");
                   break;
           }
       }
       
       scanner.close();
    }
}
