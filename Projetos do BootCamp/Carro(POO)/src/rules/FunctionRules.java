package rules;

public class FunctionRules {

    //Verifica se a marcha é compatível com a velocidade
    public boolean checarMarcha(int marcha, double velocidade) {
        switch (marcha) {
            case 1: return (0 <= velocidade && velocidade <= 20);
            case 2: return (20 < velocidade && velocidade <= 40);
            case 3: return (40 < velocidade && velocidade <= 60);
            case 4: return (60 < velocidade && velocidade <= 80);
            case 5: return (80 < velocidade && velocidade <= 100);
            case 6: return (100 < velocidade && velocidade <= 120);
            default: return false;
        }
    }

    //Verifica se atingiu velocidade máxima
    public boolean checarVelocidadeMaxima(double velocidade) {
        return (velocidade >= 120);
    }

    //Verifica se está na velocidade mínima
    public boolean checarVelocidadeMinima(double velocidade) {
        return (velocidade <= 0);
    }

    //Só pode desligar se estiver parado e em ponto morto
    public boolean checagemParaDesligar(int marcha, double velocidade) {
        return (marcha == 0 && velocidade == 0);
    }

    //Só pode virar se velocidade entre 1-40 km/h
    public boolean checagemParaVirar(double velocidade) {
        return (velocidade <= 40 && velocidade >= 1);
    }
}
