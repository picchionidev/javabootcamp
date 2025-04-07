public class Livro {
    private String titulo;
    private String autor;
    private int anodepublicacao;

    public Livro(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnodepublicacao() {
        return anodepublicacao;
    }

    public void setAnodepublicacao(int anodepublicacao) {
        this.anodepublicacao = anodepublicacao;
    }

    // Método toString() para exibição correta das informações do livro
    public String toString() {
        return "Livro: " + titulo + "\nAutor: " + autor + "\nAno: " + anodepublicacao;
    }
}