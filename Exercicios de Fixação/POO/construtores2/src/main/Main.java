package main;
import modelos.TipoTreino;
import modelos.Treino;

public class Main {
    public static void main(String[] args) {
        Treino treino1 = new Treino("Carlos",TipoTreino.EMAGRECIMENTO);
        Treino treino2 = new Treino("Marcos",64 ,TipoTreino.HIPERTROFIA); 
        treino1.ExibirDados();
        treino2.ExibirDados();
    }
    
}
