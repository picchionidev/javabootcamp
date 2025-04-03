import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Criação de um objeto biblioteca para gerenciar os métodos da classe GerenciadorBiblioteca
        GerenciadorBiblioteca biblioteca = new GerenciadorBiblioteca();

        // Criação do Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para controlar o loop do menu
        boolean loop = false;

        while (!loop) {
            // Exibe as opções para o usuário
            System.out.println("Deseja adicionar um livro?\n[1] SIM\n[2] NÃO");
            int novoLivro = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

            if (novoLivro == 1) {
                //A criação de um novo objeto Livro dentro do loop garante que um novo livro seja instanciado a cada iteração.
                Livro livro = new Livro();

                // Preenchimento das informações do livro
                System.out.println("Qual o título do livro?");
                livro.setTitulo(scanner.nextLine());

                System.out.println("Qual o autor do livro?");
                livro.setAutor(scanner.nextLine());

                System.out.println("Qual o ano de publicação do livro?");
                livro.setAnodepublicacao(scanner.nextInt());

                // Adiciona o livro à lista na biblioteca
                biblioteca.adicionarLivro(livro);
            } else if (novoLivro == 2) {
                // Sai do loop caso o usuário escolha não adicionar mais livros
                loop = true;
            }
        }

        // Exibe a lista de livros adicionados
        biblioteca.listarLivros();

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}