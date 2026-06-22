package exercicios.criacao_de_objetos;

public class Cadeira {
    String materialDeConstrucao;
    float dimensoes;
    String acabamento;

    void conforto() {
        if (this.acabamento == "Lã") {
            System.out.println("Muito confortável");
        } else if (this.acabamento == "Algodão") {
            System.out.println("Confortável");
        } else {
            System.out.println("Pouco confortável");
        }
    }

    void material() {
        if (this.materialDeConstrucao == "Couro") {
            System.out.println("Ótimo material");
        } else if (this.materialDeConstrucao == "Tecido") {
            System.out.println("Bom material");
        } else {
            System.out.println("Material ruim");
        }
    }

    void tamanho() {
        if (this.dimensoes < 70) {
            System.out.println("Pequeno");
        } else {
            System.out.println("Grande");
        }
    }
}
