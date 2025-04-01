import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) throws Exception {
       //Declaração do Salário base
        float salarioBase = 2000;
       //Fluxo
        if(pegarSalario()<salarioBase) 
            System.out.println("Ligar para o Candidato!");
    
        else if(pegarSalario()==salarioBase)
            System.out.println("Ligar com Contra Proposta");
        else
            System.out.println("Aguardando demais Candidatos");
    }
    public static float pegarSalario(){
        //Criação do Scanner
       Scanner scanner = new Scanner(System.in);
        //Pedindo o Dado
        System.out.println("Qual o seu salario pretendido?");
        float salariopretendido = scanner.nextFloat();
        //Limpeza de Buffer
        scanner.nextLine();
        //Fechamento do Scanner
        scanner.close();
        return salariopretendido;
    }
}
