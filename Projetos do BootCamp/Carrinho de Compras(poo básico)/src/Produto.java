public class Produto {
    // Atributos do produto: nome e preço
    private String nome;
    private double preco;

    // Getter para obter o preço do produto
    public double getPreco() {
        return preco;
    }

    // Setter para definir o preço do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Setter para definir o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString() para exibir o produto formatado corretamente
    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}
