import java.util.Scanner;

public class Main {
    //Declaração das variáveis Globais
    public static float saldo,saque;
    
    public static void main(String[] args) throws SaldoInsuficienteException{
        boolean check = false;
        //Uso Do Try/Catch 
        while(!check){
        try{
        sacar();
        //Erro/Conclusão do Processo
        
        if (saldo<saque)
            throw new SaldoInsuficienteException();
        else
            System.out.printf("Concluido!Seu saldo Restante é : %.2f",saldo-saque);
        check=true;
        }
    
        catch (SaldoInsuficienteException e){
            System.out.println("Saldo Insuficiente");
        }
        finally{
            System.out.println("Operação finalizada.");
        }
        
    }
}

    
    public static void sacar(){
        
        //Criação do Scanner
        Scanner scanner=new Scanner(System.in);
        
        //Requisição dos Dados
        System.out.println("Qual o seu saldo atual na Conta bancária?");
            saldo = scanner.nextFloat();
            //Limpeza do Buffer
            scanner.nextLine();
        System.out.println("Quanto você deseja sacar?");
            saque = scanner.nextFloat();
            //Limpeza do Buffer
            scanner.nextLine();

        
        //Fechamento do Scanner
        scanner.close();
          
    }
}

    
    

