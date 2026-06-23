package ExercicioDePOO_BancoDePraca;

public class Main {
    static void main(String[] args) {
        Banco[] b = new Banco[3];

        b[0] = new Banco("Banco de 3 lugares", "Madeira Maciça de Eucalipto", 3, 2, "Exelente", "Madera Madera");

        b[0].sentar();
        b[0].levantar();
        b[0].descricaoDoBanco();
    }
}
