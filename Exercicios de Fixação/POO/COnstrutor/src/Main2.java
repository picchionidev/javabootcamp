public class Main2 {
    public static void main(String[] args) {
        LivroP livro1 = new LivroP("Dom Casmurro", "Machado de Assis", 1899);
        LivroP livro2 = new LivroP("A Hora da Estrela", "Clarice Lispector");

        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();
    }
}