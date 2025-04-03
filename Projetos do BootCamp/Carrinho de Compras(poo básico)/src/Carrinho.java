import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    // Lista de produtos no carrinho
    public static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        // Variável para armazenar a soma dos valores dos produtos
        double soma = 0;

        // Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Controle do loop do menu
        boolean loop = false;

        // Estrutura de repetição para manter o menu ativo até o usario finalizar
        while (!loop) {
            System.out.println("Você deseja:");
            System.out.println("[1] ADICIONAR PRODUTO AO CARRINHO");
            System.out.println("[2] EXIBIR VALOR TOTAL E FINALIZAR COMPRA");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha após o número

            if (escolha == 1) {
                // Criação de um novo produto
                Produto produto = new Produto();

                // Solicita e armazena o nome do produto
                System.out.println("Qual o nome do produto?");
                produto.setNome(scanner.nextLine());

                // Solicita e armazena o valor do produto
                System.out.println("Qual o valor do produto?");
                produto.setPreco(scanner.nextDouble());

                // Adiciona o produto ao carrinho
                adicionarCarrinho(produto);

                // Soma o preço do produto ao total
                soma += produto.getPreco();
            } else {
                // Sai do loop e finaliza a compra
                loop = true;
            }
        }

        // Exibe os produtos no carrinho e o valor total da compra
        exibirCarrinho(soma);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Método para adicionar um produto ao carrinho
    public static void adicionarCarrinho(Produto produto) {
        produtos.add(produto);
    }

    // Método para exibir os produtos no carrinho e o valor total da compra
    public static void exibirCarrinho(Double soma) {
        System.out.println("\n🛒 Produtos no Carrinho:");
        
        // Loop for-each para exibir cada produto armazenado na lista
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("----------------------------");
        System.out.printf("💰 Total da Compra: R$ %.2f\n", soma);
    }
}
