import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia,nomeCliente;
        float saldo;

        System.out.println("Digite o Número da conta:");
            numero=input.nextInt();
            input.nextLine();
        System.out.println("Digite o Número da agência:");
            agencia=input.nextLine();
        System.out.println("Digite o Nome do Cliente:");
            nomeCliente=input.nextLine();
        System.out.println("Digite o Saldo da conta:");
            saldo=input.nextFloat();
        
        input.close();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f Reais já está disponível para saque.", nomeCliente, agencia, numero, saldo));

}
}

