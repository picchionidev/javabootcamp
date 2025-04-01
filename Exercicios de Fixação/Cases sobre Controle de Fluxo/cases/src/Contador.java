import java.util.Scanner;
public class Contador {
    
    public static int primeiroparametro,segundoparametro;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParametrosInvalidosException {
        
        boolean check = false;
        
        while(!check){
        
            try {
                receberParametros();
                
                if(primeiroparametro<segundoparametro)
                    throw new ParametrosInvalidosException();
                else{
                    int i ;
                    int contador = primeiroparametro-segundoparametro;
                        
                    for(i=0;i<contador;i++){
                            System.out.printf("Imprimindo número %d\n",i+1);
                    }
                    check = true;}

                } 
        catch (ParametrosInvalidosException e) {
        System.out.println("O primeiro parametro deve ser maior que o segundo parametro");
       } 
                     }
        scanner.close();
}
    public static void receberParametros() {
        
        System.out.println("Digite o primeiro parametro;");
            primeiroparametro = scanner.nextInt();
            scanner.nextLine();
               
        System.out.println("Digite o segundo parametro;");
            segundoparametro = scanner.nextInt();
            scanner.nextLine(); 
         
    }
}
