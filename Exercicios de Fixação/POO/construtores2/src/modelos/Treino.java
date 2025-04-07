package modelos;
public class Treino {
    private String nomeAluno;
    private int duracaoMinutos;
    private TipoTreino tipoTreino;

    public Treino(String nomeAluno, int duracaoMinutos,TipoTreino TipoTreino) {
        this.nomeAluno = nomeAluno;
        this.duracaoMinutos = duracaoMinutos;
        this.tipoTreino = TipoTreino;
    }

    public Treino(String nomeAluno,TipoTreino TipoTreino){
        this.nomeAluno = nomeAluno;
        this.tipoTreino = TipoTreino;
        duracaoMinutos = 60; 
    }
    public void ExibirDados(){
        System.out.printf("\nNome %s\n",nomeAluno);
        System.out.printf("Duração %d\n",duracaoMinutos);
        System.out.printf("Tipo de Treino %s\n",tipoTreino);
    }
}
