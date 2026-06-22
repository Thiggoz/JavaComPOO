package exercicios.criacao_de_objetos;

public class Main {
    public static void main(String[] args) {
        Cadeira C1 = new Cadeira();
        C1.materialDeConstrucao = "Couro";
        C1.acabamento = "Lã";
        C1.dimensoes = 87.6f;

        C1.material();
        C1.tamanho();
        C1.conforto();
    }
}
