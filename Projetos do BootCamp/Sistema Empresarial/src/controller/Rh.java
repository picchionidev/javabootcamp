package controller;

import model.Funcionario;
import model.Gerente;
import model.Desenvolvedor;
import model.Estagiario;

import java.util.ArrayList;
import java.util.Scanner;


 //Classe responsável pela gestão dos funcionários.
 //Contém métodos para criar, aplicar aumento e exibir dados de funcionários.

public class Rh {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

   
    // Cria uma lista de funcionários e os adiciona à lista.
    public void criarLista() {
        // Criando alguns funcionários
        Funcionario f1 = new Gerente("Alice", 123456789, 8000, "TI");
        Funcionario f2 = new Desenvolvedor("Bob", 987654321, 5000, "Java");
        Funcionario f3 = new Estagiario("Carol", 456789123, 1500, 6);

        // Adicionando os funcionários à lista
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
    }

  
     //Exibe os dados de todos os funcionários.
    
    public void exibirDados() {
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }

  
    // Aplica aumento de salário para todos os funcionários.
    
    public void aplicarAumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto, em %, deseja aumentar os salários?");
        double aumento = scanner.nextDouble();

        for (Funcionario f : funcionarios) {
            f.aumentarSalario(aumento); // Aplica o aumento de salário
        }

        scanner.close(); // Fecha o scanner
    }

    
    // Exibe o bônus de todos os funcionários.
     
    public void exibirBonus() {
        for (Funcionario f : funcionarios) {
            double bonus = f.calcularBonus(); // Calcula o bônus do funcionário
            System.out.printf("O bônus do %s é = %.2f\n", f.getName(), bonus);
        }
    }
}
