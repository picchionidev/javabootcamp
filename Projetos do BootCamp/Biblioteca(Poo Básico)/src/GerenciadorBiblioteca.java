import java.util.ArrayList;

// Classe GerenciadorBiblioteca para armazenar e gerenciar os livros
public class GerenciadorBiblioteca {
    // Lista para armazenar os livros adicionados
    public ArrayList<Livro> livros = new ArrayList<>();

    // Método para adicionar um livro à lista
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para listar todos os livros armazenadoss
    public void listarLivros() {
        System.out.println("Ok, agora vou listar os livros já adicionados.");

        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i)); // Utiliza o método toString() da classe Livro
            System.out.println("------------------------------------------"); // Linha separadora
        }
    }
}
 